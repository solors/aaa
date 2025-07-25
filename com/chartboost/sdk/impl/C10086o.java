package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.o */
/* loaded from: classes3.dex */
public final class C10086o {

    /* renamed from: a */
    public final AbstractC10232u f22761a;

    /* renamed from: b */
    public final Integer f22762b;

    /* renamed from: c */
    public final Integer f22763c;

    /* renamed from: d */
    public final String f22764d;

    /* renamed from: e */
    public final int f22765e;

    public C10086o(AbstractC10232u adType, Integer num, Integer num2, String str, int i) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f22761a = adType;
        this.f22762b = num;
        this.f22763c = num2;
        this.f22764d = str;
        this.f22765e = i;
    }

    /* renamed from: a */
    public final AbstractC10232u m80972a() {
        return this.f22761a;
    }

    /* renamed from: b */
    public final Integer m80971b() {
        return this.f22762b;
    }

    /* renamed from: c */
    public final int m80970c() {
        return this.f22765e;
    }

    /* renamed from: d */
    public final String m80969d() {
        return this.f22764d;
    }

    /* renamed from: e */
    public final Integer m80968e() {
        return this.f22763c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10086o)) {
            return false;
        }
        C10086o c10086o = (C10086o) obj;
        if (Intrinsics.m17075f(this.f22761a, c10086o.f22761a) && Intrinsics.m17075f(this.f22762b, c10086o.f22762b) && Intrinsics.m17075f(this.f22763c, c10086o.f22763c) && Intrinsics.m17075f(this.f22764d, c10086o.f22764d) && this.f22765e == c10086o.f22765e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.f22761a.hashCode() * 31;
        Integer num = this.f22762b;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        Integer num2 = this.f22763c;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str = this.f22764d;
        if (str != null) {
            i = str.hashCode();
        }
        return ((i3 + i) * 31) + Integer.hashCode(this.f22765e);
    }

    public String toString() {
        AbstractC10232u abstractC10232u = this.f22761a;
        Integer num = this.f22762b;
        Integer num2 = this.f22763c;
        String str = this.f22764d;
        int i = this.f22765e;
        return "AdParameters(adType=" + abstractC10232u + ", height=" + num + ", width=" + num2 + ", location=" + str + ", impDepth=" + i + ")";
    }
}
