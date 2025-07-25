package com.mbridge.msdk.foundation.p434db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.SameLogTool;

/* renamed from: com.mbridge.msdk.foundation.db.f */
/* loaded from: classes6.dex */
public abstract class CommonAbsDBHelper {

    /* renamed from: a */
    private C21921a f56241a;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CommonAbsDBHelper.java */
    /* renamed from: com.mbridge.msdk.foundation.db.f$a */
    /* loaded from: classes6.dex */
    public class C21921a extends SQLiteOpenHelper {
        public C21921a(Context context, String str, int i) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, i);
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51827a("DatabaseOpenHelper", "数据库： name :" + str + "  " + i);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51827a("DatabaseOpenHelper", "数据库创建了");
            }
            CommonAbsDBHelper.this.mo52592a(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            CommonAbsDBHelper.this.mo52591a(sQLiteDatabase, i, i2);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51827a("DatabaseOpenHelper", "数据库升级了");
            }
            CommonAbsDBHelper.this.mo52588b(sQLiteDatabase, i, i2);
        }
    }

    public CommonAbsDBHelper(Context context) {
        this.f56241a = new C21921a(context, mo52594a(), mo52590b());
    }

    /* renamed from: a */
    protected abstract String mo52594a();

    /* renamed from: a */
    protected abstract void mo52592a(SQLiteDatabase sQLiteDatabase);

    /* renamed from: a */
    protected abstract void mo52591a(SQLiteDatabase sQLiteDatabase, int i, int i2);

    /* renamed from: b */
    protected abstract int mo52590b();

    /* renamed from: b */
    protected abstract void mo52588b(SQLiteDatabase sQLiteDatabase, int i, int i2);

    /* renamed from: c */
    public final SQLiteDatabase m52596c() {
        return this.f56241a.getReadableDatabase();
    }

    /* renamed from: d */
    public final synchronized SQLiteDatabase m52595d() {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = this.f56241a.getWritableDatabase();
        } catch (Exception unused) {
            sQLiteDatabase = null;
        }
        return sQLiteDatabase;
    }
}
