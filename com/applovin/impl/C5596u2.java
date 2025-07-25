package com.applovin.impl;

/* renamed from: com.applovin.impl.u2 */
/* loaded from: classes2.dex */
public final class C5596u2 {

    /* renamed from: a */
    private long f11023a;

    /* renamed from: b */
    private long f11024b;

    /* renamed from: c */
    private boolean f11025c;

    /* renamed from: d */
    private long f11026d;

    /* renamed from: e */
    private long f11027e;

    /* renamed from: f */
    private int f11028f;

    /* renamed from: g */
    private Throwable f11029g;

    /* renamed from: a */
    public Throwable m94297a() {
        return this.f11029g;
    }

    /* renamed from: b */
    public int m94293b() {
        return this.f11028f;
    }

    /* renamed from: c */
    public void m94292c() {
        this.f11027e++;
    }

    /* renamed from: d */
    public void m94291d() {
        this.f11026d++;
    }

    public String toString() {
        return "CacheStatsTracker{totalDownloadedBytes=" + this.f11023a + ", totalCachedBytes=" + this.f11024b + ", isHTMLCachingCancelled=" + this.f11025c + ", htmlResourceCacheSuccessCount=" + this.f11026d + ", htmlResourceCacheFailureCount=" + this.f11027e + '}';
    }

    /* renamed from: a */
    public void m94294a(Throwable th) {
        this.f11029g = th;
    }

    /* renamed from: a */
    public void m94296a(int i) {
        this.f11028f = i;
    }

    /* renamed from: a */
    public void m94295a(long j) {
        this.f11024b += j;
    }
}
