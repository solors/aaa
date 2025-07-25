package com.amazon.p047a.p048a.p059h;

import com.ironsource.C21114v8;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.amazon.a.a.h.a */
/* loaded from: classes2.dex */
public class Metric implements Serializable {

    /* renamed from: a */
    public static final String f2404a = "name";

    /* renamed from: b */
    public static final String f2405b = "time";

    /* renamed from: c */
    private static final long f2406c = 1;

    /* renamed from: d */
    private final Map<String, String> f2407d;

    public Metric(String str) {
        HashMap hashMap = new HashMap();
        this.f2407d = hashMap;
        hashMap.put("name", str);
        hashMap.put(f2405b, String.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: a */
    public Metric m103116a(String str, String str2) {
        this.f2407d.put(str, str2);
        return this;
    }

    public String toString() {
        return "Metric: [" + this.f2407d.toString() + C21114v8.C21123i.f54139e;
    }

    /* renamed from: a */
    public Map<String, String> m103117a() {
        return this.f2407d;
    }
}
