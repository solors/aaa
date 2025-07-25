package com.maticoo.sdk.bean;

import android.text.TextUtils;
import com.maticoo.sdk.utils.JSONUtil;
import com.maticoo.sdk.utils.crash.CrashUtil;
import com.maticoo.sdk.utils.log.DeveloperLog;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class AdBean {
    private Bidresp bidBean;
    private Map<String, Object> eventMap;
    private InteractBean interactBean;
    private int ort;
    private final AtomicInteger mSuccess = new AtomicInteger(0);
    private final AtomicInteger mFailed = new AtomicInteger(0);

    public static int getInteractRefreshIntervalSecond(AdBean adBean) {
        if (adBean == null || adBean.getInteractBean() == null) {
            return 0;
        }
        return adBean.getInteractBean().getRecallInterval();
    }

    public static boolean isValid(AdBean adBean, int i) {
        if (isValid(adBean)) {
            if (i == 5) {
                return InteractBean.isValid(adBean.interactBean);
            }
            return Bidresp.isValid(adBean.bidBean);
        }
        return false;
    }

    public static AdBean toAdBean(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            AdBean adBean = new AdBean();
            JSONObject optJSONObject = jSONObject.optJSONObject("bidresp");
            if (optJSONObject != null) {
                adBean.bidBean = Bidresp.toAdBean(optJSONObject.toString());
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("interactiveresp");
            if (optJSONObject2 != null) {
                adBean.interactBean = InteractBean.toAdBean(optJSONObject2.toString());
            }
            Map<String, Object> jsonObjToMap = JSONUtil.jsonObjToMap(jSONObject.optJSONObject("event"));
            if (jsonObjToMap != null) {
                adBean.eventMap = jsonObjToMap;
            }
            adBean.ort = jSONObject.optInt("ort", 0);
            if (!isValid(adBean)) {
                return null;
            }
            return adBean;
        } catch (Exception e) {
            DeveloperLog.LogE("JSONObject convert AdBean error: " + e.getMessage());
            CrashUtil.getSingleton().reportSDKException(e, "toAdBean");
            return null;
        }
    }

    public static String toJsonString(AdBean adBean) {
        if (!isValid(adBean)) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            String jsonString = Bidresp.toJsonString(adBean.bidBean);
            if (!TextUtils.isEmpty(jsonString)) {
                jSONObject.put("bidresp", new JSONObject(jsonString));
            }
            String jsonString2 = InteractBean.toJsonString(adBean.interactBean);
            if (!TextUtils.isEmpty(jsonString2)) {
                jSONObject.put("interactiveresp", new JSONObject(jsonString2));
            }
            JSONObject convert = JSONUtil.convert(adBean.eventMap);
            if (convert != null) {
                jSONObject.put("event", convert);
            }
            jSONObject.put("ort", adBean.ort);
            return jSONObject.toString();
        } catch (Exception e) {
            DeveloperLog.LogE("AdBean convert JSONObject error: " + e.getMessage());
            CrashUtil.getSingleton().reportSDKException(e, "AdBean");
            return "";
        }
    }

    public String getAdUrl(int i) {
        if (i == 5) {
            InteractBean interactBean = this.interactBean;
            if (interactBean != null) {
                return interactBean.getH5Url();
            }
            return "";
        }
        Bidresp bidresp = this.bidBean;
        if (bidresp != null) {
            return bidresp.getAdurl();
        }
        return "";
    }

    public String getBiAppId() {
        if (getInteractBean() != null) {
            return getInteractBean().getBiAppid();
        }
        return "";
    }

    public Bidresp getBidBean() {
        return this.bidBean;
    }

    public String getBundleId() {
        Bidresp bidresp = this.bidBean;
        if (bidresp != null) {
            return bidresp.getBundleId();
        }
        return "";
    }

    public Map<String, Object> getEventMap() {
        return this.eventMap;
    }

    public AtomicInteger getFailed() {
        return this.mFailed;
    }

    public InteractBean getInteractBean() {
        return this.interactBean;
    }

    public int getOrt() {
        return this.ort;
    }

    public List<String> getPreloadAsyncResources() {
        ArrayList<String> arrayList = new ArrayList();
        Bidresp bidresp = this.bidBean;
        if (bidresp != null) {
            arrayList.addAll(bidresp.getPreloadAsyncResources());
        }
        InteractBean interactBean = this.interactBean;
        if (interactBean != null) {
            arrayList.add(interactBean.getH5Url());
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            if (!TextUtils.isEmpty(str)) {
                arrayList2.add(str);
            }
        }
        return arrayList2;
    }

    public List<String> getPreloadResources() {
        ArrayList<String> arrayList = new ArrayList();
        Bidresp bidresp = this.bidBean;
        if (bidresp != null) {
            arrayList.addAll(bidresp.getPreloadResources());
        }
        InteractBean interactBean = this.interactBean;
        if (interactBean != null) {
            arrayList.add(interactBean.getIconUrl());
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            if (!TextUtils.isEmpty(str)) {
                arrayList2.add(str);
            }
        }
        return arrayList2;
    }

    public float getPrice() {
        Bidresp bidresp = this.bidBean;
        if (bidresp == null) {
            return 0.0f;
        }
        return bidresp.getPrice();
    }

    public AtomicInteger getSuccess() {
        return this.mSuccess;
    }

    public String getUniqueId() {
        Bidresp bidresp = this.bidBean;
        if (bidresp != null) {
            return bidresp.getAdRequestId();
        }
        InteractBean interactBean = this.interactBean;
        if (interactBean != null) {
            return interactBean.getAdRequestId();
        }
        return "";
    }

    public boolean isHybrid() {
        Bidresp bidresp = this.bidBean;
        if (bidresp != null && bidresp.getVideoResp() != null) {
            return true;
        }
        return false;
    }

    public void replaceOnlineResToLocal(String str, String str2) {
        Bidresp bidresp = this.bidBean;
        if (bidresp != null) {
            bidresp.replaceOnlineResToLocal(str, str2);
        }
    }

    public void setOrt(int i) {
        this.ort = i;
    }

    public String toString() {
        return toJsonString(this);
    }

    private static boolean isValid(AdBean adBean) {
        if (adBean == null) {
            return false;
        }
        return (adBean.bidBean == null && adBean.interactBean == null) ? false : true;
    }
}
