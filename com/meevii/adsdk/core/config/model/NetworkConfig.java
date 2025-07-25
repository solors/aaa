package com.meevii.adsdk.core.config.model;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.learnings.abcenter.util.AbCenterUtil;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class NetworkConfig {
    private String appId;
    private String appKey;
    private String appSign;
    private String requestNetwork;
    private String userId;

    public static NetworkConfig getFromJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            NetworkConfig networkConfig = new NetworkConfig();
            networkConfig.setAppId(AbCenterUtil.optString(jSONObject, "appId"));
            networkConfig.setAppKey(AbCenterUtil.optString(jSONObject, "appKey"));
            networkConfig.setAppSign(AbCenterUtil.optString(jSONObject, "appSign"));
            networkConfig.setUserId(AbCenterUtil.optString(jSONObject, "userId"));
            networkConfig.setRequestNetwork(AbCenterUtil.optString(jSONObject, "requestNetwork"));
            return networkConfig;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getAppId() {
        return this.appId;
    }

    public String getAppKey() {
        return this.appKey;
    }

    public String getAppSign() {
        return this.appSign;
    }

    public String getRequestNetwork() {
        return this.requestNetwork;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setAppKey(String str) {
        this.appKey = str;
    }

    public void setAppSign(String str) {
        this.appSign = str;
    }

    public void setRequestNetwork(String str) {
        this.requestNetwork = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap(4);
        hashMap.put("appID", getAppId());
        hashMap.put("appKey", getAppKey());
        hashMap.put("appSign", getAppSign());
        hashMap.put(SDKConstants.PARAM_USER_ID, getUserId());
        return hashMap;
    }
}
