package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Im */
/* loaded from: classes9.dex */
public class C33977Im implements InterfaceC34355Yh {

    /* renamed from: a */
    public final int f93039a;

    /* renamed from: b */
    public final int f93040b;

    /* renamed from: c */
    public int f93041c = 0;

    public C33977Im(int i, int i2) {
        this.f93039a = i;
        this.f93040b = i2;
    }

    /* renamed from: a */
    public final int m22535a() {
        return this.f93040b;
    }

    /* renamed from: b */
    public final boolean m22534b() {
        int i = this.f93041c;
        this.f93041c = i + 1;
        if (i < this.f93039a) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void m22533c() {
        this.f93041c = 0;
    }
}
