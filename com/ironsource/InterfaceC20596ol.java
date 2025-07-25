package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.ol */
/* loaded from: classes6.dex */
public interface InterfaceC20596ol {
    /* renamed from: b */
    void mo55950b(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    /* renamed from: j */
    void mo55949j(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void onNativeAdLoadFailed(@Nullable IronSourceError ironSourceError);
}
