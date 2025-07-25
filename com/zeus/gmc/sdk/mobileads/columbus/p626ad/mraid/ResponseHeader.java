package com.zeus.gmc.sdk.mobileads.columbus.p626ad.mraid;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.mraid.ResponseHeader */
/* loaded from: classes8.dex */
public enum ResponseHeader {
    CONTENT_TYPE("content-type"),
    LOCATION("location"),
    USER_AGENT("user-agent"),
    ACCEPT_LANGUAGE("accept-language");
    
    private final String key;

    ResponseHeader(String str) {
        this.key = str;
    }

    public String getKey() {
        return this.key;
    }
}
