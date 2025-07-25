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
import com.p552ot.pubsub.p560h.C26552a;
import com.p552ot.pubsub.util.C26577b;
import com.p552ot.pubsub.util.C26578c;
import com.p552ot.pubsub.util.C26586j;
import com.p552ot.pubsub.util.C26601v;
import java.util.List;
import java.util.Map;

/* renamed from: com.ot.pubsub.g.f */
/* loaded from: classes7.dex */
public class C26542f {

    /* renamed from: a */
    private static final String f69492a = "MessageOTManager";

    /* renamed from: b */
    private static C26542f f69493b = null;

    /* renamed from: d */
    private static final int f69494d = 1000;

    /* renamed from: e */
    private static final int f69495e = 512000;

    /* renamed from: f */
    private static final int f69496f = 1024000;

    /* renamed from: g */
    private static final int f69497g = 7;

    /* renamed from: h */
    private static final String f69498h = "priority ASC, _id ASC";

    /* renamed from: i */
    private static volatile boolean f69499i = false;

    /* renamed from: j */
    private static volatile int f69500j = 1;

    /* renamed from: k */
    private static volatile int f69501k;

    /* renamed from: c */
    private C26543a f69502c = new C26543a(C26577b.m41121a());

    private C26542f() {
        m41252c();
    }

    /* renamed from: b */
    public static void m41255b() {
        if (f69493b == null) {
            synchronized (C26542f.class) {
                if (f69493b == null) {
                    f69493b = new C26542f();
                }
            }
        }
    }

    /* renamed from: f */
    private void m41249f() {
        try {
            this.f69502c.getWritableDatabase().delete(C26543a.f69504b, null, null);
            m41257a(true);
            C26586j.m41080a(f69492a, "delete table othbpubsub");
        } catch (Exception e) {
            C26586j.m41074b(f69492a, "delete table error: " + e.getMessage());
        }
    }

    /* renamed from: c */
    public void m41252c() {
        C26536a.m41288a(new RunnableC26545h(this));
    }

    /* renamed from: d */
    public synchronized boolean m41251d() {
        return f69499i;
    }

    /* renamed from: e */
    public long m41250e() {
        return DatabaseUtils.queryNumEntries(this.f69502c.getReadableDatabase(), C26543a.f69504b);
    }

