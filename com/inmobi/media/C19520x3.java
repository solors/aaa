package com.inmobi.media;

/* renamed from: com.inmobi.media.x3 */
/* loaded from: classes6.dex */
public final class C19520x3 {

    /* renamed from: a */
    public final int f48868a;

    /* renamed from: b */
    public final long f48869b;

    /* renamed from: c */
    public final long f48870c;

    /* renamed from: d */
    public final long f48871d;

    /* renamed from: e */
    public final int f48872e;

    /* renamed from: f */
    public final int f48873f;

    /* renamed from: g */
    public final int f48874g;

    /* renamed from: h */
    public final int f48875h;

    /* renamed from: i */
    public final long f48876i;

    /* renamed from: j */
    public final long f48877j;

    /* renamed from: k */
    public String f48878k;

    public C19520x3(int i, long j, long j2, long j3, int i2, int i3, int i4, int i5, long j4, long j5) {
        this.f48868a = i;
        this.f48869b = j;
        this.f48870c = j2;
        this.f48871d = j3;
        this.f48872e = i2;
        this.f48873f = i3;
        this.f48874g = i4;
        this.f48875h = i5;
        this.f48876i = j4;
        this.f48877j = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19520x3)) {
            return false;
        }
        C19520x3 c19520x3 = (C19520x3) obj;
        if (this.f48868a == c19520x3.f48868a && this.f48869b == c19520x3.f48869b && this.f48870c == c19520x3.f48870c && this.f48871d == c19520x3.f48871d && this.f48872e == c19520x3.f48872e && this.f48873f == c19520x3.f48873f && this.f48874g == c19520x3.f48874g && this.f48875h == c19520x3.f48875h && this.f48876i == c19520x3.f48876i && this.f48877j == c19520x3.f48877j) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.f48869b);
        int hashCode2 = Long.hashCode(this.f48870c);
        int hashCode3 = Long.hashCode(this.f48871d);
        int hashCode4 = Integer.hashCode(this.f48872e);
        int hashCode5 = Integer.hashCode(this.f48873f);
        int hashCode6 = Integer.hashCode(this.f48874g);
        int hashCode7 = Integer.hashCode(this.f48875h);
        int hashCode8 = Long.hashCode(this.f48876i);
        return Long.hashCode(this.f48877j) + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (Integer.hashCode(this.f48868a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "EventConfig(maxRetryCount=" + this.f48868a + ", timeToLiveInSec=" + this.f48869b + ", processingInterval=" + this.f48870c + ", ingestionLatencyInSec=" + this.f48871d + ", minBatchSizeWifi=" + this.f48872e + ", maxBatchSizeWifi=" + this.f48873f + ", minBatchSizeMobile=" + this.f48874g + ", maxBatchSizeMobile=" + this.f48875h + ", retryIntervalWifi=" + this.f48876i + ", retryIntervalMobile=" + this.f48877j + ')';
    }
}
