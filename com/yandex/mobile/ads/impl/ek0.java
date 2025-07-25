package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ek0 {
    @NotNull

    /* renamed from: a */
    private final Context f78679a;
    @NotNull

    /* renamed from: b */
    private final ik0 f78680b;
    @NotNull

    /* renamed from: c */
    private final gj0 f78681c;
    @NotNull

    /* renamed from: d */
    private final y22 f78682d;
    @Nullable

    /* renamed from: e */
    private x22 f78683e;

    public /* synthetic */ ek0(Context context, pq1 pq1Var, ik0 ik0Var, ze1 ze1Var, pj0 pj0Var) {
        this(context, pq1Var, ik0Var, ze1Var, pj0Var, new gj0());
    }

    /* renamed from: a */
    public final void m34504a(@NotNull C31920yr coreInstreamAdBreak, @NotNull m62 videoAdInfo, @NotNull sa2 videoTracker, @NotNull a62 playbackListener, @NotNull wg1 imageProvider) {
        Intrinsics.checkNotNullParameter(coreInstreamAdBreak, "coreInstreamAdBreak");
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        Intrinsics.checkNotNullParameter(playbackListener, "playbackListener");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        m34506a();
        hk0 m33219a = this.f78680b.m33219a();
        if (m33219a != null) {
            y22 y22Var = this.f78682d;
            Context applicationContext = this.f78679a.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            x22 m27111a = y22Var.m27111a(applicationContext, m33219a, coreInstreamAdBreak, videoAdInfo, videoTracker, imageProvider, playbackListener);
            m27111a.m27678a();
            this.f78683e = m27111a;
        }
    }

    /* renamed from: b */
    public final void m34503b() {
        this.f78681c.m33825b();
    }

    public ek0(@NotNull Context context, @NotNull pq1 sdkEnvironmentModule, @NotNull ik0 instreamAdViewsHolderManager, @NotNull ze1 playerVolumeProvider, @NotNull pj0 playerController, @NotNull gj0 instreamAdCustomUiElementsHolder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(instreamAdViewsHolderManager, "instreamAdViewsHolderManager");
        Intrinsics.checkNotNullParameter(playerVolumeProvider, "playerVolumeProvider");
        Intrinsics.checkNotNullParameter(playerController, "playerController");
        Intrinsics.checkNotNullParameter(instreamAdCustomUiElementsHolder, "instreamAdCustomUiElementsHolder");
        this.f78679a = context;
        this.f78680b = instreamAdViewsHolderManager;
        this.f78681c = instreamAdCustomUiElementsHolder;
        this.f78682d = new y22(sdkEnvironmentModule, playerVolumeProvider, playerController, instreamAdCustomUiElementsHolder);
    }

    /* renamed from: a */
    public final void m34506a() {
        x22 x22Var = this.f78683e;
        if (x22Var != null) {
            x22Var.m27676b();
        }
        this.f78683e = null;
    }

    /* renamed from: a */
    public final void m34505a(@NotNull m62<kl0> nextVideo) {
        Intrinsics.checkNotNullParameter(nextVideo, "nextVideo");
        x22 x22Var = this.f78683e;
        if (x22Var != null) {
            x22Var.m27677a(nextVideo);
        }
    }
}
