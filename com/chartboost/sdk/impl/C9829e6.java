package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.chartboost.sdk.impl.e6 */
/* loaded from: classes3.dex */
public final class C9829e6 {

    /* renamed from: a */
    public int f21944a;

    /* renamed from: b */
    public int f21945b;

    /* renamed from: c */
    public int f21946c;

    /* renamed from: d */
    public int f21947d;

    public C9829e6(int i, int i2, int i3, int i4) {
        this.f21944a = i;
        this.f21945b = i2;
        this.f21946c = i3;
        this.f21947d = i4;
    }

    /* renamed from: a */
    public final int m81744a() {
        return this.f21946c;
    }

    /* renamed from: b */
    public final int m81742b() {
        return this.f21947d;
    }

    /* renamed from: c */
    public final int m81740c() {
        return this.f21945b;
    }

    /* renamed from: d */
    public final int m81738d() {
        return this.f21944a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9829e6)) {
            return false;
        }
        C9829e6 c9829e6 = (C9829e6) obj;
        if (this.f21944a == c9829e6.f21944a && this.f21945b == c9829e6.f21945b && this.f21946c == c9829e6.f21946c && this.f21947d == c9829e6.f21947d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f21944a) * 31) + Integer.hashCode(this.f21945b)) * 31) + Integer.hashCode(this.f21946c)) * 31) + Integer.hashCode(this.f21947d);
    }

    public String toString() {
        int i = this.f21944a;
        int i2 = this.f21945b;
        int i3 = this.f21946c;
        int i4 = this.f21947d;
        return "ImpressionCounter(onVideoCompletedPlayCount=" + i + ", onRewardedVideoCompletedPlayCount=" + i2 + ", impressionNotifyDidCompleteAdPlayCount=" + i3 + ", impressionSendVideoCompleteRequestPlayCount=" + i4 + ")";
    }

    /* renamed from: a */
    public final void m81743a(int i) {
        this.f21946c = i;
    }

    /* renamed from: b */
    public final void m81741b(int i) {
        this.f21947d = i;
    }

    /* renamed from: c */
    public final void m81739c(int i) {
        this.f21945b = i;
    }

    /* renamed from: d */
    public final void m81737d(int i) {
        this.f21944a = i;
    }

    public /* synthetic */ C9829e6(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 1 : i, (i5 & 2) != 0 ? 1 : i2, (i5 & 4) != 0 ? 1 : i3, (i5 & 8) != 0 ? 1 : i4);
    }
}
