package com.yandex.mobile.ads.impl;

import com.monetization.ads.mediation.base.C25606a;
import com.yandex.mobile.ads.impl.ak1;
import com.yandex.mobile.ads.impl.jw0;
import com.yandex.mobile.ads.impl.nw0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C37566w;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class xw0 {
    @Nullable

    /* renamed from: a */
    private String f87891a;

    @NotNull
    /* renamed from: a */
    public final ArrayList m27182a(@NotNull List networks) {
        int m17154x;
        int m17154x2;
        C25606a c25606a;
        nw0.C30984c c30984c;
        Intrinsics.checkNotNullParameter(networks, "networks");
        m17154x = C37566w.m17154x(networks, 10);
        ArrayList arrayList = new ArrayList(m17154x);
        Iterator it = networks.iterator();
        while (it.hasNext()) {
            jw0 jw0Var = (jw0) it.next();
            List<jw0.C30677b> m32723b = jw0Var.m32723b();
            m17154x2 = C37566w.m17154x(m32723b, 10);
            ArrayList arrayList2 = new ArrayList(m17154x2);
            for (jw0.C30677b c30677b : m32723b) {
                try {
                    c25606a = (C25606a) ak1.C29944a.m35838a(c30677b.m32719a(), new Object[0]);
                } catch (Exception unused) {
                    c25606a = null;
                }
                if (c25606a == null) {
                    c30984c = new nw0.C30984c(c30677b.m32718b(), null, false);
                } else {
                    if (this.f87891a == null) {
                        this.f87891a = c25606a.getAdapterInfo().getNetworkSdkVersion();
                    }
                    c30984c = new nw0.C30984c(c30677b.m32718b(), c25606a.getAdapterInfo().getAdapterVersion(), true);
                }
                arrayList2.add(c30984c);
            }
            String str = this.f87891a;
            this.f87891a = null;
            arrayList.add(new nw0(jw0Var.m32722c(), str, arrayList2));
        }
        return arrayList;
    }
}
