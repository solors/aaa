package com.appsflyer.deeplink;

import androidx.annotation.Nullable;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.maticoo.sdk.utils.constant.KeyConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.p552ot.pubsub.p553a.C26484a;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class DeepLink {
    public final JSONObject AFInAppEventParameterName;

    private DeepLink(JSONObject jSONObject) {
        this.AFInAppEventParameterName = jSONObject;
    }

    public static DeepLink AFInAppEventParameterName(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject("custom_params");
        if (optJSONObject != null) {
            jSONObject.remove("custom_params");
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, optJSONObject.opt(next));
            }
        }
        return new DeepLink(jSONObject);
    }

    public static DeepLink values(Map<String, String> map) throws JSONException {
        Set<String> keySet = map.keySet();
        keySet.removeAll(Arrays.asList("install_time", KeyConstants.RequestBody.KEY_PID, ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "af_prt", "af_mp", MBridgeConstans.DYNAMIC_VIEW_WX_CLICKID, "af_siteid", "af_sub_siteid", "af_click_lookback", "af_viewthrough_lookback", "af_keywords", "af_cost_model", "af_cost_currency", "af_cost_value", "af_r", "af_web_dp", "af_force_deeplink", "af_ref", "is_incentivized", "af_param_forwarding", "is_retargeting", "af_reengagement_window", "is_branded_link", "is_universal_link", "af_generated_clk", "transaction_id", "af_fp_lookback_window", "af_vt_fp_lookback_window", "af_fp_priority", "af_generate_clk", "af_inactivity_window", "af_ol_red", "af_attr", "af_ol_lp", "af_blank_red", "af_source", "af_lp_src", "af_src_browser", "af_tranid", "af_wrt_clk", "af_ua", "af_ip", "af_lang", "advertising_id", "sha1_advertising_id", "md5_advertising_id", C26484a.f69184A, "sha1_android_id", "md5_android_id", "imei", "sha1_imei", "md5_imei", CommonUrlParts.HUAWEI_OAID, "sha1_oaid", "md5_oaid", "af_android_url", "sha1_el", "fire_advertising_id", "sha1_fire_advertising_id", "idfa", "md5_idfa", "af_ios_url", "af_ios_fallback", "sha1_idfa", C26484a.f69185B, "sha1_mac", "af_banner", "af_slk_web_endpoint", "af_chrome_lp", "af_android_custom_url", "af_ios_custom_url", "af_enc_data", "engmnt_source", "redirect_response_data", "shortlink", "advertiserId", "sha1_advertiserId", "advertiser_id", "sha1_advertiser_id", "muid", "idfv", "md5_idfv", "sha1_idfv", "af_installpostback", "http_referrer", "af_model", "af_os", "md5_advertiserId", "af_video_total_length", "af_video_played_length", "af_playable_played_length", "af_ad_time_viewed", "af_ad_displayed_percent", "af_audio_total_length", "af_audio_played_length", "af_status", "af_web_id", "af_deeplink"));
        HashMap hashMap = new HashMap();
        for (String str : keySet) {
            hashMap.put(str, map.get(str));
        }
        return AFInAppEventParameterName(new JSONObject(hashMap));
    }

    @Nullable
    public String getAfSub1() {
        Object opt = this.AFInAppEventParameterName.opt("af_sub1");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        return (String) opt;
    }

    @Nullable
    public String getAfSub2() {
        Object opt = this.AFInAppEventParameterName.opt("af_sub2");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        return (String) opt;
    }

    @Nullable
    public String getAfSub3() {
        Object opt = this.AFInAppEventParameterName.opt("af_sub3");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        return (String) opt;
    }

    @Nullable
    public String getAfSub4() {
        Object opt = this.AFInAppEventParameterName.opt("af_sub4");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        return (String) opt;
    }

    @Nullable
    public String getAfSub5() {
        Object opt = this.AFInAppEventParameterName.opt("af_sub5");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        return (String) opt;
    }

    @Nullable
    public String getCampaign() {
        Object opt = this.AFInAppEventParameterName.opt("campaign");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        return (String) opt;
    }

    @Nullable
    public String getCampaignId() {
        Object opt = this.AFInAppEventParameterName.opt("campaign_id");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        return (String) opt;
    }

    public JSONObject getClickEvent() {
        return this.AFInAppEventParameterName;
    }

    @Nullable
    public String getClickHttpReferrer() {
        Object opt = this.AFInAppEventParameterName.opt("click_http_referrer");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        return (String) opt;
    }

    @Nullable
    public String getDeepLinkValue() {
        Object opt = this.AFInAppEventParameterName.opt("deep_link_value");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        return (String) opt;
    }

    @Nullable
    public String getMatchType() {
        Object opt = this.AFInAppEventParameterName.opt("match_type");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        return (String) opt;
    }

    @Nullable
    public String getMediaSource() {
        Object opt = this.AFInAppEventParameterName.opt("media_source");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        return (String) opt;
    }

    @Nullable
    public String getStringValue(String str) {
        Object opt = this.AFInAppEventParameterName.opt(str);
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        if (opt == null) {
            return null;
        }
        return String.valueOf(opt);
    }

    @Nullable
    public Boolean isDeferred() {
        Object opt = this.AFInAppEventParameterName.opt("is_deferred");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        return (Boolean) opt;
    }

    public String toString() {
        return this.AFInAppEventParameterName.toString();
    }
}
