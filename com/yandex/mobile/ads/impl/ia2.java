package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC30632jl;

/* loaded from: classes8.dex */
public final class ia2 implements InterfaceC30632jl {

    /* renamed from: f */
    public static final /* synthetic */ int f80393f = 0;
    @IntRange(from = 0)

    /* renamed from: b */
    public final int f80394b;
    @IntRange(from = 0)

    /* renamed from: c */
    public final int f80395c;
    @IntRange(from = 0, m105510to = 359)

    /* renamed from: d */
    public final int f80396d;
    @FloatRange(from = 0.0d, fromInclusive = false)

    /* renamed from: e */
    public final float f80397e;

    static {
        new InterfaceC30632jl.InterfaceC30633a() { // from class: com.yandex.mobile.ads.impl.fq2
            @Override // com.yandex.mobile.ads.impl.InterfaceC30632jl.InterfaceC30633a
            public final InterfaceC30632jl fromBundle(Bundle bundle) {
                return ia2.m33323b(bundle);
            }
        };
    }

    public ia2(@IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0, m105510to = 359) int i3, @FloatRange(from = 0.0d, fromInclusive = false) float f) {
        this.f80394b = i;
        this.f80395c = i2;
        this.f80396d = i3;
        this.f80397e = f;
    }

    /* renamed from: a */
    public static ia2 m33324a(Bundle bundle) {
        return new ia2(bundle.getInt(Integer.toString(0, 36), 0), bundle.getInt(Integer.toString(1, 36), 0), bundle.getInt(Integer.toString(2, 36), 0), bundle.getFloat(Integer.toString(3, 36), 1.0f));
    }

    /* renamed from: b */
    public static /* synthetic */ ia2 m33323b(Bundle bundle) {
        return m33324a(bundle);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia2)) {
            return false;
        }
        ia2 ia2Var = (ia2) obj;
        if (this.f80394b == ia2Var.f80394b && this.f80395c == ia2Var.f80395c && this.f80396d == ia2Var.f80396d && this.f80397e == ia2Var.f80397e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f80397e) + ((((((this.f80394b + 217) * 31) + this.f80395c) * 31) + this.f80396d) * 31);
    }
}
