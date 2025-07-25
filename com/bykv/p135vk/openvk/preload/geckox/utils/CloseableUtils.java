package com.bykv.p135vk.openvk.preload.geckox.utils;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.bykv.p135vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils */
/* loaded from: classes3.dex */
public class CloseableUtils {
    public static boolean close(Closeable closeable) {
        if (closeable == null) {
            return true;
        }
        try {
            closeable.close();
            return true;
        } catch (IOException e) {
            GeckoLogger.m91262e("gecko-debug-tag", "close:", e);
            return false;
        }
    }

    public static boolean close(Cursor cursor) {
        if (cursor == null) {
            return true;
        }
        try {
            cursor.close();
            return true;
        } catch (Exception e) {
            GeckoLogger.m91262e("gecko-debug-tag", "close:", e);
            return false;
        }
    }

    public static boolean close(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase == null) {
            return true;
        }
        try {
            sQLiteDatabase.close();
            return true;
        } catch (Exception e) {
            GeckoLogger.m91262e("gecko-debug-tag", "close:", e);
            return false;
        }
    }
}
