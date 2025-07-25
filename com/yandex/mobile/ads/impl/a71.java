package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C37563v;
import kotlin.collections.MutableCollections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class a71 {
    @NotNull

    /* renamed from: a */
    private final gu0 f76730a = new gu0();

    /* renamed from: a */
    public final boolean m35941a(@NotNull l11 nativeAdBlock) {
        List<m62<u71>> list;
        Intrinsics.checkNotNullParameter(nativeAdBlock, "nativeAdBlock");
        List<z01> m31672e = nativeAdBlock.m32373c().m31672e();
        ArrayList arrayList = new ArrayList();
        for (z01 z01Var : m31672e) {
            this.f76730a.getClass();
            MutableCollections.m17624D(arrayList, gu0.m33773a(z01Var));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            y52 m34429c = ((eu0) it.next()).m34429c();
            if (m34429c != null) {
                list = m34429c.m27025c();
            } else {
                list = null;
            }
            if (list == null) {
                list = C37563v.m17166m();
            }
            MutableCollections.m17624D(arrayList2, list);
        }
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (!((m62) it2.next()).m32082g().m26367d().isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }
}
