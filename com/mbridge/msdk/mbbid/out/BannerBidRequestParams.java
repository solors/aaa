package com.mbridge.msdk.mbbid.out;

/* loaded from: classes6.dex */
public class BannerBidRequestParams extends CommonBidRequestParams {

    /* renamed from: a */
    private int f57387a;

    /* renamed from: b */
    private int f57388b;

    public BannerBidRequestParams(String str, String str2, int i, int i2) {
        super(str, str2);
        this.f57387a = i2;
        this.f57388b = i;
    }

    public int getHeight() {
        return this.f57387a;
    }

    public int getWidth() {
        return this.f57388b;
    }

    public void setHeight(int i) {
        this.f57387a = i;
    }

    public void setWidth(int i) {
        this.f57388b = i;
    }

    public BannerBidRequestParams(String str, String str2, String str3, int i, int i2) {
        super(str, str2, str3);
        this.f57387a = i2;
        this.f57388b = i;
    }
}
