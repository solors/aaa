package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC30632jl;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class qx1 extends bj1 {

    /* renamed from: e */
    public static final InterfaceC30632jl.InterfaceC30633a<qx1> f84585e = new InterfaceC30632jl.InterfaceC30633a() { // from class: com.yandex.mobile.ads.impl.xu2
        @Override // com.yandex.mobile.ads.impl.InterfaceC30632jl.InterfaceC30633a
        public final InterfaceC30632jl fromBundle(Bundle bundle) {
            return qx1.m30185d(bundle);
        }
    };
    @IntRange(from = 1)

    /* renamed from: c */
    private final int f84586c;

    /* renamed from: d */
    private final float f84587d;

    public qx1(@IntRange(from = 1) int i) {
        C30937nf.m31568a("maxStars must be a positive integer", i > 0);
        this.f84586c = i;
        this.f84587d = -1.0f;
    }

    /* renamed from: b */
    public static qx1 m30186b(Bundle bundle) {
        if (bundle.getInt(Integer.toString(0, 36), -1) == 2) {
            int i = bundle.getInt(Integer.toString(1, 36), 5);
            float f = bundle.getFloat(Integer.toString(2, 36), -1.0f);
            if (f == -1.0f) {
                return new qx1(i);
            }
            return new qx1(i, f);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: d */
    public static /* synthetic */ qx1 m30185d(Bundle bundle) {
        return m30186b(bundle);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof qx1)) {
            return false;
        }
        qx1 qx1Var = (qx1) obj;
        if (this.f84586c != qx1Var.f84586c || this.f84587d != qx1Var.f84587d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f84586c), Float.valueOf(this.f84587d)});
    }

    public qx1(@IntRange(from = 1) int i, @FloatRange(from = 0.0d) float f) {
        boolean z = true;
        C30937nf.m31568a("maxStars must be a positive integer", i > 0);
        C30937nf.m31568a("starRating is out of range [0, maxStars]", (f < 0.0f || f > ((float) i)) ? false : z);
        this.f84586c = i;
        this.f84587d = f;
    }
}
