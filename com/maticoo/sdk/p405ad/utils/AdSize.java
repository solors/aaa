package com.maticoo.sdk.p405ad.utils;

import com.maticoo.sdk.utils.PlacementUtils;
import com.maticoo.sdk.utils.model.BannerInfo;
import com.maticoo.sdk.utils.model.Placement;

/* renamed from: com.maticoo.sdk.ad.utils.AdSize */
/* loaded from: classes6.dex */
public class AdSize {
    public static AdSize BANNER = new AdSize(320, 50);
    public static AdSize LEADERBOARD = new AdSize(728, 90);
    public static AdSize MEDIUM_RECTANGLE = new AdSize(300, 250);
    int height;
    int width;

    public AdSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public static AdSize getSize(String str) {
        BannerInfo bannerInfo;
        Placement placement = PlacementUtils.getPlacement(str);
        AdSize adSize = BANNER;
        if (placement != null && (bannerInfo = placement.getBannerInfo()) != null && bannerInfo.getWidth() != 0 && bannerInfo.getHeight() != 0) {
            adSize.setWidth(bannerInfo.getWidth());
            adSize.setHeight(bannerInfo.getHeight());
        }
        return new AdSize(adSize.getWidth(), adSize.getHeight());
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public String toString() {
        return "AdSize{width=" + this.width + ", height=" + this.height + '}';
    }
}
