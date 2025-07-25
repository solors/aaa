package com.p551my.tracker.obfuscated;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;

/* renamed from: com.my.tracker.obfuscated.i0 */
/* loaded from: classes7.dex */
final class C26339i0 {

    /* renamed from: x */
    static long f68632x = -1;

    /* renamed from: b */
    private final SQLiteDatabase f68634b;

    /* renamed from: d */
    private final SQLiteStatement f68636d;

    /* renamed from: e */
    private final SQLiteStatement f68637e;

    /* renamed from: f */
    private final SQLiteStatement f68638f;

    /* renamed from: g */
    private final SQLiteStatement f68639g;

    /* renamed from: h */
    private final SQLiteStatement f68640h;

    /* renamed from: i */
    private final SQLiteStatement f68641i;

    /* renamed from: j */
    private final SQLiteStatement f68642j;

    /* renamed from: k */
    private final SQLiteStatement f68643k;

    /* renamed from: l */
    private final SQLiteStatement f68644l;

    /* renamed from: m */
    private final SQLiteStatement f68645m;

    /* renamed from: n */
    private final SQLiteStatement f68646n;

    /* renamed from: o */
    private final SQLiteStatement f68647o;

    /* renamed from: p */
    private final SQLiteStatement f68648p;

    /* renamed from: q */
    private final SQLiteStatement f68649q;

    /* renamed from: r */
    private final SQLiteStatement f68650r;

    /* renamed from: s */
    private final SQLiteStatement f68651s;

    /* renamed from: t */
    private final SQLiteStatement f68652t;

    /* renamed from: u */
    private final SQLiteStatement f68653u;

    /* renamed from: v */
    private final SQLiteStatement f68654v;

    /* renamed from: w */
    private final SQLiteStatement f68655w;

    /* renamed from: a */
    private final String[] f68633a = new String[1];

    /* renamed from: c */
    private final C26347h f68635c = new C26347h();

    /* renamed from: com.my.tracker.obfuscated.i0$a */
    /* loaded from: classes7.dex */
    static abstract class AbstractC26340a implements Closeable {

        /* renamed from: a */
        final Cursor f68656a;

        AbstractC26340a(Cursor cursor) {
            this.f68656a = cursor;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean m42000a() {
            return this.f68656a.moveToNext();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            try {
                this.f68656a.close();
            } catch (Throwable th) {
                C26468z0.m41524b("AbstractReader error: error while closing cursor", th);
            }
        }

        protected void finalize() {
            super.finalize();
            close();
        }
    }

