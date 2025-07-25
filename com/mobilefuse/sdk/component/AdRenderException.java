package com.mobilefuse.sdk.component;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AdExceptions.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AdRenderException extends Throwable {
    @NotNull
    private final RenderError error;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdRenderException(@NotNull RenderError error) {
        super(error.getMessage());
        Intrinsics.checkNotNullParameter(error, "error");
        this.error = error;
    }

    @NotNull
    public final RenderError getError() {
        return this.error;
    }
}
