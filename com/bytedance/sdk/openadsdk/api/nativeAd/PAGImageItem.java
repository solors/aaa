package com.bytedance.sdk.openadsdk.api.nativeAd;

/* loaded from: classes3.dex */
public class PAGImageItem {

    /* renamed from: IL */
    private final int f17739IL;

    /* renamed from: bX */
    private final String f17740bX;

    /* renamed from: bg */
    private final int f17741bg;
    private float eqN;

    public PAGImageItem(int i, int i2, String str, float f) {
        this.f17741bg = i;
        this.f17739IL = i2;
        this.f17740bX = str;
        this.eqN = f;
    }

    public float getDuration() {
        return this.eqN;
    }

    public int getHeight() {
        return this.f17741bg;
    }

    public String getImageUrl() {
        return this.f17740bX;
    }

    public int getWidth() {
        return this.f17739IL;
    }

    public PAGImageItem(int i, int i2, String str) {
        this(i, i2, str, 0.0f);
    }
}
