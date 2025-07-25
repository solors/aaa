package com.applovin.impl;

/* renamed from: com.applovin.impl.t5 */
/* loaded from: classes2.dex */
public class C5541t5 implements InterfaceC5303s4 {

    /* renamed from: b */
    private final long f10816b = -9223372036854775807L;

    /* renamed from: a */
    private final long f10815a = -9223372036854775807L;

    /* renamed from: c */
    private final boolean f10817c = false;

    @Override // com.applovin.impl.InterfaceC5303s4
    /* renamed from: a */
    public boolean mo94545a(InterfaceC5193qh interfaceC5193qh) {
        interfaceC5193qh.mo96331u();
        return true;
    }

    @Override // com.applovin.impl.InterfaceC5303s4
    /* renamed from: b */
    public boolean mo94539b(InterfaceC5193qh interfaceC5193qh) {
        interfaceC5193qh.mo96355b();
        return true;
    }

    @Override // com.applovin.impl.InterfaceC5303s4
    /* renamed from: c */
    public boolean mo94537c(InterfaceC5193qh interfaceC5193qh) {
        if (!this.f10817c) {
            interfaceC5193qh.mo96368B();
            return true;
        } else if (mo94540b() && interfaceC5193qh.mo96327y()) {
            m94542a(interfaceC5193qh, -this.f10815a);
            return true;
        } else {
            return true;
        }
    }

    @Override // com.applovin.impl.InterfaceC5303s4
    /* renamed from: d */
    public boolean mo94536d(InterfaceC5193qh interfaceC5193qh) {
        if (!this.f10817c) {
            interfaceC5193qh.mo96329w();
            return true;
        } else if (mo94546a() && interfaceC5193qh.mo96327y()) {
            m94542a(interfaceC5193qh, this.f10816b);
            return true;
        } else {
            return true;
        }
    }

    @Override // com.applovin.impl.InterfaceC5303s4
    /* renamed from: e */
    public boolean mo94535e(InterfaceC5193qh interfaceC5193qh) {
        interfaceC5193qh.mo96366D();
        return true;
    }

    @Override // com.applovin.impl.InterfaceC5303s4
    /* renamed from: a */
    public boolean mo94543a(InterfaceC5193qh interfaceC5193qh, int i, long j) {
        interfaceC5193qh.mo96361a(i, j);
        return true;
    }

    @Override // com.applovin.impl.InterfaceC5303s4
    /* renamed from: b */
    public boolean mo94538b(InterfaceC5193qh interfaceC5193qh, boolean z) {
        interfaceC5193qh.mo96356a(z);
        return true;
    }

    @Override // com.applovin.impl.InterfaceC5303s4
    /* renamed from: a */
    public boolean mo94544a(InterfaceC5193qh interfaceC5193qh, int i) {
        interfaceC5193qh.mo96362a(i);
        return true;
    }

    @Override // com.applovin.impl.InterfaceC5303s4
    /* renamed from: b */
    public boolean mo94540b() {
        return !this.f10817c || this.f10815a > 0;
    }

    @Override // com.applovin.impl.InterfaceC5303s4
    /* renamed from: a */
    public boolean mo94541a(InterfaceC5193qh interfaceC5193qh, boolean z) {
        interfaceC5193qh.mo96350b(z);
        return true;
    }

    @Override // com.applovin.impl.InterfaceC5303s4
    /* renamed from: a */
    public boolean mo94546a() {
        return !this.f10817c || this.f10816b > 0;
    }

    /* renamed from: a */
    private static void m94542a(InterfaceC5193qh interfaceC5193qh, long j) {
        long currentPosition = interfaceC5193qh.getCurrentPosition() + j;
        long duration = interfaceC5193qh.getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        interfaceC5193qh.mo96360a(Math.max(currentPosition, 0L));
    }
}
