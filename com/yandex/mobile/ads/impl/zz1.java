package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC30632jl;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class zz1 extends bj1 {

    /* renamed from: e */
    public static final InterfaceC30632jl.InterfaceC30633a<zz1> f89171e = new InterfaceC30632jl.InterfaceC30633a() { // from class: com.yandex.mobile.ads.impl.g23
        @Override // com.yandex.mobile.ads.impl.InterfaceC30632jl.InterfaceC30633a
        public final InterfaceC30632jl fromBundle(Bundle bundle) {
            return zz1.m25942d(bundle);
        }
    };

    /* renamed from: c */
    private final boolean f89172c;

    /* renamed from: d */
    private final boolean f89173d;

    public zz1() {
        this.f89172c = false;
        this.f89173d = false;
    }

    /* renamed from: b */
    public static zz1 m25943b(Bundle bundle) {
        if (bundle.getInt(Integer.toString(0, 36), -1) == 3) {
            if (bundle.getBoolean(Integer.toString(1, 36), false)) {
                return new zz1(bundle.getBoolean(Integer.toString(2, 36), false));
            }
            return new zz1();
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: d */
    public static /* synthetic */ zz1 m25942d(Bundle bundle) {
        return m25943b(bundle);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof zz1)) {
            return false;
        }
        zz1 zz1Var = (zz1) obj;
        if (this.f89173d != zz1Var.f89173d || this.f89172c != zz1Var.f89172c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f89172c), Boolean.valueOf(this.f89173d)});
    }

    public zz1(boolean z) {
        this.f89172c = true;
        this.f89173d = z;
    }
}
