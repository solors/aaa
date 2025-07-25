package com.mobilefuse.sdk.component;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AdExceptions.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AdParseException extends Throwable {
    @NotNull
    private final ParsingError error;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdParseException(@NotNull ParsingError error) {
        super(error.getMessage());
        Intrinsics.checkNotNullParameter(error, "error");
        this.error = error;
    }

    @NotNull
    public final ParsingError getError() {
        return this.error;
    }
}
