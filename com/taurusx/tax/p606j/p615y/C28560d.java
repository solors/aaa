package com.taurusx.tax.p606j.p615y;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.taurusx.tax.j.y.d */
/* loaded from: classes7.dex */
public class C28560d {

    /* renamed from: b */
    public static C28560d f74046b;

    /* renamed from: a */
    public ConcurrentHashMap<String, Object> f74047a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static C28560d m37928a() {
        if (f74046b == null) {
            f74046b = new C28560d();
        }
        return f74046b;
    }

    /* renamed from: a */
    public void m37927a(String str, Object obj) {
        try {
            this.f74047a.put(str, obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
