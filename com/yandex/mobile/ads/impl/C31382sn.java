package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.sn */
/* loaded from: classes8.dex */
public final class C31382sn {
    @NotNull

    /* renamed from: a */
    private final m62<kl0> f85311a;
    @NotNull

    /* renamed from: b */
    private final View.OnClickListener f85312b;
    @NotNull

    /* renamed from: c */
    private final C31778wz f85313c;

    public C31382sn(@NotNull Context context, @NotNull pq1 sdkEnvironmentModule, @NotNull C31920yr coreInstreamAdBreak, @NotNull m62<kl0> videoAdInfo, @NotNull sa2 videoTracker, @NotNull pl0 playbackListener, @NotNull n82 videoClicks, @NotNull View.OnClickListener clickListener, @NotNull C31778wz deviceTypeProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(coreInstreamAdBreak, "coreInstreamAdBreak");
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        Intrinsics.checkNotNullParameter(playbackListener, "playbackListener");
        Intrinsics.checkNotNullParameter(videoClicks, "videoClicks");
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        Intrinsics.checkNotNullParameter(deviceTypeProvider, "deviceTypeProvider");
        this.f85311a = videoAdInfo;
        this.f85312b = clickListener;
        this.f85313c = deviceTypeProvider;
    }

    /* renamed from: a */
    public final void m29580a(@NotNull View clickControl) {
        boolean z;
        Intrinsics.checkNotNullParameter(clickControl, "clickControl");
        C31778wz c31778wz = this.f85313c;
        Context context = clickControl.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        EnumC31709vz m27724a = c31778wz.m27724a(context);
        String m32445b = this.f85311a.m32087b().m32445b();
        if (m32445b != null && m32445b.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if ((!z) && m27724a != EnumC31709vz.f87043d) {
            clickControl.setOnClickListener(this.f85312b);
        } else {
            clickControl.setVisibility(8);
        }
    }
}
