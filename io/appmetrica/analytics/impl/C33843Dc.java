package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.C37566w;
import kotlin.collections.MutableCollections;
import kotlin.collections._Collections;

/* renamed from: io.appmetrica.analytics.impl.Dc */
/* loaded from: classes9.dex */
public final class C33843Dc {

    /* renamed from: a */
    public final LinkedHashSet f92706a = new LinkedHashSet();

    /* renamed from: a */
    public final synchronized Set m22718a() {
        int m17154x;
        Set m17547e1;
        LinkedHashSet<InterfaceC33818Cc> linkedHashSet = this.f92706a;
        m17154x = C37566w.m17154x(linkedHashSet, 10);
        ArrayList arrayList = new ArrayList(m17154x);
        for (InterfaceC33818Cc interfaceC33818Cc : linkedHashSet) {
            arrayList.add(interfaceC33818Cc.mo20790a());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        m17547e1 = _Collections.m17547e1(arrayList2);
        return m17547e1;
    }

    /* renamed from: a */
    public final synchronized void m22717a(InterfaceC33818Cc... interfaceC33818CcArr) {
        MutableCollections.m17622F(this.f92706a, interfaceC33818CcArr);
    }
}
