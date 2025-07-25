package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.f4 */
/* loaded from: classes9.dex */
public final class C34525f4 {

    /* renamed from: a */
    public final String f94306a;

    /* renamed from: b */
    public final String f94307b;

    /* renamed from: c */
    public final Integer f94308c;

    /* renamed from: d */
    public final String f94309d;

    /* renamed from: e */
    public final CounterConfigurationReporterType f94310e;

    public C34525f4(String str, String str2, Integer num, String str3, CounterConfigurationReporterType counterConfigurationReporterType) {
        this.f94306a = str;
        this.f94307b = str2;
        this.f94308c = num;
        this.f94309d = str3;
        this.f94310e = counterConfigurationReporterType;
    }

    /* renamed from: a */
    public static C34525f4 m21760a(C34365Z3 c34365z3) {
        return new C34525f4(c34365z3.f93861b.getApiKey(), c34365z3.f93860a.f93495a.getAsString("PROCESS_CFG_PACKAGE_NAME"), c34365z3.f93860a.f93495a.getAsInteger("PROCESS_CFG_PROCESS_ID"), c34365z3.f93860a.f93495a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), c34365z3.f93861b.getReporterType());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C34525f4.class != obj.getClass()) {
            return false;
        }
        C34525f4 c34525f4 = (C34525f4) obj;
        String str = this.f94306a;
        if (str == null ? c34525f4.f94306a != null : !str.equals(c34525f4.f94306a)) {
            return false;
        }
        if (!this.f94307b.equals(c34525f4.f94307b)) {
            return false;
        }
        Integer num = this.f94308c;
        if (num == null ? c34525f4.f94308c != null : !num.equals(c34525f4.f94308c)) {
            return false;
        }
        String str2 = this.f94309d;
        if (str2 == null ? c34525f4.f94309d != null : !str2.equals(c34525f4.f94309d)) {
            return false;
        }
        if (this.f94310e == c34525f4.f94310e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.f94306a;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int hashCode = (this.f94307b.hashCode() + (i * 31)) * 31;
        Integer num = this.f94308c;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = (hashCode + i2) * 31;
        String str2 = this.f94309d;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return this.f94310e.hashCode() + ((i4 + i3) * 31);
    }

    public final String toString() {
        return "ClientDescription{mApiKey='" + this.f94306a + "', mPackageName='" + this.f94307b + "', mProcessID=" + this.f94308c + ", mProcessSessionID='" + this.f94309d + "', mReporterType=" + this.f94310e + '}';
    }
}
