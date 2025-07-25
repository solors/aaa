package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Ll */
/* loaded from: classes9.dex */
public final class C34048Ll {

    /* renamed from: a */
    public final long f93197a;

    public C34048Ll(long j) {
        this.f93197a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C34048Ll.class == obj.getClass() && this.f93197a == ((C34048Ll) obj).f93197a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f93197a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "StatSending{disabledReportingInterval=" + this.f93197a + '}';
    }
}
