package com.bytedance.sdk.openadsdk.api.banner;

/* loaded from: classes3.dex */
public final class PAGBannerSize {

    /* renamed from: IL */
    private final int f17694IL;

    /* renamed from: bg */
    private final int f17695bg;
    public static final PAGBannerSize BANNER_W_320_H_50 = new PAGBannerSize(320, 50);
    public static final PAGBannerSize BANNER_W_300_H_250 = new PAGBannerSize(300, 250);
    public static final PAGBannerSize BANNER_W_728_H_90 = new PAGBannerSize(728, 90);

    public PAGBannerSize(int i, int i2) {
        this.f17695bg = i;
        this.f17694IL = i2;
    }

    public int getHeight() {
        return this.f17694IL;
    }

    public int getWidth() {
        return this.f17695bg;
    }
}
