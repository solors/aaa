package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.Ab */
/* loaded from: classes9.dex */
public final class C33767Ab {

    /* renamed from: a */
    public final C34316X2 f92565a;

    /* renamed from: b */
    public final C34604i2 f92566b;

    /* renamed from: c */
    public final ArrayList f92567c;

    public C33767Ab(C34316X2 c34316x2, C34604i2 c34604i2) {
        ArrayList arrayList = new ArrayList();
        this.f92567c = arrayList;
        this.f92565a = c34316x2;
        arrayList.add(c34316x2);
        this.f92566b = c34604i2;
        arrayList.add(c34604i2);
    }

    /* renamed from: a */
    public final synchronized void m22780a() {
        Iterator it = this.f92567c.iterator();
        while (it.hasNext()) {
            ((InterfaceC35045yj) it.next()).onCreate();
        }
    }

    /* renamed from: a */
    public final synchronized void m22779a(C34666ka c34666ka) {
        this.f92567c.add(c34666ka);
    }
}
