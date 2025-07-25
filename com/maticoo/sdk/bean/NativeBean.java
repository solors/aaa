package com.maticoo.sdk.bean;

import android.text.TextUtils;
import com.maticoo.sdk.utils.JSONUtil;
import com.maticoo.sdk.utils.crash.CrashUtil;
import com.maticoo.sdk.utils.log.DeveloperLog;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class NativeBean {
    private String callToActionText;
    private String clickThroughUrl;
    private List<String> clickTrackers;
    private String describeData;
    private String iconUrl;
    private String imgAdUrl;
    private List<String> impTrackers;
    private String sponsored;
    private String title;
    private String videoAdUrl;

    public static boolean isValid(NativeBean nativeBean) {
        if (nativeBean == null) {
            return false;
        }
        if (TextUtils.isEmpty(nativeBean.imgAdUrl) && TextUtils.isEmpty(nativeBean.videoAdUrl)) {
            return false;
        }
        return true;
    }

    public static NativeBean toAdBean(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            NativeBean nativeBean = new NativeBean();
            nativeBean.iconUrl = jSONObject.optString(CampaignEx.JSON_KEY_ICON_URL);
            nativeBean.title = jSONObject.optString("title");
            nativeBean.imgAdUrl = jSONObject.optString("img_ad_url");
            nativeBean.videoAdUrl = jSONObject.optString("video_ad_url");
            nativeBean.impTrackers = JSONUtil.convertFromList(jSONObject.optJSONArray("imp_trackers"));
            nativeBean.clickTrackers = JSONUtil.convertFromList(jSONObject.optJSONArray("click_trackers"));
            nativeBean.clickThroughUrl = jSONObject.optString("click_through_url");
            nativeBean.sponsored = jSONObject.optString("sponsored_data");
            nativeBean.describeData = jSONObject.optString("describe_data");
            nativeBean.callToActionText = jSONObject.optString("cta_text");
            return nativeBean;
        } catch (Exception e) {
            DeveloperLog.LogE("JSONObject convert AdBean error: " + e.getMessage());
            CrashUtil.getSingleton().reportSDKException(e);
            return null;
        }
    }

    public static String toJsonString(NativeBean nativeBean) {
        if (!isValid(nativeBean)) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("iconUrl", nativeBean.iconUrl);
            jSONObject.put("title", nativeBean.title);
            jSONObject.put("img_ad_url", nativeBean.imgAdUrl);
            jSONObject.put("video_ad_url", nativeBean.videoAdUrl);
            jSONObject.put("imp_trackers", JSONUtil.convertList(nativeBean.impTrackers));
            jSONObject.put("click_trackers", JSONUtil.convertList(nativeBean.clickTrackers));
            jSONObject.put("click_through_url", nativeBean.clickThroughUrl);
            jSONObject.put("sponsored_data", nativeBean.sponsored);
            jSONObject.put("describe_data", nativeBean.describeData);
            jSONObject.put("cta_text", nativeBean.callToActionText);
            return jSONObject.toString();
        } catch (Exception e) {
            DeveloperLog.LogE("NativeBean convert JSONObject error: " + e.getMessage());
            CrashUtil.getSingleton().reportSDKException(e);
            return "";
        }
    }

    public String getCallToActionText() {
        return this.callToActionText;
    }

    public String getClickThroughUrl() {
        return this.clickThroughUrl;
    }

    public List<String> getClickTrackers() {
        return this.clickTrackers;
    }

    public String getDescribeData() {
        return this.describeData;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public String getImgAdUrl() {
        return this.imgAdUrl;
    }

    public List<String> getImpTrackers() {
        return this.impTrackers;
    }

    public String getSponsored() {
        return this.sponsored;
    }

    public String getTitle() {
        return this.title;
    }

    public String getVideoAdUrl() {
        return this.videoAdUrl;
    }
}
