package com.yandex.mobile.ads.impl;

import androidx.media3.common.AdPlaybackState;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class r82 {
    @NotNull

    /* renamed from: a */
    private final C30443h5 f84676a;
    @NotNull

    /* renamed from: b */
    private final q92 f84677b;
    @NotNull

    /* renamed from: c */
    private final p82 f84678c;

    /* renamed from: d */
    private boolean f84679d;

    public r82(@NotNull C30443h5 adPlaybackStateController, @NotNull u82 videoDurationHolder, @NotNull sf1 positionProviderHolder, @NotNull q92 videoPlayerEventsController, @NotNull p82 videoCompleteNotifyPolicy) {
        Intrinsics.checkNotNullParameter(adPlaybackStateController, "adPlaybackStateController");
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        Intrinsics.checkNotNullParameter(positionProviderHolder, "positionProviderHolder");
        Intrinsics.checkNotNullParameter(videoPlayerEventsController, "videoPlayerEventsController");
        Intrinsics.checkNotNullParameter(videoCompleteNotifyPolicy, "videoCompleteNotifyPolicy");
        this.f84676a = adPlaybackStateController;
        this.f84677b = videoPlayerEventsController;
        this.f84678c = videoCompleteNotifyPolicy;
    }

    /* renamed from: a */
    public final void m30118a() {
        if (!this.f84679d) {
            this.f84679d = true;
            AdPlaybackState m33616a = this.f84676a.m33616a();
            int i = m33616a.adGroupCount;
            for (int i2 = 0; i2 < i; i2++) {
                AdPlaybackState.AdGroup adGroup = m33616a.getAdGroup(i2);
                Intrinsics.checkNotNullExpressionValue(adGroup, "getAdGroup(...)");
                if (adGroup.timeUs != Long.MIN_VALUE) {
                    if (adGroup.count < 0) {
                        m33616a = m33616a.withAdCount(i2, 1);
                        Intrinsics.checkNotNullExpressionValue(m33616a, "withAdCount(...)");
                    }
                    m33616a = m33616a.withSkippedAdGroup(i2);
                    Intrinsics.checkNotNullExpressionValue(m33616a, "withSkippedAdGroup(...)");
                    this.f84676a.m33615a(m33616a);
                }
            }
            this.f84677b.onVideoCompleted();
        }
    }

    /* renamed from: b */
    public final boolean m30117b() {
        return this.f84679d;
    }

    /* renamed from: c */
    public final void m30116c() {
        if (this.f84678c.m30808a()) {
            m30118a();
        }
    }
}
