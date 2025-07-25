package com.pubmatic.sdk.nativead.response;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeDataAssetType;

/* loaded from: classes7.dex */
public class POBNativeAdDataResponseAsset extends POBNativeAdResponseAsset {
    @NonNull

    /* renamed from: d */
    private final String f70484d;

    /* renamed from: e */
    private final int f70485e;
    @Nullable

    /* renamed from: f */
    private final POBNativeDataAssetType f70486f;

    public POBNativeAdDataResponseAsset(int i, boolean z, @Nullable POBNativeAdLinkResponse pOBNativeAdLinkResponse, @NonNull String str, int i2, @Nullable POBNativeDataAssetType pOBNativeDataAssetType) {
        super(i, z, pOBNativeAdLinkResponse);
        this.f70484d = str;
        this.f70485e = i2;
        this.f70486f = pOBNativeDataAssetType;
    }

    public int getLength() {
        return this.f70485e;
    }

    @Nullable
    public POBNativeDataAssetType getType() {
        return this.f70486f;
    }

    @NonNull
    public String getValue() {
        return this.f70484d;
    }

    @Override // com.pubmatic.sdk.nativead.response.POBNativeAdResponseAsset
    @NonNull
    public String toString() {
        return "Asset-Id: " + getAssetId() + "\nRequired: " + isRequired() + "\nLink: " + getLink() + "\nValue: " + this.f70484d + "\nLength: " + this.f70485e + "\nType: " + this.f70486f;
    }
}
