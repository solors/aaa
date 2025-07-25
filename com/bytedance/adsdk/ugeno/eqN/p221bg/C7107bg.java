package com.bytedance.adsdk.ugeno.eqN.p221bg;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.adsdk.ugeno.eqN.bg.bg */
/* loaded from: classes3.dex */
public class C7107bg {

    /* renamed from: bg */
    private volatile Map<String, InterfaceC7106bX> f15278bg = new HashMap();

    /* renamed from: bg */
    public InterfaceC7106bX m90029bg(String str) {
        if (this.f15278bg.containsKey(str) && this.f15278bg.get(str) != null) {
            return this.f15278bg.get(str);
        }
        C7105IL c7105il = new C7105IL();
        this.f15278bg.put(str, c7105il);
        return c7105il;
    }

    /* renamed from: bg */
    public void m90028bg(String str, InterfaceC7106bX interfaceC7106bX) {
        if (!this.f15278bg.containsKey(str) || this.f15278bg.get(str) == null) {
            this.f15278bg.put(str, interfaceC7106bX);
        }
    }
}
