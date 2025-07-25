package com.moloco.sdk.internal.client_metrics_data;

import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.client_metrics_data.c */
/* loaded from: classes7.dex */
public enum EnumC23948c {
    SDKInit("sdk_init_time"),
    SDKInitHttpRequest("sdk_init_request_time_ms"),
    CreateAd("create_ad_time_ms"),
    CreateAdAwaitAdFactory("create_ad_await_ad_factory_time_ms"),
    LoadAd("load_ad_time"),
    NativePrepareAd("native_ad_load_prepare_time"),
    BidTokenFetch("bid_token_fetch_time"),
    ServerBidTokenFetch("sbt_fetch_time_ms"),
    ServerBidTokenApiFetchTime("sbt_api_fetch_time_ms"),
    ClientBidTokenBuild("bid_token_build_time_ms"),
    LoadToShow("load_to_show_time"),
    CreateToLoad("ad_create_to_load_ms");
    
    @NotNull

    /* renamed from: b */
    public final String f62011b;

    EnumC23948c(String str) {
        this.f62011b = str;
    }

    @NotNull
    /* renamed from: c */
    public final String m47293c() {
        return this.f62011b;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.f62011b;
    }
}
