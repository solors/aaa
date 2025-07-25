package com.pubmatic.sdk.nativead.response;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeImageAssetType;

/* loaded from: classes7.dex */
public class POBNativeAdImageResponseAsset extends POBNativeAdResponseAsset {
    @NonNull

    /* renamed from: d */
    private final String f70487d;

    /* renamed from: e */
    private final int f70488e;

    /* renamed from: f */
    private final int f70489f;
    @Nullable

    /* renamed from: g */
    private final POBNativeImageAssetType f70490g;

    public POBNativeAdImageResponseAsset(int i, boolean z, @Nullable POBNativeAdLinkResponse pOBNativeAdLinkResponse, @NonNull String str, int i2, int i3, @Nullable POBNativeImageAssetType pOBNativeImageAssetType) {
        super(i, z, pOBNativeAdLinkResponse);
        this.f70487d = str;
        this.f70488e = i2;
        this.f70489f = i3;
        this.f70490g = pOBNativeImageAssetType;
    }

    public int getHeight() {
        return this.f70489f;
    }

    @NonNull
    public String getImageURL() {
        return this.f70487d;
    }

    @Nullable
    public POBNativeImageAssetType getType() {
        return this.f70490g;
    }

    public int getWidth() {
        return this.f70488e;
    }

    @Override // com.pubmatic.sdk.nativead.response.POBNativeAdResponseAsset
    @NonNull
    public String toString() {
        return "Asset-Id: " + getAssetId() + "\nRequired: " + isRequired() + "\nLink: " + getLink() + "\nImageUrl: " + this.f70487d + "\nWidth: " + this.f70488e + "\nHeight: " + this.f70489f + "\nType: " + this.f70490g;
    }
}
