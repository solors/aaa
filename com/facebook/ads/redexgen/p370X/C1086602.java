package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.02 */
/* loaded from: assets/audience_network.dex */
public final class C1086602<T> {
    public final T A00;
    public final Throwable A01;
    public final boolean A02;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.02 != com.facebook.ads.cache.api.CacheResponse<T> */
    public C1086602(boolean z, T result) {
        this.A02 = z;
        this.A00 = result;
        this.A01 = null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.02 != com.facebook.ads.cache.api.CacheResponse<T> */
    public C1086602(boolean z, T result, Throwable th) {
        this.A02 = z;
        this.A00 = result;
        this.A01 = th;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.02 != com.facebook.ads.cache.api.CacheResponse<T> */
    public final T A00() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.02 != com.facebook.ads.cache.api.CacheResponse<T> */
    public final boolean A01() {
        return this.A02;
    }
}
