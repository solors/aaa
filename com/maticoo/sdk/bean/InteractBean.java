package com.maticoo.sdk.bean;

import android.text.TextUtils;
import com.maticoo.sdk.utils.constant.KeyConstants;
import com.maticoo.sdk.utils.crash.CrashUtil;
import com.maticoo.sdk.utils.log.DeveloperLog;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class InteractBean {
    private String pid = "";
    private String iconUrl = "";
    private String h5Url = "";
    private String interactiveAdvId = "";
    private int recallInterval = 0;
    private String adRequestId = "";
    private String country = "";
    private String biAppid = "";

    private InteractBean() {
    }

    public static boolean isValid(InteractBean interactBean) {
        if (interactBean == null || TextUtils.isEmpty(interactBean.iconUrl) || TextUtils.isEmpty(interactBean.h5Url) || !interactBean.iconUrl.startsWith("http") || !interactBean.h5Url.startsWith("http")) {
            return false;
        }
        return true;
    }

    public static InteractBean toAdBean(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            InteractBean interactBean = new InteractBean();
            interactBean.pid = jSONObject.optString(KeyConstants.RequestBody.KEY_PID);
            interactBean.iconUrl = jSONObject.optString(CampaignEx.JSON_KEY_ICON_URL, "");
            interactBean.h5Url = jSONObject.optString("h5_url", "");
            interactBean.interactiveAdvId = jSONObject.optString("interactive_adv_id");
            interactBean.adRequestId = jSONObject.optString("request_id");
            interactBean.recallInterval = jSONObject.optInt("recall_interval", 0);
            interactBean.country = jSONObject.optString("country");
            interactBean.biAppid = jSONObject.optString("bi_app_id");
            return interactBean;
        } catch (Exception e) {
            DeveloperLog.LogE("JSONObject convert AdBean error: " + e.getMessage());
            CrashUtil.getSingleton().reportSDKException(e, "InteractBeantoAdBean");
            return null;
        }
    }

    public static String toJsonString(InteractBean interactBean) {
        if (!isValid(interactBean)) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(KeyConstants.RequestBody.KEY_PID, interactBean.pid);
            jSONObject.put(CampaignEx.JSON_KEY_ICON_URL, interactBean.iconUrl);
            jSONObject.put("h5_url", interactBean.h5Url);
            jSONObject.put("interactive_adv_id", interactBean.interactiveAdvId);
            jSONObject.put("request_id", interactBean.adRequestId);
            jSONObject.put("recall_interval", interactBean.recallInterval);
            jSONObject.put("country", interactBean.country);
            jSONObject.put("bi_app_id", interactBean.biAppid);
            return jSONObject.toString();
        } catch (Exception e) {
            DeveloperLog.LogE("AdBean convert JSONObject error: " + e.getMessage());
            CrashUtil.getSingleton().reportSDKException(e, "InteractBeantoJsonString");
            return "";
        }
    }

    public String getAdRequestId() {
        return this.adRequestId;
    }

    public String getBiAppid() {
        return this.biAppid;
    }

    public String getCountry() {
        return this.country;
    }

    public String getH5Url() {
        return this.h5Url;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public String getInteractiveAdvId() {
        return this.interactiveAdvId;
    }

    public String getPid() {
        return this.pid;
    }

    public int getRecallInterval() {
        return this.recallInterval;
    }

    public String toString() {
        return toJsonString(this);
    }
}
