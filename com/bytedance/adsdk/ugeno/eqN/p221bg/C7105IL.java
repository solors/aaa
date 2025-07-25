package com.bytedance.adsdk.ugeno.eqN.p221bg;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.adsdk.ugeno.eqN.bg.IL */
/* loaded from: classes3.dex */
public class C7105IL implements InterfaceC7106bX {

    /* renamed from: bg */
    private List<InterfaceC7108eqN> f15277bg = new CopyOnWriteArrayList();

    @Override // com.bytedance.adsdk.ugeno.eqN.p221bg.InterfaceC7106bX
    /* renamed from: bg */
    public void mo90031bg(InterfaceC7108eqN interfaceC7108eqN) {
        this.f15277bg.add(interfaceC7108eqN);
    }

    @Override // com.bytedance.adsdk.ugeno.eqN.p221bg.InterfaceC7106bX
    /* renamed from: bg */
    public void mo90030bg(String str) {
        if (this.f15277bg.isEmpty()) {
            return;
        }
        for (InterfaceC7108eqN interfaceC7108eqN : this.f15277bg) {
            interfaceC7108eqN.mo90027bg(str);
        }
    }
}
