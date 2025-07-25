package com.maticoo.sdk.utils.error;

/* loaded from: classes6.dex */
public class ErrorBuilder {
    public static InternalError build(int i, String str) {
        return new InternalError(i, str);
    }
}
