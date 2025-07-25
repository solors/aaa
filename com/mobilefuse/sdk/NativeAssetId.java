package com.mobilefuse.sdk;

import kotlin.Metadata;

/* compiled from: MobileFuseNativeAd.kt */
@Metadata
/* loaded from: classes7.dex */
public enum NativeAssetId {
    AD_TITLE(100),
    ICON_IMAGE(200),
    MAIN_IMAGE(201),
    VIDEO(300),
    SPONSORED_TEXT(400),
    DESCRIPTION_TEXT(401),
    DISPLAY_URL(402),
    CTA_BUTTON_TEXT(403);
    

    /* renamed from: id */
    private final int f61642id;

    NativeAssetId(int i) {
        this.f61642id = i;
    }

    public final int getId() {
        return this.f61642id;
    }
}
