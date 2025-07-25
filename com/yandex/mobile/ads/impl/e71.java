package com.yandex.mobile.ads.impl;

import android.view.TextureView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public interface e71 extends u90 {
    /* renamed from: a */
    void mo28048a();

    /* renamed from: a */
    void mo28047a(@Nullable TextureView textureView);

    /* renamed from: a */
    void mo28046a(@Nullable ea2 ea2Var);

    /* renamed from: a */
    void mo28045a(@NotNull g72 g72Var);

    /* renamed from: a */
    void mo28044a(@Nullable h72 h72Var);

    /* renamed from: a */
    void mo28043a(@NotNull u71 u71Var);

    /* renamed from: b */
    long mo28041b();

    /* renamed from: c */
    void mo28039c();

    /* renamed from: e */
    boolean mo28035e();

    long getAdPosition();

    float getVolume();

    boolean isPlayingAd();

    void pauseAd();

    void resumeAd();

    void setVolume(float f);
}
