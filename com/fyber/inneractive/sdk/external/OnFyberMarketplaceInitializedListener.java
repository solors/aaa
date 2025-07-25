package com.fyber.inneractive.sdk.external;

/* loaded from: classes4.dex */
public interface OnFyberMarketplaceInitializedListener {

    /* loaded from: classes4.dex */
    public enum FyberInitStatus {
        SUCCESSFULLY,
        FAILED_NO_KITS_DETECTED,
        FAILED,
        INVALID_APP_ID
    }

    void onFyberMarketplaceInitialized(FyberInitStatus fyberInitStatus);
}
