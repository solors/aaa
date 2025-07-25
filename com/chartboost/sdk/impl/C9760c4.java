package com.chartboost.sdk.impl;

/* renamed from: com.chartboost.sdk.impl.c4 */
/* loaded from: classes3.dex */
public final class C9760c4 {

    /* renamed from: a */
    public final int f21792a;

    /* renamed from: b */
    public final int f21793b;

    public C9760c4(int i, int i2) {
        this.f21792a = i;
        this.f21793b = i2;
    }

    /* renamed from: a */
    public final int m81928a() {
        return this.f21793b;
    }

    /* renamed from: b */
    public final int m81927b() {
        return this.f21792a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9760c4)) {
            return false;
        }
        C9760c4 c9760c4 = (C9760c4) obj;
        if (this.f21792a == c9760c4.f21792a && this.f21793b == c9760c4.f21793b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f21792a) * 31) + Integer.hashCode(this.f21793b);
    }

    public String toString() {
        int i = this.f21792a;
        int i2 = this.f21793b;
        return "DisplaySize(width=" + i + ", height=" + i2 + ")";
    }
}
