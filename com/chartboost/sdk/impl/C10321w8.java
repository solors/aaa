package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.w8 */
/* loaded from: classes3.dex */
public final class C10321w8 {

    /* renamed from: a */
    public final Integer f23453a;

    /* renamed from: b */
    public final Integer f23454b;

    /* renamed from: c */
    public final String f23455c;

    /* renamed from: d */
    public final EnumC10065n7 f23456d;

    public C10321w8(Integer num, Integer num2, String str, EnumC10065n7 openRTBConnectionType) {
        Intrinsics.checkNotNullParameter(openRTBConnectionType, "openRTBConnectionType");
        this.f23453a = num;
        this.f23454b = num2;
        this.f23455c = str;
        this.f23456d = openRTBConnectionType;
    }

    /* renamed from: a */
    public final Integer m80156a() {
        return this.f23453a;
    }

    /* renamed from: b */
    public final Integer m80155b() {
        return this.f23454b;
    }

    /* renamed from: c */
    public final String m80154c() {
        return this.f23455c;
    }

    /* renamed from: d */
    public final EnumC10065n7 m80153d() {
        return this.f23456d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10321w8)) {
            return false;
        }
        C10321w8 c10321w8 = (C10321w8) obj;
        if (Intrinsics.m17075f(this.f23453a, c10321w8.f23453a) && Intrinsics.m17075f(this.f23454b, c10321w8.f23454b) && Intrinsics.m17075f(this.f23455c, c10321w8.f23455c) && this.f23456d == c10321w8.f23456d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        Integer num = this.f23453a;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = hashCode * 31;
        Integer num2 = this.f23454b;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str = this.f23455c;
        if (str != null) {
            i = str.hashCode();
        }
        return ((i3 + i) * 31) + this.f23456d.hashCode();
    }

    public String toString() {
        Integer num = this.f23453a;
        Integer num2 = this.f23454b;
        String str = this.f23455c;
        EnumC10065n7 enumC10065n7 = this.f23456d;
        return "ReachabilityBodyFields(cellularConnectionType=" + num + ", connectionTypeFromActiveNetwork=" + num2 + ", detailedConnectionType=" + str + ", openRTBConnectionType=" + enumC10065n7 + ")";
    }
}
