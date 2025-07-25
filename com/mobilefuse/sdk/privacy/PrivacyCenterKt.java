package com.mobilefuse.sdk.privacy;

import com.mobilefuse.sdk.MobileFuse;
import com.mobilefuse.sdk.MobileFuseSettings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PrivacyCenter.kt */
@Metadata
/* loaded from: classes7.dex */
public final class PrivacyCenterKt {
    public static final boolean dntFactory(@NotNull PrivacyCenter dntFactory) {
        Intrinsics.checkNotNullParameter(dntFactory, "$this$dntFactory");
        return MobileFuse.getPrivacyPreferences().isDoNotTrack();
    }

    public static final boolean ifaLmtFactory(@NotNull PrivacyCenter ifaLmtFactory) {
        Intrinsics.checkNotNullParameter(ifaLmtFactory, "$this$ifaLmtFactory");
        return MobileFuseSettings.isLimitTrackingEnabled();
    }
}
