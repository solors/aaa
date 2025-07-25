package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.source.ads.AdsLoader;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.i5 */
/* loaded from: classes8.dex */
public final class C30533i5 {
    @Nullable

    /* renamed from: a */
    private AdsLoader.EventListener f80318a;
    @NotNull

    /* renamed from: b */
    private AdPlaybackState f80319b;

    public C30533i5(@Nullable AdsLoader.EventListener eventListener) {
        this.f80318a = eventListener;
        AdPlaybackState NONE = AdPlaybackState.NONE;
        Intrinsics.checkNotNullExpressionValue(NONE, "NONE");
        this.f80319b = NONE;
    }

    @NotNull
    /* renamed from: a */
    public final AdPlaybackState m33369a() {
        return this.f80319b;
    }

    /* renamed from: b */
    public final void m33366b() {
        this.f80318a = null;
        AdPlaybackState NONE = AdPlaybackState.NONE;
        Intrinsics.checkNotNullExpressionValue(NONE, "NONE");
        this.f80319b = NONE;
    }

    /* renamed from: a */
    public final void m33367a(@Nullable AdsLoader.EventListener eventListener) {
        this.f80318a = eventListener;
    }

    /* renamed from: a */
    public final void m33368a(@NotNull AdPlaybackState adPlaybackState) {
        Intrinsics.checkNotNullParameter(adPlaybackState, "adPlaybackState");
        this.f80319b = adPlaybackState;
        AdsLoader.EventListener eventListener = this.f80318a;
        if (eventListener != null) {
            eventListener.onAdPlaybackState(adPlaybackState);
        }
    }
}
