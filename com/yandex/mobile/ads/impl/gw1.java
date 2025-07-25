package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C37563v;
import kotlin.collections.C37566w;
import kotlin.collections.MutableCollections;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class gw1 {
    @NotNull
    /* renamed from: a */
    public static ArrayList m33762a(@Nullable List list, @Nullable xo0 xo0Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(m33763a(xo0Var));
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.addAll(m33763a(((C31034of) it.next()).m31044a()));
            }
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* renamed from: a */
    private static List m33763a(xo0 xo0Var) {
        List m17166m;
        List<InterfaceC31780x> m27443a;
        int m17154x;
        if (xo0Var == null || (m27443a = xo0Var.m27443a()) == null) {
            m17166m = C37563v.m17166m();
            return m17166m;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : m27443a) {
            if (obj instanceof ew1) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            List<hw1> m34415c = ((ew1) it.next()).m34415c();
            m17154x = C37566w.m17154x(m34415c, 10);
            ArrayList arrayList3 = new ArrayList(m17154x);
            for (hw1 hw1Var : m34415c) {
                arrayList3.add(hw1Var.m33447c().m32717a());
            }
            MutableCollections.m17624D(arrayList2, arrayList3);
        }
        return arrayList2;
    }
}
