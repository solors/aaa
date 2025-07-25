package com.applovin.impl;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.applovin.impl.p5 */
/* loaded from: classes2.dex */
public final class C5105p5 {

    /* renamed from: a */
    public final String f8988a;

    /* renamed from: b */
    public final C4310e9 f8989b;

    /* renamed from: c */
    public final C4310e9 f8990c;

    /* renamed from: d */
    public final int f8991d;

    /* renamed from: e */
    public final int f8992e;

    public C5105p5(String str, C4310e9 c4310e9, C4310e9 c4310e92, int i, int i2) {
        boolean z;
        if (i != 0 && i2 != 0) {
            z = false;
        } else {
            z = true;
        }
        AbstractC4100b1.m100580a(z);
        this.f8988a = AbstractC4100b1.m100581a(str);
        this.f8989b = (C4310e9) AbstractC4100b1.m100583a(c4310e9);
        this.f8990c = (C4310e9) AbstractC4100b1.m100583a(c4310e92);
        this.f8991d = i;
        this.f8992e = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5105p5.class != obj.getClass()) {
            return false;
        }
        C5105p5 c5105p5 = (C5105p5) obj;
        if (this.f8991d == c5105p5.f8991d && this.f8992e == c5105p5.f8992e && this.f8988a.equals(c5105p5.f8988a) && this.f8989b.equals(c5105p5.f8989b) && this.f8990c.equals(c5105p5.f8990c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((this.f8991d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f8992e) * 31) + this.f8988a.hashCode()) * 31) + this.f8989b.hashCode()) * 31) + this.f8990c.hashCode();
    }
}
