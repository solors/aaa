package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class vg0 {
    @NotNull

    /* renamed from: a */
    private final wg0 f86740a;
    @NotNull

    /* renamed from: b */
    private final ug0 f86741b;

    public vg0(@NotNull wg0 imageProvider, @NotNull ug0 imagePreviewCreator) {
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(imagePreviewCreator, "imagePreviewCreator");
        this.f86740a = imageProvider;
        this.f86741b = imagePreviewCreator;
    }

    /* renamed from: a */
    public final void m28319a(@NotNull Set<bh0> imageValues) {
        Bitmap m28784a;
        boolean m16635B;
        Intrinsics.checkNotNullParameter(imageValues, "imageValues");
        ArrayList arrayList = new ArrayList();
        for (Object obj : imageValues) {
            String m35473c = ((bh0) obj).m35473c();
            if (m35473c != null) {
                m16635B = StringsJVM.m16635B(m35473c);
                if (!m16635B) {
                    arrayList.add(obj);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bh0 bh0Var = (bh0) it.next();
            if (this.f86740a.mo27909a(bh0Var) == null && this.f86740a.mo27906b(bh0Var) == null && (m28784a = this.f86741b.m28784a(bh0Var)) != null) {
                this.f86740a.mo27910a(m28784a, bh0Var);
            }
        }
    }
}
