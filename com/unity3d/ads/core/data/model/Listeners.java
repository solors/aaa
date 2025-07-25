package com.unity3d.ads.core.data.model;

import com.unity3d.ads.UnityAds;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Listeners.kt */
@Metadata
/* loaded from: classes7.dex */
public interface Listeners {

    /* compiled from: Listeners.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static void onClick(@NotNull Listeners listeners, @NotNull String placementId) {
            Intrinsics.checkNotNullParameter(placementId, "placementId");
        }

        public static void onComplete(@NotNull Listeners listeners, @NotNull String placementId, @NotNull UnityAds.UnityAdsShowCompletionState state) {
            Intrinsics.checkNotNullParameter(placementId, "placementId");
            Intrinsics.checkNotNullParameter(state, "state");
        }

        public static void onError(@NotNull Listeners listeners, @NotNull String placementId, @NotNull UnityAds.UnityAdsShowError error, @NotNull String message) {
            Intrinsics.checkNotNullParameter(placementId, "placementId");
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(message, "message");
        }

        public static void onLeftApplication(@NotNull Listeners listeners, @NotNull String placementId) {
            Intrinsics.checkNotNullParameter(placementId, "placementId");
        }

        public static void onStart(@NotNull Listeners listeners, @NotNull String placementId) {
            Intrinsics.checkNotNullParameter(placementId, "placementId");
        }
    }

    void onClick(@NotNull String str);

    void onComplete(@NotNull String str, @NotNull UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState);

    void onError(@NotNull String str, @NotNull UnityAds.UnityAdsShowError unityAdsShowError, @NotNull String str2);

    void onLeftApplication(@NotNull String str);

    void onStart(@NotNull String str);
}
