package com.maticoo.sdk.utils.error;

/* loaded from: classes6.dex */
public class InternalError {
    private final int code;
    private final String message;

    public InternalError(int i, String str) {
        this.code = i;
        this.message = str;
    }

    public int getErrorCode() {
        return this.code;
    }

    public String getErrorMessage() {
        return this.message;
    }

    public String toString() {
        return "Error{code:" + this.code + ", message:" + this.message + "}";
    }
}
