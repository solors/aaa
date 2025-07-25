package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.gg */
/* loaded from: classes8.dex */
public final class C30390gg {
    @NotNull

    /* renamed from: a */
    private final dh0 f79650a;

    public /* synthetic */ C30390gg() {
        this(new dh0());
    }

    @NotNull
    /* renamed from: a */
    public final ArrayList m33833a(@NotNull List assets, @NotNull Map images) {
        bh0 bh0Var;
        Object m17529r0;
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(images, "images");
        ArrayList arrayList = new ArrayList();
        Iterator it = assets.iterator();
        while (it.hasNext()) {
            C31034of c31034of = (C31034of) it.next();
            Object m31041d = c31034of.m31041d();
            String m31042c = c31034of.m31042c();
            if (Intrinsics.m17075f("image", m31042c) && (m31041d instanceof bh0)) {
                this.f79650a.getClass();
                if (dh0.m34934a((bh0) m31041d, images)) {
                    arrayList.add(c31034of);
                }
            } else {
                if (Intrinsics.m17075f("media", m31042c) && (m31041d instanceof eu0)) {
                    eu0 eu0Var = (eu0) m31041d;
                    if (eu0Var.m34431a() != null) {
                        Intrinsics.m17073h(m31041d, "null cannot be cast to non-null type com.monetization.ads.network.model.MediaValue");
                        List<bh0> m34431a = eu0Var.m34431a();
                        if (m34431a != null) {
                            m17529r0 = _Collections.m17529r0(m34431a);
                            bh0Var = (bh0) m17529r0;
                        } else {
                            bh0Var = null;
                        }
                        y52 m34429c = eu0Var.m34429c();
                        xr0 m34430b = eu0Var.m34430b();
                        if (m34429c == null && m34430b == null) {
                            if (bh0Var != null) {
                                this.f79650a.getClass();
                                if (dh0.m34934a(bh0Var, images)) {
                                }
                            }
                        }
                        arrayList.add(c31034of);
                    }
                }
                arrayList.add(c31034of);
            }
        }
        return arrayList;
    }

    public C30390gg(@NotNull dh0 imageValueValidator) {
        Intrinsics.checkNotNullParameter(imageValueValidator, "imageValueValidator");
        this.f79650a = imageValueValidator;
    }
}
