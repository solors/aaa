package com.maticoo.sdk.mraid.cache;

/* loaded from: classes6.dex */
public class RedirectsException extends Exception {
    private String newUrl;

    public RedirectsException(String str) {
        this.newUrl = str;
    }

    public String getNewUrl() {
        return this.newUrl;
    }
}
