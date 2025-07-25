package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class a21 {
    @NotNull

    /* renamed from: a */
    private final C30459hg f76666a;

    public /* synthetic */ a21() {
        this(new C30459hg());
    }

    @NotNull
    /* renamed from: a */
    public final List<String> m36009a(@NotNull z01 nativeAd) {
        List<String> m17553Z0;
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        C30459hg c30459hg = this.f76666a;
        List<C31034of<?>> m26492b = nativeAd.m26492b();
        c30459hg.getClass();
        Set<bh0> m33554a = C30459hg.m33554a(m26492b);
        ArrayList arrayList = new ArrayList();
        for (bh0 bh0Var : m33554a) {
            String m35472d = bh0Var.m35472d();
            if (m35472d != null) {
                arrayList.add(m35472d);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((String) next).length() > 0) {
                arrayList2.add(next);
            }
        }
        m17553Z0 = _Collections.m17553Z0(arrayList2);
        return m17553Z0;
    }

    public a21(@NotNull C30459hg assetsImagesProvider) {
        Intrinsics.checkNotNullParameter(assetsImagesProvider, "assetsImagesProvider");
        this.f76666a = assetsImagesProvider;
    }
}
