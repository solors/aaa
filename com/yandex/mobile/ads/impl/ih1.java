package com.yandex.mobile.ads.impl;

import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import android.widget.ProgressBar;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ih1 extends Animation {

    /* renamed from: b */
    private final int f80462b;

    /* renamed from: c */
    private final int f80463c;
    @NotNull

    /* renamed from: d */
    private final WeakReference<ProgressBar> f80464d;

    public ih1(@NotNull ProgressBar progressBar, int i, int i2) {
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        this.f80462b = i;
        this.f80463c = i2;
        this.f80464d = new WeakReference<>(progressBar);
        setInterpolator(new LinearInterpolator());
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, @Nullable Transformation transformation) {
        ProgressBar progressBar = this.f80464d.get();
        if (progressBar != null) {
            super.applyTransformation(f, transformation);
            int i = this.f80462b;
            progressBar.setProgress(Math.round(((this.f80463c - i) * f) + i));
        }
    }
}
