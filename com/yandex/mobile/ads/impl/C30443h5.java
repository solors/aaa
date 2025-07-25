package com.yandex.mobile.ads.impl;

import androidx.media3.common.AdPlaybackState;
import androidx.media3.exoplayer.source.ads.AdsLoader;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.h5 */
/* loaded from: classes8.dex */
public final class C30443h5 {
    @Nullable

    /* renamed from: a */
    private AdsLoader.EventListener f79954a;
    @NotNull

    /* renamed from: b */
    private AdPlaybackState f79955b;

    public C30443h5(@Nullable AdsLoader.EventListener eventListener) {
        this.f79954a = eventListener;
        AdPlaybackState NONE = AdPlaybackState.NONE;
        Intrinsics.checkNotNullExpressionValue(NONE, "NONE");
        this.f79955b = NONE;
    }

    @NotNull
    /* renamed from: a */
    public final AdPlaybackState m33616a() {
        return this.f79955b;
    }

    /* renamed from: b */
    public final void m33613b() {
        this.f79954a = null;
        AdPlaybackState NONE = AdPlaybackState.NONE;
        Intrinsics.checkNotNullExpressionValue(NONE, "NONE");
        this.f79955b = NONE;
    }

    /* renamed from: a */
    public final void m33614a(@Nullable AdsLoader.EventListener eventListener) {
        this.f79954a = eventListener;
    }

    /* renamed from: a */
    public final void m33615a(@NotNull AdPlaybackState adPlaybackState) {
        Intrinsics.checkNotNullParameter(adPlaybackState, "adPlaybackState");
        this.f79955b = adPlaybackState;
        AdsLoader.EventListener eventListener = this.f79954a;
        if (eventListener != null) {
            eventListener.onAdPlaybackState(adPlaybackState);
        }
    }
}
