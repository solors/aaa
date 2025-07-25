package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Hl */
/* loaded from: classes9.dex */
public final class C33952Hl {

    /* renamed from: a */
    public final int f92978a;

    public C33952Hl(int i) {
        this.f92978a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C33952Hl) && this.f92978a == ((C33952Hl) obj).f92978a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f92978a);
    }

    public final String toString() {
        return "StartupUpdateConfig(intervalSeconds=" + this.f92978a + ')';
    }
}