    /* renamed from: a */
    public static C26542f m41264a() {
        if (f69493b == null) {
            m41255b();
        }
        return f69493b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public boolean m41254b(String str, String str2, C26552a c26552a, Map<String, String> map) {
        try {
            synchronized (this.f69502c) {
                if (c26552a != null && c26552a.m41205i() && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    byte[] m41260a = m41260a(c26552a.m41208f().toString());
                    if (m41260a.length > f69495e) {
                        C26586j.m41074b(f69492a, "Too large data, discard ***");
                        return false;
                    }
                    SQLiteDatabase writableDatabase = this.f69502c.getWritableDatabase();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("appid", c26552a.m41216b());
                    contentValues.put(C26543a.f69507e, c26552a.m41213c());
                    contentValues.put(C26543a.f69514l, c26552a.m41211d());
                    contentValues.put("projectid", str);
                    contentValues.put("topic", str2);
                    contentValues.put("attribute", C26578c.m41109a((Object) map));
                    contentValues.put("gzipandencrypt", Integer.valueOf(f69500j));
                    contentValues.put("timestamp", Long.valueOf(System.currentTimeMillis()));
                    contentValues.put("data", m41260a);
                    contentValues.put("priority", Integer.valueOf(c26552a.m41209e()));
                    long insert = writableDatabase.insert(C26543a.f69504b, null, contentValues);
                    C26586j.m41080a(f69492a, "DB-Thread: addOTMessageToDatabase , row=" + insert);
                    int i = (insert > (-1L) ? 1 : (insert == (-1L) ? 0 : -1));
                    if (i != 0) {
                        if (C26586j.f69734a) {
                            C26586j.m41080a(f69492a, "添加后，DB 中事件个数为 " + m41250e());
                        }
                        m41257a(false);
                    }
                    return i != 0;
                }
                C26586j.m41069c(f69492a, "addEventToDatabase message is inValid. topic:" + str2 + ", data EventName:" + c26552a.m41211d());
                return false;
            }
        } catch (Exception e) {
            C26586j.m41073b(f69492a, "addEvent exception: ", e);
            return false;
        }
    }

    /* renamed from: a */
    public synchronized void m41259a(String str, String str2, C26552a c26552a, Map<String, String> map) {
        C26536a.m41288a(new RunnableC26544g(this, map, str, str2, c26552a));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:8|(2:10|(5:62|63|64|65|66)(1:12))(1:69)|(1:14)(1:61)|15|(1:(1:59)(6:60|21|22|23|24|(2:26|(2:29|30)(1:28))(2:53|54)))(1:19)|20|21|22|23|24|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:33|(1:35)(2:44|(5:46|37|38|39|40))|36|37|38|39|40) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ee, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ef, code lost:
        com.p552ot.pubsub.util.C26586j.m41073b(com.p552ot.pubsub.p559g.C26542f.f69492a, "*** error ***", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x016d, code lost:
        if (r3 == null) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0175: MOVE  (r11 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:71:0x0175 */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0178 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0104 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.p552ot.pubsub.p564j.C26563a m41263a(int r36) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p552ot.pubsub.p559g.C26542f.m41263a(int):com.ot.pubsub.j.a");
    }

    /* renamed from: b */
    public int m41253b(List<C26531c> list) {
        synchronized (this.f69502c) {
            if (list != null) {
                try {
                    if (list.size() != 0) {
                        try {
                            SQLiteDatabase writableDatabase = this.f69502c.getWritableDatabase();
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
                                C26586j.m41080a(f69492a, "*** *** deleted events sb id " + sb2.toString());
                                int delete = writableDatabase.delete(C26543a.f69504b, sb2.toString(), null);
                                C26586j.m41080a(f69492a, "*** *** deleted events count " + delete);
                                long m41250e = m41264a().m41250e();
                                if (m41250e != 0) {
                                    z = false;
                                }
                                m41257a(z);
                                C26586j.m41080a(f69492a, "after delete DB record remains=" + m41250e);
                                return delete;
                            }
                            return 0;
                        } catch (Exception e) {
                            C26586j.m41074b(f69492a, "e=" + e);
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
    public int m41258a(List<C26531c> list) {
        synchronized (this.f69502c) {
            if (list != null) {
                try {
                    if (list.size() != 0) {
                        try {
                            SQLiteDatabase writableDatabase = this.f69502c.getWritableDatabase();
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
                            int delete = writableDatabase.delete(C26543a.f69504b, sb2.toString(), null);
                            C26586j.m41080a(f69492a, "*** *** deleted events count " + delete);
                            long m41250e = m41264a().m41250e();
                            if (m41250e != 0) {
                                z = false;
                            }
                            m41257a(z);
                            C26586j.m41080a(f69492a, "after delete DB record remains=" + m41250e);
                            return delete;
                        } catch (Exception e) {
                            C26586j.m41074b(f69492a, "e=" + e);
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
    public synchronized void m41257a(boolean z) {
        f69499i = z;
    }

    /* renamed from: a */
    public static byte[] m41260a(String str) {
        return C26521a.m41370a(str.getBytes(), C26524d.m41343a(C26523c.m41354a(), true).getBytes());
    }

    /* renamed from: a */
    public static String m41256a(byte[] bArr) {
        return new String(C26521a.m41366b(bArr, C26524d.m41343a(C26523c.m41354a(), true).getBytes()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.ot.pubsub.g.f$a */
    /* loaded from: classes7.dex */
    public static class C26543a extends SQLiteOpenHelper {

        /* renamed from: a */
        public static final String f69503a = "othbpubsub.db";

        /* renamed from: b */
        public static final String f69504b = "othbpubsub";

        /* renamed from: c */
        public static final String f69505c = "_id";

        /* renamed from: d */
        public static final String f69506d = "appid";

        /* renamed from: e */
        public static final String f69507e = "package";

        /* renamed from: f */
        public static final String f69508f = "projectid";

        /* renamed from: g */
        public static final String f69509g = "topic";

        /* renamed from: h */
        public static final String f69510h = "data";

        /* renamed from: i */
        public static final String f69511i = "attribute";

        /* renamed from: j */
        public static final String f69512j = "gzipandencrypt";

        /* renamed from: k */
        public static final String f69513k = "timestamp";

        /* renamed from: l */
        public static final String f69514l = "event_name";

        /* renamed from: m */
        public static final String f69515m = "priority";

        /* renamed from: n */
        private static final int f69516n = 1;

        /* renamed from: o */
        private static final String f69517o = "CREATE TABLE othbpubsub (_id INTEGER PRIMARY KEY AUTOINCREMENT,appid TEXT,package TEXT,event_name TEXT,projectid TEXT,topic TEXT,data BLOB,attribute BLOB,gzipandencrypt INTEGER,priority INTEGER,timestamp INTEGER)";

        public C26543a(Context context) {
            super(context, f69503a, (SQLiteDatabase.CursorFactory) null, 1);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(f69517o);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }
}
