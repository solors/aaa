package com.maticoo.sdk.utils.model;

/* loaded from: classes6.dex */
public class PlacementInfo {
    private int mAdType;
    private int mHeight;
    private String mId;
    private int mWidth;

    public PlacementInfo() {
    }

    public int getAdType() {
        return this.mAdType;
    }

    public PlacementInfo getBannerPlacementInfo(int i, int i2) {
        this.mAdType = 1;
        this.mWidth = i;
        this.mHeight = i2;
        return this;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public String getId() {
        return this.mId;
    }

    public PlacementInfo getPlacementInfo(int i) {
        this.mAdType = i;
        if (i == 1) {
            this.mWidth = 640;
            this.mHeight = 100;
        }
        return this;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public void setAdType(int i) {
        this.mAdType = i;
    }

    public void setHeight(int i) {
        this.mHeight = i;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public void setWidth(int i) {
        this.mWidth = i;
    }

    public String toString() {
        return "PlacementInfo{mId='" + this.mId + "', mWidth=" + this.mWidth + ", mHeight=" + this.mHeight + ", mAdType=" + this.mAdType + '}';
    }

    public PlacementInfo(String str) {
        this.mId = str;
    }
}
