package com.ironsource;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.lh */
/* loaded from: classes6.dex */
public interface InterfaceC20267lh {
    /* renamed from: a */
    void mo57473a(@Nullable LevelPlayAdError levelPlayAdError);

    /* renamed from: a */
    default void mo57472a(@NotNull LevelPlayAdError error, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    /* renamed from: a */
    void mo57471a(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    /* renamed from: b */
    void mo57470b(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    /* renamed from: c */
    void mo57469c(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    /* renamed from: d */
    void mo57468d(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    default void onAdInfoChanged(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }
}
