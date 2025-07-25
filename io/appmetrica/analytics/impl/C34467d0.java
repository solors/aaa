package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.d0 */
/* loaded from: classes9.dex */
public final class C34467d0 {

    /* renamed from: a */
    public final String f94134a;

    /* renamed from: b */
    public final long f94135b;

    public C34467d0(String str, long j) {
        this.f94134a = str;
        this.f94135b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C34467d0.class != obj.getClass()) {
            return false;
        }
        C34467d0 c34467d0 = (C34467d0) obj;
        if (this.f94135b != c34467d0.f94135b) {
            return false;
        }
        String str = this.f94134a;
        String str2 = c34467d0.f94134a;
        if (str != null) {
            if (str.equals(str2)) {
                return true;
            }
        } else if (str2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.f94134a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        long j = this.f94135b;
        return (i * 31) + ((int) (j ^ (j >>> 32)));
    }
}
