package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.InterfaceC30632jl;
import java.util.Locale;

/* loaded from: classes8.dex */
public final class ae1 implements InterfaceC30632jl {

    /* renamed from: e */
    public static final ae1 f76770e = new ae1(1.0f, 1.0f);

    /* renamed from: b */
    public final float f76771b;

    /* renamed from: c */
    public final float f76772c;

    /* renamed from: d */
    private final int f76773d;

    static {
        new InterfaceC30632jl.InterfaceC30633a() { // from class: com.yandex.mobile.ads.impl.qj2
            @Override // com.yandex.mobile.ads.impl.InterfaceC30632jl.InterfaceC30633a
            public final InterfaceC30632jl fromBundle(Bundle bundle) {
                return ae1.m35909b(bundle);
            }
        };
    }

    public ae1(@FloatRange(from = 0.0d, fromInclusive = false) float f, @FloatRange(from = 0.0d, fromInclusive = false) float f2) {
        boolean z;
        if (f > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        C30937nf.m31567a(z);
        C30937nf.m31567a(f2 > 0.0f);
        this.f76771b = f;
        this.f76772c = f2;
        this.f76773d = Math.round(f * 1000.0f);
    }

    /* renamed from: b */
    public static /* synthetic */ ae1 m35909b(Bundle bundle) {
        return m35910a(bundle);
    }

    /* renamed from: a */
    public final long m35911a(long j) {
        return j * this.f76773d;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ae1.class != obj.getClass()) {
            return false;
        }
        ae1 ae1Var = (ae1) obj;
        if (this.f76771b == ae1Var.f76771b && this.f76772c == ae1Var.f76772c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f76772c) + ((Float.floatToRawIntBits(this.f76771b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f76771b), Float.valueOf(this.f76772c)};
        int i = y32.f88010a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    /* renamed from: a */
    public static ae1 m35910a(Bundle bundle) {
        return new ae1(bundle.getFloat(Integer.toString(0, 36), 1.0f), bundle.getFloat(Integer.toString(1, 36), 1.0f));
    }
}
