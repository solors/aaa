package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.hp */
/* loaded from: classes6.dex */
public interface InterfaceC20059hp {
    /* renamed from: a */
    void mo57421a(@Nullable IronSourceError ironSourceError);

    /* renamed from: a */
    void mo57418a(@Nullable IronSourceError ironSourceError, @NotNull LevelPlayAdInfo levelPlayAdInfo);

    /* renamed from: a */
    void mo57417a(@NotNull Placement placement, @NotNull LevelPlayAdInfo levelPlayAdInfo);

    /* renamed from: a */
    void mo57415a(boolean z, @NotNull LevelPlayAdInfo levelPlayAdInfo);

    /* renamed from: b */
    void mo57411b(@NotNull Placement placement, @NotNull LevelPlayAdInfo levelPlayAdInfo);

    /* renamed from: d */
    void mo57407d(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    /* renamed from: f */
    void mo57402f(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    /* renamed from: h */
    void mo57399h(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    /* renamed from: i */
    void mo57397i(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void onRewardedVideoAdEnded();

    void onRewardedVideoAdStarted();
}
