package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.InterfaceC30632jl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.zt */
/* loaded from: classes8.dex */
public final class C32015zt implements InterfaceC30632jl {

    /* renamed from: b */
    public static final /* synthetic */ int f89100b = 0;

    static {
        new C32015zt(oh0.m31009h());
        new InterfaceC30632jl.InterfaceC30633a() { // from class: com.yandex.mobile.ads.impl.e23
            @Override // com.yandex.mobile.ads.impl.InterfaceC30632jl.InterfaceC30633a
            public final InterfaceC30632jl fromBundle(Bundle bundle) {
                return C32015zt.m26003b(bundle);
            }
        };
    }

    public C32015zt(List<C31840xt> list) {
        oh0.m31014a((Collection) list);
    }

    /* renamed from: a */
    public static final C32015zt m26004a(Bundle bundle) {
        oh0 m32506a;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        if (parcelableArrayList == null) {
            m32506a = oh0.m31009h();
        } else {
            m32506a = C30734kl.m32506a(C31840xt.f87806t, parcelableArrayList);
        }
        return new C32015zt(m32506a);
    }

    /* renamed from: b */
    public static /* synthetic */ C32015zt m26003b(Bundle bundle) {
        return m26004a(bundle);
    }
}
