package com.mobilefuse.videoplayer.utils;

import android.content.Context;
import android.os.StatFs;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.crypto.hash_algorithms;
import com.mobilefuse.videoplayer.utils.lrucache.DiskLruCache;
import com.mobilefuse.videoplayer.utils.lrucache.Util;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes7.dex */
public class DiskCacheUtil {
    private static final boolean CLEAR_CACHE_WHEN_INIT = true;
    private static final int LRUCACHE_APP_VERSION = 1;
    private static final int LRUCACHE_DISK_CACHE_INDEX = 0;
    private static final int LRUCACHE_VALUE_COUNT = 1;
    private static final int MAX_DISK_CACHE_SIZE = 125829120;
    static final String MF_CACHE_DIR_NAME = "mobilefuse_lrucache";
    private static final int MIN_DISK_CACHE_SIZE = 39845888;
    private static DiskLruCache diskLruCache;
    private static boolean initialized;

    private DiskCacheUtil() {
    }

    public static String cacheFile(String str, InputStream inputStream) {
        DiskLruCache.Editor editor;
        if (diskLruCache == null) {
            return null;
        }
        try {
            String createFileCacheKey = createFileCacheKey(str);
            editor = diskLruCache.edit(createFileCacheKey);
            if (editor == null) {
                return null;
            }
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(editor.newOutputStream(0));
                copyContent(inputStream, bufferedOutputStream);
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
                diskLruCache.flush();
                editor.commit();
                return createFileCacheKey;
            } catch (Throwable unused) {
                if (editor != null) {
                    try {
                        editor.abort();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                return null;
            }
        } catch (Throwable unused2) {
            editor = null;
        }
    }

    public static void closeStream(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th) {
            StabilityHelper.logException((Class<?>) DiskCacheUtil.class, th);
        }
    }

    public static boolean containsFileCache(String str) {
        DiskLruCache diskLruCache2 = diskLruCache;
        if (diskLruCache2 == null) {
            return false;
        }
        try {
            if (diskLruCache2.get(createFileCacheKey(str)) == null) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static void copyContent(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (inputStream != null && outputStream != null) {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    return;
                }
            }
        } else {
            throw new IOException("A stream can't be null.");
        }
    }

    public static String createFileCacheKey(String str) throws Throwable {
        return hash_algorithms.sha1(str);
    }

    public static boolean deleteFile(String str) {
        try {
            String createFileCacheKey = createFileCacheKey(str);
            DiskLruCache diskLruCache2 = diskLruCache;
            if (diskLruCache2 == null) {
                return false;
            }
            diskLruCache2.remove(createFileCacheKey);
            diskLruCache.flush();
            return true;
        } catch (Throwable th) {
            StabilityHelper.logException((Class<?>) DiskCacheUtil.class, th);
            return false;
        }
    }

    private static File getCacheDirectory(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String path = cacheDir.getPath();
        File file = new File(path + File.separator + MF_CACHE_DIR_NAME);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static long getCacheDirectorySize(File file) {
        long j;
        try {
            j = new StatFs(file.getAbsolutePath()).getAvailableBytes() / 5;
        } catch (IllegalArgumentException e) {
            StabilityHelper.logException((Class<?>) DiskCacheUtil.class, (Throwable) e);
            j = 39845888;
        }
        return Math.max(39845888L, Math.min(125829120L, j));
    }

    @Nullable
    public static String getCachedFilePath(@NonNull String str) throws Throwable {
        if (diskLruCache == null) {
            return null;
        }
        return diskLruCache.getDirectory() + File.separator + createFileCacheKey(str) + ".0";
    }

    private static boolean initLruDiskCache(Context context) {
        if (context == null) {
            return false;
        }
        if (diskLruCache == null) {
            File cacheDirectory = getCacheDirectory(context);
            if (cacheDirectory == null) {
                return false;
            }
            try {
                Util.deleteContents(cacheDirectory);
            } catch (Throwable th) {
                StabilityHelper.logException((Class<?>) DiskCacheUtil.class, th);
            }
            try {
                diskLruCache = DiskLruCache.open(cacheDirectory, 1, 1, getCacheDirectorySize(cacheDirectory));
            } catch (Throwable th2) {
                StabilityHelper.logException((Class<?>) DiskCacheUtil.class, th2);
                return false;
            }
        }
        return true;
    }

    public static void initialize(Context context) {
        if (initialized) {
            return;
        }
        initialized = true;
        initLruDiskCache(context);
    }
}
