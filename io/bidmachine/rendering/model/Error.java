package io.bidmachine.rendering.model;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public class Error {

    /* renamed from: a */
    private final String f97905a;

    public Error(@NonNull String str) {
        this.f97905a = str;
    }

    @NonNull
    public static Error create(@NonNull Throwable th) {
        String message = th.getMessage();
        if (message == null) {
            message = "Unknown error";
        }
        return new Error(message);
    }

    @NonNull
    public String getMessage() {
        return this.f97905a;
    }

    @NonNull
    public String toString() {
        return getMessage();
    }
}
