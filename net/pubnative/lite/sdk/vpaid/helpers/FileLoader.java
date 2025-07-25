package net.pubnative.lite.sdk.vpaid.helpers;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.vpaid.PlayerInfo;
import net.pubnative.lite.sdk.vpaid.enums.VastError;
import net.pubnative.lite.sdk.vpaid.utils.FileUtils;
import net.pubnative.lite.sdk.vpaid.utils.Utils;

/* loaded from: classes10.dex */
public class FileLoader {
    private static final int CONNECT_TIMEOUT = 10000;
    private static final String LOG_TAG = "FileLoader";
    private static final int READ_TIMEOUT = 10000;
    private static boolean useMobileNetworkForCaching;
    private boolean firstQuartile;
    private final Callback mCallback;
    private volatile HttpURLConnection mConnection;
    private final Context mContext;
    private boolean mIsEndCard;
    private volatile boolean mIsFileFullyDownloaded;
    private final File mLoadingFile;
    private final String mRemoteFileUrl;
    private volatile boolean mStop;
    private boolean midpoint;
    private boolean thirdQuartile;

    /* loaded from: classes10.dex */
    public interface Callback {
        void onError(PlayerInfo playerInfo);

        void onFileLoaded(String str);

        void onProgress(double d);
    }

    public FileLoader(String str, Context context, Callback callback, Boolean bool) {
        this.mCallback = callback;
        this.mContext = context;
        this.mRemoteFileUrl = str;
        this.mIsEndCard = bool.booleanValue();
        this.mLoadingFile = new File(FileUtils.getParentDir(context), FileUtils.obtainHashName(str));
    }

