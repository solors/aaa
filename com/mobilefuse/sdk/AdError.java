package com.mobilefuse.sdk;

/* loaded from: classes7.dex */
public enum AdError {
    AD_ALREADY_LOADED(1, "ad is already loaded"),
    AD_ALREADY_RENDERED(4, "ad was already rendered"),
    NO_FILL(204, "ad no fill"),
    INCORRECT_ADM(2, "incorrect adm"),
    AD_RUNTIME_ERROR(3, "ad runtime error"),
    AD_LOAD_ERROR(5, "ad load error");
    
    private int errorCode;
    private String errorMessage;

    AdError(int i, String str) {
        this.errorCode = i;
        this.errorMessage = str;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }
}
