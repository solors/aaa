package com.maticoo.sdk.p405ad.utils.error;

/* renamed from: com.maticoo.sdk.ad.utils.error.ErrorBuilder */
/* loaded from: classes6.dex */
public class ErrorBuilder {
    public static Error build(int i) {
        return new Error(i, ErrorCode.getErrorMessage(i));
    }

    public static Error build(int i, int i2) {
        return new Error(i, ErrorCode.getErrorMessage(i) + ", error:" + i2);
    }

    public static Error build(int i, String str, int i2) {
        return new Error(i, ErrorCode.getErrorMessage(i) + ", tag:" + str + ", error:" + i2);
    }

    public static Error build(int i, String str) {
        return new Error(i, str);
    }
}
