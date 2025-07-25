package com.maticoo.sdk.p405ad.banner;

/* renamed from: com.maticoo.sdk.ad.banner.BannerAdOptions */
/* loaded from: classes6.dex */
public class BannerAdOptions {
    private boolean canCloseAd;
    private String placementId;

    public String getPlacementId() {
        return this.placementId;
    }

    public boolean isCanCloseAd() {
        return this.canCloseAd;
    }

    private BannerAdOptions() {
    }

    /* renamed from: com.maticoo.sdk.ad.banner.BannerAdOptions$Builder */
    /* loaded from: classes6.dex */
    public static class Builder {
        private boolean canCloseAd;
        private String placementId;

        public Builder(String str) {
            this.placementId = str;
        }

        public BannerAdOptions build() {
            BannerAdOptions bannerAdOptions = new BannerAdOptions();
            bannerAdOptions.canCloseAd = this.canCloseAd;
            bannerAdOptions.placementId = this.placementId;
            return bannerAdOptions;
        }

        public Builder setCanCloseAd(boolean z) {
            this.canCloseAd = z;
            return this;
        }

        public Builder setAutoRefresh(boolean z) {
            return this;
        }
    }
}
