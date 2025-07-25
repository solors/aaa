package com.maticoo.sdk.p405ad.utils;

/* renamed from: com.maticoo.sdk.ad.utils.CloseReason */
/* loaded from: classes6.dex */
public enum CloseReason {
    CLOSE_WITH_REPEAT("repeat"),
    CLOSE_WITH_NOT_INTERESTED("not interested"),
    CLOSE_WITH_INAPPROPRIATE("inappropriate");
    
    String reason;

    CloseReason(String str) {
        this.reason = str;
    }

    public String getReason() {
        return this.reason;
    }
}
