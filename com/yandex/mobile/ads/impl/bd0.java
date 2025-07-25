package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC30632jl;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class bd0 extends bj1 {

    /* renamed from: e */
    public static final InterfaceC30632jl.InterfaceC30633a<bd0> f77271e = new InterfaceC30632jl.InterfaceC30633a() { // from class: com.yandex.mobile.ads.impl.bl2
        @Override // com.yandex.mobile.ads.impl.InterfaceC30632jl.InterfaceC30633a
        public final InterfaceC30632jl fromBundle(Bundle bundle) {
            return bd0.m35489d(bundle);
        }
    };

    /* renamed from: c */
    private final boolean f77272c;

    /* renamed from: d */
    private final boolean f77273d;

    public bd0() {
        this.f77272c = false;
        this.f77273d = false;
    }

    /* renamed from: b */
    public static bd0 m35490b(Bundle bundle) {
        if (bundle.getInt(Integer.toString(0, 36), -1) == 0) {
            if (bundle.getBoolean(Integer.toString(1, 36), false)) {
                return new bd0(bundle.getBoolean(Integer.toString(2, 36), false));
            }
            return new bd0();
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: d */
    public static /* synthetic */ bd0 m35489d(Bundle bundle) {
        return m35490b(bundle);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof bd0)) {
            return false;
        }
        bd0 bd0Var = (bd0) obj;
        if (this.f77273d != bd0Var.f77273d || this.f77272c != bd0Var.f77272c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f77272c), Boolean.valueOf(this.f77273d)});
    }

    public bd0(boolean z) {
        this.f77272c = true;
        this.f77273d = z;
    }
}
