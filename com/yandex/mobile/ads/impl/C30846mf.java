package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.mf */
/* loaded from: classes8.dex */
public final class C30846mf {

    /* renamed from: a */
    private final float f82166a;

    public C30846mf(float f) {
        this.f82166a = f == 0.0f ? 1.7777778f : f;
    }

    /* renamed from: a */
    public final int m32025a(int i) {
        return Math.round(i / this.f82166a);
    }

    /* renamed from: b */
    public final int m32024b(int i) {
        return Math.round(i * this.f82166a);
    }
}
