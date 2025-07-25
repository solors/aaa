package com.inmobi.media;

/* renamed from: com.inmobi.media.I8 */
/* loaded from: classes6.dex */
public final class C18966I8 {
    private int maxBatchSize;
    private int minBatchSize;
    private long retryInterval;

    /* renamed from: a */
    public final void m61039a(long j) {
        this.retryInterval = j;
    }

    /* renamed from: b */
    public final int m61038b() {
        return this.minBatchSize;
    }

    /* renamed from: c */
    public final long m61036c() {
        return this.retryInterval;
    }

    /* renamed from: a */
    public final int m61041a() {
        return this.maxBatchSize;
    }

    /* renamed from: b */
    public final void m61037b(int i) {
        this.maxBatchSize = i;
    }

    /* renamed from: c */
    public final void m61035c(int i) {
        this.minBatchSize = i;
    }

    /* renamed from: a */
    public final boolean m61040a(int i) {
        int i2;
        int i3 = this.maxBatchSize;
        return i3 <= i && this.retryInterval > 0 && i3 > 0 && (i2 = this.minBatchSize) > 0 && i2 <= i3;
    }
}
