package com.mobilefuse.sdk.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Either.kt */
@Metadata
/* loaded from: classes7.dex */
public final class ProcessingError implements BaseError {
    @Nullable
    private final String message;

    public ProcessingError(@Nullable String str) {
        this.message = str;
    }

    public static /* synthetic */ ProcessingError copy$default(ProcessingError processingError, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = processingError.getMessage();
        }
        return processingError.copy(str);
    }

    @Nullable
    public final String component1() {
        return getMessage();
    }

    @NotNull
    public final ProcessingError copy(@Nullable String str) {
        return new ProcessingError(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (!(obj instanceof ProcessingError) || !Intrinsics.m17075f(getMessage(), ((ProcessingError) obj).getMessage())) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // com.mobilefuse.sdk.exception.BaseError
    @Nullable
    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        String message = getMessage();
        if (message != null) {
            return message.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return "ProcessingError(message=" + getMessage() + ")";
    }
}
