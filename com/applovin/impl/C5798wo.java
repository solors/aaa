package com.applovin.impl;

/* renamed from: com.applovin.impl.wo */
/* loaded from: classes2.dex */
public final class C5798wo {

    /* renamed from: a */
    public final int f11803a;

    /* renamed from: b */
    public final C5516si[] f11804b;

    /* renamed from: c */
    public final InterfaceC4445g8[] f11805c;

    /* renamed from: d */
    public final Object f11806d;

    public C5798wo(C5516si[] c5516siArr, InterfaceC4445g8[] interfaceC4445g8Arr, Object obj) {
        this.f11804b = c5516siArr;
        this.f11805c = (InterfaceC4445g8[]) interfaceC4445g8Arr.clone();
        this.f11806d = obj;
        this.f11803a = c5516siArr.length;
    }

    /* renamed from: a */
    public boolean m93405a(C5798wo c5798wo) {
        if (c5798wo == null || c5798wo.f11805c.length != this.f11805c.length) {
            return false;
        }
        for (int i = 0; i < this.f11805c.length; i++) {
            if (!m93404a(c5798wo, i)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public boolean m93404a(C5798wo c5798wo, int i) {
        return c5798wo != null && AbstractC5863xp.m93016a(this.f11804b[i], c5798wo.f11804b[i]) && AbstractC5863xp.m93016a(this.f11805c[i], c5798wo.f11805c[i]);
    }

    /* renamed from: a */
    public boolean m93406a(int i) {
        return this.f11804b[i] != null;
    }
}
