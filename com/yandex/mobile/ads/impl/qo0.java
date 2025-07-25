package com.yandex.mobile.ads.impl;

import java.util.Comparator;
import java.util.TreeSet;

/* loaded from: classes8.dex */
public final class qo0 implements InterfaceC31905yl {

    /* renamed from: a */
    private final long f84440a;

    /* renamed from: b */
    private final TreeSet<C30255em> f84441b = new TreeSet<>(new Comparator() { // from class: com.yandex.mobile.ads.impl.wu2
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return qo0.m30255b((C30255em) obj, (C30255em) obj2);
        }
    });

    /* renamed from: c */
    private long f84442c;

    public qo0(long j) {
        this.f84440a = j;
    }

    /* renamed from: a */
    public static int m30256a(C30255em c30255em, C30255em c30255em2) {
        long j = c30255em.f78707g;
        long j2 = c30255em2.f78707g;
        if (j - j2 != 0) {
            return j < j2 ? -1 : 1;
        } else if (!c30255em.f78702b.equals(c30255em2.f78702b)) {
            return c30255em.f78702b.compareTo(c30255em2.f78702b);
        } else {
            int i = ((c30255em.f78703c - c30255em2.f78703c) > 0L ? 1 : ((c30255em.f78703c - c30255em2.f78703c) == 0L ? 0 : -1));
            if (i == 0) {
                return 0;
            }
            return i < 0 ? -1 : 1;
        }
    }

    /* renamed from: b */
    public static /* synthetic */ int m30255b(C30255em c30255em, C30255em c30255em2) {
        return m30256a(c30255em, c30255em2);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31296rl.InterfaceC31298b
    /* renamed from: a */
    public final void mo29986a(InterfaceC31296rl interfaceC31296rl, C30255em c30255em) {
        this.f84441b.add(c30255em);
        this.f84442c += c30255em.f78704d;
        while (this.f84442c > this.f84440a && !this.f84441b.isEmpty()) {
            interfaceC31296rl.mo27766a(this.f84441b.first());
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31296rl.InterfaceC31298b
    /* renamed from: a */
    public final void mo29987a(C30255em c30255em) {
        this.f84441b.remove(c30255em);
        this.f84442c -= c30255em.f78704d;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31296rl.InterfaceC31298b
    /* renamed from: a */
    public final void mo29985a(InterfaceC31296rl interfaceC31296rl, C30255em c30255em, C30255em c30255em2) {
        mo29987a(c30255em);
        mo29986a(interfaceC31296rl, c30255em2);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31905yl
    /* renamed from: a */
    public final void mo26864a(InterfaceC31296rl interfaceC31296rl, long j) {
        if (j != -1) {
            while (this.f84442c + j > this.f84440a && !this.f84441b.isEmpty()) {
                interfaceC31296rl.mo27766a(this.f84441b.first());
            }
        }
    }
}
