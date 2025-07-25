package com.maticoo.sdk.videocache;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import net.pubnative.lite.sdk.analytics.Reporting;

/* loaded from: classes6.dex */
final class StorageUtils {
    private static final String INDIVIDUAL_DIR_NAME = "video-cache";

    StorageUtils() {
    }

    private static File getCacheDirectory(Context context, boolean z) {
        String str;
        File file;
        try {
            str = Environment.getExternalStorageState();
        } catch (NullPointerException unused) {
            str = "";
        }
        if (z && "mounted".equals(str)) {
            file = getExternalCacheDir(context);
        } else {
            file = null;
        }
        if (file == null) {
            file = context.getCacheDir();
        }
        if (file == null) {
            String str2 = "/data/data/" + context.getPackageName() + "/cache/";
            ILog.m53544w("Can't define system cache directory! '" + str2 + "%s' will be used.");
            return new File(str2);
        }
        return file;
    }

    private static File getExternalCacheDir(Context context) {
        File file = new File(new File(new File(new File(Environment.getExternalStorageDirectory(), "Android"), "data"), context.getPackageName()), Reporting.EventType.CACHE);
        if (!file.exists() && !file.mkdirs()) {
            ILog.m53544w("Unable to create external cache directory");
            return null;
        }
        return file;
    }

    public static File getIndividualCacheDirectory(Context context) {
        return new File(getCacheDirectory(context, true), INDIVIDUAL_DIR_NAME);
    }
}
