package com.bytedance.sdk.openadsdk.api.banner;

import com.bytedance.sdk.openadsdk.api.PAGRequest;

/* loaded from: classes3.dex */
public class PAGBannerRequest extends PAGRequest {

    /* renamed from: bg */
    private PAGBannerSize f17693bg;

    public PAGBannerRequest(PAGBannerSize pAGBannerSize) {
        this.f17693bg = pAGBannerSize;
    }

    public PAGBannerSize getAdSize() {
        return this.f17693bg;
    }

    public void setAdSize(PAGBannerSize pAGBannerSize) {
        this.f17693bg = pAGBannerSize;
    }
}
