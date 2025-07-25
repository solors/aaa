package com.mbridge.msdk.mbbid.out;

/* loaded from: classes6.dex */
public class AdvancedNativeBidRequestParams extends CommonBidRequestParams {

    /* renamed from: a */
    private int f57385a;

    /* renamed from: b */
    private int f57386b;

    public AdvancedNativeBidRequestParams(String str, String str2, int i, int i2) {
        super(str, str2);
        this.f57385a = i2;
        this.f57386b = i;
    }

    public int getHeight() {
        return this.f57385a;
    }

    public int getWidth() {
        return this.f57386b;
    }

    public void setHeight(int i) {
        this.f57385a = i;
    }

    public void setWidth(int i) {
        this.f57386b = i;
    }

    public AdvancedNativeBidRequestParams(String str, String str2, String str3, int i, int i2) {
        super(str, str2, str3);
        this.f57385a = i2;
        this.f57386b = i;
    }
}
