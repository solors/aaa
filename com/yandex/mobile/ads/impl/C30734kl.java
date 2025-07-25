package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.InterfaceC30632jl;
import com.yandex.mobile.ads.impl.oh0;
import java.util.ArrayList;

/* renamed from: com.yandex.mobile.ads.impl.kl */
/* loaded from: classes8.dex */
public final class C30734kl {
    private C30734kl() {
    }

    /* renamed from: a */
    public static oh0 m32506a(InterfaceC30632jl.InterfaceC30633a interfaceC30633a, ArrayList arrayList) {
        int i = oh0.f83515d;
        oh0.C31039a c31039a = new oh0.C31039a();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Bundle bundle = (Bundle) arrayList.get(i2);
            bundle.getClass();
            c31039a.m31999b(interfaceC30633a.fromBundle(bundle));
        }
        return c31039a.m31008a();
    }
}
