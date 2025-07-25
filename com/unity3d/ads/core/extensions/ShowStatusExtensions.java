package com.unity3d.ads.core.extensions;

import com.unity3d.ads.UnityAds;
import com.unity3d.ads.adplayer.model.ShowStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.unity3d.ads.core.extensions.ShowStatusExtensionsKt */
/* loaded from: classes7.dex */
public final class ShowStatusExtensions {

    /* compiled from: ShowStatusExtensions.kt */
    @Metadata
    /* renamed from: com.unity3d.ads.core.extensions.ShowStatusExtensionsKt$WhenMappings */
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShowStatus.values().length];
            try {
                iArr[ShowStatus.COMPLETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShowStatus.SKIPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final UnityAds.UnityAdsShowCompletionState toUnityAdsShowCompletionState(@NotNull ShowStatus showStatus) {
        Intrinsics.checkNotNullParameter(showStatus, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[showStatus.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return UnityAds.UnityAdsShowCompletionState.SKIPPED;
            }
            throw new IllegalStateException("Unexpected show status: " + showStatus);
        }
        return UnityAds.UnityAdsShowCompletionState.COMPLETED;
    }
}
