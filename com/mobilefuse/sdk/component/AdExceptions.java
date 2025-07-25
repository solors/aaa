package com.mobilefuse.sdk.component;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.mobilefuse.sdk.component.AdLoadException */
/* loaded from: classes7.dex */
public final class AdExceptions extends Throwable {
    @NotNull
    private final LoadingError error;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdExceptions(@NotNull LoadingError error) {
        super(error.getMessage());
        Intrinsics.checkNotNullParameter(error, "error");
        this.error = error;
    }

    @NotNull
    public final LoadingError getError() {
        return this.error;
    }
}
