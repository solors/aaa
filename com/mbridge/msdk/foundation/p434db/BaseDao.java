package com.mbridge.msdk.foundation.p434db;

import android.database.sqlite.SQLiteDatabase;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.SameLogTool;

/* renamed from: com.mbridge.msdk.foundation.db.a */
/* loaded from: classes6.dex */
public class BaseDao<T> {
    protected CommonAbsDBHelper mHelper;

    public BaseDao(CommonAbsDBHelper commonAbsDBHelper) {
        this.mHelper = commonAbsDBHelper;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized SQLiteDatabase getReadableDatabase() {
        try {
        } catch (Exception unused) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51827a("BaseDao", "getReadableDatabase error");
                return null;
            }
            return null;
        }
        return this.mHelper.m52596c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized SQLiteDatabase getWritableDatabase() {
        try {
        } catch (Exception unused) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51827a("BaseDao", "getWritableDatabase error");
                return null;
            }
            return null;
        }
        return this.mHelper.m52595d();
    }
}
