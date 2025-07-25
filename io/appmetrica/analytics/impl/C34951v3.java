package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.v3 */
/* loaded from: classes9.dex */
public final class C34951v3 {

    /* renamed from: a */
    public final long f95499a;

    public C34951v3(long j) {
        this.f95499a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C34951v3.class == obj.getClass() && this.f95499a == ((C34951v3) obj).f95499a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f95499a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "CacheControl{lastKnownLocationTtl=" + this.f95499a + '}';
    }
}
