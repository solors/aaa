package com.moloco.sdk.publisher;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public interface AdLoad {

    @Metadata
    /* loaded from: classes7.dex */
    public interface Listener {
        void onAdLoadFailed(@NotNull MolocoAdError molocoAdError);

        void onAdLoadSuccess(@NotNull MolocoAd molocoAd);
    }

    boolean isLoaded();

    void load(@NotNull String str, @Nullable Listener listener);
}
