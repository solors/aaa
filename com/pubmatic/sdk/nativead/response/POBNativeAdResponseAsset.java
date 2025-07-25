package com.pubmatic.sdk.nativead.response;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public class POBNativeAdResponseAsset {

    /* renamed from: a */
    private final int f70501a;

    /* renamed from: b */
    private final boolean f70502b;
    @Nullable

    /* renamed from: c */
    private final POBNativeAdLinkResponse f70503c;

    public POBNativeAdResponseAsset(int i, boolean z, @Nullable POBNativeAdLinkResponse pOBNativeAdLinkResponse) {
        this.f70501a = i;
        this.f70502b = z;
        this.f70503c = pOBNativeAdLinkResponse;
    }

    public int getAssetId() {
        return this.f70501a;
    }

    @Nullable
    public POBNativeAdLinkResponse getLink() {
        return this.f70503c;
    }

    public boolean isRequired() {
        return this.f70502b;
    }

    @NonNull
    public String toString() {
        return "Asset-Id: " + getAssetId() + "\nRequired: " + isRequired() + "\nLink: " + getLink();
    }
}
