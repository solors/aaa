package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.A0 */
/* loaded from: classes9.dex */
public final class C33756A0 {

    /* renamed from: a */
    public final String f92542a;

    /* renamed from: b */
    public final String f92543b;

    /* renamed from: c */
    public final CounterConfigurationReporterType f92544c;

    /* renamed from: d */
    public final int f92545d;

    /* renamed from: e */
    public final String f92546e;

    /* renamed from: f */
    public final String f92547f;

    public C33756A0(String str, String str2, CounterConfigurationReporterType counterConfigurationReporterType, int i, String str3, String str4) {
        this.f92542a = str;
        this.f92543b = str2;
        this.f92544c = counterConfigurationReporterType;
        this.f92545d = i;
        this.f92546e = str3;
        this.f92547f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33756A0)) {
            return false;
        }
        C33756A0 c33756a0 = (C33756A0) obj;
        if (Intrinsics.m17075f(this.f92542a, c33756a0.f92542a) && Intrinsics.m17075f(this.f92543b, c33756a0.f92543b) && this.f92544c == c33756a0.f92544c && this.f92545d == c33756a0.f92545d && Intrinsics.m17075f(this.f92546e, c33756a0.f92546e) && Intrinsics.m17075f(this.f92547f, c33756a0.f92547f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f92543b.hashCode();
        int hashCode3 = this.f92544c.hashCode();
        int hashCode4 = Integer.hashCode(this.f92545d);
        int hashCode5 = (this.f92546e.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + (this.f92542a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.f92547f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode5 + hashCode;
    }

    public final String toString() {
        return "AppMetricaNativeCrashMetadata(apiKey=" + this.f92542a + ", packageName=" + this.f92543b + ", reporterType=" + this.f92544c + ", processID=" + this.f92545d + ", processSessionID=" + this.f92546e + ", errorEnvironment=" + this.f92547f + ')';
    }
}
