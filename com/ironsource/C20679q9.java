package com.ironsource;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import android.provider.BaseColumns;

/* renamed from: com.ironsource.q9 */
/* loaded from: classes6.dex */
public class C20679q9 extends SQLiteOpenHelper implements InterfaceC20095ie {

    /* renamed from: f */
    private static C20679q9 f52524f = null;

    /* renamed from: g */
    private static final String f52525g = " TEXT";

    /* renamed from: h */
    private static final String f52526h = " INTEGER";

    /* renamed from: i */
    private static final String f52527i = ",";

    /* renamed from: a */
    private final C20748r9 f52528a;

    /* renamed from: b */
    private final int f52529b;

    /* renamed from: c */
    private final int f52530c;

    /* renamed from: d */
    private final String f52531d;

    /* renamed from: e */
    private final String f52532e;

    /* renamed from: com.ironsource.q9$a */
    /* loaded from: classes6.dex */
    static abstract class AbstractC20680a implements BaseColumns {

        /* renamed from: a */
        public static final String f52533a = "events";

        /* renamed from: b */
        public static final int f52534b = 4;

        /* renamed from: c */
        public static final String f52535c = "eventid";

        /* renamed from: d */
        public static final String f52536d = "timestamp";

        /* renamed from: e */
        public static final String f52537e = "type";

        /* renamed from: f */
        public static final String f52538f = "data";

        AbstractC20680a() {
        }
    }

    public C20679q9(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.f52528a = new C20748r9();
        this.f52529b = 4;
        this.f52530c = 400;
        this.f52531d = "DROP TABLE IF EXISTS events";
        this.f52532e = "CREATE TABLE events (_id INTEGER PRIMARY KEY,eventid INTEGER,timestamp INTEGER,type TEXT,data TEXT )";
    }