    private int appendFile(File file, String str, int i, FileHeaders fileHeaders) {
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            this.mConnection = obtainGetConnection(str, i, fileHeaders);
            inputStream = this.mConnection.getInputStream();
            try {
                fileOutputStream = new FileOutputStream(file, true);
            } catch (Exception e) {
                e = e;
                fileOutputStream = null;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = null;
            }
        } catch (Exception e2) {
            e = e2;
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
                i += read;
                handelProgress(i / fileHeaders.fileLength);
            }
            closeStream(inputStream);
        } catch (Exception e3) {
            e = e3;
            inputStream2 = inputStream;
            try {
                Logger.m14227e(LOG_TAG, "appendFile interrupted: " + e.getMessage());
                closeStream(inputStream2);
                closeStream(fileOutputStream);
                return i;
            } catch (Throwable th3) {
                th = th3;
                closeStream(inputStream2);
                closeStream(fileOutputStream);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            inputStream2 = inputStream;
            closeStream(inputStream2);
            closeStream(fileOutputStream);
            throw th;
        }
        closeStream(fileOutputStream);
        return i;
    }

    private static void closeStream(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                Logger.m14227e(LOG_TAG, "Can't close stream");
            }
        }
    }

    private void handelProgress(double d) {
        Callback callback = this.mCallback;
        if (callback != null) {
            if (!this.firstQuartile) {
                if (d > 0.25d) {
                    this.firstQuartile = true;
                    callback.onProgress(0.25d);
                }
            } else if (!this.midpoint) {
                if (d > 0.5d) {
                    this.midpoint = true;
                    callback.onProgress(0.5d);
                }
            } else if (!this.thirdQuartile && d > 0.75d) {
                this.thirdQuartile = true;
                callback.onProgress(0.75d);
            }
        }
    }

    private void handleEmulator() {
        if (Utils.isEmulator()) {
            Logger.m14227e(LOG_TAG, "running on emulator");
            useMobileNetworkForCaching = true;
        }
    }

    private void handleFileFullDownloaded() {
        this.mIsFileFullyDownloaded = true;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: net.pubnative.lite.sdk.vpaid.helpers.c
            {
                FileLoader.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FileLoader.this.lambda$handleFileFullDownloaded$0();
            }
        });
    }

    public /* synthetic */ void lambda$handleFileFullDownloaded$0() {
        Callback callback = this.mCallback;
        if (callback != null) {
            callback.onFileLoaded(this.mLoadingFile.getAbsolutePath());
        }
    }

    public /* synthetic */ void lambda$stop$1() {
        Logger.m14227e(LOG_TAG, "disconnect()");
        this.mConnection.disconnect();
    }

    public void load() {
        try {
            if (this.mStop) {
                return;
            }
            FileHeaders obtainHeaders = obtainHeaders(this.mRemoteFileUrl);
            if (obtainHeaders == null) {
                Callback callback = this.mCallback;
                if (callback != null) {
                    callback.onError(new PlayerInfo("Error during loading file"));
                    return;
                }
                return;
            }
            String str = LOG_TAG;
            Logger.m14229d(str, "File length: " + obtainHeaders.fileLength);
            long currentTimeMillis = System.currentTimeMillis();
            int i = 0;
            int i2 = 0;
            while (!this.mStop && i < obtainHeaders.fileLength) {
                i = appendFile(this.mLoadingFile, this.mRemoteFileUrl, i, obtainHeaders);
                i2++;
            }
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            String str2 = LOG_TAG;
            Logger.m14229d(str2, "Load time: " + (currentTimeMillis2 / 1000.0d));
            Logger.m14229d(str2, "AttemptsCount: " + i2);
            if (i == obtainHeaders.fileLength) {
                handleFileFullDownloaded();
                return;
            }
            Bitmap bitmap = obtainHeaders.bitmap;
            if (bitmap != null) {
                saveBitmapIntoFile(bitmap);
                handleFileFullDownloaded();
                return;
            }
            Callback callback2 = this.mCallback;
            if (callback2 != null) {
                callback2.onError(new PlayerInfo("Error during file loading, attemptsCount: " + i2));
            }
        } catch (Exception e) {
            String str3 = LOG_TAG;
            Logger.m14227e(str3, "Unexpected FileLoader error: " + e.getMessage());
        }
    }

    private void maybeLoadFile() {
        if (RequestParametersProvider.getConnectionType(this.mContext) != 2 && !useMobileNetworkForCaching) {
            Callback callback = this.mCallback;
            if (callback != null) {
                callback.onError(new PlayerInfo("Mobile network. File will not be cached"));
                return;
            }
            return;
        }
        ExecutorHelper.getExecutor().submit(new Runnable() { // from class: net.pubnative.lite.sdk.vpaid.helpers.a
            {
                FileLoader.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FileLoader.this.load();
            }
        });
    }

    private HttpURLConnection obtainGetConnection(String str, int i, FileHeaders fileHeaders) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setRequestMethod("GET");
        return httpURLConnection;
    }

    private FileHeaders obtainHeaders(String str) {
        Bitmap bitmap;
        try {
            try {
                try {
                    this.mConnection = (HttpURLConnection) new URL(str).openConnection();
                    if (this.mConnection != null && this.mConnection.getHeaderFields() != null && this.mConnection.getHeaderFields().get("content-Length") != null && this.mConnection.getHeaderFields().get("content-Length").isEmpty()) {
                        Logger.m14227e(LOG_TAG, "File not found by URL: " + this.mRemoteFileUrl);
                        ErrorLog.postError(this.mContext, VastError.TRAFFICKING);
                        if (this.mConnection != null) {
                            this.mConnection.disconnect();
                        }
                        return null;
                    }
                    this.mConnection.setRequestMethod("GET");
                    if (this.mConnection.getResponseCode() == 200) {
                        String headerField = this.mConnection.getHeaderField("ETag");
                        int contentLength = this.mConnection.getContentLength();
                        if (contentLength == -1 && this.mIsEndCard) {
                            bitmap = EndCardFileDownloader.mLoad(this.mRemoteFileUrl);
                        } else {
                            bitmap = null;
                        }
                        FileHeaders fileHeaders = new FileHeaders(headerField, contentLength, bitmap);
                        if (this.mConnection != null) {
                            this.mConnection.disconnect();
                        }
                        return fileHeaders;
                    } else if (this.mConnection.getResponseCode() != 403 && this.mConnection.getResponseCode() != 206 && this.mConnection.getResponseCode() != 404) {
                        if (this.mConnection != null) {
                            this.mConnection.disconnect();
                        }
                        return null;
                    } else {
                        Logger.m14227e(LOG_TAG, "File not found by URL: " + this.mRemoteFileUrl);
                        ErrorLog.postError(this.mContext, VastError.TRAFFICKING);
                        if (this.mConnection != null) {
                            this.mConnection.disconnect();
                        }
                        return null;
                    }
                } catch (SocketTimeoutException unused) {
                    Logger.m14227e(LOG_TAG, "Timeout by URL: " + this.mRemoteFileUrl);
                    ErrorLog.postError(this.mContext, VastError.TIMEOUT);
                    if (this.mConnection != null) {
                        this.mConnection.disconnect();
                    }
                    return null;
                }
            } catch (IOException unused2) {
                Logger.m14227e(LOG_TAG, "File not found by URL: " + this.mRemoteFileUrl);
                ErrorLog.postError(this.mContext, VastError.FILE_NOT_FOUND);
                if (this.mConnection != null) {
                    this.mConnection.disconnect();
                }
                return null;
            }
        } catch (Throwable th) {
            if (this.mConnection != null) {
                this.mConnection.disconnect();
            }
            throw th;
        }
    }

    private void saveBitmapIntoFile(Bitmap bitmap) {
        new AndroidBmpUtil().save(bitmap, this.mLoadingFile.getAbsolutePath());
    }

    public static void setUseMobileNetworkForCaching(boolean z) {
        useMobileNetworkForCaching = z;
    }

    public void start() {
        String str = LOG_TAG;
        Logger.m14229d(str, "start");
        handleEmulator();
        Logger.m14229d(str, "Use mobile network for caching: " + useMobileNetworkForCaching);
        if (TextUtils.isEmpty(this.mRemoteFileUrl)) {
            this.mCallback.onError(new PlayerInfo("FileUrl is empty"));
        } else if (this.mLoadingFile.exists()) {
            Logger.m14229d(str, "File already exists");
            handleFileFullDownloaded();
        } else {
            maybeLoadFile();
        }
    }

    public void stop() {
        File file;
        String str = LOG_TAG;
        Logger.m14227e(str, "stop()");
        this.mStop = true;
        if (this.mConnection != null) {
            ExecutorHelper.getExecutor().submit(new Runnable() { // from class: net.pubnative.lite.sdk.vpaid.helpers.b
                {
                    FileLoader.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    FileLoader.this.lambda$stop$1();
                }
            });
        }
        if (!this.mIsFileFullyDownloaded && (file = this.mLoadingFile) != null && file.exists()) {
            Logger.m14227e(str, "remove bad file");
            this.mLoadingFile.delete();
        }
    }

    /* loaded from: classes10.dex */
    public static class FileHeaders {
        final Bitmap bitmap;
        final String eTag;
        final int fileLength;

        FileHeaders(String str, int i) {
            this.eTag = str;
            this.fileLength = i;
            this.bitmap = null;
        }

        FileHeaders(String str, int i, Bitmap bitmap) {
            this.eTag = str;
            this.fileLength = i;
            this.bitmap = bitmap;
        }
    }
}
