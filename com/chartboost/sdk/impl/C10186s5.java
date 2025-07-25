package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.s5 */
/* loaded from: classes3.dex */
public final class C10186s5 {

    /* renamed from: a */
    public final EnumC10170ra f23099a;

    /* renamed from: b */
    public final String f23100b;

    /* renamed from: c */
    public final String f23101c;

    /* renamed from: d */
    public final String f23102d;

    /* renamed from: e */
    public final String f23103e;

    /* renamed from: f */
    public final Integer f23104f;

    public C10186s5(EnumC10170ra trackingState, String str, String str2, String str3, String str4, Integer num) {
        Intrinsics.checkNotNullParameter(trackingState, "trackingState");
        this.f23099a = trackingState;
        this.f23100b = str;
        this.f23101c = str2;
        this.f23102d = str3;
        this.f23103e = str4;
        this.f23104f = num;
    }

    /* renamed from: a */
    public final String m80626a() {
        return this.f23102d;
    }

    /* renamed from: b */
    public final String m80625b() {
        return this.f23100b;
    }

    /* renamed from: c */
    public final String m80624c() {
        return this.f23103e;
    }

    /* renamed from: d */
    public final Integer m80623d() {
        return this.f23104f;
    }

    /* renamed from: e */
    public final EnumC10170ra m80622e() {
        return this.f23099a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10186s5)) {
            return false;
        }
        C10186s5 c10186s5 = (C10186s5) obj;
        if (this.f23099a == c10186s5.f23099a && Intrinsics.m17075f(this.f23100b, c10186s5.f23100b) && Intrinsics.m17075f(this.f23101c, c10186s5.f23101c) && Intrinsics.m17075f(this.f23102d, c10186s5.f23102d) && Intrinsics.m17075f(this.f23103e, c10186s5.f23103e) && Intrinsics.m17075f(this.f23104f, c10186s5.f23104f)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final String m80621f() {
        return this.f23101c;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = this.f23099a.hashCode() * 31;
        String str = this.f23100b;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode5 + hashCode) * 31;
        String str2 = this.f23101c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.f23102d;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.f23103e;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Integer num = this.f23104f;
        if (num != null) {
            i = num.hashCode();
        }
        return i5 + i;
    }

    public String toString() {
        EnumC10170ra enumC10170ra = this.f23099a;
        String str = this.f23100b;
        String str2 = this.f23101c;
        String str3 = this.f23102d;
        String str4 = this.f23103e;
        Integer num = this.f23104f;
        return "IdentityBodyFields(trackingState=" + enumC10170ra + ", identifiers=" + str + ", uuid=" + str2 + ", gaid=" + str3 + ", setId=" + str4 + ", setIdScope=" + num + ")";
    }

    public /* synthetic */ C10186s5(EnumC10170ra enumC10170ra, String str, String str2, String str3, String str4, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EnumC10170ra.f23054c : enumC10170ra, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) == 0 ? num : null);
    }
}