    /* renamed from: com.my.tracker.obfuscated.i0$b */
    /* loaded from: classes7.dex */
    static final class C26341b extends AbstractC26340a {
        C26341b(Cursor cursor) {
            super(cursor);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public String m41999b() {
            return this.f68656a.getString(1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public long m41998c() {
            return this.f68656a.getLong(0);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public String m41997d() {
            return this.f68656a.getString(2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e */
        public String m41996e() {
            return this.f68656a.getString(3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: f */
        public int m41995f() {
            return this.f68656a.getInt(4);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: g */
        public long m41994g() {
            return this.f68656a.getLong(5);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.i0$c */
    /* loaded from: classes7.dex */
    static final class C26342c extends AbstractC26340a {
        C26342c(Cursor cursor) {
            super(cursor);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public byte[] m41993b() {
            return this.f68656a.getBlob(3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public long m41992c() {
            return this.f68656a.getLong(0);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public long m41991d() {
            return this.f68656a.getLong(4);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e */
        public long m41990e() {
            return this.f68656a.getLong(1);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.i0$d */
    /* loaded from: classes7.dex */
    static final class C26343d extends AbstractC26340a {
        C26343d(Cursor cursor) {
            super(cursor);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public long m41989b() {
            return this.f68656a.getLong(1);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.i0$e */
    /* loaded from: classes7.dex */
    static final class C26344e extends AbstractC26340a {
        C26344e(Cursor cursor) {
            super(cursor);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public String m41988b() {
            return this.f68656a.getString(1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public long m41987c() {
            return this.f68656a.getLong(0);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public String m41986d() {
            return this.f68656a.getString(2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e */
        public long m41985e() {
            return this.f68656a.getLong(3);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.i0$f */
    /* loaded from: classes7.dex */
    static final class C26345f extends AbstractC26340a {
        C26345f(Cursor cursor) {
            super(cursor);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public long m41984b() {
            return this.f68656a.getLong(0);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public String m41983c() {
            return this.f68656a.getString(1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public long m41982d() {
            if (this.f68656a.isNull(2)) {
                return C26339i0.f68632x;
            }
            return this.f68656a.getLong(2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e */
        public long m41981e() {
            return this.f68656a.getLong(3);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.i0$g */
    /* loaded from: classes7.dex */
    static final class C26346g extends AbstractC26340a {
        C26346g(Cursor cursor) {
            super(cursor);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public long m41980b() {
            return this.f68656a.getLong(2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public long m41979c() {
            return this.f68656a.getLong(1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean m41978d() {
            return this.f68656a.isNull(2);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.i0$h */
    /* loaded from: classes7.dex */
    static final class C26347h implements SQLiteDatabase.CursorFactory {

        /* renamed from: a */
        long f68657a;

        /* renamed from: b */
        byte[] f68658b;

        C26347h() {
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            sQLiteQuery.bindLong(1, this.f68657a);
            sQLiteQuery.bindBlob(2, this.f68658b);
            return new SQLiteCursor(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    private C26339i0(SQLiteDatabase sQLiteDatabase) {
        this.f68634b = sQLiteDatabase;
        this.f68636d = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_events(type, major, body) VALUES (?, ?, ?)");
        this.f68637e = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_events_timestamps(eid, ts) VALUES (?, ?)");
        this.f68638f = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_sessions(name, ts_start) VALUES (?, ?)");
        this.f68639g = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_sessions_timestamps(sid, ts_start, ts_end) VALUES (?, ?, ?)");
        this.f68640h = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_params(key, value) VALUES (?, ?)");
        this.f68641i = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_raw_purchases(data, signature, ts) VALUES (?, ?, ?)");
        this.f68642j = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_huawei_appgallery_raw_purchases(data, signature, signature_algorithm, source, ts) VALUES (?, ?, ?, ?, ?)");
        this.f68643k = sQLiteDatabase.compileStatement("UPDATE table_events SET ts_skipped=?  WHERE id=?");
        this.f68644l = sQLiteDatabase.compileStatement("UPDATE table_sessions SET ts_start=?, ts_skipped=?  WHERE id=?");
        this.f68645m = sQLiteDatabase.compileStatement("UPDATE table_params SET value=?  WHERE key=?");
        this.f68646n = sQLiteDatabase.compileStatement("UPDATE table_sessions SET ts_skipped=0");
        this.f68647o = sQLiteDatabase.compileStatement("DELETE FROM table_events");
        this.f68651s = sQLiteDatabase.compileStatement("DELETE FROM table_events_timestamps WHERE rowid IN (SELECT rowid FROM table_events_timestamps WHERE eid=?  ORDER BY ts LIMIT ?)");
        this.f68648p = sQLiteDatabase.compileStatement("DELETE FROM table_events_timestamps");
        this.f68649q = sQLiteDatabase.compileStatement("DELETE FROM table_sessions WHERE ts_start IS NULL");
        this.f68652t = sQLiteDatabase.compileStatement("DELETE FROM table_sessions_timestamps WHERE rowid IN (SELECT rowid FROM table_sessions_timestamps WHERE sid=?  ORDER BY ts_start LIMIT ?)");
        this.f68650r = sQLiteDatabase.compileStatement("DELETE FROM table_sessions_timestamps");
        this.f68653u = sQLiteDatabase.compileStatement("DELETE FROM table_params WHERE key=?");
        this.f68654v = sQLiteDatabase.compileStatement("DELETE FROM table_raw_purchases WHERE id=?");
        this.f68655w = sQLiteDatabase.compileStatement("DELETE FROM table_huawei_appgallery_raw_purchases WHERE id=?");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public long m42033a(int i, byte[] bArr, boolean z) {
        this.f68636d.bindLong(1, i);
        this.f68636d.bindLong(2, z ? 1L : 0L);
        this.f68636d.bindBlob(3, bArr);
        return this.f68636d.executeInsert();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public long m42019b(long j, long j2) {
        this.f68652t.bindLong(1, j);
        this.f68652t.bindLong(2, j2);
        return this.f68652t.executeUpdateDelete();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public long m42015c(long j) {
        this.f68633a[0] = String.valueOf(j);
        Cursor rawQuery = this.f68634b.rawQuery("SELECT COUNT(*) FROM table_events_timestamps WHERE eid=?", this.f68633a);
        try {
            if (!rawQuery.moveToNext()) {
                rawQuery.close();
                return 0L;
            }
            long j2 = rawQuery.getLong(0);
            rawQuery.close();
            return j2;
        } catch (Throwable th) {
            if (rawQuery != null) {
                try {
                    rawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public C26343d m42012d(long j) {
        this.f68633a[0] = String.valueOf(j);
        return new C26343d(this.f68634b.rawQuery("SELECT eid, ts FROM table_events_timestamps WHERE eid=?", this.f68633a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public long m42009e(long j) {
        this.f68633a[0] = String.valueOf(j);
        Cursor rawQuery = this.f68634b.rawQuery("SELECT COUNT(*)  FROM table_events WHERE type=?", this.f68633a);
        try {
            if (!rawQuery.moveToNext()) {
                rawQuery.close();
                return 0L;
            }
            long j2 = rawQuery.getLong(0);
            rawQuery.close();
            return j2;
        } catch (Throwable th) {
            if (rawQuery != null) {
                try {
                    rawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public long m42008f() {
        Cursor rawQuery = this.f68634b.rawQuery("SELECT COUNT(*) FROM table_huawei_appgallery_raw_purchases", null);
        try {
            if (!rawQuery.moveToNext()) {
                rawQuery.close();
                return 0L;
            }
            long j = rawQuery.getLong(0);
            rawQuery.close();
            return j;
        } catch (Throwable th) {
            if (rawQuery != null) {
                try {
                    rawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C26341b m42006g() {
        return new C26341b(this.f68634b.rawQuery("SELECT id, data, signature, signature_algorithm, source, ts FROM table_huawei_appgallery_raw_purchases", null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public C26342c m42004h() {
        return new C26342c(this.f68634b.rawQuery("SELECT id, type, major, body, ts_skipped FROM table_events", null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public long m42003i() {
        Cursor rawQuery = this.f68634b.rawQuery("SELECT COUNT(*) FROM table_raw_purchases", null);
        try {
            if (rawQuery.moveToNext()) {
                long j = rawQuery.getLong(0);
                rawQuery.close();
                return j;
            }
            rawQuery.close();
            return 0L;
        } catch (Throwable th) {
            if (rawQuery != null) {
                try {
                    rawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public C26344e m42002j() {
        return new C26344e(this.f68634b.rawQuery("SELECT id, data, signature, ts FROM table_raw_purchases", null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public long m42001k() {
        Cursor rawQuery = this.f68634b.rawQuery("SELECT COUNT(*)  FROM table_events WHERE major=1", null);
        try {
            if (rawQuery.moveToNext()) {
                long j = rawQuery.getLong(0);
                rawQuery.close();
                return j;
            }
            rawQuery.close();
            return 0L;
        } catch (Throwable th) {
            if (rawQuery != null) {
                try {
                    rawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public long m42031a(long j, long j2) {
        this.f68651s.bindLong(1, j);
        this.f68651s.bindLong(2, j2);
        return this.f68651s.executeUpdateDelete();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C26342c m42018b(long j, byte[] bArr) {
        C26347h c26347h = this.f68635c;
        c26347h.f68657a = j;
        c26347h.f68658b = bArr;
        return new C26342c(this.f68634b.rawQueryWithFactory(c26347h, "SELECT id, type, major, body, ts_skipped FROM table_events WHERE type=?  AND body=?  LIMIT 1", null, null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m42016c() {
        this.f68648p.execute();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m42013d() {
        this.f68649q.execute();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m42010e() {
        this.f68650r.execute();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public long m42007f(long j) {
        this.f68633a[0] = String.valueOf(j);
        Cursor rawQuery = this.f68634b.rawQuery("SELECT COUNT(*) FROM table_sessions_timestamps WHERE sid=?", this.f68633a);
        try {
            if (!rawQuery.moveToNext()) {
                rawQuery.close();
                return 0L;
            }
            long j2 = rawQuery.getLong(0);
            rawQuery.close();
            return j2;
        } catch (Throwable th) {
            if (rawQuery != null) {
                try {
                    rawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C26346g m42005g(long j) {
        this.f68633a[0] = String.valueOf(j);
        return new C26346g(this.f68634b.rawQuery("SELECT sid, ts_start, ts_end FROM table_sessions_timestamps WHERE sid=?", this.f68633a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public long m42028a(long j, byte[] bArr) {
        C26347h c26347h = this.f68635c;
        c26347h.f68657a = j;
        c26347h.f68658b = bArr;
        Cursor rawQueryWithFactory = this.f68634b.rawQueryWithFactory(c26347h, "SELECT COUNT(*)  FROM table_events WHERE type=?  AND body=?", null, null);
        try {
            if (!rawQueryWithFactory.moveToNext()) {
                rawQueryWithFactory.close();
                return 0L;
            }
            long j2 = rawQueryWithFactory.getLong(0);
            rawQueryWithFactory.close();
            return j2;
        } catch (Throwable th) {
            if (rawQueryWithFactory != null) {
                try {
                    rawQueryWithFactory.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public Long m42017b(String str) {
        String[] strArr = this.f68633a;
        strArr[0] = str;
        Cursor rawQuery = this.f68634b.rawQuery("SELECT value FROM table_params WHERE key=?", strArr);
        try {
            if (!rawQuery.moveToNext()) {
                rawQuery.close();
                return null;
            }
            Long valueOf = Long.valueOf(rawQuery.getLong(0));
            rawQuery.close();
            return valueOf;
        } catch (Throwable th) {
            if (rawQuery != null) {
                try {
                    rawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m42014c(long j, long j2) {
        this.f68637e.bindLong(1, j);
        this.f68637e.bindLong(2, j2);
        this.f68637e.execute();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m42011d(long j, long j2) {
        this.f68643k.bindLong(1, j2);
        this.f68643k.bindLong(2, j);
        this.f68643k.execute();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public long m42026a(String str, long j) {
        this.f68638f.bindString(1, str);
        this.f68638f.bindLong(2, j);
        return this.f68638f.executeInsert();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m42021b() {
        this.f68647o.execute();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public long m42023a(String str, String str2, long j) {
        this.f68641i.bindString(1, str);
        this.f68641i.bindString(2, str2);
        this.f68641i.bindLong(3, j);
        return this.f68641i.executeInsert();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m42020b(long j) {
        this.f68654v.bindLong(1, j);
        this.f68654v.execute();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public long m42022a(String str, String str2, String str3, int i, long j) {
        this.f68642j.bindString(1, str);
        this.f68642j.bindString(2, str2);
        this.f68642j.bindString(3, str3);
        this.f68642j.bindLong(4, i);
        this.f68642j.bindLong(5, j);
        return this.f68642j.executeInsert();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C26345f m42027a(String str) {
        String[] strArr = this.f68633a;
        strArr[0] = str;
        return new C26345f(this.f68634b.rawQuery("SELECT id, name, ts_start, ts_skipped FROM table_sessions WHERE name=?  LIMIT 1", strArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C26339i0 m42025a(String str, Context context) {
        try {
            String str2 = "mytracker_" + str + ".db";
            SQLiteDatabase openOrCreateDatabase = context.openOrCreateDatabase(str2, 0, null);
            if (openOrCreateDatabase == null) {
                C26468z0.m41525b("MyTrackerDatabase error: can't open database");
                return null;
            }
            if (openOrCreateDatabase.getVersion() != 9) {
                openOrCreateDatabase.close();
                context.deleteDatabase(str2);
                openOrCreateDatabase = context.openOrCreateDatabase(str2, 0, null);
                openOrCreateDatabase.setVersion(9);
                openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_events(id INTEGER PRIMARY KEY AUTOINCREMENT, type INTEGER NOT NULL, major INTEGER NOT NULL, body BLOB NOT NULL, ts_skipped INTEGER NOT NULL DEFAULT 0, UNIQUE(type, body))");
                openOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_eventsmajor ON table_events(major)");
                openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_events_timestamps(eid INTEGER NOT NULL, ts INTEGER NOT NULL)");
                openOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_events_timestampseid ON table_events_timestamps(eid)");
                openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_params(key TEXT PRIMARY KEY, value INTEGER)");
                openOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_paramskey ON table_params(key)");
                openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_sessions(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL UNIQUE, ts_start INTEGER, ts_skipped INTEGER NOT NULL DEFAULT 0)");
                openOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_sessionsname ON table_sessions(name)");
                openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_sessions_timestamps(sid INTEGER NOT NULL, ts_start INTEGER NOT NULL, ts_end INTEGER)");
                openOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_sessions_timestampssid ON table_sessions_timestamps(sid)");
                openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_raw_purchases(id INTEGER PRIMARY KEY AUTOINCREMENT, data TEXT NOT NULL, signature TEXT NOT NULL, ts INTEGER NOT NULL )");
                openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_huawei_appgallery_raw_purchases(id INTEGER PRIMARY KEY AUTOINCREMENT, data TEXT NOT NULL, signature TEXT NOT NULL, signature_algorithm TEXT NOT NULL, source INTEGER NOT NULL, ts INTEGER NOT NULL )");
            }
            return new C26339i0(openOrCreateDatabase);
        } catch (Throwable th) {
            C26468z0.m41524b("MyTrackerDatabase error: exception occurred while initialization database", th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m42034a() {
        this.f68646n.execute();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m42032a(long j) {
        this.f68655w.bindLong(1, j);
        this.f68655w.execute();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m42030a(long j, long j2, long j3) {
        if (j2 != f68632x) {
            this.f68644l.bindLong(1, j2);
        } else {
            this.f68644l.bindNull(1);
        }
        this.f68644l.bindLong(2, j3);
        this.f68644l.bindLong(3, j);
        this.f68644l.execute();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m42029a(long j, long j2, boolean z, long j3) {
        this.f68639g.bindLong(1, j);
        this.f68639g.bindLong(2, j2);
        SQLiteStatement sQLiteStatement = this.f68639g;
        if (z) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindLong(3, j3);
        }
        this.f68639g.execute();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m42024a(String str, Long l) {
        SQLiteStatement sQLiteStatement;
        if (l == null) {
            this.f68653u.bindString(1, str);
            sQLiteStatement = this.f68653u;
        } else {
            long longValue = l.longValue();
            this.f68640h.bindString(1, str);
            this.f68640h.bindLong(2, longValue);
            if (this.f68640h.executeInsert() != f68632x) {
                return;
            }
            this.f68645m.bindLong(1, longValue);
            this.f68645m.bindString(2, str);
            sQLiteStatement = this.f68645m;
        }
        sQLiteStatement.execute();
    }
}
