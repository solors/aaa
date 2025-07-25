package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;

/* renamed from: io.appmetrica.analytics.impl.Yb */
/* loaded from: classes9.dex */
public final class C34349Yb {

    /* renamed from: a */
    public int f93821a = 5;

    /* renamed from: b */
    public final C34493e f93822b;

    public C34349Yb(InterfaceC34413b0 interfaceC34413b0) {
        this.f93822b = new C34493e(new C35037yb(interfaceC34413b0));
    }

    /* renamed from: b */
    public static final void m22066b(AnrListener anrListener) {
        anrListener.onAppNotResponding();
    }

    /* renamed from: a */
    public final void m22067a(final AnrListener anrListener) {
        C34493e c34493e = this.f93822b;
        c34493e.f94222a.add(new InterfaceC34439c() { // from class: io.appmetrica.analytics.impl.ro
            @Override // io.appmetrica.analytics.impl.InterfaceC34439c
            public final void onAppNotResponding() {
                C34349Yb.m22066b(anrListener);
            }
        });
    }
}
