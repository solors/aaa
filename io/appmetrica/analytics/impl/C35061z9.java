package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.z9 */
/* loaded from: classes9.dex */
public final class C35061z9 {

    /* renamed from: a */
    public final long f95690a;

    public C35061z9(long j) {
        this.f95690a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C35061z9) && this.f95690a == ((C35061z9) obj).f95690a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f95690a);
    }

    public final String toString() {
        return "ExternalAttributionConfig(collectingInterval=" + this.f95690a + ')';
    }
}
