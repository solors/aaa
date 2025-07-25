package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
final class sx1 extends x90 {

    /* renamed from: b */
    private final long f85435b;

    public sx1(C30513hy c30513hy, long j) {
        super(c30513hy);
        boolean z;
        if (c30513hy.mo27622a() >= j) {
            z = true;
        } else {
            z = false;
        }
        C30937nf.m31567a(z);
        this.f85435b = j;
    }

    @Override // com.yandex.mobile.ads.impl.x90, com.yandex.mobile.ads.impl.o50
    /* renamed from: a */
    public final long mo27622a() {
        return super.mo27622a() - this.f85435b;
    }

    @Override // com.yandex.mobile.ads.impl.x90, com.yandex.mobile.ads.impl.o50
    /* renamed from: b */
    public final long mo27618b() {
        return super.mo27618b() - this.f85435b;
    }

    @Override // com.yandex.mobile.ads.impl.x90, com.yandex.mobile.ads.impl.o50
    /* renamed from: d */
    public final long mo27613d() {
        return super.mo27613d() - this.f85435b;
    }
}
