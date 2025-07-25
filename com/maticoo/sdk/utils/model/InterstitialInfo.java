package com.maticoo.sdk.utils.model;

import org.json.JSONObject;

/* loaded from: classes6.dex */
public class InterstitialInfo {
    private int countdown;

    /* renamed from: id */
    private long f55037id;
    private int type;

    public static InterstitialInfo jsonToAd(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        InterstitialInfo interstitialInfo = new InterstitialInfo();
        interstitialInfo.setId(jSONObject.optLong("id"));
        interstitialInfo.setType(jSONObject.optInt("type"));
        interstitialInfo.setCountdown(jSONObject.optInt("countdown"));
        return interstitialInfo;
    }

    public int getCountdown() {
        return this.countdown;
    }

    public long getId() {
        return this.f55037id;
    }

    public int getType() {
        return this.type;
    }

    public void setCountdown(int i) {
        this.countdown = i;
    }

    public void setId(long j) {
        this.f55037id = j;
    }

    public void setType(int i) {
        this.type = i;
    }
}
