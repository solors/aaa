package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.C37566w;
import kotlin.collections._Collections;
import kotlin.collections._CollectionsJvm;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class gu0 {
    @NotNull
    /* renamed from: a */
    public static Set m33773a(@NotNull z01 nativeAd) {
        int m17154x;
        List m17582b0;
        Set m17547e1;
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        List<C31034of<?>> m26492b = nativeAd.m26492b();
        m17154x = C37566w.m17154x(m26492b, 10);
        ArrayList arrayList = new ArrayList(m17154x);
        Iterator<T> it = m26492b.iterator();
        while (it.hasNext()) {
            arrayList.add(((C31034of) it.next()).m31041d());
        }
        m17582b0 = _CollectionsJvm.m17582b0(arrayList, eu0.class);
        m17547e1 = _Collections.m17547e1(m17582b0);
        return m17547e1;
    }
}
