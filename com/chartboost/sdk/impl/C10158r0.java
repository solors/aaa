package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.r0 */
/* loaded from: classes3.dex */
public final class C10158r0 {

    /* renamed from: a */
    public final EnumC10170ra f23037a;

    /* renamed from: b */
    public final String f23038b;

    public C10158r0(EnumC10170ra advertisingIDState, String str) {
        Intrinsics.checkNotNullParameter(advertisingIDState, "advertisingIDState");
        this.f23037a = advertisingIDState;
        this.f23038b = str;
    }

    /* renamed from: a */
    public final String m80697a() {
        return this.f23038b;
    }

    /* renamed from: b */
    public final EnumC10170ra m80696b() {
        return this.f23037a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10158r0)) {
            return false;
        }
        C10158r0 c10158r0 = (C10158r0) obj;
        if (this.f23037a == c10158r0.f23037a && Intrinsics.m17075f(this.f23038b, c10158r0.f23038b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f23037a.hashCode() * 31;
        String str = this.f23038b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        EnumC10170ra enumC10170ra = this.f23037a;
        String str = this.f23038b;
        return "AdvertisingIDHolder(advertisingIDState=" + enumC10170ra + ", advertisingID=" + str + ")";
    }
}
