package com.maticoo.sdk.p405ad.utils;

import android.app.Application;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ironsource.C21114v8;
import com.maticoo.sdk.MaticooAdsConstant;
import com.maticoo.sdk.bean.AdBean;
import com.maticoo.sdk.bean.InteractBean;
import com.maticoo.sdk.core.AbstractAdsManager;
import com.maticoo.sdk.p405ad.utils.error.Error;
import com.maticoo.sdk.utils.ApplicationUtil;
import com.maticoo.sdk.utils.JSONUtil;
import com.maticoo.sdk.utils.PlacementUtils;
import com.maticoo.sdk.utils.ResUtil;
import com.maticoo.sdk.utils.constant.KeyConstants;
import com.maticoo.sdk.utils.crash.CrashUtil;
import com.maticoo.sdk.utils.error.InternalError;
import com.maticoo.sdk.utils.event.Event;
import com.maticoo.sdk.utils.event.EventId;
import com.maticoo.sdk.utils.event.EventReportManager;
import com.maticoo.sdk.utils.log.DeveloperLog;
import com.maticoo.sdk.utils.log.InteractLogHelper;
import com.maticoo.sdk.utils.log.p406bi.Constants;
import com.maticoo.sdk.utils.model.Configurations;
import com.maticoo.sdk.utils.prefs.Preference;
import com.mbridge.msdk.MBridgeConstans;
import com.p552ot.pubsub.p561i.p562a.C26559a;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.maticoo.sdk.ad.utils.AdsUtil */
/* loaded from: classes6.dex */
public class AdsUtil {
    private static void addAdParams(JSONObject jSONObject, AdBean adBean) {
        if (adBean != null) {
            Map<String, Object> eventMap = adBean.getEventMap();
            if (eventMap != null) {
                for (String str : eventMap.keySet()) {
                    JSONUtil.put(jSONObject, str, eventMap.get(str));
                }
            }
            JSONUtil.put(jSONObject, "request_id", adBean.getUniqueId());
        }
        JSONUtil.put(jSONObject, "sdk", Integer.valueOf(Build.VERSION.SDK_INT));
    }

    public static void callActionReportFailed(int i, AdBean adBean, int i2, int i3, Error error, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        JSONUtil.addWithMap(jSONObject, map);
        addAdParams(jSONObject, adBean);
        JSONUtil.put(jSONObject, "ad_child_type", Integer.valueOf(i3));
        if (error != null) {
            JSONUtil.put(jSONObject, "msg", error.getMessage());
            JSONUtil.put(jSONObject, C26559a.f69635d, Integer.valueOf(error.getCode()));
        }
        JSONUtil.put(jSONObject, "autoRefresh", Integer.valueOf(i));
        EventReportManager.getInstance().reportEvent(new Event(i2, jSONObject));
    }

    public static void callActionReportSuccess(int i, AdBean adBean, int i2, int i3, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        JSONUtil.addWithMap(jSONObject, map);
        addAdParams(jSONObject, adBean);
        JSONUtil.put(jSONObject, "ad_child_type", Integer.valueOf(i3));
        JSONUtil.put(jSONObject, "autoRefresh", Integer.valueOf(i));
        EventReportManager.getInstance().reportEvent(new Event(i2, jSONObject));
    }

    public static void callAdClickReport(AdBean adBean, int i, String str, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        JSONUtil.addWithMap(jSONObject, map);
        addAdParams(jSONObject, adBean);
        JSONUtil.put(jSONObject, C21114v8.C21122h.f54038L, str);
        JSONUtil.put(jSONObject, "ad_child_type", Integer.valueOf(i));
        EventReportManager.getInstance().reportEvent(new Event(109, jSONObject));
    }

    public static void callAdClickTrumpetReport(AdBean adBean, int i, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        JSONUtil.addWithMap(jSONObject, map);
        addAdParams(jSONObject, adBean);
        JSONUtil.put(jSONObject, "is_mute", Integer.valueOf(i));
        EventReportManager.getInstance().reportEvent(new Event(111, jSONObject));
    }

    public static void callAdCloseReport(AdBean adBean, String str, String str2, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        JSONUtil.addWithMap(jSONObject, map);
        addAdParams(jSONObject, adBean);
        JSONUtil.put(jSONObject, C21114v8.C21122h.f54038L, str);
        if (str2 != null && str2.length() > 0) {
            JSONUtil.put(jSONObject, "msg", str2);
        }
        EventReportManager.getInstance().reportEvent(new Event(110, jSONObject));
    }

