package com.maticoo.sdk.utils.model;

import net.pubnative.lite.sdk.vpaid.enums.EventConstants;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class SplashInfo {
    private int adshow;
    private int countdown;

    /* renamed from: id */
    private long f55041id;
    private boolean skip;

    public static SplashInfo jsonToAd(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        SplashInfo splashInfo = new SplashInfo();
        splashInfo.setId(jSONObject.optLong("id"));
        splashInfo.setCountdown(jSONObject.optInt("countdown"));
        boolean z = true;
        if (jSONObject.optInt(EventConstants.SKIP) != 1) {
            z = false;
        }
        splashInfo.setSkip(z);
        if (z) {
            splashInfo.setAdshow(jSONObject.optInt("adshow"));
        }
        return splashInfo;
    }

    public int getAdshow() {
        return this.adshow;
    }

    public int getCountdown() {
        return this.countdown;
    }

    public long getId() {
        return this.f55041id;
    }

    public boolean isSkip() {
        return this.skip;
    }

    public void setAdshow(int i) {
        this.adshow = i;
    }

    public void setCountdown(int i) {
        this.countdown = i;
    }

    public void setId(long j) {
        this.f55041id = j;
    }

    public void setSkip(boolean z) {
        this.skip = z;
    }
}
