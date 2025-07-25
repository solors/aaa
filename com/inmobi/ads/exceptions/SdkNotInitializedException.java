package com.inmobi.ads.exceptions;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata
/* loaded from: classes6.dex */
public final class SdkNotInitializedException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkNotInitializedException(@NotNull String adType) {
        super("Please initialize the SDK before creating " + adType + " ad");
        Intrinsics.checkNotNullParameter(adType, "adType");
    }
}
