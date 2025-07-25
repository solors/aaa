package com.inmobi.media;

/* renamed from: com.inmobi.media.fa */
/* loaded from: classes6.dex */
public final class C19275fa {

    /* renamed from: a */
    public final int f48231a;

    /* renamed from: b */
    public final int f48232b;

    public C19275fa(int i, int i2) {
        this.f48231a = i;
        this.f48232b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19275fa)) {
            return false;
        }
        C19275fa c19275fa = (C19275fa) obj;
        if (this.f48231a == c19275fa.f48231a && this.f48232b == c19275fa.f48232b && Double.compare(1.0d, 1.0d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f48232b);
        return Double.hashCode(1.0d) + ((hashCode + (Integer.hashCode(this.f48231a) * 31)) * 31);
    }

    public final String toString() {
        return "RetryPolicy(maxNoOfRetries=" + this.f48231a + ", delayInMillis=" + this.f48232b + ", delayFactor=1.0)";
    }
}
