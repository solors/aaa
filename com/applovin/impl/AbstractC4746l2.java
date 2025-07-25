package com.applovin.impl;

/* renamed from: com.applovin.impl.l2 */
/* loaded from: classes2.dex */
public abstract class AbstractC4746l2 {

    /* renamed from: a */
    private int f7616a;

    /* renamed from: b */
    public final void m97871b(int i) {
        this.f7616a = i | this.f7616a;
    }

    /* renamed from: c */
    public final void m97869c(int i) {
        this.f7616a = (~i) & this.f7616a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean m97867d(int i) {
        return (this.f7616a & i) == i;
    }

    /* renamed from: e */
    public final boolean m97866e() {
        return m97867d(4);
    }

    /* renamed from: f */
    public final boolean m97864f() {
        return m97867d(1);
    }

    /* renamed from: b */
    public void mo94598b() {
        this.f7616a = 0;
    }

    /* renamed from: c */
    public final boolean m97870c() {
        return m97867d(268435456);
    }

    /* renamed from: d */
    public final boolean m97868d() {
        return m97867d(Integer.MIN_VALUE);
    }

    /* renamed from: e */
    public final void m97865e(int i) {
        this.f7616a = i;
    }
}
