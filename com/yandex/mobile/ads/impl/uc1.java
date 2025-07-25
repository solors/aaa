package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC30632jl;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class uc1 extends bj1 {

    /* renamed from: d */
    public static final InterfaceC30632jl.InterfaceC30633a<uc1> f86208d = new InterfaceC30632jl.InterfaceC30633a() { // from class: com.yandex.mobile.ads.impl.zy2
        @Override // com.yandex.mobile.ads.impl.InterfaceC30632jl.InterfaceC30633a
        public final InterfaceC30632jl fromBundle(Bundle bundle) {
            return uc1.m28825d(bundle);
        }
    };

    /* renamed from: c */
    private final float f86209c;

    public uc1() {
        this.f86209c = -1.0f;
    }

    /* renamed from: b */
    public static uc1 m28826b(Bundle bundle) {
        if (bundle.getInt(Integer.toString(0, 36), -1) == 1) {
            float f = bundle.getFloat(Integer.toString(1, 36), -1.0f);
            if (f == -1.0f) {
                return new uc1();
            }
            return new uc1(f);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: d */
    public static /* synthetic */ uc1 m28825d(Bundle bundle) {
        return m28826b(bundle);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof uc1) || this.f86209c != ((uc1) obj).f86209c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f86209c)});
    }

    public uc1(@FloatRange(from = 0.0d, m105511to = 100.0d) float f) {
        C30937nf.m31568a("percent must be in the range of [0, 100]", f >= 0.0f && f <= 100.0f);
        this.f86209c = f;
    }
}
