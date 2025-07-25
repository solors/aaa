package com.bytedance.sdk.openadsdk.core;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.sdk.component.adexpress.p243bg.p244IL.C7302IL;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.openadsdk.core.p326VB.p330bg.C8819bX;
import com.bytedance.sdk.openadsdk.eqN.C9121Lq;
import com.bytedance.sdk.openadsdk.eqN.C9126Ta;
import com.bytedance.sdk.openadsdk.eqN.C9164WR;
import com.bytedance.sdk.openadsdk.eqN.C9260eqN;
import com.bytedance.sdk.openadsdk.eqN.C9269xxp;
import com.bytedance.sdk.openadsdk.eqN.C9270yDt;
import com.bytedance.sdk.openadsdk.rri.C9359IL;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.bytedance.sdk.openadsdk.core.ldr */
/* loaded from: classes3.dex */
public class C8936ldr {

    /* renamed from: bX */
    private static final Object f19760bX = new Object();

    /* renamed from: IL */
    private Context f19761IL;

    /* renamed from: bg */
    private C8939bX f19762bg;

    /* renamed from: com.bytedance.sdk.openadsdk.core.ldr$IL */
    /* loaded from: classes3.dex */
    private class C8938IL extends AbstractCursor {
        private C8938IL() {
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[0];
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getCount() {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public double getDouble(int i) {
            return 0.0d;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public float getFloat(int i) {
            return 0.0f;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getInt(int i) {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public long getLong(int i) {
            return 0L;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public short getShort(int i) {
            return (short) 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String getString(int i) {
            return null;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public boolean isNull(int i) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8936ldr(Context context) {
        Context applicationContext;
        try {
            if (context == null) {
                applicationContext = C8838VzQ.m84740bg();
            } else {
                applicationContext = context.getApplicationContext();
            }
            this.f19761IL = applicationContext;
            if (this.f19762bg == null) {
                this.f19762bg = new C8939bX();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bX */
    public Context m84364bX() {
        Context context = this.f19761IL;
        if (context == null) {
            return C8838VzQ.m84740bg();
        }
        return context;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.ldr$bX */
    /* loaded from: classes3.dex */
    public class C8939bX {

        /* renamed from: IL */
        private SQLiteDatabase f19764IL = null;

        public C8939bX() {
        }

        private synchronized boolean ldr() {
            SQLiteDatabase sQLiteDatabase = this.f19764IL;
            if (sQLiteDatabase != null) {
                if (sQLiteDatabase.inTransaction()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: zx */
        private synchronized void m84354zx() {
            try {
                synchronized (C8936ldr.f19760bX) {
                    SQLiteDatabase sQLiteDatabase = this.f19764IL;
                    if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                        C8936ldr c8936ldr = C8936ldr.this;
                        SQLiteDatabase writableDatabase = new C8940bg(c8936ldr.m84364bX()).getWritableDatabase();
                        this.f19764IL = writableDatabase;
                        writableDatabase.setLockingEnabled(false);
                    }
                }
            } catch (Throwable th) {
                C7741PX.m87873bg("DBHelper", th.getMessage());
                if (!ldr()) {
                    return;
                }
                throw th;
            }
        }

        /* renamed from: IL */
        public synchronized void m84362IL() {
            m84354zx();
            SQLiteDatabase sQLiteDatabase = this.f19764IL;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.beginTransaction();
        }

        /* renamed from: bX */
        public synchronized void m84361bX() {
            m84354zx();
            SQLiteDatabase sQLiteDatabase = this.f19764IL;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.setTransactionSuccessful();
        }

        /* renamed from: bg */
        public SQLiteDatabase m84360bg() {
            m84354zx();
            return this.f19764IL;
        }

        public synchronized void eqN() {
            m84354zx();
            SQLiteDatabase sQLiteDatabase = this.f19764IL;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.endTransaction();
        }

        /* renamed from: bg */
        public synchronized void m84359bg(String str) throws SQLException {
            try {
                m84354zx();
                this.f19764IL.execSQL(str);
            } catch (Throwable th) {
                if (ldr()) {
                    throw th;
                }
            }
        }

        /* renamed from: bg */
        public synchronized Cursor m84355bg(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            Cursor cursor;
            try {
                m84354zx();
                cursor = this.f19764IL.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th) {
                C7741PX.m87873bg("DBHelper", th.getMessage());
                C8938IL c8938il = new C8938IL();
                if (ldr()) {
                    throw th;
                }
                cursor = c8938il;
            }
            return cursor;
        }

        /* renamed from: bg */
        public synchronized int m84358bg(String str, ContentValues contentValues, String str2, String[] strArr) {
            int i;
            try {
                m84354zx();
                i = this.f19764IL.update(str, contentValues, str2, strArr);
            } catch (Exception e) {
                C7741PX.m87873bg("DBHelper", e.getMessage());
                if (ldr()) {
                    throw e;
                }
                i = 0;
            }
            return i;
        }

        /* renamed from: bg */
        public synchronized long m84357bg(String str, String str2, ContentValues contentValues) {
            long j;
            try {
                m84354zx();
                j = this.f19764IL.replace(str, str2, contentValues);
            } catch (Exception e) {
                C7741PX.m87873bg("DBHelper", e.getMessage());
                if (ldr()) {
                    throw e;
                }
                j = -1;
            }
            return j;
        }

        /* renamed from: bg */
        public synchronized int m84356bg(String str, String str2, String[] strArr) {
            int i;
            try {
                m84354zx();
                i = this.f19764IL.delete(str, str2, strArr);
            } catch (Exception e) {
                C7741PX.m87873bg("DBHelper", e.getMessage());
                if (ldr()) {
                    throw e;
                }
                i = 0;
            }
            return i;
        }
    }

    /* renamed from: bg */
    public C8939bX mo83544bg() {
        return this.f19762bg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.bytedance.sdk.openadsdk.core.ldr$bg */
    /* loaded from: classes3.dex */
    public class C8940bg extends SQLiteOpenHelper {

        /* renamed from: bg */
        final Context f19767bg;

        public C8940bg(Context context) {
            super(context, "ttopensdk.db", (SQLiteDatabase.CursorFactory) null, 11);
            this.f19767bg = context;
        }

        /* renamed from: IL */
        private void m84353IL(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(C8819bX.eqN());
        }

        /* renamed from: bX */
        private void m84352bX(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> eqN = eqN(sQLiteDatabase);
            if (eqN != null && eqN.size() > 0) {
                Iterator<String> it = eqN.iterator();
                while (it.hasNext()) {
                    sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", it.next()));
                }
            }
        }

        /* renamed from: bg */
        private void m84350bg(SQLiteDatabase sQLiteDatabase, Context context) {
            sQLiteDatabase.execSQL(C9260eqN.m83274bg());
            sQLiteDatabase.execSQL(C9164WR.m83449bX());
            sQLiteDatabase.execSQL(C9270yDt.m83235bg());
            sQLiteDatabase.execSQL(C9126Ta.m83500bg());
            sQLiteDatabase.execSQL(C9359IL.m82954bg());
            sQLiteDatabase.execSQL(C9269xxp.m83237bX());
            sQLiteDatabase.execSQL(C7302IL.m89238bX());
            sQLiteDatabase.execSQL(C8819bX.m84857bX());
            sQLiteDatabase.execSQL(C9121Lq.m83514bg());
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
            if (r1 != null) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
            if (r1 != null) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
            r1.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
            return r0;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private java.util.ArrayList<java.lang.String> eqN(android.database.sqlite.SQLiteDatabase r4) {
            /*
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = 0
                java.lang.String r2 = "select name from sqlite_master where type='table' order by name"
                android.database.Cursor r1 = r4.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L37
                if (r1 == 0) goto L2d
            Le:
                boolean r4 = r1.moveToNext()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L37
                if (r4 == 0) goto L2d
                r4 = 0
                java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L37
                java.lang.String r2 = "android_metadata"
                boolean r2 = r4.equals(r2)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L37
                if (r2 != 0) goto Le
                java.lang.String r2 = "sqlite_sequence"
                boolean r2 = r4.equals(r2)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L37
                if (r2 != 0) goto Le
                r0.add(r4)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L37
                goto Le
            L2d:
                if (r1 == 0) goto L3c
                goto L39
            L30:
                r4 = move-exception
                if (r1 == 0) goto L36
                r1.close()
            L36:
                throw r4
            L37:
                if (r1 == 0) goto L3c
            L39:
                r1.close()
            L3c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C8936ldr.C8940bg.eqN(android.database.sqlite.SQLiteDatabase):java.util.ArrayList");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                m84350bg(sQLiteDatabase, this.f19767bg);
            } catch (Throwable th) {
                C7741PX.m87873bg("DBHelper", th.getMessage());
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i > i2) {
                try {
                    m84352bX(sQLiteDatabase);
                    m84350bg(sQLiteDatabase, C8936ldr.this.f19761IL);
                } catch (Throwable th) {
                    C7741PX.m87880IL(th.getMessage());
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i > i2) {
                try {
                    m84352bX(sQLiteDatabase);
                } catch (Throwable unused) {
                }
            }
            m84350bg(sQLiteDatabase, C8936ldr.this.f19761IL);
            switch (i) {
                case 1:
                    m84351bg(sQLiteDatabase);
                    break;
                case 2:
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'ad_video_info';");
                    m84351bg(sQLiteDatabase);
                    break;
                case 3:
                    sQLiteDatabase.execSQL(C9270yDt.m83235bg());
                    m84351bg(sQLiteDatabase);
                    break;
                case 4:
                    sQLiteDatabase.execSQL(C7302IL.m89238bX());
                    m84351bg(sQLiteDatabase);
                    break;
                case 5:
                    sQLiteDatabase.execSQL(C9126Ta.m83500bg());
                    m84351bg(sQLiteDatabase);
                    break;
                case 6:
                    m84351bg(sQLiteDatabase);
                    break;
            }
            if (i < 11) {
                try {
                    m84353IL(sQLiteDatabase);
                    C9359IL.m82953bg(sQLiteDatabase);
                } catch (Throwable th) {
                    C7741PX.m87873bg("DBHelper", th.getMessage());
                }
            }
        }

        /* renamed from: bg */
        private void m84351bg(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(C9260eqN.m83275IL());
            sQLiteDatabase.execSQL(C9164WR.eqN());
            sQLiteDatabase.execSQL(C9270yDt.m83236IL());
            sQLiteDatabase.execSQL(C9126Ta.m83501IL());
        }
    }
}
