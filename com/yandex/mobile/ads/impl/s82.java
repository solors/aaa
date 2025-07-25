package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class s82 {
    @NotNull

    /* renamed from: a */
    private final C30533i5 f85147a;
    @NotNull

    /* renamed from: b */
    private final p92 f85148b;
    @NotNull

    /* renamed from: c */
    private final q82 f85149c;

    /* renamed from: d */
    private boolean f85150d;

    public s82(@NotNull C30533i5 adPlaybackStateController, @NotNull v82 videoDurationHolder, @NotNull tf1 positionProviderHolder, @NotNull p92 videoPlayerEventsController, @NotNull q82 videoCompleteNotifyPolicy) {
        Intrinsics.checkNotNullParameter(adPlaybackStateController, "adPlaybackStateController");
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        Intrinsics.checkNotNullParameter(positionProviderHolder, "positionProviderHolder");
        Intrinsics.checkNotNullParameter(videoPlayerEventsController, "videoPlayerEventsController");
        Intrinsics.checkNotNullParameter(videoCompleteNotifyPolicy, "videoCompleteNotifyPolicy");
        this.f85147a = adPlaybackStateController;
        this.f85148b = videoPlayerEventsController;
        this.f85149c = videoCompleteNotifyPolicy;
    }

    /* renamed from: a */
    public final void m29675a() {
        if (!this.f85150d) {
            this.f85150d = true;
            AdPlaybackState m33369a = this.f85147a.m33369a();
            int i = m33369a.adGroupCount;
            for (int i2 = 0; i2 < i; i2++) {
                AdPlaybackState.AdGroup adGroup = m33369a.getAdGroup(i2);
                Intrinsics.checkNotNullExpressionValue(adGroup, "getAdGroup(...)");
                if (adGroup.timeUs != Long.MIN_VALUE) {
                    if (adGroup.count < 0) {
                        m33369a = m33369a.withAdCount(i2, 1);
                        Intrinsics.checkNotNullExpressionValue(m33369a, "withAdCount(...)");
                    }
                    m33369a = m33369a.withSkippedAdGroup(i2);
                    Intrinsics.checkNotNullExpressionValue(m33369a, "withSkippedAdGroup(...)");
                    this.f85147a.m33368a(m33369a);
                }
            }
            this.f85148b.onVideoCompleted();
        }
    }

    /* renamed from: b */
    public final boolean m29674b() {
        return this.f85150d;
    }

    /* renamed from: c */
    public final void m29673c() {
        if (this.f85149c.m30445a()) {
            m29675a();
        }
    }
}
