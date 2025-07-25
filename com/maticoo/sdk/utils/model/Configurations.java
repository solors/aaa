package com.maticoo.sdk.utils.model;

import java.util.Map;

/* loaded from: classes6.dex */
public class Configurations {
    private int adCloseableTimeOut;
    private int adLoadTimeOut;
    private int bannerCacheRatio;
    private String biAppId;
    private String biUrl;
    private String biddingTokenPrefix;
    private int clickTimeOut;
    private int debug;
    private Map<String, Object> eventMap;
    private int gzip;
    private int layout;
    private int noFillCount;
    private int ort;
    private Map<String, Placement> pls;
    private int reportActive;

    /* renamed from: ri */
    private int f55035ri;
    private int test;
    private int trackLevel;
    private int videoCacheRadio;
    private boolean redirect = false;
    private double visibleRate = 0.699999988079071d;

    public int getAdCloseableTimeOut() {
        return this.adCloseableTimeOut;
    }

    public int getAdLoadTimeOut() {
        return this.adLoadTimeOut;
    }

    public int getBannerCacheRatio() {
        return this.bannerCacheRatio;
    }

    public String getBiAppId() {
        return this.biAppId;
    }

    public String getBiUrl() {
        return this.biUrl;
    }

    public String getBiddingTokenPrefix() {
        return this.biddingTokenPrefix;
    }

    public int getClickTimeOut() {
        return this.clickTimeOut;
    }

    public int getDebug() {
        return this.debug;
    }

    public Map<String, Object> getEventMap() {
        return this.eventMap;
    }

    public int getGzip() {
        return this.gzip;
    }

    public int getLayout() {
        return this.layout;
    }

    public int getNoFillCount() {
        return this.noFillCount;
    }

    public int getOrt() {
        return this.ort;
    }

    public Map<String, Placement> getPls() {
        return this.pls;
    }

    public int getReportActive() {
        return this.reportActive;
    }

    public int getRi() {
        return this.f55035ri;
    }

    public int getTest() {
        return this.test;
    }

    public int getTrackLevel() {
        return this.trackLevel;
    }

    public int getVideoCacheRadio() {
        return this.videoCacheRadio;
    }

    public double getVisibleRate() {
        return this.visibleRate;
    }

    public boolean isRedirect() {
        return this.redirect;
    }

    public void setAdCloseableTimeOut(int i) {
        this.adCloseableTimeOut = i;
    }

    public void setAdLoadTimeOut(int i) {
        this.adLoadTimeOut = i;
    }

    public void setBannerCacheRatio(int i) {
        this.bannerCacheRatio = i;
    }

    public void setBiAppId(String str) {
        this.biAppId = str;
    }

    public void setBiUrl(String str) {
        this.biUrl = str;
    }

    public void setBiddingTokenPrefix(String str) {
        this.biddingTokenPrefix = str;
    }

    public void setClickTimeOut(int i) {
        this.clickTimeOut = i;
    }

    public void setDebug(int i) {
        this.debug = i;
    }

    public void setEventMap(Map<String, Object> map) {
        this.eventMap = map;
    }

    public void setGzip(int i) {
        this.gzip = i;
    }

    public void setLayout(int i) {
        this.layout = i;
    }

    public void setNoFillCount(int i) {
        this.noFillCount = i;
    }

    public void setOrt(int i) {
        this.ort = i;
    }

    public void setPls(Map<String, Placement> map) {
        this.pls = map;
    }

    public void setRedirect(boolean z) {
        this.redirect = z;
    }

    public void setReportActive(int i) {
        this.reportActive = i;
    }

    public void setRi(int i) {
        this.f55035ri = i;
    }

    public void setTest(int i) {
        this.test = i;
    }

    public void setTrackLevel(int i) {
        this.trackLevel = i;
    }

    public void setVideoCacheRadio(int i) {
        this.videoCacheRadio = i;
    }

    public void setVisibleRate(double d) {
        this.visibleRate = d;
    }

    public String toString() {
        return "Configurations{debug=" + this.debug + ", ri=" + this.f55035ri + ", redirect=" + this.redirect + ", pls=" + this.pls + ", biddingTokenPrefix='" + this.biddingTokenPrefix + "', adLoadTimeOut=" + this.adLoadTimeOut + ", adCloseableTimeOut=" + this.adCloseableTimeOut + ", ort=" + this.ort + ", biUrl='" + this.biUrl + "', test=" + this.test + ", eventMap=" + this.eventMap + ", videoCacheRadio=" + this.videoCacheRadio + ", bannerCacheRatio=" + this.bannerCacheRatio + '}';
    }
}
