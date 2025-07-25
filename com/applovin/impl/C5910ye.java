package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.applovin.impl.ye */
/* loaded from: classes2.dex */
public class C5910ye {

    /* renamed from: a */
    private final List f12321a = Collections.synchronizedList(new ArrayList());

    /* renamed from: com.applovin.impl.ye$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC5911a {
        /* renamed from: a */
        void mo92756a(AbstractC4391fe abstractC4391fe);
    }

    /* renamed from: a */
    public void m92758a(InterfaceC5911a interfaceC5911a) {
        this.f12321a.add(interfaceC5911a);
    }

    /* renamed from: b */
    public void m92757b(InterfaceC5911a interfaceC5911a) {
        this.f12321a.remove(interfaceC5911a);
    }

    /* renamed from: a */
    public void m92759a(AbstractC4391fe abstractC4391fe) {
        Iterator it = new ArrayList(this.f12321a).iterator();
        while (it.hasNext()) {
            ((InterfaceC5911a) it.next()).mo92756a(abstractC4391fe);
        }
    }
}
