package com.mobilefuse.sdk.component;

import com.mobilefuse.sdk.exception.BaseError;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: AdExceptions.kt */
@Metadata
/* loaded from: classes7.dex */
public enum ParsingError implements BaseError {
    UNEXPECTED_MARKUP_FORMAT(1, "The ad markup is in an unexpected format"),
    INVALID_MARKUP(1, "The ad markup was invalid"),
    EMPTY_MARKUP(2, "The ad markup was empty"),
    MARKUP_TOO_LARGE(3, "The ad markup is too large");
    
    private final int code;
    @NotNull
    private final String message;

    ParsingError(int i, String str) {
        this.code = i;
        this.message = str;
    }

    public final int getCode() {
        return this.code;
    }

    @Override // com.mobilefuse.sdk.exception.BaseError
    @NotNull
    public String getMessage() {
        return this.message;
    }
}
