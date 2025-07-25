package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.impl.tr0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class b01 {
    @NotNull

    /* renamed from: a */
    private final h01 f76979a = new h01();

    @NotNull
    /* renamed from: a */
    public final ExtendedViewContainer m35723a(@NotNull Context context, @NotNull List<bh0> imageValues) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageValues, "imageValues");
        ExtendedViewContainer extendedViewContainer = new ExtendedViewContainer(context, null, 0, 6, null);
        this.f76979a.getClass();
        extendedViewContainer.setMeasureSpecProvider(new gi1((float) h01.m33743a(imageValues), new tr0.C31476a()));
        return extendedViewContainer;
    }
}
