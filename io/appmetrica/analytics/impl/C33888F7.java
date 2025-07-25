package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.C37563v;
import kotlin.collections.C37566w;
import kotlin.collections.MutableCollections;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.F7 */
/* loaded from: classes9.dex */
public final class C33888F7 implements ServiceComponentsInitializer {

    /* renamed from: a */
    public final List f92817a;

    public C33888F7() {
        List m17163p;
        m17163p = C37563v.m17163p("io.appmetrica.analytics.remotepermissions.internal.RemotePermissionsModuleEntryPoint", "io.appmetrica.analytics.apphud.internal.ApphudServiceModuleEntryPoint");
        this.f92817a = m17163p;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer
    public final void onCreate(@NotNull Context context) {
        int m17154x;
        C33843Dc c33843Dc = C34693la.f94825C.f94846s;
        List<String> list = this.f92817a;
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
            C34693la.f94825C.f94846s.m22717a(new C34724me(context, "io.appmetrica.analytics.modules.ads", "lsm"));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
}
