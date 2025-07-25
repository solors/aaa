package com.pubmatic.sdk.nativead.response;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public class POBNativeAdTitleResponseAsset extends POBNativeAdResponseAsset {
    @NonNull

    /* renamed from: d */
    private final String f70509d;

    /* renamed from: e */
    private final int f70510e;

    public POBNativeAdTitleResponseAsset(int i, boolean z, @Nullable POBNativeAdLinkResponse pOBNativeAdLinkResponse, @NonNull String str, int i2) {
        super(i, z, pOBNativeAdLinkResponse);
        this.f70509d = str;
        this.f70510e = i2 == 0 ? str.length() : i2;
    }

    public int getLength() {
        return this.f70510e;
    }

    @NonNull
    public String getTitle() {
        return this.f70509d;
    }

    @Override // com.pubmatic.sdk.nativead.response.POBNativeAdResponseAsset
    @NonNull
    public String toString() {
        return "Asset-Id: " + getAssetId() + "\nRequired: " + isRequired() + "\nLink: " + getLink() + "\nTitle: " + this.f70509d + "\nLength: " + this.f70510e + "\nType: ";
    }
}
