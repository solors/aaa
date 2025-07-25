package com.meevii.adsdk.common;

/* loaded from: classes6.dex */
public class AdSize {
    float height;
    float width;

    public AdSize(float f, float f2) {
        this.width = f;
        this.height = f2;
    }

    public static AdSize getDefaultAdSize() {
        return new AdSize(1080.0f, 1920.0f);
    }

    public float getHeight() {
        return this.height;
    }

    public float getWidth() {
        return this.width;
    }

    public void setHeight(float f) {
        this.height = f;
    }

    public void setWidth(float f) {
        this.width = f;
    }
}
