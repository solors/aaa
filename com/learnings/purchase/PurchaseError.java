package com.learnings.purchase;

/* loaded from: classes6.dex */
public class PurchaseError {
    private int code;
    private String msg;

    /* JADX INFO: Access modifiers changed from: protected */
    public PurchaseError(int i, String str) {
        this.code = i;
        this.msg = str;
    }

    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public String toString() {
        return "PurchaseError{code=" + this.code + ", msg='" + this.msg + "'}";
    }
}
