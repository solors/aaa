package com.maticoo.sdk.utils.model;

/* loaded from: classes6.dex */
public class Placement {
    private BannerInfo bannerInfo;

    /* renamed from: id */
    private String f55038id;
    private InteractInfo interactInfo;
    private InterstitialInfo interstitialInfo;
    private String name;
    private String oriData;
    private int preload;

    /* renamed from: pt */
    private int f55039pt = 60;
    private SplashInfo splashInfo;

    /* renamed from: t */
    private int f55040t;

    public BannerInfo getBannerInfo() {
        return this.bannerInfo;
    }

    public String getId() {
        return this.f55038id;
    }

    public InteractInfo getInteractInfo() {
        return this.interactInfo;
    }

    public InterstitialInfo getInterstitialInfo() {
        return this.interstitialInfo;
    }

    public String getName() {
        return this.name;
    }

    public String getOriData() {
        return this.oriData;
    }

    public int getPreload() {
        return this.preload;
    }

    public int getPt() {
        return this.f55039pt;
    }

    public SplashInfo getSplashInfo() {
        return this.splashInfo;
    }

    public int getT() {
        return this.f55040t;
    }

    public boolean isPreload() {
        if (this.preload == 1) {
            return true;
        }
        return false;
    }

    public void setBannerInfo(BannerInfo bannerInfo) {
        this.bannerInfo = bannerInfo;
    }

    public void setId(String str) {
        this.f55038id = str;
    }

    public void setInteractInfo(InteractInfo interactInfo) {
        this.interactInfo = interactInfo;
    }

    public void setInterstitialInfo(InterstitialInfo interstitialInfo) {
        this.interstitialInfo = interstitialInfo;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOriData(String str) {
        this.oriData = str;
    }

    public void setPreload(int i) {
        this.preload = i;
    }

    public void setPt(int i) {
        this.f55039pt = i;
    }

    public void setSplashInfo(SplashInfo splashInfo) {
        this.splashInfo = splashInfo;
    }

    public void setT(int i) {
        this.f55040t = i;
    }

    public String toString() {
        return "Placement{id='" + this.f55038id + "', name='" + this.name + "', t=" + this.f55040t + '}';
    }
}
