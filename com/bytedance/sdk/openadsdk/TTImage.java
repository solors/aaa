package com.bytedance.sdk.openadsdk;

/* loaded from: classes3.dex */
public class TTImage {

    /* renamed from: IL */
    private final int f17246IL;

    /* renamed from: bX */
    private final String f17247bX;

    /* renamed from: bg */
    private final int f17248bg;
    private double eqN;

    public TTImage(int i, int i2, String str, double d) {
        this.f17248bg = i;
        this.f17246IL = i2;
        this.f17247bX = str;
        this.eqN = d;
    }

    public double getDuration() {
        return this.eqN;
    }

    public int getHeight() {
        return this.f17248bg;
    }

    public String getImageUrl() {
        return this.f17247bX;
    }

    public int getWidth() {
        return this.f17246IL;
    }

    public boolean isValid() {
        String str;
        if (this.f17248bg > 0 && this.f17246IL > 0 && (str = this.f17247bX) != null && str.length() > 0) {
            return true;
        }
        return false;
    }

    public TTImage(int i, int i2, String str) {
        this(i, i2, str, 0.0d);
    }
}