    public static void callAdLoadCachedReport(AdBean adBean, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        addAdParams(jSONObject, adBean);
        JSONUtil.addWithMap(jSONObject, map);
        EventReportManager.getInstance().reportEvent(new Event(112, jSONObject));
    }

    public static void callAdVideoCompletedReport(AdBean adBean, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        JSONUtil.addWithMap(jSONObject, map);
        addAdParams(jSONObject, adBean);
        EventReportManager.getInstance().reportEvent(new Event(115, jSONObject));
    }

    public static void callAdVideoImplReport(AdBean adBean, long j, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        JSONUtil.addWithMap(jSONObject, map);
        addAdParams(jSONObject, adBean);
        JSONUtil.put(jSONObject, Constants.KEY_DURATION, Long.valueOf(j));
        EventReportManager.getInstance().reportEvent(new Event(108, jSONObject));
    }

    public static void callReportRenderGone(AbstractAdsManager abstractAdsManager, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean didCrash;
        if (abstractAdsManager == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONUtil.addWithMap(jSONObject, abstractAdsManager.getEventCommonParams());
            addAdParams(jSONObject, abstractAdsManager.getAdBean());
            JSONUtil.put(jSONObject, "ad_child_type", Integer.valueOf(abstractAdsManager.getChildAdType()));
            String str = "unknow";
            if (renderProcessGoneDetail != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    didCrash = renderProcessGoneDetail.didCrash();
                    if (didCrash) {
                        str = "crash";
                    } else {
                        str = "not_crash";
                    }
                } else {
                    str = "unknow_less_O";
                }
            }
            JSONUtil.put(jSONObject, "crash_status", str);
            JSONUtil.put(jSONObject, "ad_is_showing", Boolean.valueOf(abstractAdsManager.isInShowing()));
            EventReportManager.getInstance().reportEvent(new Event(503, jSONObject));
        } catch (Exception unused) {
        }
    }

    public static void callViewCheck(AdBean adBean, int i, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        JSONUtil.addWithMap(jSONObject, map);
        addAdParams(jSONObject, adBean);
        JSONUtil.put(jSONObject, "visible", Integer.valueOf(i));
        EventReportManager.getInstance().reportEvent(new Event(123, jSONObject));
    }

    private static JSONObject getInteractCustomProperties(String str, AdBean adBean, String str2) {
        if (adBean == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", str2);
            Application applicationContext = ApplicationUtil.getInstance().getApplicationContext();
            if (applicationContext != null) {
                jSONObject.put(KeyConstants.RequestBody.KEY_BUNDLE, applicationContext.getPackageName());
            }
            jSONObject.put("sub_aff_id", "interactive_adv_sdk");
            InteractBean interactBean = adBean.getInteractBean();
            if (interactBean != null) {
                jSONObject.put("country_code", interactBean.getCountry());
            }
            InteractBean interactBean2 = adBean.getInteractBean();
            if (interactBean2 != null) {
                jSONObject.put("sdk_icon", ResUtil.getResourceName(interactBean2.getIconUrl()));
                jSONObject.put("interactive_adv_id", interactBean2.getInteractiveAdvId());
            }
            jSONObject.put("slot_id", str);
            jSONObject.put("request", adBean.getUniqueId());
            return jSONObject;
        } catch (Exception e) {
            DeveloperLog.LogD("getInteractCustomProperties, Exception = " + e);
            CrashUtil.getSingleton().reportSDKException(e, "AdsUtil");
            return null;
        }
    }

    public static void initCompleteReport(int i, String str, long j, InternalError internalError) {
        JSONObject jSONObject = new JSONObject();
        if (internalError != null) {
            JSONUtil.put(jSONObject, C26559a.f69635d, Integer.valueOf(internalError.getErrorCode()));
            JSONUtil.put(jSONObject, "msg", internalError.getErrorMessage());
        }
        JSONUtil.put(jSONObject, "sdk", Integer.valueOf(Build.VERSION.SDK_INT));
        if (j != 0) {
            JSONUtil.put(jSONObject, Constants.KEY_DURATION, Long.valueOf(System.currentTimeMillis() - j));
        }
        JSONUtil.put(jSONObject, MaticooAdsConstant.KEY_AD_MEDIATION, str);
        if (i == 104) {
            JSONUtil.put(jSONObject, MBridgeConstans.APP_KEY, Preference.APP_KEY.getValue());
        }
        EventReportManager.getInstance().reportEvent(new Event(i, jSONObject));
    }

    public static void initCompleteSetUser(String str, long j) {
        Map<String, Object> eventMap;
        JSONObject jSONObject = new JSONObject();
        JSONUtil.put(jSONObject, "sdk", Integer.valueOf(Build.VERSION.SDK_INT));
        if (j != 0) {
            JSONUtil.put(jSONObject, Constants.KEY_DURATION, Long.valueOf(System.currentTimeMillis() - j));
        }
        JSONUtil.put(jSONObject, MaticooAdsConstant.KEY_AD_MEDIATION, str);
        Configurations value = Preference.CONFIGURATION.getValue();
        if (value == null) {
            CrashUtil.getSingleton().reportSDKException("configurations is null", "AdsUtil-initCompleteSetUser");
        }
        if (value != null && (eventMap = value.getEventMap()) != null) {
            for (String str2 : eventMap.keySet()) {
                JSONUtil.put(jSONObject, str2, eventMap.get(str2));
            }
        }
        EventReportManager.getInstance().reportEvent(new Event(601, jSONObject, EventId.USER_SET_NAME));
    }

    public static void initReport(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        JSONUtil.put(jSONObject, MaticooAdsConstant.KEY_AD_MEDIATION, str);
        EventReportManager.getInstance().reportEvent(new Event(i, jSONObject));
    }

    public static void reportAdCacheSuccess(AdBean adBean, long j, boolean z, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        JSONUtil.addWithMap(jSONObject, map);
        addAdParams(jSONObject, adBean);
        JSONUtil.put(jSONObject, Constants.KEY_DURATION, Long.valueOf(j));
        JSONUtil.put(jSONObject, "success", Boolean.valueOf(z));
        EventReportManager.getInstance().reportEvent(new Event(121, jSONObject));
    }

    public static void reportAdCovered(AdBean adBean, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        JSONUtil.addWithMap(jSONObject, map);
        addAdParams(jSONObject, adBean);
        Event event = new Event(504, jSONObject);
        event.justToSdkServer = true;
        EventReportManager.getInstance().reportEvent(event);
    }

    public static void reportAdLoad(int i, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        JSONUtil.addWithMap(jSONObject, map);
        JSONUtil.put(jSONObject, "autoRefresh", Integer.valueOf(i));
        EventReportManager.getInstance().reportEvent(new Event(113, jSONObject));
    }

    public static void reportAdLoadFailed(int i, AdBean adBean, long j, Error error, Long l, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        JSONUtil.addWithMap(jSONObject, map);
        addAdParams(jSONObject, adBean);
        JSONUtil.put(jSONObject, Constants.KEY_DURATION, Long.valueOf(j));
        if (error != null) {
            JSONUtil.put(jSONObject, C26559a.f69635d, Integer.valueOf(error.getCode()));
            JSONUtil.put(jSONObject, "msg", error.getMessage());
        }
        if (l != null) {
            JSONUtil.put(jSONObject, "down_time", l);
        }
        JSONUtil.put(jSONObject, "autoRefresh", Integer.valueOf(i));
        EventReportManager.getInstance().reportEvent(new Event(106, jSONObject));
    }

    public static void reportAdLoadRequest(int i, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        JSONUtil.addWithMap(jSONObject, map);
        JSONUtil.put(jSONObject, "autoRefresh", Integer.valueOf(i));
        EventReportManager.getInstance().reportEvent(new Event(102, jSONObject));
    }

    public static void reportAdLoadSucceed(int i, AdBean adBean, int i2, long j, Long l, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        JSONUtil.addWithMap(jSONObject, map);
        addAdParams(jSONObject, adBean);
        JSONUtil.put(jSONObject, "ad_child_type", Integer.valueOf(i2));
        if (l != null) {
            JSONUtil.put(jSONObject, "down_time", l);
        }
        JSONUtil.put(jSONObject, "autoRefresh", Integer.valueOf(i));
        JSONUtil.put(jSONObject, Constants.KEY_DURATION, Long.valueOf(j));
        EventReportManager.getInstance().reportEvent(new Event(103, jSONObject));
    }

    public static void reportAdShowing(AdBean adBean, int i, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        addAdParams(jSONObject, adBean);
        JSONUtil.addWithMap(jSONObject, map);
        JSONUtil.put(jSONObject, "autoRefresh", Integer.valueOf(i));
        EventReportManager.getInstance().reportEvent(new Event(117, jSONObject));
    }

    public static void reportAppDuration(long j) {
        try {
            Configurations value = Preference.CONFIGURATION.getValue();
            if (value == null) {
                return;
            }
            int reportActive = value.getReportActive();
            DeveloperLog.LogD("reportAppDuration, reportActive = " + reportActive);
            if (reportActive != 0 && reportActive != 1) {
                Event event = new Event(603);
                event.justToSdkServer = true;
                long currentTimeMillis = System.currentTimeMillis();
                event.addProperty("duration", Long.valueOf(currentTimeMillis - j));
                event.addProperty("start_time", Long.valueOf(j));
                event.addProperty(SDKConstants.PARAM_TOURNAMENTS_END_TIME, Long.valueOf(currentTimeMillis));
                EventReportManager.getInstance().reportEvent(event);
            }
        } catch (Exception unused) {
        }
    }

    public static void reportCustomData() {
        try {
            Configurations value = Preference.CONFIGURATION.getValue();
            if (value == null) {
                return;
            }
            int reportActive = value.getReportActive();
            DeveloperLog.LogD("reportCustomData, reportActive = " + reportActive);
            if (reportActive != 0 && reportActive != 2) {
                Event event = new Event(602);
                event.justToSdkServer = true;
                event.addParamsWithMap(Preference.CUSTOM_DATA.getValue());
                EventReportManager.getInstance().reportEvent(event);
            }
        } catch (Exception unused) {
        }
    }

    public static void reportErrorEventWithAdapter(String str, int i, int i2, String str2, String str3) {
        JSONObject placementEventParams = PlacementUtils.placementEventParams(str, i2);
        JSONUtil.put(placementEventParams, MaticooAdsConstant.KEY_AD_MEDIATION, str2);
        JSONUtil.put(placementEventParams, "msg", str3);
        EventReportManager.getInstance().reportEvent(new Event(i, placementEventParams));
    }

    public static void reportEventWithAdapter(String str, int i, int i2, String str2) {
        JSONObject placementEventParams = PlacementUtils.placementEventParams(str, i2);
        JSONUtil.put(placementEventParams, MaticooAdsConstant.KEY_AD_MEDIATION, str2);
        EventReportManager.getInstance().reportEvent(new Event(i, placementEventParams));
    }

    public static void reportEventWithAdapterBidLoss(String str, int i, String str2, double d, String str3) {
        JSONObject placementEventParams = PlacementUtils.placementEventParams(str, i);
        JSONUtil.put(placementEventParams, MaticooAdsConstant.KEY_AD_MEDIATION, str2);
        JSONUtil.put(placementEventParams, "winPrice", Double.valueOf(d));
        JSONUtil.put(placementEventParams, "lossReason", str3);
        Event event = new Event(212, placementEventParams);
        event.justToSdkServer = true;
        EventReportManager.getInstance().reportEvent(event);
    }

    public static void reportEventWithAdapterBidWin(String str, int i, String str2, double d, double d2) {
        JSONObject placementEventParams = PlacementUtils.placementEventParams(str, i);
        JSONUtil.put(placementEventParams, MaticooAdsConstant.KEY_AD_MEDIATION, str2);
        JSONUtil.put(placementEventParams, "winPrice", Double.valueOf(d));
        JSONUtil.put(placementEventParams, "secondPrice", Double.valueOf(d2));
        Event event = new Event(211, placementEventParams);
        event.justToSdkServer = true;
        EventReportManager.getInstance().reportEvent(event);
    }

    public static void reportInitEventWithAdapter(int i, String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        JSONUtil.put(jSONObject, MaticooAdsConstant.KEY_AD_MEDIATION, str);
        JSONUtil.put(jSONObject, "msg", str3);
        if (i == 204) {
            JSONUtil.put(jSONObject, MBridgeConstans.APP_KEY, str2);
        }
        EventReportManager.getInstance().reportEvent(new Event(i, jSONObject));
    }

    public static void reportInteractEntranceClick(AdBean adBean, String str) {
        if (adBean == null) {
            return;
        }
        JSONObject placementEventParams = PlacementUtils.placementEventParams(str, 5);
        JSONUtil.put(placementEventParams, "request_id", adBean.getUniqueId());
        Event event = new Event(302, placementEventParams);
        JSONObject interactCustomProperties = getInteractCustomProperties(str, adBean, "click");
        if (interactCustomProperties != null) {
            JSONUtil.put(placementEventParams, "data", InteractLogHelper.produceLog(adBean.getBiAppId(), event.getType(), "maticoo_icon", interactCustomProperties));
        }
        DeveloperLog.LogD("reportInteractEntranceClick, object = " + placementEventParams);
        EventReportManager.getInstance().reportEvent(event);
    }

    public static void reportInteractEntranceShow(AdBean adBean, String str) {
        if (adBean == null) {
            return;
        }
        JSONObject placementEventParams = PlacementUtils.placementEventParams(str, 5);
        JSONUtil.put(placementEventParams, "request_id", adBean.getUniqueId());
        Event event = new Event(301, placementEventParams);
        JSONObject interactCustomProperties = getInteractCustomProperties(str, adBean, "show");
        if (interactCustomProperties != null) {
            JSONUtil.put(placementEventParams, "data", InteractLogHelper.produceLog(adBean.getBiAppId(), event.getType(), "maticoo_icon", interactCustomProperties));
        }
        DeveloperLog.LogD("reportInteractEntranceShow, object = " + placementEventParams);
        EventReportManager.getInstance().reportEvent(event);
    }

    public static void reportInteractH5Event(AdBean adBean, String str, JSONObject jSONObject, String str2) {
        try {
            JSONObject placementEventParams = PlacementUtils.placementEventParams(adBean, str, 5);
            JSONUtil.put(placementEventParams, "data", jSONObject);
            DeveloperLog.LogD("reportInteractH5Event, object = " + placementEventParams);
            if (!TextUtils.isEmpty(str2)) {
                JSONUtil.put(placementEventParams, "request_id", str2);
            }
            EventReportManager.getInstance().reportEvent(new Event(303, placementEventParams));
        } catch (Exception e) {
            DeveloperLog.LogD("reportInteractH5Event, Exception = " + e);
            CrashUtil.getSingleton().reportSDKException(e, "AdsUtil");
        }
    }

    public static void reportJSLog(String str, String str2, int i, JSONObject jSONObject) {
        try {
            JSONObject placementEventParams = PlacementUtils.placementEventParams(str2, i);
            JSONUtil.put(placementEventParams, "custom_event_name", str);
            JSONUtil.mergeJSONObject(jSONObject, placementEventParams);
            EventReportManager.getInstance().reportEvent(new Event(401, placementEventParams));
        } catch (Throwable th) {
            DeveloperLog.LogD("reportJSLog", th);
            CrashUtil.getSingleton().reportSDKException(th, "JSLog");
        }
    }

    public static void reportLogoClick(AdBean adBean, int i, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        JSONUtil.addWithMap(jSONObject, map);
        addAdParams(jSONObject, adBean);
        JSONUtil.put(jSONObject, "msg_type", Integer.valueOf(i));
        EventReportManager.getInstance().reportEvent(new Event(118, jSONObject));
    }

    public static void reportParseDns(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        JSONUtil.put(jSONObject, "sdk_api_error", str);
        JSONUtil.put(jSONObject, "msg", str2);
        EventReportManager.getInstance().reportEvent(new Event(901, jSONObject));
    }

    public static void reportRequestFailed(String str, long j, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        JSONUtil.put(jSONObject, "msg", str);
        JSONUtil.addWithMap(jSONObject, map);
        JSONUtil.put(jSONObject, Constants.KEY_DURATION, Long.valueOf(j));
        EventReportManager.getInstance().reportEvent(new Event(105, jSONObject));
    }

    public static void reportRequestSuccess(long j, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        JSONUtil.addWithMap(jSONObject, map);
        JSONUtil.put(jSONObject, Constants.KEY_DURATION, Long.valueOf(j));
        EventReportManager.getInstance().reportEvent(new Event(120, jSONObject));
    }
}
