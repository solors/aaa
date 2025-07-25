package com.chartboost.sdk.impl;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.f2 */
/* loaded from: classes3.dex */
public final class C9843f2 {

    /* renamed from: a */
    public final int f21974a;

    /* renamed from: b */
    public final byte[] f21975b;

    public C9843f2(int i, byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f21974a = i;
        this.f21975b = data;
    }

    /* renamed from: a */
    public final byte[] m81718a() {
        return this.f21975b;
    }

    /* renamed from: b */
    public final int m81717b() {
        return this.f21974a;
    }

    /* renamed from: c */
    public final boolean m81716c() {
        int i = this.f21974a;
        if (i >= 200 && i < 300) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9843f2)) {
            return false;
        }
        C9843f2 c9843f2 = (C9843f2) obj;
        if (this.f21974a == c9843f2.f21974a && Intrinsics.m17075f(this.f21975b, c9843f2.f21975b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f21974a) * 31) + Arrays.hashCode(this.f21975b);
    }

    public String toString() {
        int i = this.f21974a;
        String arrays = Arrays.toString(this.f21975b);
        return "CBNetworkServerResponse(statusCode=" + i + ", data=" + arrays + ")";
    }
}
