package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.C37566w;
import kotlin.collections.C37572z0;
import kotlin.collections.MutableCollections;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class g31 {
    @NotNull
    /* renamed from: a */
    public static Set m33938a(@NotNull f31 nativeAdPrivate) {
        Intrinsics.checkNotNullParameter(nativeAdPrivate, "nativeAdPrivate");
        return m33937a(nativeAdPrivate, null);
    }

    @NotNull
    /* renamed from: b */
    public static Set m33936b(@NotNull f31 nativeAdPrivate) {
        Intrinsics.checkNotNullParameter(nativeAdPrivate, "nativeAdPrivate");
        return m33937a(nativeAdPrivate, d10.f77831b);
    }

    @NotNull
    /* renamed from: c */
    public static Set m33935c(@NotNull f31 nativeAdPrivate) {
        Intrinsics.checkNotNullParameter(nativeAdPrivate, "nativeAdPrivate");
        return m33937a(nativeAdPrivate, d10.f77832c);
    }

    /* renamed from: a */
    private static Set m33937a(f31 f31Var, d10 d10Var) {
        Set m17123f;
        int m17154x;
        Set m17547e1;
        List<h10> mo27038c = f31Var.mo27038c();
        if (mo27038c != null) {
            ArrayList arrayList = new ArrayList();
            for (h10 h10Var : mo27038c) {
                MutableCollections.m17624D(arrayList, h10Var.m33741a());
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                c10 c10Var = (c10) next;
                if (d10Var == null || c10Var.m35383b() == d10Var) {
                    arrayList2.add(next);
                }
            }
            m17154x = C37566w.m17154x(arrayList2, 10);
            ArrayList arrayList3 = new ArrayList(m17154x);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((c10) it2.next()).m35384a());
            }
            m17547e1 = _Collections.m17547e1(arrayList3);
            if (m17547e1 != null) {
                return m17547e1;
            }
        }
        m17123f = C37572z0.m17123f();
        return m17123f;
    }
}
