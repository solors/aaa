package com.mobilefuse.sdk.component;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: AdExceptions.kt */
@Metadata
/* loaded from: classes7.dex */
public enum LoadingError {
    UNABLE_TO_PARSE_MARKUP(1, "The ad markup has no valid parsers"),
    NO_AD_MARKUP(2, "There was no ad markup"),
    UNEXPECTED_STATE(3, "The application state was invalid, this should not happen"),
    UNEXPECTED_MARKUP_FORMAT(4, "The ad markup is in an unexpected format");
    
    private final int code;
    @NotNull
    private final String message;

    LoadingError(int i, String str) {
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
