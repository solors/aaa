package com.chartboost.sdk.impl;

/* renamed from: com.chartboost.sdk.impl.da */
/* loaded from: classes3.dex */
public final class C9816da {

    /* renamed from: a */
    public final long f21919a;

    /* renamed from: b */
    public final long f21920b;

    /* renamed from: c */
    public final long f21921c;

    public C9816da(long j, long j2, long j3) {
        this.f21919a = j;
        this.f21920b = j2;
        this.f21921c = j3;
    }

    /* renamed from: a */
    public final long m81778a() {
        return this.f21919a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9816da)) {
            return false;
        }
        C9816da c9816da = (C9816da) obj;
        if (this.f21919a == c9816da.f21919a && this.f21920b == c9816da.f21920b && this.f21921c == c9816da.f21921c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f21919a) * 31) + Long.hashCode(this.f21920b)) * 31) + Long.hashCode(this.f21921c);
    }

    public String toString() {
        long j = this.f21919a;
        long j2 = this.f21920b;
        long j3 = this.f21921c;
        return "TimeSourceBodyFields(currentTimeMillis=" + j + ", nanoTime=" + j2 + ", uptimeMillis=" + j3 + ")";
    }
}
