package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.i6 */
/* loaded from: classes3.dex */
public final class C9956i6 {

    /* renamed from: a */
    public final C10373y1 f22304a;

    /* renamed from: b */
    public final CBError.EnumC10416b f22305b;

    public C9956i6(C10373y1 c10373y1, CBError.EnumC10416b enumC10416b) {
        this.f22304a = c10373y1;
        this.f22305b = enumC10416b;
    }

    /* renamed from: a */
    public final CBError.EnumC10416b m81395a() {
        return this.f22305b;
    }

    /* renamed from: b */
    public final C10373y1 m81394b() {
        return this.f22304a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9956i6)) {
            return false;
        }
        C9956i6 c9956i6 = (C9956i6) obj;
        if (Intrinsics.m17075f(this.f22304a, c9956i6.f22304a) && this.f22305b == c9956i6.f22305b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        C10373y1 c10373y1 = this.f22304a;
        int i = 0;
        if (c10373y1 == null) {
            hashCode = 0;
        } else {
            hashCode = c10373y1.hashCode();
        }
        int i2 = hashCode * 31;
        CBError.EnumC10416b enumC10416b = this.f22305b;
        if (enumC10416b != null) {
            i = enumC10416b.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        C10373y1 c10373y1 = this.f22304a;
        CBError.EnumC10416b enumC10416b = this.f22305b;
        return "ImpressionHolder(impression=" + c10373y1 + ", error=" + enumC10416b + ")";
    }
}
