package net.pubnative.lite.sdk.vpaid.utils;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Executors;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.vpaid.VpaidConstants;

/* loaded from: classes10.dex */
public class FileUtils {
    private static final String LOG_TAG = "FileUtils";
    private static File cachedParentDir;

    /* renamed from: a */
    public static /* synthetic */ void m14057a(Context context) {
        lambda$initParentDirAsync$0(context);
    }

    public static void clearCache(Context context) {
        Logger.m14229d(LOG_TAG, "Clear cache");
        File parentDir = getParentDir(context);
        if (parentDir == null) {
            return;
        }
        File[] listFiles = parentDir.listFiles();
        int i = 0;
        if (listFiles != null && listFiles.length > 0) {
            int length = listFiles.length;
            int i2 = 0;
            while (i < length) {
                File file = listFiles[i];
                if (!file.isDirectory()) {
                    file.delete();
                    i2++;
                }
                i++;
            }
            i = i2;
        }
        Logger.m14229d(LOG_TAG, "Deleted " + i + " file(s)");
    }

    public static void deleteExpiredFiles(Context context) {
        File parentDir = getParentDir(context);
        if (parentDir == null) {
            return;
        }
        File[] listFiles = parentDir.listFiles();
        int i = 0;
        if (listFiles != null && listFiles.length > 0) {
            int length = listFiles.length;
            int i2 = 0;
            while (i < length) {
                File file = listFiles[i];
                if (!file.isDirectory()) {
                    if (file.lastModified() + VpaidConstants.CACHED_VIDEO_LIFE_TIME >= System.currentTimeMillis() && file.length() != 0) {
                        i2++;
                    } else {
                        file.delete();
                        Logger.m14229d(LOG_TAG, "Deleted cached file: " + file.getAbsolutePath());
                    }
                }
                i++;
            }
            i = i2;
        }
        String str = LOG_TAG;
        Logger.m14229d(str, "In cache " + i + " file(s)");
        Logger.m14229d(str, "Cache time: 32 hours");
    }

    public static File getParentDir(Context context) {
        File file = cachedParentDir;
        if (file != null) {
            return file;
        }
        if (context != null) {
            cachedParentDir = context.getExternalFilesDir(VpaidConstants.FILE_FOLDER);
        }
        return cachedParentDir;
    }

    public static void initParentDirAsync(final Context context) {
        if (context != null && cachedParentDir == null) {
            Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: net.pubnative.lite.sdk.vpaid.utils.a
                @Override // java.lang.Runnable
                public final void run() {
                    FileUtils.m14057a(context);
                }
            });
        }
    }

    public static /* synthetic */ void lambda$initParentDirAsync$0(Context context) {
        cachedParentDir = context.getExternalFilesDir(VpaidConstants.FILE_FOLDER);
    }

    public static String obtainHashName(String str) {
        return Long.toString(str.hashCode() & 4294967295L);
    }
}
