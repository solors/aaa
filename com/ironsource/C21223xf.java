package com.ironsource;

import android.util.Log;
import com.ironsource.C21145vp;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.xf */
/* loaded from: classes6.dex */
public class C21223xf {

    /* renamed from: b */
    private static C21223xf f54490b;

    /* renamed from: a */
    private C21126vb f54491a;

    private C21223xf() {
    }

    /* renamed from: a */
    private static C21223xf m54140a() {
        if (f54490b == null) {
            f54490b = new C21223xf();
        }
        return f54490b;
    }

    /* renamed from: a */
    public static void m54139a(C20630pb c20630pb, C21132vf c21132vf) {
        if (c20630pb != null) {
            try {
                m54140a().f54491a = new C21126vb(c20630pb, c21132vf);
            } catch (Exception e) {
                C20086i9.m57997d().m58003a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    /* renamed from: a */
    public static void m54138a(C21145vp.C21146a c21146a) {
        m54137a(c21146a, new HashMap());
    }

    /* renamed from: a */
    public static void m54137a(C21145vp.C21146a c21146a, Map<String, Object> map) {
        C21126vb c21126vb = m54140a().f54491a;
        if (c21126vb == null) {
            Log.d(C20517nb.f52175a, C20517nb.f52174U);
            return;
        }
        if (map != null) {
            map.put("eventid", Integer.valueOf(c21146a.f54262b));
        }
        c21126vb.m54497a(c21146a.f54261a, map);
    }
}
