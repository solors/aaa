package com.unity3d.ads.core.data.model.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ExposureException.kt */
@Metadata
/* loaded from: classes7.dex */
public final class ExposureException extends Exception {
    @NotNull
    private final Object[] parameters;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposureException(@NotNull String message, @NotNull Object[] parameters) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.parameters = parameters;
    }

    @NotNull
    public final Object[] getParameters() {
        return this.parameters;
    }
}
