package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.InterfaceC30632jl;

/* loaded from: classes8.dex */
public abstract class bj1 implements InterfaceC30632jl {

    /* renamed from: b */
    public static final InterfaceC30632jl.InterfaceC30633a<bj1> f77334b = new InterfaceC30632jl.InterfaceC30633a() { // from class: com.yandex.mobile.ads.impl.el2
        @Override // com.yandex.mobile.ads.impl.InterfaceC30632jl.InterfaceC30633a
        public final InterfaceC30632jl fromBundle(Bundle bundle) {
            return bj1.m35461c(bundle);
        }
    };

    /* renamed from: a */
    public static bj1 m35462a(Bundle bundle) {
        int i = bundle.getInt(Integer.toString(0, 36), -1);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return zz1.f89171e.fromBundle(bundle);
                    }
                    throw new IllegalArgumentException(C31736wd.m27978a("Unknown RatingType: ", i));
                }
                return qx1.f84585e.fromBundle(bundle);
            }
            return uc1.f86208d.fromBundle(bundle);
        }
        return bd0.f77271e.fromBundle(bundle);
    }

    /* renamed from: c */
    public static /* synthetic */ bj1 m35461c(Bundle bundle) {
        return m35462a(bundle);
    }
}
