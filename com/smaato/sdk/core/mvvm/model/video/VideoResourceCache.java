package com.smaato.sdk.core.mvvm.model.video;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.simplehttp.SimpleHttpClient;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class VideoResourceCache {
    private static final String SDK_CACHE_ROOT_FOLDER_NAME = "com.smaato.sdk.cache/video/vast";
    private static final int STREAM_BUFFER_SIZE = 16384;
    private static final String TIMESTAMP_SEPARATOR = ".";
    private static final String TMP_SUFFIX = ".tmp";
    @NonNull
    private final Context context;
    @NonNull
    private final Logger logger;
    @NonNull
    private final Md5Digester md5Digester;
    @NonNull
    private final SimpleHttpClient simpleHttpClient;
    @NonNull
    private final Map<String, String> synchroObjectMap = new HashMap();

    public VideoResourceCache(@NonNull SimpleHttpClient simpleHttpClient, @NonNull Context context, @NonNull Md5Digester md5Digester, @NonNull Logger logger) {
        this.simpleHttpClient = simpleHttpClient;
        this.context = context;
        this.md5Digester = md5Digester;
        this.logger = logger;
    }

    @NonNull
    private File createCacheFile(@NonNull String str, long j) throws Exception {
        if (str != null) {
            return new File(getCacheDir(), createResourceFilename(str, j));
        }
        throw new NullPointerException("'url' specified as non-null is null");
    }

    @NonNull
    private String createResourceFilename(@NonNull String str, long j) throws Exception {
        if (str != null) {
            String md5Hex = this.md5Digester.md5Hex(str);
            return md5Hex + TIMESTAMP_SEPARATOR + j;
        }
        throw new NullPointerException("'url' specified as non-null is null");
    }

    @Nullable
    private File findCacheFile(String str) throws Exception {
        File[] listFiles = getCacheDir().listFiles();
        if (listFiles != null && listFiles.length != 0) {
            String md5Hex = this.md5Digester.md5Hex(str);
            for (File file : listFiles) {
                if (md5Hex.equals(getMd5Hex(file))) {
                    return file;
                }
            }
        }
        return null;
    }

    @NonNull
    private File getCacheDir() throws IOException {
        File file = new File(this.context.getCacheDir(), SDK_CACHE_ROOT_FOLDER_NAME);
        if (!file.exists() && !file.mkdirs()) {
            throw new IOException("Could not create cache dir");
        }
        return file;
    }

    private long getExpirationTimestamp(File file) {
        String name = file.getName();
        try {
            return Long.parseLong(name.substring(name.indexOf(TIMESTAMP_SEPARATOR) + 1));
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    @Nullable
    private String getMd5Hex(File file) {
        String name = file.getName();
        int indexOf = name.indexOf(TIMESTAMP_SEPARATOR);
        if (indexOf == -1) {
            return null;
        }
        return name.substring(0, indexOf);
    }

    @Nullable
    private Uri getResourceFromCache(@NonNull String str, long j) throws Exception {
        if (str != null) {
            removeExpiredResourceFiles();
            File findCacheFile = findCacheFile(str);
            if (findCacheFile != null) {
                return Uri.fromFile(findCacheFile);
            }
            return null;
        }
        throw new NullPointerException("'url' specified as non-null is null");
    }

    @NonNull
    private String getSynchronizationObject(String str) throws Exception {
        String md5Hex = this.md5Digester.md5Hex(str);
        String str2 = this.synchroObjectMap.get(md5Hex);
        if (str2 != null) {
            return str2;
        }
        this.synchroObjectMap.put(md5Hex, md5Hex);
        return md5Hex;
    }

    @NonNull
    private File getTempFile(@NonNull String str, long j) throws Exception {
        if (str != null) {
            File cacheDir = getCacheDir();
            return new File(cacheDir, createResourceFilename(str, j) + TMP_SUFFIX);
        }
        throw new NullPointerException("'url' specified as non-null is null");
    }

    @NonNull
    private Uri loadResourceIntoCache(@NonNull String str, long j) throws Exception {
        if (str != null) {
            InputStream doNetworkRequest = this.simpleHttpClient.doNetworkRequest(str, new HashMap());
            File tempFile = getTempFile(str, j);
            readIntoFile(tempFile, doNetworkRequest);
            File createCacheFile = createCacheFile(str, j);
            if (tempFile.renameTo(createCacheFile)) {
                return Uri.fromFile(createCacheFile);
            }
            throw new IOException("Could rename temp file to resource file");
        }
        throw new NullPointerException("'url' specified as non-null is null");
    }

    private void readIntoFile(@NonNull File file, @NonNull InputStream inputStream) throws Exception {
        if (file != null) {
            if (inputStream != null) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 16384);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file), 16384);
                    byte[] bArr = new byte[16384];
                    while (true) {
                        int read = bufferedInputStream.read(bArr);
                        if (read > 0) {
                            bufferedOutputStream.write(bArr, 0, read);
                        } else {
                            bufferedOutputStream.flush();
                            bufferedOutputStream.close();
                            bufferedInputStream.close();
                            return;
                        }
                    }
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                throw new NullPointerException("'inputStream' specified as non-null is null");
            }
        } else {
            throw new NullPointerException("'tempFile' specified as non-null is null");
        }
    }

    private void removeExpiredResourceFiles() throws Exception {
        File[] listFiles = getCacheDir().listFiles();
        if (listFiles != null && listFiles.length != 0) {
            for (File file : listFiles) {
                if (getExpirationTimestamp(file) < System.currentTimeMillis() && !file.delete()) {
                    this.logger.error(LogDomain.CORE, "Could not delete file" + file.getName(), new Object[0]);
                }
            }
        }
    }

    @NonNull
    public Uri getResource(@NonNull String str, long j) throws Exception {
        Uri resourceFromCache;
        if (str != null) {
            synchronized (getSynchronizationObject(str)) {
                resourceFromCache = getResourceFromCache(str, j);
                if (resourceFromCache == null) {
                    resourceFromCache = loadResourceIntoCache(str, j);
                }
            }
            return resourceFromCache;
        }
        throw new NullPointerException("'url' specified as non-null is null");
    }
}
