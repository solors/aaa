package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.fl */
/* loaded from: classes8.dex */
public abstract class AbstractC30321fl {

    /* renamed from: b */
    private int f79102b;

    /* renamed from: b */
    public final void m34140b(int i) {
        this.f79102b = i | this.f79102b;
    }

    /* renamed from: c */
    public final void m34139c() {
        this.f79102b &= Integer.MAX_VALUE;
    }

    /* renamed from: d */
    public final boolean m34137d() {
        return m34138c(268435456);
    }

    /* renamed from: e */
    public final boolean m34135e() {
        return m34138c(Integer.MIN_VALUE);
    }

    /* renamed from: f */
    public final boolean m34134f() {
        return m34138c(4);
    }

    /* renamed from: g */
    public final boolean m34133g() {
        return m34138c(1);
    }

    /* renamed from: b */
    public void mo28933b() {
        this.f79102b = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean m34138c(int i) {
        return (this.f79102b & i) == i;
    }

    /* renamed from: d */
    public final void m34136d(int i) {
        this.f79102b = i;
    }
}
