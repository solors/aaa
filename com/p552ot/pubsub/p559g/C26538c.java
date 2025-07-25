package com.p552ot.pubsub.p559g;

import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.p552ot.pubsub.p555c.C26521a;
import com.p552ot.pubsub.p555c.C26523c;
import com.p552ot.pubsub.p555c.C26524d;
import com.p552ot.pubsub.p556d.C26531c;
import com.p552ot.pubsub.util.C26577b;
import com.p552ot.pubsub.util.C26578c;
import com.p552ot.pubsub.util.C26586j;
import com.p552ot.pubsub.util.C26601v;
import java.util.List;
import java.util.Map;

/* renamed from: com.ot.pubsub.g.c */
/* loaded from: classes7.dex */
public class C26538c {

    /* renamed from: a */
    private static final String f69463a = "MessageManager";

    /* renamed from: b */
    private static C26538c f69464b = null;

    /* renamed from: d */
    private static final int f69465d = 1000;

    /* renamed from: e */
    private static final int f69466e = 512000;

    /* renamed from: f */
    private static final int f69467f = 1024000;

    /* renamed from: g */
    private static final int f69468g = 7;

    /* renamed from: h */
    private static final String f69469h = "timestamp";

    /* renamed from: i */
    private static volatile boolean f69470i = false;

    /* renamed from: j */
    private static volatile int f69471j = 1;

    /* renamed from: k */
    private static volatile int f69472k;

    /* renamed from: c */
    private C26539a f69473c = new C26539a(C26577b.m41121a());

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.ot.pubsub.g.c$a */
    /* loaded from: classes7.dex */
    public static class C26539a extends SQLiteOpenHelper {

        /* renamed from: a */
        public static final String f69474a = "otpubsub.db";

        /* renamed from: b */
        public static final String f69475b = "otpubsub";

        /* renamed from: c */
        public static final String f69476c = "_id";

        /* renamed from: d */
        public static final String f69477d = "projectid";

        /* renamed from: e */
        public static final String f69478e = "topic";

        /* renamed from: f */
        public static final String f69479f = "data";

        /* renamed from: g */
        public static final String f69480g = "attribute";

        /* renamed from: h */
        public static final String f69481h = "gzipandencrypt";

        /* renamed from: i */
        public static final String f69482i = "timestamp";

        /* renamed from: j */
        private static final int f69483j = 2;

        /* renamed from: k */
        private static final String f69484k = "CREATE TABLE otpubsub (_id INTEGER PRIMARY KEY AUTOINCREMENT,projectid TEXT,topic TEXT,data BLOB,attribute BLOB,gzipandencrypt INTEGER,timestamp INTEGER)";

        public C26539a(Context context) {
            super(context, f69474a, (SQLiteDatabase.CursorFactory) null, 2);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(f69484k);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            C26586j.m41080a(C26538c.f69463a, "onUpgrade, old=" + i + ", new = " + i2);
            if (i2 == 2 && i == 1) {
                try {
                    sQLiteDatabase.execSQL("ALTER TABLE otpubsub ADD COLUMN gzipandencrypt INTEGER DEFAULT 0");
                } catch (Throwable th) {
                    C26586j.m41074b(C26538c.f69463a, "onUpgrade Throwable" + th.getMessage());
                }
            }
        }
    }

    private C26538c() {
        m41268d();
    }

    /* renamed from: b */
    public static void m41272b() {
        if (f69464b == null) {
            synchronized (C26538c.class) {
                if (f69464b == null) {
                    f69464b = new C26538c();
                }
            }
        }
    }

