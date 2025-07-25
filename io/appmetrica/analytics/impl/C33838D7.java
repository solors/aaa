package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.clientcomponents.ClientComponentsInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.C37563v;
import kotlin.collections.C37566w;
import kotlin.collections.MutableCollections;

/* renamed from: io.appmetrica.analytics.impl.D7 */
/* loaded from: classes9.dex */
public final class C33838D7 implements ClientComponentsInitializer {

    /* renamed from: a */
    public final List f92705a;

    public C33838D7() {
        List m17163p;
        m17163p = C37563v.m17163p("io.appmetrica.analytics.adrevenue.admob.v23.internal.AdMobClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.applovin.v12.internal.AppLovinClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.fyber.v3.internal.FyberClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.ironsource.v7.internal.IronSourceClientModuleEntryPoint", "io.appmetrica.analytics.apphud.internal.ApphudClientModuleEntryPoint");
        this.f92705a = m17163p;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.clientcomponents.ClientComponentsInitializer
    public final void onCreate() {
        int m17154x;
        if (C34848r4.m21050i().f95249a.m22155c()) {
            C33843Dc c33843Dc = C34848r4.m21050i().f95261m;
            List<String> list = this.f92705a;
            m17154x = C37566w.m17154x(list, 10);
            ArrayList arrayList = new ArrayList(m17154x);
            for (String str : list) {
                arrayList.add(new C35005x5(str));
            }
            Object[] array = arrayList.toArray(new C35005x5[0]);
            if (array != null) {
                C35005x5[] c35005x5Arr = (C35005x5[]) array;
                InterfaceC33818Cc[] interfaceC33818CcArr = (InterfaceC33818Cc[]) Arrays.copyOf(c35005x5Arr, c35005x5Arr.length);
                synchronized (c33843Dc) {
                    MutableCollections.m17622F(c33843Dc.f92706a, interfaceC33818CcArr);
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }
}
