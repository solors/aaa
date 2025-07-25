package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.InterfaceC30632jl;

/* renamed from: com.yandex.mobile.ads.impl.tz */
/* loaded from: classes8.dex */
public final class C31541tz implements InterfaceC30632jl {

    /* renamed from: b */
    public final int f86025b;

    /* renamed from: c */
    public final int f86026c;

    /* renamed from: d */
    public final int f86027d;

    static {
        new InterfaceC30632jl.InterfaceC30633a() { // from class: com.yandex.mobile.ads.impl.sy2
            @Override // com.yandex.mobile.ads.impl.InterfaceC30632jl.InterfaceC30633a
            public final InterfaceC30632jl fromBundle(Bundle bundle) {
                C31541tz m28932a;
                m28932a = C31541tz.m28932a(bundle);
                return m28932a;
            }
        };
    }

    public C31541tz(int i, int i2, int i3) {
        this.f86025b = i;
        this.f86026c = i2;
        this.f86027d = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static C31541tz m28932a(Bundle bundle) {
        return new C31541tz(bundle.getInt(Integer.toString(0, 36), 0), bundle.getInt(Integer.toString(1, 36), 0), bundle.getInt(Integer.toString(2, 36), 0));
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31541tz)) {
            return false;
        }
        C31541tz c31541tz = (C31541tz) obj;
        if (this.f86025b == c31541tz.f86025b && this.f86026c == c31541tz.f86026c && this.f86027d == c31541tz.f86027d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f86025b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f86026c) * 31) + this.f86027d;
    }
}
