package com.mbridge.msdk.mbbid.common;

/* renamed from: com.mbridge.msdk.mbbid.common.c */
/* loaded from: classes6.dex */
public abstract class BidRequestParams {

    /* renamed from: a */
    private String f57381a;

    /* renamed from: b */
    private String f57382b;

    /* renamed from: c */
    private String f57383c;

    public BidRequestParams(String str, String str2) {
        this.f57381a = str;
        this.f57382b = str2;
    }

    public String getmFloorPrice() {
        return this.f57383c;
    }

    public String getmPlacementId() {
        return this.f57381a;
    }

    public String getmUnitId() {
        return this.f57382b;
    }

    public void setmFloorPrice(String str) {
        this.f57383c = str;
    }

    public void setmPlacementId(String str) {
        this.f57381a = str;
    }

    public void setmUnitId(String str) {
        this.f57382b = str;
    }

    public BidRequestParams(String str, String str2, String str3) {
        this.f57381a = str;
        this.f57382b = str2;
        this.f57383c = str3;
    }
}
