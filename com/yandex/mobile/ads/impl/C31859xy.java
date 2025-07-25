package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.xy */
/* loaded from: classes8.dex */
public final class C31859xy implements en1 {

    /* renamed from: a */
    private int f87928a;

    /* renamed from: b */
    private int f87929b;

    /* renamed from: c */
    private final int f87930c;

    /* renamed from: d */
    private final float f87931d;

    public C31859xy() {
        this(1.0f, 2500, 1);
    }

    @Override // com.yandex.mobile.ads.impl.en1
    /* renamed from: a */
    public final int mo27163a() {
        return this.f87928a;
    }

    @Override // com.yandex.mobile.ads.impl.en1
    /* renamed from: b */
    public final int mo27161b() {
        return this.f87929b;
    }

    public C31859xy(float f, int i, int i2) {
        this.f87928a = i;
        this.f87930c = i2;
        this.f87931d = f;
    }

    @Override // com.yandex.mobile.ads.impl.en1
    /* renamed from: a */
    public final void mo27162a(yc2 yc2Var) throws yc2 {
        int i = this.f87929b + 1;
        this.f87929b = i;
        int i2 = this.f87928a;
        this.f87928a = i2 + ((int) (i2 * this.f87931d));
        if (i > this.f87930c) {
            throw yc2Var;
        }
    }
}
