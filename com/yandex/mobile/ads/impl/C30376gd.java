package com.yandex.mobile.ads.impl;

import android.widget.ProgressBar;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.gd */
/* loaded from: classes8.dex */
public final class C30376gd {
    /* renamed from: a */
    public static void m33882a(@NotNull ProgressBar progressBar, long j, long j2) {
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        progressBar.clearAnimation();
        if (j > 0) {
            progressBar.setMax((int) j);
            ih1 ih1Var = new ih1(progressBar, progressBar.getProgress(), (int) j2);
            ih1Var.setDuration(200L);
            progressBar.startAnimation(ih1Var);
        }
    }
}
