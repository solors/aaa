package com.moloco.sdk.internal.services.bidtoken;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.internal.services.bidtoken.i */
/* loaded from: classes7.dex */
public final class C24265i {

    /* renamed from: a */
    public final long f62848a;

    /* renamed from: b */
    public final int f62849b;

    /* renamed from: c */
    public final long f62850c;

    public C24265i(long j, int i, long j2) {
        this.f62848a = j;
        this.f62849b = i;
        this.f62850c = j2;
    }

    /* renamed from: a */
    public final long m46697a() {
        return this.f62850c;
    }

    /* renamed from: b */
    public final int m46696b() {
        return this.f62849b;
    }

    /* renamed from: c */
    public final long m46695c() {
        return this.f62848a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24265i)) {
            return false;
        }
        C24265i c24265i = (C24265i) obj;
        if (this.f62848a == c24265i.f62848a && this.f62849b == c24265i.f62849b && this.f62850c == c24265i.f62850c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f62848a) * 31) + Integer.hashCode(this.f62849b)) * 31) + Long.hashCode(this.f62850c);
    }

    @NotNull
    public String toString() {
        return "BidTokenHttpRequestInfo(requestTimeoutMillis=" + this.f62848a + ", fetchRetryMax=" + this.f62849b + ", fetchRetryDelayMillis=" + this.f62850c + ')';
    }
}
