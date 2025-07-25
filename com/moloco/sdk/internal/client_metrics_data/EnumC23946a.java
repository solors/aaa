package com.moloco.sdk.internal.client_metrics_data;

import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.client_metrics_data.a */
/* loaded from: classes7.dex */
public enum EnumC23946a {
    SDKInitAttempt("sdk_init_attempt"),
    SDKInitSuccess("sdk_init_success"),
    SDKPerformInitAttempt("sdk_perform_init_attempt"),
    CreateAd("create_ad"),
    LoadAdAttempt("load_ad_attempted"),
    LoadAdSuccess("load_ad_success"),
    LoadAdFailed("load_ad_failed"),
    NativeAdLoadAdAttempted("native_ad_load_attempted"),
    NativeLoadAd("native_ad_load"),
    BidTokenFetch("bid_token_fetch"),
    ServerBidTokenFetch("sbt_fetch"),
    ServerBidTokenCached("sbt_cached"),
    ServerBidTokenApiFetch("sbt_api_fetch"),
    ClientBidTokenBuild("bid_token_build"),
    ClientBidTokenCached("cbt_cached"),
    ShowAdAttempt("show_ad_attempted"),
    ShowAdSuccess("show_ad_success"),
    ShowAdFailed("show_ad_failed"),
    AdClicked("ad_clicked"),
    CrashDetected("crash_detected");
    
    @NotNull

    /* renamed from: b */
    public final String f61990b;

    EnumC23946a(String str) {
        this.f61990b = str;
    }

    @NotNull
    /* renamed from: c */
    public final String m47297c() {
        return this.f61990b;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.f61990b;
    }
}
