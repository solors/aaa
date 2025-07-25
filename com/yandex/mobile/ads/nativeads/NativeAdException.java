package com.yandex.mobile.ads.nativeads;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes8.dex */
public final class NativeAdException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdException(@NotNull String detailMessage, @NotNull Throwable exception) {
        super(detailMessage, exception);
        Intrinsics.checkNotNullParameter(detailMessage, "detailMessage");
        Intrinsics.checkNotNullParameter(exception, "exception");
    }
}
