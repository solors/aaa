package com.zeus.gmc.sdk.mobileads.columbus.p626ad.mraid;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.mraid.MraidErrorCode */
/* loaded from: classes8.dex */
public enum MraidErrorCode {
    RENDER_PROCESS_GONE_WITH_CRASH("Render process for this WebView has crashed."),
    RENDER_PROCESS_GONE_UNSPECIFIED("Render process is gone for this WebView. Unspecified cause.");
    
    private final String message;

    MraidErrorCode(String str) {
        this.message = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.message;
    }
}
