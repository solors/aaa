package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class gh0 {
    @NotNull

    /* renamed from: a */
    private final dh0 f79661a = new dh0();

    /* renamed from: a */
    public final void m33831a(@NotNull List<? extends C31034of<?>> assets, @NotNull Map<String, Bitmap> images) {
        List<bh0> m34431a;
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(images, "images");
        for (C31034of<?> c31034of : assets) {
            Object m31041d = c31034of.m31041d();
            if (Intrinsics.m17075f(c31034of.m31042c(), "media") && (m31041d instanceof eu0) && (m34431a = ((eu0) m31041d).m34431a()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : m34431a) {
                    this.f79661a.getClass();
                    if (dh0.m34934a((bh0) obj, images)) {
                        arrayList.add(obj);
                    }
                }
                m34431a.retainAll(arrayList);
            }
        }
    }
}
