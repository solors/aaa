package com.meevii.adsdk.core.config.model;

import com.learnings.abcenter.util.AbCenterUtil;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class AttachNetwork {
    private String adUnitId;
    private String appId;
    private String networkName;

    public static AttachNetwork getFromJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            AttachNetwork attachNetwork = new AttachNetwork();
            attachNetwork.setAdUnitId(AbCenterUtil.optString(jSONObject, "adUnitId"));
            attachNetwork.setAppId(AbCenterUtil.optString(jSONObject, "appId"));
            attachNetwork.setNetworkName(AbCenterUtil.optString(jSONObject, "networkName"));
            return attachNetwork;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getAdUnitId() {
        return this.adUnitId;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getNetworkName() {
        return this.networkName;
    }

    public void setAdUnitId(String str) {
        this.adUnitId = str;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setNetworkName(String str) {
        this.networkName = str;
    }
}
