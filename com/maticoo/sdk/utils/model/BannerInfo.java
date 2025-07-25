package com.maticoo.sdk.utils.model;

import com.pubmatic.sdk.nativead.POBNativeConstants;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class BannerInfo {
    private int height;

    /* renamed from: id */
    private long f55034id;
    private int interval;
    private int width;

    public static BannerInfo jsonToAd(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        BannerInfo bannerInfo = new BannerInfo();
        bannerInfo.f55034id = jSONObject.optLong("id");
        bannerInfo.width = jSONObject.optInt(POBNativeConstants.NATIVE_IMAGE_WIDTH);
        bannerInfo.height = jSONObject.optInt("h");
        bannerInfo.interval = jSONObject.optInt("interval", 0);
        return bannerInfo;
    }

    public int getHeight() {
        return this.height;
    }

    public long getId() {
        return this.f55034id;
    }

    public int getInterval() {
        return this.interval;
    }

    public int getWidth() {
        return this.width;
    }
}
