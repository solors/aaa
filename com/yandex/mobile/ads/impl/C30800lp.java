package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.InterfaceC30632jl;
import java.util.Arrays;

/* renamed from: com.yandex.mobile.ads.impl.lp */
/* loaded from: classes8.dex */
public final class C30800lp implements InterfaceC30632jl {

    /* renamed from: g */
    public static final InterfaceC30632jl.InterfaceC30633a<C30800lp> f81874g = new InterfaceC30632jl.InterfaceC30633a() { // from class: com.yandex.mobile.ads.impl.ks2
        @Override // com.yandex.mobile.ads.impl.InterfaceC30632jl.InterfaceC30633a
        public final InterfaceC30632jl fromBundle(Bundle bundle) {
            C30800lp m32218a;
            m32218a = C30800lp.m32218a(bundle);
            return m32218a;
        }
    };

    /* renamed from: b */
    public final int f81875b;

    /* renamed from: c */
    public final int f81876c;

    /* renamed from: d */
    public final int f81877d;
    @Nullable

    /* renamed from: e */
    public final byte[] f81878e;

    /* renamed from: f */
    private int f81879f;

    public C30800lp(int i, int i2, int i3, @Nullable byte[] bArr) {
        this.f81875b = i;
        this.f81876c = i2;
        this.f81877d = i3;
        this.f81878e = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static C30800lp m32218a(Bundle bundle) {
        return new C30800lp(bundle.getInt(Integer.toString(0, 36), -1), bundle.getInt(Integer.toString(1, 36), -1), bundle.getInt(Integer.toString(2, 36), -1), bundle.getByteArray(Integer.toString(3, 36)));
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C30800lp.class != obj.getClass()) {
            return false;
        }
        C30800lp c30800lp = (C30800lp) obj;
        if (this.f81875b == c30800lp.f81875b && this.f81876c == c30800lp.f81876c && this.f81877d == c30800lp.f81877d && Arrays.equals(this.f81878e, c30800lp.f81878e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f81879f == 0) {
            this.f81879f = Arrays.hashCode(this.f81878e) + ((((((this.f81875b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f81876c) * 31) + this.f81877d) * 31);
        }
        return this.f81879f;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(this.f81875b);
        sb2.append(", ");
        sb2.append(this.f81876c);
        sb2.append(", ");
        sb2.append(this.f81877d);
        sb2.append(", ");
        if (this.f81878e != null) {
            z = true;
        } else {
            z = false;
        }
        sb2.append(z);
        sb2.append(")");
        return sb2.toString();
    }
}
