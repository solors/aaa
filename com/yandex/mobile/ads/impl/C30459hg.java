package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.C37566w;
import kotlin.collections.CollectionsJVM;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.hg */
/* loaded from: classes8.dex */
public final class C30459hg {
    @NotNull
    /* renamed from: a */
    public static Set m33554a(@NotNull List assets) {
        int m17154x;
        List m17152z;
        Set m17547e1;
        List<bh0> list;
        Intrinsics.checkNotNullParameter(assets, "assets");
        m17154x = C37566w.m17154x(assets, 10);
        ArrayList arrayList = new ArrayList(m17154x);
        Iterator it = assets.iterator();
        while (it.hasNext()) {
            arrayList.add(((C31034of) it.next()).m31041d());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (next instanceof bh0) {
                list = CollectionsJVM.m17175e(next);
            } else if (next instanceof eu0) {
                list = ((eu0) next).m34431a();
            } else {
                list = null;
            }
            if (list != null) {
                arrayList2.add(list);
            }
        }
        m17152z = C37566w.m17152z(arrayList2);
        m17547e1 = _Collections.m17547e1(m17152z);
        return m17547e1;
    }
}