    /* renamed from: g */
    private void m41265g() {
        try {
            this.f69473c.getWritableDatabase().delete(C26539a.f69475b, null, null);
            m41274a(true);
            C26586j.m41080a(f69463a, "delete table otpubsub");
        } catch (Exception e) {
            C26586j.m41074b(f69463a, "delete table error: " + e.getMessage());
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:8|(1:10)(1:55)|11|(1:(1:53)(6:54|17|18|19|20|(2:22|(2:25|26)(1:24))(2:47|48)))(1:15)|16|17|18|19|20|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ac, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ad, code lost:
        com.p552ot.pubsub.util.C26586j.m41073b(com.p552ot.pubsub.p559g.C26538c.f69463a, "*** error ***", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0119, code lost:
        if (r2 == null) goto L45;
     */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0121: MOVE  (r10 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:60:0x0121 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0124 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00c0 A[SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.p552ot.pubsub.p564j.C26563a m41269c() {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p552ot.pubsub.p559g.C26538c.m41269c():com.ot.pubsub.j.a");
    }

    /* renamed from: d */
    public void m41268d() {
        C26536a.m41288a(new RunnableC26541e(this));
    }

    /* renamed from: e */
    public synchronized boolean m41267e() {
        return f69470i;
    }

    /* renamed from: f */
    public long m41266f() {
        return DatabaseUtils.queryNumEntries(this.f69473c.getReadableDatabase(), C26539a.f69475b);
    }

    /* renamed from: a */
    public static C26538c m41280a() {
        if (f69464b == null) {
            m41272b();
        }
        return f69464b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public boolean m41271b(String str, String str2, String str3, Map<String, String> map, boolean z) {
        try {
            synchronized (this.f69473c) {
                if (TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                    C26586j.m41069c(f69463a, "addEventToDatabase message is inValid. topic:" + str2 + ", data:" + str3);
                    return false;
                }
                if (!z) {
                    str3 = C26523c.m41351b(str3);
                }
                byte[] m41277a = m41277a(str3);
                if (m41277a.length > f69466e) {
                    C26586j.m41074b(f69463a, "Too large data, discard ***");
                    return false;
                }
                int i = f69472k;
                if (z) {
                    i = f69471j;
                }
                SQLiteDatabase writableDatabase = this.f69473c.getWritableDatabase();
                ContentValues contentValues = new ContentValues();
                contentValues.put("projectid", str);
                contentValues.put("topic", str2);
                contentValues.put("attribute", C26578c.m41109a((Object) map));
                contentValues.put("gzipandencrypt", Integer.valueOf(i));
                contentValues.put("timestamp", Long.valueOf(System.currentTimeMillis()));
                contentValues.put("data", m41277a);
                long insert = writableDatabase.insert(C26539a.f69475b, null, contentValues);
                C26586j.m41080a(f69463a, "DB-Thread: EventManager.addEventToDatabase , row=" + insert);
                int i2 = (insert > (-1L) ? 1 : (insert == (-1L) ? 0 : -1));
                if (i2 != 0) {
                    if (C26586j.f69734a) {
                        C26586j.m41080a(f69463a, "添加后，DB 中事件个数为 " + m41266f());
                    }
                    m41274a(false);
                }
                return i2 != 0;
            }
        } catch (Exception e) {
            C26586j.m41073b(f69463a, "EventManager.addEvent exception: ", e);
            return false;
        }
    }

    /* renamed from: a */
    public synchronized void m41276a(String str, String str2, String str3, Map<String, String> map, boolean z) {
        C26536a.m41288a(new RunnableC26540d(this, map, str, str2, str3, z));
    }

    /* renamed from: a */
    public int m41275a(List<C26531c> list) {
        synchronized (this.f69473c) {
            if (list != null) {
                try {
                    if (list.size() != 0) {
                        try {
                            SQLiteDatabase writableDatabase = this.f69473c.getWritableDatabase();
                            boolean z = true;
                            StringBuilder sb2 = new StringBuilder(((Long.toString(list.get(0).m41303b()).length() + 1) * list.size()) + 16);
                            sb2.append("_id");
                            sb2.append(" in (");
                            sb2.append(list.get(0).m41303b());
                            int size = list.size();
                            for (int i = 1; i < size; i++) {
                                sb2.append(",");
                                sb2.append(list.get(i).m41303b());
                            }
                            sb2.append(")");
                            int delete = writableDatabase.delete(C26539a.f69475b, sb2.toString(), null);
                            C26586j.m41080a(f69463a, "*** *** deleted events count " + delete);
                            long m41266f = m41280a().m41266f();
                            if (m41266f != 0) {
                                z = false;
                            }
                            m41274a(z);
                            C26586j.m41080a(f69463a, "after delete DB record remains=" + m41266f);
                            return delete;
                        } catch (Exception e) {
                            C26586j.m41074b(f69463a, "e=" + e);
                            return 0;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return 0;
        }
    }

    /* renamed from: a */
    public synchronized void m41274a(boolean z) {
        f69470i = z;
    }

    /* renamed from: a */
    public static byte[] m41277a(String str) {
        return C26521a.m41370a(str.getBytes(), C26524d.m41343a(C26523c.m41354a(), true).getBytes());
    }

    /* renamed from: a */
    public static String m41273a(byte[] bArr) {
        return new String(C26521a.m41366b(bArr, C26524d.m41343a(C26523c.m41354a(), true).getBytes()));
    }

    /* renamed from: b */
    public int m41270b(List<C26531c> list) {
        synchronized (this.f69473c) {
            if (list != null) {
                try {
                    if (list.size() != 0) {
                        try {
                            SQLiteDatabase writableDatabase = this.f69473c.getWritableDatabase();
                            boolean z = true;
                            StringBuilder sb2 = new StringBuilder(((Long.toString(list.get(0).m41303b()).length() + 1) * list.size()) + 16);
                            sb2.append("_id");
                            sb2.append(" in (");
                            int size = list.size();
                            boolean z2 = false;
                            for (int i = 0; i < size; i++) {
                                if (C26601v.m40958a(list.get(i).m41295g(), 86400000L)) {
                                    if (i == size - 1) {
                                        sb2.append(list.get(i).m41303b());
                                    } else {
                                        sb2.append(list.get(i).m41303b());
                                        sb2.append(",");
                                    }
                                    z2 = true;
                                }
                            }
                            sb2.append(")");
                            if (z2) {
                                C26586j.m41080a(f69463a, "*** *** deleted events sb id " + sb2.toString());
                                int delete = writableDatabase.delete(C26539a.f69475b, sb2.toString(), null);
                                C26586j.m41080a(f69463a, "*** *** deleted events count " + delete);
                                long m41266f = m41280a().m41266f();
                                if (m41266f != 0) {
                                    z = false;
                                }
                                m41274a(z);
                                C26586j.m41080a(f69463a, "after delete DB record remains=" + m41266f);
                                return delete;
                            }
                            return 0;
                        } catch (Exception e) {
                            C26586j.m41074b(f69463a, "e=" + e);
                            return 0;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return 0;
        }
    }
}
