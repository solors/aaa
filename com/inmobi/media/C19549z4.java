package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.z4 */
/* loaded from: classes6.dex */
public final class C19549z4 {

    /* renamed from: a */
    public final EnumC19096S5 f48956a;

    /* renamed from: b */
    public final double f48957b;

    public C19549z4(EnumC19096S5 logLevel, double d) {
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        this.f48956a = logLevel;
        this.f48957b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19549z4)) {
            return false;
        }
        C19549z4 c19549z4 = (C19549z4) obj;
        if (this.f48956a == c19549z4.f48956a && Double.compare(this.f48957b, c19549z4.f48957b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.f48957b) + (this.f48956a.hashCode() * 31);
    }

    public final String toString() {
        return "LoggerConfiguration(logLevel=" + this.f48956a + ", samplingFactor=" + this.f48957b + ')';
    }
}
