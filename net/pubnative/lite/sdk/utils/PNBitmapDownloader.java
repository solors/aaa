package net.pubnative.lite.sdk.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.URLUtil;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.RejectedExecutionException;
import net.pubnative.lite.sdk.utils.svgparser.SVG;

/* loaded from: classes10.dex */
public class PNBitmapDownloader {
    private static final String TAG = "PNBitmapDownloader";
    private final Runnable downloadTask = new Runnable() { // from class: net.pubnative.lite.sdk.utils.PNBitmapDownloader.1
        HttpURLConnection connection = null;

        {
            PNBitmapDownloader.this = this;
        }

        @Override // java.lang.Runnable
        public void run() {
            HttpURLConnection httpURLConnection;
            Bitmap decodeStream;
            try {
                try {
                    try {
                        URL url = new URL(PNBitmapDownloader.this.mURL);
                        this.connection = (HttpURLConnection) url.openConnection();
                        InputStream inputStream = url.openConnection().getInputStream();
                        BitmapFactory.decodeStream(inputStream, new Rect(), PNBitmapDownloader.this.getBitmapOptionsDecodingBounds(true));
                        inputStream.close();
                        InputStream inputStream2 = url.openConnection().getInputStream();
                        if (url.openConnection().getContentType().equals("image/svg+xml")) {
                            Picture renderToPicture = SVG.getFromInputStream(inputStream2).renderToPicture();
                            decodeStream = Bitmap.createBitmap(renderToPicture.getWidth(), renderToPicture.getHeight(), Bitmap.Config.ARGB_8888);
                            new Canvas(decodeStream).drawPicture(renderToPicture);
                        } else {
                            decodeStream = BitmapFactory.decodeStream(inputStream2, null, PNBitmapDownloader.this.getBitmapOptionsDecodingBounds(false));
                        }
                        inputStream2.close();
                        PNBitmapLruCache.addBitmapToMemoryCache(PNBitmapDownloader.this.mURL, decodeStream);
                        PNBitmapDownloader.this.invokeLoad(decodeStream);
                        httpURLConnection = this.connection;
                        if (httpURLConnection == null) {
                            return;
                        }
                    } catch (RuntimeException e) {
                        PNBitmapDownloader.this.invokeFail(e);
                        httpURLConnection = this.connection;
                        if (httpURLConnection == null) {
                            return;
                        }
                    } catch (Exception e2) {
                        PNBitmapDownloader.this.invokeFail(e2);
                        httpURLConnection = this.connection;
                        if (httpURLConnection == null) {
                            return;
                        }
                    }
                } catch (Error e3) {
                    PNBitmapDownloader.this.invokeFail(new Exception(e3.toString()));
                    httpURLConnection = this.connection;
                    if (httpURLConnection == null) {
                        return;
                    }
                }
                httpURLConnection.disconnect();
            } catch (Throwable th) {
                HttpURLConnection httpURLConnection2 = this.connection;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                throw th;
            }
        }
    };
    private final Runnable loadFromFileSystemTask = new Runnable() { // from class: net.pubnative.lite.sdk.utils.PNBitmapDownloader.2
        {
            PNBitmapDownloader.this = this;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Bitmap decodeFile = BitmapFactory.decodeFile(Uri.parse(PNBitmapDownloader.this.mURL).getEncodedPath(), PNBitmapDownloader.this.getBitmapOptionsDecodingBounds(false));
                PNBitmapLruCache.addBitmapToMemoryCache(PNBitmapDownloader.this.mURL, decodeFile);
                PNBitmapDownloader.this.invokeLoad(decodeFile);
            } catch (Error e) {
                PNBitmapDownloader.this.invokeFail(new Exception(e.toString()));
            } catch (RuntimeException e2) {
                PNBitmapDownloader.this.invokeFail(e2);
            } catch (Exception e3) {
                PNBitmapDownloader.this.invokeFail(e3);
            }
        }
    };
    private DownloadListener mDownloadListener;
    private Handler mHandler;
    private int mHeight;
    private String mURL;
    private int mWidth;

    /* loaded from: classes10.dex */
    public interface DownloadListener {
        void onDownloadFailed(String str, Exception exc);

        void onDownloadFinish(String str, Bitmap bitmap);
    }

    /* renamed from: a */
    public static /* synthetic */ void m14221a(PNBitmapDownloader pNBitmapDownloader, Bitmap bitmap) {
        pNBitmapDownloader.lambda$invokeLoad$0(bitmap);
    }

    /* renamed from: b */
    public static /* synthetic */ void m14220b(PNBitmapDownloader pNBitmapDownloader, Exception exc) {
        pNBitmapDownloader.lambda$invokeFail$1(exc);
    }

    private synchronized void downloadImage() {
        try {
            BitmapDownloaderExecutor.getExecutor().submit(this.downloadTask);
        } catch (RejectedExecutionException e) {
            String str = TAG;
            Logger.m14227e(str, "Task submission rejected: " + e.getMessage());
            invokeFail(e);
        }
    }

    public BitmapFactory.Options getBitmapOptionsDecodingBounds(boolean z) {
        int i;
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i2 = this.mWidth;
        if (i2 > 0 && (i = this.mHeight) > 0 && !z) {
            options.inSampleSize = calculateInSampleSize(options, i2, i);
        }
        options.inJustDecodeBounds = z;
        return options;
    }

    public /* synthetic */ void lambda$invokeFail$1(Exception exc) {
        DownloadListener downloadListener = this.mDownloadListener;
        this.mDownloadListener = null;
        if (downloadListener != null) {
            downloadListener.onDownloadFailed(this.mURL, exc);
        }
    }

    public /* synthetic */ void lambda$invokeLoad$0(Bitmap bitmap) {
        DownloadListener downloadListener = this.mDownloadListener;
        this.mDownloadListener = null;
        if (downloadListener != null) {
            downloadListener.onDownloadFinish(this.mURL, bitmap);
        }
    }

    private void loadCachedImage() {
        BitmapDownloaderExecutor.getExecutor().submit(this.loadFromFileSystemTask);
    }

    protected int calculateInSampleSize(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            int i6 = i3 / 2;
            int i7 = i4 / 2;
            while (i6 / i5 >= i2 && i7 / i5 >= i) {
                i5 *= 2;
            }
        }
        return i5;
    }

    public synchronized void download(String str, DownloadListener downloadListener) {
        download(str, 0, 0, downloadListener);
    }

    protected void invokeFail(final Exception exc) {
        this.mHandler.post(new Runnable() { // from class: net.pubnative.lite.sdk.utils.c
            @Override // java.lang.Runnable
            public final void run() {
                PNBitmapDownloader.m14220b(PNBitmapDownloader.this, exc);
            }
        });
    }

    protected void invokeLoad(final Bitmap bitmap) {
        this.mHandler.post(new Runnable() { // from class: net.pubnative.lite.sdk.utils.d
            @Override // java.lang.Runnable
            public final void run() {
                PNBitmapDownloader.m14221a(PNBitmapDownloader.this, bitmap);
            }
        });
    }

    public synchronized void download(String str, int i, int i2, DownloadListener downloadListener) {
        this.mHandler = new Handler(Looper.getMainLooper());
        if (downloadListener == null) {
            Log.w(TAG, "download won't start since there is no assigned listener to It");
        } else {
            this.mDownloadListener = downloadListener;
            this.mURL = str;
            this.mWidth = i;
            this.mHeight = i2;
            if (TextUtils.isEmpty(str)) {
                invokeFail(new Exception("Image URL is empty"));
            } else {
                if (!URLUtil.isHttpUrl(str) && !URLUtil.isHttpsUrl(str)) {
                    if (URLUtil.isFileUrl(str)) {
                        loadCachedImage();
                    } else {
                        invokeFail(new Exception("Wrong file URL!"));
                    }
                }
                downloadImage();
            }
        }
    }
}
