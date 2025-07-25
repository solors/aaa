package com.yandex.mobile.ads.impl;

import android.view.View;
import be.MathJVM;
import com.monetization.ads.video.playback.view.ExtendedVideoAdControlsContainer;
import com.yandex.mobile.ads.impl.tr0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class x80 implements tr0 {
    @NotNull

    /* renamed from: a */
    private final View f87593a;
    @NotNull

    /* renamed from: b */
    private final tr0.C31476a f87594b;

    public x80(@NotNull ExtendedVideoAdControlsContainer container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f87593a = container;
        this.f87594b = new tr0.C31476a();
    }

    @Override // com.yandex.mobile.ads.impl.tr0
    @NotNull
    /* renamed from: a */
    public final tr0.C31476a mo27438a(int i, int i2) {
        int m103791d;
        m103791d = MathJVM.m103791d(this.f87593a.getHeight() * 0.1f);
        tr0.C31476a c31476a = this.f87594b;
        c31476a.f85812a = i;
        c31476a.f85813b = View.MeasureSpec.makeMeasureSpec(m103791d, 1073741824);
        return this.f87594b;
    }
}
