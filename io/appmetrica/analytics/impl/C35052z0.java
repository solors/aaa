package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.z0 */
/* loaded from: classes9.dex */
public final class C35052z0 {

    /* renamed from: a */
    public final NativeCrashSource f95666a;

    /* renamed from: b */
    public final String f95667b;

    /* renamed from: c */
    public final String f95668c;

    /* renamed from: d */
    public final String f95669d;

    /* renamed from: e */
    public final long f95670e;

    /* renamed from: f */
    public final C33756A0 f95671f;

    public C35052z0(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j, C33756A0 c33756a0) {
        this.f95666a = nativeCrashSource;
        this.f95667b = str;
        this.f95668c = str2;
        this.f95669d = str3;
        this.f95670e = j;
        this.f95671f = c33756a0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35052z0)) {
            return false;
        }
        C35052z0 c35052z0 = (C35052z0) obj;
        if (this.f95666a == c35052z0.f95666a && Intrinsics.m17075f(this.f95667b, c35052z0.f95667b) && Intrinsics.m17075f(this.f95668c, c35052z0.f95668c) && Intrinsics.m17075f(this.f95669d, c35052z0.f95669d) && this.f95670e == c35052z0.f95670e && Intrinsics.m17075f(this.f95671f, c35052z0.f95671f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f95667b.hashCode();
        int hashCode2 = this.f95668c.hashCode();
        int hashCode3 = this.f95669d.hashCode();
        int hashCode4 = Long.hashCode(this.f95670e);
        return this.f95671f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.f95666a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AppMetricaNativeCrash(source=" + this.f95666a + ", handlerVersion=" + this.f95667b + ", uuid=" + this.f95668c + ", dumpFile=" + this.f95669d + ", creationTime=" + this.f95670e + ", metadata=" + this.f95671f + ')';
    }
}
