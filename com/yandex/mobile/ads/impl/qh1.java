package com.yandex.mobile.ads.impl;

import android.widget.ProgressBar;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class qh1 implements l72 {
    @NotNull

    /* renamed from: a */
    private final ik0 f84368a;
    @NotNull

    /* renamed from: b */
    private final gk0 f84369b;
    @NotNull

    /* renamed from: c */
    private final kh1 f84370c;

    public /* synthetic */ qh1(ik0 ik0Var) {
        this(ik0Var, new gk0(), new kh1());
    }

    @Override // com.yandex.mobile.ads.impl.l72
    /* renamed from: a */
    public final void mo26256a(long j, long j2) {
        h50 instreamAdView;
        hk0 m33219a = this.f84368a.m33219a();
        ProgressBar progressBar = null;
        if (m33219a != null) {
            instreamAdView = m33219a.m33540b();
        } else {
            instreamAdView = null;
        }
        if (instreamAdView != null) {
            this.f84369b.getClass();
            Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
            b62 adUiElements = instreamAdView.getAdUiElements();
            if (adUiElements != null) {
                progressBar = adUiElements.m35624j();
            }
        }
        ProgressBar progressBar2 = progressBar;
        if (progressBar2 != null) {
            this.f84370c.m32559a(progressBar2, j2, j);
        }
    }

    public qh1(@NotNull ik0 instreamAdViewsHolderManager, @NotNull gk0 instreamAdViewUiElementsManager, @NotNull kh1 progressBarConfigurator) {
        Intrinsics.checkNotNullParameter(instreamAdViewsHolderManager, "instreamAdViewsHolderManager");
        Intrinsics.checkNotNullParameter(instreamAdViewUiElementsManager, "instreamAdViewUiElementsManager");
        Intrinsics.checkNotNullParameter(progressBarConfigurator, "progressBarConfigurator");
        this.f84368a = instreamAdViewsHolderManager;
        this.f84369b = instreamAdViewUiElementsManager;
        this.f84370c = progressBarConfigurator;
    }
}
