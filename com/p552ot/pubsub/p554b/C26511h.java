package com.p552ot.pubsub.p554b;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Log;
import com.p552ot.pubsub.p559g.C26536a;
import com.p552ot.pubsub.util.C26577b;
import com.p552ot.pubsub.util.C26586j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ot.pubsub.b.h */
/* loaded from: classes7.dex */
public class C26511h {

    /* renamed from: a */
    private static final String f69345a = "ConfigDbManager";

    /* renamed from: e */
    private static final int f69346e = 100;

    /* renamed from: b */
    private C26510g f69347b;

    /* renamed from: c */
    private ConcurrentHashMap<String, C26516l> f69348c;

    /* renamed from: d */
    private ConcurrentHashMap<String, Boolean> f69349d;

    /* renamed from: com.ot.pubsub.b.h$a */
    /* loaded from: classes7.dex */
    private static class C26512a {

        /* renamed from: a */
        private static final C26511h f69350a = new C26511h(null);

        private C26512a() {
        }
    }

    /* synthetic */ C26511h(RunnableC26513i runnableC26513i) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m41394b(ArrayList<C26516l> arrayList) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                SQLiteDatabase writableDatabase = this.f69347b.getWritableDatabase();
                try {
                    writableDatabase.beginTransaction();
                    Iterator<C26516l> it = arrayList.iterator();
                    while (it.hasNext()) {
                        C26516l next = it.next();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("app_id", next.f69357a);
                        contentValues.put("timestamp", Long.valueOf(next.f69359c));
                        JSONObject jSONObject = next.f69361e;
                        if (jSONObject != null) {
                            contentValues.put(C26510g.f69339e, jSONObject.toString());
                        }
                        String str = next.f69360d;
                        if (str != null) {
                            contentValues.put(C26510g.f69340f, str);
                        }
                        if (DatabaseUtils.queryNumEntries(writableDatabase, C26510g.f69336b, "app_id=?", new String[]{next.f69357a}) > 0) {
                            int update = writableDatabase.update(C26510g.f69336b, contentValues, "app_id=?", new String[]{next.f69357a});
                            C26586j.m41080a(f69345a, "database updated, row: " + update);
                        } else {
                            long insert = writableDatabase.insert(C26510g.f69336b, null, contentValues);
                            C26586j.m41080a(f69345a, "database inserted, row: " + insert);
                        }
                        this.f69349d.put(next.f69357a, Boolean.TRUE);
                    }
                    writableDatabase.setTransactionSuccessful();
                    try {
                        writableDatabase.endTransaction();
                    } catch (Exception e) {
                        C26586j.m41074b(f69345a, "Exception while endTransaction:" + e);
                    }
                } catch (Exception e2) {
                    e = e2;
                    sQLiteDatabase = writableDatabase;
                    C26586j.m41073b(f69345a, "updateToDb error: ", e);
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.endTransaction();
                        } catch (Exception e3) {
                            C26586j.m41074b(f69345a, "Exception while endTransaction:" + e3);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    sQLiteDatabase = writableDatabase;
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.endTransaction();
                        } catch (Exception e4) {
                            C26586j.m41074b(f69345a, "Exception while endTransaction:" + e4);
                        }
                    }
                    throw th;
                }
            } catch (Exception e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: c */
    private JSONObject m41391c(String str, String str2) {
        JSONObject jSONObject;
        JSONArray optJSONArray;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                if (this.f69348c.get(str) == null || (this.f69349d.containsKey(str) && this.f69349d.get(str).booleanValue())) {
                    m41396b(str);
                }
                C26516l c26516l = this.f69348c.get(str);
                if (c26516l != null && (jSONObject = c26516l.f69361e) != null && (optJSONArray = jSONObject.optJSONArray("events")) != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                        if (TextUtils.equals(str2, jSONObject2.optString("event"))) {
                            if (C26586j.f69734a) {
                                C26586j.m41080a(f69345a, "getEventConfig:" + jSONObject2.toString());
                            }
                            return jSONObject2;
                        }
                    }
                }
            } catch (Exception e) {
                Log.e(f69345a, "getEventConfig error: " + e.toString());
            }
        }
        return null;
    }

    /* renamed from: d */
    public String m41390d(String str) {
        C26516l m41388f = m41388f(str);
        if (m41388f != null) {
            return m41388f.f69360d;
        }
        return "";
    }

    /* renamed from: e */
    public int m41389e(String str) {
        JSONObject jSONObject;
        C26516l m41388f = m41388f(str);
        if (m41388f != null && (jSONObject = m41388f.f69361e) != null) {
            return jSONObject.optInt("version");
        }
        return 0;
    }

    /* renamed from: f */
    public C26516l m41388f(String str) {
        C26586j.m41080a(f69345a, "getAppConfigData start, appId: " + str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            if (this.f69348c.get(str) == null || (this.f69349d.containsKey(str) && this.f69349d.get(str).booleanValue())) {
                m41396b(str);
            }
        } catch (Exception e) {
            C26586j.m41074b(f69345a, "getConfig error: " + e.getMessage());
        }
        return this.f69348c.get(str);
    }

    private C26511h() {
        this.f69348c = new ConcurrentHashMap<>();
        this.f69349d = new ConcurrentHashMap<>();
        this.f69347b = new C26510g(C26577b.m41121a());
    }

    /* renamed from: a */
    public static C26511h m41408a() {
        return C26512a.f69350a;
    }

    /* renamed from: a */
    public void m41398a(ArrayList<C26516l> arrayList) {
        C26536a.m41288a(new RunnableC26513i(this, arrayList));
    }

    /* renamed from: a */
    public void m41405a(String str) {
        FutureTask futureTask = new FutureTask(new RunnableC26514j(this, str), null);
        C26536a.m41288a(futureTask);
        try {
            futureTask.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public boolean m41399a(String str, String str2, String str3, boolean z) {
        try {
            JSONObject m41391c = m41391c(str, str2);
            if (m41391c == null) {
                C26586j.m41080a(f69345a, "config not available, use default value");
                return z;
            }
            return m41391c.getBoolean(str3);
        } catch (Exception e) {
            C26586j.m41080a(f69345a, "getBoolean: " + e.toString());
            return z;
        }
    }

    /* renamed from: c */
    public String m41392c(String str) {
        JSONObject jSONObject;
        C26516l m41388f = m41388f(str);
        return (m41388f == null || (jSONObject = m41388f.f69361e) == null) ? "" : jSONObject.optString(C26502a.f69301g);
    }

    /* renamed from: a */
    public String m41400a(String str, String str2, String str3, String str4) {
        try {
            JSONObject m41391c = m41391c(str, str2);
            if (m41391c == null) {
                C26586j.m41080a(f69345a, "config not available, use default value");
                return str4;
            }
            return m41391c.getString(str3);
        } catch (Exception e) {
            C26586j.m41080a(f69345a, "getString: " + e.toString());
            return str4;
        }
    }

    /* renamed from: a */
    public int m41402a(String str, String str2, String str3, int i) {
        try {
            JSONObject m41391c = m41391c(str, str2);
            if (m41391c == null) {
                C26586j.m41080a(f69345a, "config not available, use default value");
                return i;
            }
            return m41391c.getInt(str3);
        } catch (Exception e) {
            C26586j.m41080a(f69345a, "getInt: " + e.toString());
            return i;
        }
    }

    /* renamed from: a */
    public long m41401a(String str, String str2, String str3, long j) {
        try {
            JSONObject m41391c = m41391c(str, str2);
            if (m41391c == null) {
                C26586j.m41080a(f69345a, "config not available, use default value");
                return j;
            }
            return m41391c.getLong(str3);
        } catch (Exception e) {
            C26586j.m41074b(f69345a, "getLong: " + e.toString());
            return j;
        }
    }

    /* renamed from: b */
    public void m41396b(String str) {
        FutureTask futureTask = new FutureTask(new CallableC26515k(this, str));
        C26536a.m41288a(futureTask);
        try {
            C26516l c26516l = (C26516l) futureTask.get(5L, TimeUnit.SECONDS);
            if (c26516l != null) {
                this.f69348c.put(str, c26516l);
                this.f69349d.put(str, Boolean.FALSE);
                if (C26586j.f69734a) {
                    C26586j.m41080a(f69345a, "getConfig   appId :" + str + " config: " + c26516l.toString());
                }
            }
        } catch (Exception e) {
            C26586j.m41074b(f69345a, "getConfig error: " + e.toString());
        }
    }

    /* renamed from: a */
    public double m41403a(String str, String str2, String str3, double d) {
        try {
            JSONObject m41391c = m41391c(str, str2);
            if (m41391c == null) {
                C26586j.m41080a(f69345a, "config not available, use default value");
                return d;
            }
            return m41391c.getDouble(str3);
        } catch (Exception e) {
            C26586j.m41074b(f69345a, "getDouble: " + e.toString());
            return d;
        }
    }

    /* renamed from: a */
    public boolean m41404a(String str, String str2) {
        JSONObject jSONObject;
        try {
            C26516l m41388f = m41388f(str);
            if (m41388f == null || (jSONObject = m41388f.f69361e) == null || !jSONObject.has(str2)) {
                return false;
            }
            return m41388f.f69361e.optBoolean(str2);
        } catch (Exception e) {
            C26586j.m41074b(f69345a, "getAppLevelBoolean" + e.toString());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static int m41393b(JSONObject jSONObject) {
        try {
            int optInt = jSONObject.optInt(C26502a.f69299e, 100);
            if (optInt < 0 || optInt > 100) {
                return 100;
            }
            return optInt;
        } catch (Exception e) {
            C26586j.m41080a(f69345a, "getCommonSample Exception:" + e.getMessage());
            return 100;
        }
    }

    /* renamed from: b */
    public long m41395b(String str, String str2) {
        C26516l c26516l;
        if (TextUtils.isEmpty(str)) {
            return 100L;
        }
        try {
            if (this.f69348c.get(str) == null) {
                m41396b(str);
            }
            if (this.f69348c.get(str) != null) {
                int m41402a = m41402a(str, str2, C26502a.f69299e, -1);
                if (m41402a == -1 && (c26516l = this.f69348c.get(str)) != null) {
                    C26586j.m41080a(f69345a, "will return common sample " + c26516l.f69358b);
                    return c26516l.f69358b;
                }
                C26586j.m41080a(f69345a, "will return event sample " + m41402a);
                return m41402a;
            }
        } catch (Exception e) {
            C26586j.m41074b(f69345a, "getAppEventSample" + e.toString());
        }
        C26586j.m41080a(f69345a, "will return def sample");
        return 100L;
    }
}
