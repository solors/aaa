package com.maticoo.sdk.mraid.cache;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.StatFs;
import androidx.annotation.NonNull;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.charset.Charset;

/* loaded from: classes6.dex */
public final class Util {
    private static final String CT_CACHE = "imageLoader-cache";
    private static final int MAX_DISK_CACHE_SIZE = 31457280;
    private static final int MIN_DISK_CACHE_SIZE = 5242880;
    static final Charset US_ASCII = Charset.forName("US-ASCII");
    static final Charset UTF_8 = Charset.forName("UTF-8");

    private Util() {
    }

    @TargetApi(18)
    public static long calculateDiskCacheSize(File file) {
        long j;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 50;
        } catch (IllegalArgumentException unused) {
            j = 5242880;
        }
        return Math.max(Math.min(j, 31457280L), 5242880L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int calculateMemoryCacheSize(@NonNull Context context) {
        boolean z;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if ((context.getApplicationInfo().flags & 1048576) != 0) {
            z = true;
        } else {
            z = false;
        }
        int memoryClass = activityManager.getMemoryClass();
        if (z) {
            memoryClass = activityManager.getLargeMemoryClass();
        }
        return (int) ((memoryClass * 1048576) / 7);
    }

    static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static File createDefaultCacheDir(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), CT_CACHE);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    static void deleteContents(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    deleteContents(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete file: " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }

    public static boolean parseResponseSourceHeader(String str) {
        if (str == null) {
            return false;
        }
        String[] split = str.split(" ", 2);
        if ("CACHE".equals(split[0])) {
            return true;
        }
        if (split.length == 1) {
            return false;
        }
        try {
            if (!"CONDITIONAL_CACHE".equals(split[0])) {
                return false;
            }
            if (Integer.parseInt(split[1]) != 304) {
                return false;
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    static String readFully(Reader reader) throws IOException {
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[1024];
            while (true) {
                int read = reader.read(cArr);
                if (read != -1) {
                    stringWriter.write(cArr, 0, read);
                } else {
                    return stringWriter.toString();
                }
            }
        } finally {
            reader.close();
        }
    }
}
