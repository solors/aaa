package com.unity3d.ads.core.extensions;

import gatewayprotocol.p687v1.InitializationResponseOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p715i8.UnityAdFormat;

@Metadata
/* renamed from: com.unity3d.ads.core.extensions.AdFormatExtensionsKt */
/* loaded from: classes7.dex */
public final class AdFormatExtensions {

    /* compiled from: AdFormatExtensions.kt */
    @Metadata
    /* renamed from: com.unity3d.ads.core.extensions.AdFormatExtensionsKt$WhenMappings */
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InitializationResponseOuterClass.AdFormat.values().length];
            try {
                iArr[InitializationResponseOuterClass.AdFormat.AD_FORMAT_REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InitializationResponseOuterClass.AdFormat.AD_FORMAT_INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InitializationResponseOuterClass.AdFormat.AD_FORMAT_BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Nullable
    public static final UnityAdFormat toUnityAdFormat(@NotNull InitializationResponseOuterClass.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[adFormat.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return UnityAdFormat.BANNER;
            }
            return UnityAdFormat.INTERSTITIAL;
        }
        return UnityAdFormat.REWARDED;
    }
}
