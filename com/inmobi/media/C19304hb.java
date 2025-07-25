package com.inmobi.media;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.hb */
/* loaded from: classes6.dex */
public final class C19304hb {

    /* renamed from: a */
    public final boolean f48305a;

    /* renamed from: b */
    public final boolean f48306b;

    /* renamed from: c */
    public final boolean f48307c;

    /* renamed from: d */
    public final boolean f48308d;

    /* renamed from: e */
    public final boolean f48309e;

    /* renamed from: f */
    public final List f48310f;

    /* renamed from: g */
    public final double f48311g;

    public C19304hb(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List priorityEventsList, double d) {
        Intrinsics.checkNotNullParameter(priorityEventsList, "priorityEventsList");
        this.f48305a = z;
        this.f48306b = z2;
        this.f48307c = z3;
        this.f48308d = z4;
        this.f48309e = z5;
        this.f48310f = priorityEventsList;
        this.f48311g = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19304hb)) {
            return false;
        }
        C19304hb c19304hb = (C19304hb) obj;
        if (this.f48305a == c19304hb.f48305a && this.f48306b == c19304hb.f48306b && this.f48307c == c19304hb.f48307c && this.f48308d == c19304hb.f48308d && this.f48309e == c19304hb.f48309e && Intrinsics.m17075f(this.f48310f, c19304hb.f48310f) && Double.compare(this.f48311g, c19304hb.f48311g) == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    public final int hashCode() {
        boolean z = this.f48305a;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i2 = r0 * 31;
        ?? r2 = this.f48306b;
        int i3 = r2;
        if (r2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        ?? r22 = this.f48307c;
        int i5 = r22;
        if (r22 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        ?? r23 = this.f48308d;
        int i7 = r23;
        if (r23 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        boolean z2 = this.f48309e;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return Double.hashCode(this.f48311g) + ((this.f48310f.hashCode() + ((i8 + i) * 31)) * 31);
    }

    public final String toString() {
        return "TelemetryConfigMetaData(isTelemetryEnabled=" + this.f48305a + ", isImageEnabled=" + this.f48306b + ", isGIFEnabled=" + this.f48307c + ", isVideoEnabled=" + this.f48308d + ", isGeneralEventsDisabled=" + this.f48309e + ", priorityEventsList=" + this.f48310f + ", samplingFactor=" + this.f48311g + ')';
    }
}
