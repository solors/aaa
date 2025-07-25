package com.unity3d.services.core.extensions;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: StringExtensions.kt */
@Metadata
/* loaded from: classes7.dex */
public final class StringExtensionsKt {
    @NotNull
    public static final String toUnityMessage(@Nullable String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return "[Unity Ads] Internal error";
        }
        return UnityAdsConstants.Messages.MSG_UNITY_BASE + str;
    }
}
