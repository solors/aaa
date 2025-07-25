package com.facebook.ads.redexgen.p370X;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: com.facebook.ads.redexgen.X.JB */
/* loaded from: assets/audience_network.dex */
public class C12004JB implements InterfaceC13252dj {
    public final /* synthetic */ C11985Is A00;

    public C12004JB(C11985Is c11985Is) {
        this.A00 = c11985Is;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC13252dj
    public final void ADV() {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        ArrayList<Runnable> arrayList;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        InterfaceC13252dj interfaceC13252dj;
        InterfaceC13252dj interfaceC13252dj2;
        linkedHashMap = this.A00.A06;
        synchronized (linkedHashMap) {
            linkedHashMap2 = this.A00.A06;
            arrayList = new ArrayList(linkedHashMap2.size());
            linkedHashMap3 = this.A00.A06;
            for (Runnable runnable : linkedHashMap3.values()) {
                if (runnable != null) {
                    arrayList.add(runnable);
                }
            }
            linkedHashMap4 = this.A00.A06;
            linkedHashMap4.clear();
        }
        for (Runnable runnable2 : arrayList) {
            runnable2.run();
        }
        interfaceC13252dj = this.A00.A00;
        if (interfaceC13252dj != null) {
            interfaceC13252dj2 = this.A00.A00;
            interfaceC13252dj2.ADV();
        }
    }
}
