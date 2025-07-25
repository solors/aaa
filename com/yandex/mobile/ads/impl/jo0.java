package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class jo0<V extends ViewGroup> {
    @NotNull

    /* renamed from: a */
    private final vo1<V> f81023a;

    public /* synthetic */ jo0() {
        this(new vo1());
    }

    @Nullable
    /* renamed from: a */
    public final V m32830a(@NotNull ViewGroup container, @NotNull ho0<V> layoutDesign) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(layoutDesign, "layoutDesign");
        Context context = container.getContext();
        int m33504c = layoutDesign.m33504c();
        Class<V> m33503d = layoutDesign.m33503d();
        vo1<V> vo1Var = this.f81023a;
        Intrinsics.m17074g(context);
        vo1Var.getClass();
        return (V) vo1.m28247a(context, m33503d, m33504c, container);
    }

    public jo0(@NotNull vo1<V> safeLayoutInflater) {
        Intrinsics.checkNotNullParameter(safeLayoutInflater, "safeLayoutInflater");
        this.f81023a = safeLayoutInflater;
    }
}
