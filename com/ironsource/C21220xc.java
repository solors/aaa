package com.ironsource;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.xc */
/* loaded from: classes6.dex */
public class C21220xc {

    /* renamed from: b */
    public static final String f54486b = "userId";

    /* renamed from: c */
    public static final String f54487c = "appKey";

    /* renamed from: d */
    private static C21220xc f54488d;

    /* renamed from: a */
    private JSONObject f54489a = new JSONObject();

    private C21220xc() {
    }

    /* renamed from: a */
    public static synchronized C21220xc m54147a() {
        C21220xc c21220xc;
        synchronized (C21220xc.class) {
            if (f54488d == null) {
                f54488d = new C21220xc();
            }
            c21220xc = f54488d;
        }
        return c21220xc;
    }

    /* renamed from: b */
    public synchronized JSONObject m54143b() {
        return this.f54489a;
    }

    /* renamed from: a */
    public synchronized String m54146a(String str) {
        return this.f54489a.optString(str);
    }

    /* renamed from: a */
    public synchronized void m54145a(String str, Object obj) {
        try {
            this.f54489a.put(str, obj);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
        }
    }

    /* renamed from: a */
    public synchronized void m54144a(Map<String, Object> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                m54145a(str, map.get(str));
            }
        }
    }
}
