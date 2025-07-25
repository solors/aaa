package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.p4 */
/* loaded from: classes9.dex */
public final class C34795p4 {

    /* renamed from: a */
    public final String f95147a;

    /* renamed from: b */
    public final Integer f95148b;

    /* renamed from: c */
    public final String f95149c;

    public C34795p4(String str, Integer num, String str2) {
        this.f95147a = str;
        this.f95148b = num;
        this.f95149c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C34795p4.class != obj.getClass()) {
            return false;
        }
        C34795p4 c34795p4 = (C34795p4) obj;
        if (!this.f95147a.equals(c34795p4.f95147a)) {
            return false;
        }
        Integer num = this.f95148b;
        if (num == null ? c34795p4.f95148b != null : !num.equals(c34795p4.f95148b)) {
            return false;
        }
        String str = this.f95149c;
        String str2 = c34795p4.f95149c;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f95147a.hashCode() * 31;
        Integer num = this.f95148b;
        int i2 = 0;
        if (num != null) {
            i = num.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        String str = this.f95149c;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i3 + i2;
    }
}
