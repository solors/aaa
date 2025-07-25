package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.Jk */
/* loaded from: classes9.dex */
public final class C33999Jk {

    /* renamed from: a */
    public final /* synthetic */ C34047Lk f93085a;

    public C33999Jk(C34047Lk c34047Lk) {
        this.f93085a = c34047Lk;
    }

    /* renamed from: a */
    public final void m22506a(String str, EnumC34095Nk enumC34095Nk, C34650jl c34650jl) {
        ArrayList arrayList;
        synchronized (this.f93085a.f93194b) {
            Collection collection = (Collection) this.f93085a.f93193a.f94995a.get(str);
            if (collection == null) {
                arrayList = new ArrayList();
            } else {
                arrayList = new ArrayList(collection);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC34262Uk) it.next()).mo21633a(enumC34095Nk, c34650jl);
        }
    }
}
