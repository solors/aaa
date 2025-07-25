package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.ja */
/* loaded from: classes3.dex */
public final class C9986ja {

    /* renamed from: a */
    public final boolean f22445a;

    /* renamed from: b */
    public final List f22446b;

    /* renamed from: c */
    public final String f22447c;

    /* renamed from: d */
    public final int f22448d;

    /* renamed from: e */
    public final int f22449e;

    /* renamed from: f */
    public final boolean f22450f;

    /* renamed from: g */
    public final int f22451g;

    public C9986ja(boolean z, List blackList, String endpoint, int i, int i2, boolean z2, int i3) {
        Intrinsics.checkNotNullParameter(blackList, "blackList");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        this.f22445a = z;
        this.f22446b = blackList;
        this.f22447c = endpoint;
        this.f22448d = i;
        this.f22449e = i2;
        this.f22450f = z2;
        this.f22451g = i3;
    }

    /* renamed from: a */
    public final List m81250a() {
        return this.f22446b;
    }

    /* renamed from: b */
    public final String m81249b() {
        return this.f22447c;
    }

    /* renamed from: c */
    public final int m81248c() {
        return this.f22448d;
    }

    /* renamed from: d */
    public final boolean m81247d() {
        return this.f22450f;
    }

    /* renamed from: e */
    public final int m81246e() {
        return this.f22451g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9986ja)) {
            return false;
        }
        C9986ja c9986ja = (C9986ja) obj;
        if (this.f22445a == c9986ja.f22445a && Intrinsics.m17075f(this.f22446b, c9986ja.f22446b) && Intrinsics.m17075f(this.f22447c, c9986ja.f22447c) && this.f22448d == c9986ja.f22448d && this.f22449e == c9986ja.f22449e && this.f22450f == c9986ja.f22450f && this.f22451g == c9986ja.f22451g) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int m81245f() {
        return this.f22449e;
    }

    /* renamed from: g */
    public final boolean m81244g() {
        return this.f22445a;
    }

    public int hashCode() {
        return (((((((((((Boolean.hashCode(this.f22445a) * 31) + this.f22446b.hashCode()) * 31) + this.f22447c.hashCode()) * 31) + Integer.hashCode(this.f22448d)) * 31) + Integer.hashCode(this.f22449e)) * 31) + Boolean.hashCode(this.f22450f)) * 31) + Integer.hashCode(this.f22451g);
    }

    public String toString() {
        boolean z = this.f22445a;
        List list = this.f22446b;
        String str = this.f22447c;
        int i = this.f22448d;
        int i2 = this.f22449e;
        boolean z2 = this.f22450f;
        int i3 = this.f22451g;
        return "TrackingConfig(isEnabled=" + z + ", blackList=" + list + ", endpoint=" + str + ", eventLimit=" + i + ", windowDuration=" + i2 + ", persistenceEnabled=" + z2 + ", persistenceMaxEvents=" + i3 + ")";
    }

    public /* synthetic */ C9986ja(boolean z, List list, String str, int i, int i2, boolean z2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? AbstractC10004ka.m81215a() : list, (i4 & 4) != 0 ? "https://ssp-events.chartboost.com/track/sdk" : str, (i4 & 8) != 0 ? 10 : i, (i4 & 16) != 0 ? 60 : i2, (i4 & 32) != 0 ? true : z2, (i4 & 64) != 0 ? 100 : i3);
    }
}
