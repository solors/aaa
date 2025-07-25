package com.maticoo.sdk.p405ad.utils.error;

/* renamed from: com.maticoo.sdk.ad.utils.error.Error */
/* loaded from: classes6.dex */
public class Error {
    private int code;
    private int interactAdIntervalTime = 0;
    private String message;

    public Error(int i, String str) {
        this.code = i;
        this.message = str;
    }

    public void appendMessage(String str) {
        this.message += ", " + str;
    }

    public int getCode() {
        return this.code;
    }

    public int getInteractAdIntervalTime() {
        return this.interactAdIntervalTime;
    }

    public String getMessage() {
        return this.message;
    }

    public void setInteractAdIntervalTime(int i) {
        this.interactAdIntervalTime = i;
    }

    public String toString() {
        return "Error{code:" + this.code + ", message:" + this.message + "}";
    }

    public Error(int i) {
        this.code = i;
    }
}
