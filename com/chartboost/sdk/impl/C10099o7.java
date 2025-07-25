package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.o7 */
/* loaded from: classes3.dex */
public final class C10099o7 {

    /* renamed from: a */
    public boolean f22861a;

    /* renamed from: b */
    public boolean f22862b;

    /* renamed from: c */
    public int f22863c;

    /* renamed from: d */
    public int f22864d;

    /* renamed from: e */
    public long f22865e;

    /* renamed from: f */
    public int f22866f;

    /* renamed from: g */
    public List f22867g;

    public C10099o7(boolean z, boolean z2, int i, int i2, long j, int i3, List list) {
        this.f22861a = z;
        this.f22862b = z2;
        this.f22863c = i;
        this.f22864d = i2;
        this.f22865e = j;
        this.f22866f = i3;
        this.f22867g = list;
    }

    /* renamed from: a */
    public final int m80889a() {
        return this.f22863c;
    }

    /* renamed from: b */
    public final int m80888b() {
        return this.f22864d;
    }

    /* renamed from: c */
    public final int m80887c() {
        return this.f22866f;
    }

    /* renamed from: d */
    public final boolean m80886d() {
        return this.f22862b;
    }

    /* renamed from: e */
    public final List m80885e() {
        return this.f22867g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10099o7)) {
            return false;
        }
        C10099o7 c10099o7 = (C10099o7) obj;
        if (this.f22861a == c10099o7.f22861a && this.f22862b == c10099o7.f22862b && this.f22863c == c10099o7.f22863c && this.f22864d == c10099o7.f22864d && this.f22865e == c10099o7.f22865e && this.f22866f == c10099o7.f22866f && Intrinsics.m17075f(this.f22867g, c10099o7.f22867g)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final long m80884f() {
        return this.f22865e;
    }

    /* renamed from: g */
    public final boolean m80883g() {
        return this.f22861a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((Boolean.hashCode(this.f22861a) * 31) + Boolean.hashCode(this.f22862b)) * 31) + Integer.hashCode(this.f22863c)) * 31) + Integer.hashCode(this.f22864d)) * 31) + Long.hashCode(this.f22865e)) * 31) + Integer.hashCode(this.f22866f)) * 31;
        List list = this.f22867g;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        boolean z = this.f22861a;
        boolean z2 = this.f22862b;
        int i = this.f22863c;
        int i2 = this.f22864d;
        long j = this.f22865e;
        int i3 = this.f22866f;
        List list = this.f22867g;
        return "OmSdkModel(isEnabled=" + z + ", verificationEnabled=" + z2 + ", minVisibleDips=" + i + ", minVisibleDurationMs=" + i2 + ", visibilityCheckIntervalMs=" + j + ", traversalLimit=" + i3 + ", verificationList=" + list + ")";
    }

    public /* synthetic */ C10099o7(boolean z, boolean z2, int i, int i2, long j, int i3, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? false : z2, (i4 & 4) != 0 ? 1 : i, (i4 & 8) == 0 ? i2 : 0, (i4 & 16) != 0 ? 100L : j, (i4 & 32) != 0 ? 25 : i3, (i4 & 64) != 0 ? null : list);
    }
}
