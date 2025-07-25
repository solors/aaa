package com.mobilefuse.sdk.component;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: AdExceptions.kt */
@Metadata
/* loaded from: classes7.dex */
public enum RenderError {
    UNEXPECTED_PARSED_MARKUP_FORMAT(1, "The parsed ad markup is in an unexpected format"),
    VALID_RENDERER_UNAVAILABLE(2, "A valid renderer could not be created"),
    INVALID_STATE(3, "The ad loader is in an invalid state");
    
    private final int code;
    @NotNull
    private final String message;

    RenderError(int i, String str) {
        this.code = i;
        this.message = str;
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }
}