    /* renamed from: a */
    private ContentValues m55663a(C20200kb c20200kb, String str) {
        if (c20200kb != null) {
            ContentValues contentValues = new ContentValues(4);
            contentValues.put("eventid", Integer.valueOf(c20200kb.m57653c()));
            contentValues.put("timestamp", Long.valueOf(c20200kb.m57652d()));
            contentValues.put("type", str);
            contentValues.put("data", c20200kb.m57658a());
            return contentValues;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (r5.isOpen() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r5.isOpen() != false) goto L13;
     */
    @Override // com.ironsource.InterfaceC20095ie
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void mo55659b(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "type = ?"
            r1 = 1
            java.lang.String[] r2 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L45
            r3 = 0
            r2[r3] = r5     // Catch: java.lang.Throwable -> L45
            android.database.sqlite.SQLiteDatabase r5 = r4.m55660a(r1)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "events"
            r5.delete(r1, r0, r2)     // Catch: java.lang.Throwable -> L19
            boolean r0 = r5.isOpen()     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L36
            goto L33
        L19:
            r0 = move-exception
            goto L1d
        L1b:
            r0 = move-exception
            r5 = 0
        L1d:
            com.ironsource.i9 r1 = com.ironsource.C20086i9.m57997d()     // Catch: java.lang.Throwable -> L38
            r1.m58003a(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = "IronSource"
            java.lang.String r2 = "Exception while clearing events: "
            android.util.Log.e(r1, r2, r0)     // Catch: java.lang.Throwable -> L38
            if (r5 == 0) goto L36
            boolean r0 = r5.isOpen()     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L36
        L33:
            r5.close()     // Catch: java.lang.Throwable -> L45
        L36:
            monitor-exit(r4)
            return
        L38:
            r0 = move-exception
            if (r5 == 0) goto L44
            boolean r1 = r5.isOpen()     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L44
            r5.close()     // Catch: java.lang.Throwable -> L45
        L44:
            throw r0     // Catch: java.lang.Throwable -> L45
        L45:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C20679q9.mo55659b(java.lang.String):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY,eventid INTEGER,timestamp INTEGER,type TEXT,data TEXT )");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS events");
        onCreate(sQLiteDatabase);
    }

    /* renamed from: a */
    private synchronized SQLiteDatabase m55660a(boolean z) throws Throwable {
        int i = 0;
        while (true) {
            try {
                if (z) {
                    return this.f52528a.m55531a(true, this);
                }
                return this.f52528a.m55531a(false, this);
            } catch (Throwable th) {
                C20086i9.m57997d().m58003a(th);
                i++;
                if (i >= 4) {
                    throw th;
                }
                SystemClock.sleep(i * 400);
            }
        }
    }

    /* renamed from: a */
    public static synchronized C20679q9 m55664a(Context context, String str, int i) {
        C20679q9 c20679q9;
        synchronized (C20679q9.class) {
            if (f52524f == null) {
                f52524f = new C20679q9(context, str, i);
            }
            c20679q9 = f52524f;
        }
        return c20679q9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
        if (r11.isOpen() != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0097, code lost:
        if (r11.isOpen() != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0099, code lost:
        r11.close();
     */
    @Override // com.ironsource.InterfaceC20095ie
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized java.util.ArrayList<com.ironsource.C20200kb> mo55662a(java.lang.String r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb6
            r0.<init>()     // Catch: java.lang.Throwable -> Lb6
            r1 = 0
            r2 = 0
            android.database.sqlite.SQLiteDatabase r11 = r12.m55660a(r1)     // Catch: java.lang.Throwable -> L76
            java.lang.String r6 = "type = ?"
            r3 = 1
            java.lang.String[] r7 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L74
            r7[r1] = r13     // Catch: java.lang.Throwable -> L74
            java.lang.String r10 = "timestamp ASC"
            java.lang.String r4 = "events"
            r5 = 0
            r8 = 0
            r9 = 0
            r3 = r11
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L74
            int r13 = r2.getCount()     // Catch: java.lang.Throwable -> L74
            if (r13 <= 0) goto L64
            r2.moveToFirst()     // Catch: java.lang.Throwable -> L74
        L28:
            boolean r13 = r2.isAfterLast()     // Catch: java.lang.Throwable -> L74
            if (r13 != 0) goto L61
            java.lang.String r13 = "eventid"
            int r13 = r2.getColumnIndex(r13)     // Catch: java.lang.Throwable -> L74
            if (r13 >= 0) goto L37
            goto L28
        L37:
            int r13 = r2.getInt(r13)     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = "timestamp"
            int r1 = r2.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L74
            if (r1 >= 0) goto L44
            goto L28
        L44:
            long r3 = r2.getLong(r1)     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = "data"
            int r1 = r2.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L74
            if (r1 >= 0) goto L51
            goto L28
        L51:
            java.lang.String r1 = r2.getString(r1)     // Catch: java.lang.Throwable -> L74
            com.ironsource.kb r5 = new com.ironsource.kb     // Catch: java.lang.Throwable -> L74
            r5.<init>(r13, r3, r1)     // Catch: java.lang.Throwable -> L74
            r0.add(r5)     // Catch: java.lang.Throwable -> L74
            r2.moveToNext()     // Catch: java.lang.Throwable -> L74
            goto L28
        L61:
            r2.close()     // Catch: java.lang.Throwable -> L74
        L64:
            boolean r13 = r2.isClosed()     // Catch: java.lang.Throwable -> Lb6
            if (r13 != 0) goto L6d
            r2.close()     // Catch: java.lang.Throwable -> Lb6
        L6d:
            boolean r13 = r11.isOpen()     // Catch: java.lang.Throwable -> Lb6
            if (r13 == 0) goto L9c
            goto L99
        L74:
            r13 = move-exception
            goto L78
        L76:
            r13 = move-exception
            r11 = r2
        L78:
            com.ironsource.i9 r1 = com.ironsource.C20086i9.m57997d()     // Catch: java.lang.Throwable -> L9e
            r1.m58003a(r13)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r1 = "IronSource"
            java.lang.String r3 = "Exception while loading events: "
            android.util.Log.e(r1, r3, r13)     // Catch: java.lang.Throwable -> L9e
            if (r2 == 0) goto L91
            boolean r13 = r2.isClosed()     // Catch: java.lang.Throwable -> Lb6
            if (r13 != 0) goto L91
            r2.close()     // Catch: java.lang.Throwable -> Lb6
        L91:
            if (r11 == 0) goto L9c
            boolean r13 = r11.isOpen()     // Catch: java.lang.Throwable -> Lb6
            if (r13 == 0) goto L9c
        L99:
            r11.close()     // Catch: java.lang.Throwable -> Lb6
        L9c:
            monitor-exit(r12)
            return r0
        L9e:
            r13 = move-exception
            if (r2 == 0) goto Laa
            boolean r0 = r2.isClosed()     // Catch: java.lang.Throwable -> Lb6
            if (r0 != 0) goto Laa
            r2.close()     // Catch: java.lang.Throwable -> Lb6
        Laa:
            if (r11 == 0) goto Lb5
            boolean r0 = r11.isOpen()     // Catch: java.lang.Throwable -> Lb6
            if (r0 == 0) goto Lb5
            r11.close()     // Catch: java.lang.Throwable -> Lb6
        Lb5:
            throw r13     // Catch: java.lang.Throwable -> Lb6
        Lb6:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C20679q9.mo55662a(java.lang.String):java.util.ArrayList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
        if (r0.isOpen() != false) goto L30;
     */
    @Override // com.ironsource.InterfaceC20095ie
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void mo55661a(java.util.List<com.ironsource.C20200kb> r5, java.lang.String r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r5 == 0) goto L67
            boolean r0 = r5.isEmpty()     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto La
            goto L67
        La:
            r0 = 1
            r1 = 0
            android.database.sqlite.SQLiteDatabase r0 = r4.m55660a(r0)     // Catch: java.lang.Throwable -> L3a
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L37
        L14:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Throwable -> L37
            com.ironsource.kb r2 = (com.ironsource.C20200kb) r2     // Catch: java.lang.Throwable -> L37
            android.content.ContentValues r2 = r4.m55663a(r2, r6)     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L14
            if (r2 == 0) goto L14
            java.lang.String r3 = "events"
            r0.insert(r3, r1, r2)     // Catch: java.lang.Throwable -> L37
            goto L14
        L2e:
            if (r0 == 0) goto L55
            boolean r5 = r0.isOpen()     // Catch: java.lang.Throwable -> L64
            if (r5 == 0) goto L55
            goto L52
        L37:
            r5 = move-exception
            r1 = r0
            goto L3b
        L3a:
            r5 = move-exception
        L3b:
            com.ironsource.i9 r6 = com.ironsource.C20086i9.m57997d()     // Catch: java.lang.Throwable -> L57
            r6.m58003a(r5)     // Catch: java.lang.Throwable -> L57
            java.lang.String r6 = "IronSource"
            java.lang.String r0 = "Exception while saving events: "
            android.util.Log.e(r6, r0, r5)     // Catch: java.lang.Throwable -> L57
            if (r1 == 0) goto L55
            boolean r5 = r1.isOpen()     // Catch: java.lang.Throwable -> L64
            if (r5 == 0) goto L55
            r0 = r1
        L52:
            r0.close()     // Catch: java.lang.Throwable -> L64
        L55:
            monitor-exit(r4)
            return
        L57:
            r5 = move-exception
            if (r1 == 0) goto L63
            boolean r6 = r1.isOpen()     // Catch: java.lang.Throwable -> L64
            if (r6 == 0) goto L63
            r1.close()     // Catch: java.lang.Throwable -> L64
        L63:
            throw r5     // Catch: java.lang.Throwable -> L64
        L64:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L67:
            monitor-exit(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C20679q9.mo55661a(java.util.List, java.lang.String):void");
    }
}
