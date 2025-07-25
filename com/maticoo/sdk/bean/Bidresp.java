package com.maticoo.sdk.bean;

import android.text.TextUtils;
import com.ironsource.C19897f5;
import com.learnings.abcenter.util.AbCenterConstant;
import com.maticoo.sdk.utils.JSONUtil;
import com.maticoo.sdk.utils.constant.CommonConstants;
import com.maticoo.sdk.utils.constant.KeyConstants;
import com.maticoo.sdk.utils.crash.CrashUtil;
import com.maticoo.sdk.utils.log.DeveloperLog;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.cache.C32111coo2iico;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class Bidresp {
    private String adType;
    private String adm;
    private String adurl;
    private String bundleId;
    private String crid;
    private String dsp;
    private long fillTime;
    private String finalUrl;
    private int landingType;
    private List<String> mediaFiles;
    private NativeBean nativeResp;
    private String nurl;
    private String pid;
    private List<String> resources;
    private VideoResp videoResp;
    private String impurl = "";
    private String loadurl = "";
    private String clkurl = "";
    private float price = 0.0f;
    private String adRequestId = "";
    private double cat = 1.0d;
    private int expire = 3600;
    private int mraid = 0;
    private int multi = 0;
    private int range = 0;
    private double rangeRatio = 1.0d;
    private int auto = 0;
    private int visibleCheckInterval = 0;

    protected Bidresp() {
    }

    public static boolean isValid(Bidresp bidresp) {
        boolean z;
        if (bidresp == null) {
            return false;
        }
        if (bidresp.getVideoResp() != null) {
            z = true;
        } else {
            z = false;
        }
        boolean isVideo = bidresp.isVideo();
        if (z && isVideo && (bidresp.getMediaFiles() == null || bidresp.getMediaFiles().size() == 0)) {
            return false;
        }
        Boolean valueOf = Boolean.valueOf(!TextUtils.isEmpty(bidresp.adurl));
        Boolean valueOf2 = Boolean.valueOf(NativeBean.isValid(bidresp.getNativeResp()));
        if (!valueOf.booleanValue() && !valueOf2.booleanValue()) {
            return false;
        }
        return true;
    }

    private static Map<String, String> parseUser(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next);
            if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(optString)) {
                hashMap.put(next, optString);
            }
        }
        return hashMap;
    }

    public static Bidresp toAdBean(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Bidresp bidresp = new Bidresp();
            bidresp.pid = jSONObject.optString(KeyConstants.RequestBody.KEY_PID);
            bidresp.price = (float) jSONObject.optDouble("price", 0.0d);
            bidresp.adm = jSONObject.optString("adm", "");
            bidresp.nurl = jSONObject.optString(C19897f5.f50024z);
            bidresp.adurl = jSONObject.optString("adurl");
            bidresp.adType = jSONObject.optString("adType");
            bidresp.bundleId = jSONObject.optString(KeyConstants.RequestBody.KEY_BUNDLE);
            bidresp.clkurl = jSONObject.optString("clkurl");
            bidresp.impurl = jSONObject.optString("impurl");
            bidresp.loadurl = jSONObject.optString("loadurl");
            bidresp.adRequestId = jSONObject.optString("adRequestId");
            double optDouble = jSONObject.optDouble("cat", 1.0d);
            bidresp.cat = optDouble;
            if (optDouble <= 0.0d || optDouble > 8.0d) {
                bidresp.cat = 8.0d;
            }
            bidresp.expire = jSONObject.optInt(KeyConstants.Response.KEY_EXPIRE, 3600);
            bidresp.fillTime = System.currentTimeMillis();
            bidresp.resources = JSONUtil.convertFromList(jSONObject.optJSONArray("resources"));
            bidresp.mediaFiles = JSONUtil.convertFromList(jSONObject.optJSONArray("mediaFiles"));
            JSONObject optJSONObject = jSONObject.optJSONObject("nativeResponse");
            if (optJSONObject != null) {
                bidresp.nativeResp = NativeBean.toAdBean(optJSONObject.toString());
            }
            bidresp.mraid = jSONObject.optInt("mraid", 0);
            bidresp.multi = jSONObject.optInt("multi", 0);
            JSONObject optJSONObject2 = jSONObject.optJSONObject("video_response");
            if (optJSONObject2 != null) {
                bidresp.videoResp = VideoResp.toVideoResp(optJSONObject2.toString());
            }
            bidresp.crid = jSONObject.optString("crid");
            bidresp.dsp = jSONObject.optString(C32111coo2iico.C32113cioccoiococ.c2oc2o);
            bidresp.auto = jSONObject.optInt("auto", 0);
            int i = 1000;
            int optInt = jSONObject.optInt("vc_interval", 1000);
            if (optInt != 0) {
                i = optInt;
            }
            bidresp.visibleCheckInterval = i;
            bidresp.landingType = jSONObject.optInt(CampaignEx.JSON_KEY_LANDING_TYPE);
            bidresp.finalUrl = jSONObject.optString("final_url");
            bidresp.range = jSONObject.optInt(AbCenterConstant.RULE_TYPE_RANGE, 1);
            bidresp.rangeRatio = jSONObject.optDouble("range_ratio", 1.0d);
            return bidresp;
        } catch (Exception e) {
            DeveloperLog.LogE("JSONObject convert AdBean error: " + e.getMessage());
            CrashUtil.getSingleton().reportSDKException(e, "BidresptoAdBean");
            return null;
        }
    }

    public static String toJsonString(Bidresp bidresp) {
        if (!isValid(bidresp)) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(KeyConstants.RequestBody.KEY_PID, bidresp.pid);
            jSONObject.put("price", bidresp.price);
            jSONObject.put("adm", bidresp.adm);
            jSONObject.put(C19897f5.f50024z, bidresp.nurl);
            jSONObject.put("adurl", bidresp.adurl);
            jSONObject.put("adType", bidresp.adType);
            jSONObject.put(KeyConstants.RequestBody.KEY_BUNDLE, bidresp.bundleId);
            jSONObject.put("clkurl", bidresp.clkurl);
            jSONObject.put("impurl", bidresp.impurl);
            jSONObject.put("loadurl", bidresp.loadurl);
            jSONObject.put("adRequestId", bidresp.adRequestId);
            jSONObject.put("cat", bidresp.cat);
            jSONObject.put("resources", JSONUtil.convertList(bidresp.resources));
            jSONObject.put("mediaFiles", JSONUtil.convertList(bidresp.mediaFiles));
            jSONObject.put("nativeResponse", NativeBean.toJsonString(bidresp.nativeResp));
            jSONObject.put("mraid", bidresp.mraid);
            jSONObject.put("crid", bidresp.crid);
            jSONObject.put(C32111coo2iico.C32113cioccoiococ.c2oc2o, bidresp.dsp);
            jSONObject.put("auto", bidresp.auto);
            jSONObject.put("vc_interval", bidresp.visibleCheckInterval);
            jSONObject.put(CampaignEx.JSON_KEY_LANDING_TYPE, bidresp.landingType);
            jSONObject.put("final_url", bidresp.finalUrl);
            jSONObject.put(AbCenterConstant.RULE_TYPE_RANGE, bidresp.range);
            jSONObject.put("range_ratio", bidresp.rangeRatio);
            return jSONObject.toString();
        } catch (Exception e) {
            DeveloperLog.LogE("AdBean convert JSONObject error: " + e.getMessage());
            CrashUtil.getSingleton().reportSDKException(e, "Bidresp");
            return "";
        }
    }

    public String getAdRequestId() {
        return this.adRequestId;
    }

    public String getAdType() {
        return this.adType;
    }

    public String getAdm() {
        return this.adm;
    }

    public String getAdurl() {
        return this.adurl;
    }

    public int getAuto() {
        return this.auto;
    }

    public String getBundleId() {
        return this.bundleId;
    }

    public double getCat() {
        return this.cat;
    }

    public String getClkurl() {
        return this.clkurl;
    }

    public String getCrid() {
        return this.crid;
    }

    public String getDsp() {
        return this.dsp;
    }

    public int getExpire() {
        return this.expire;
    }

    public long getFillTime() {
        return this.fillTime;
    }

    public String getFinalUrl() {
        return this.finalUrl;
    }

    public String getImpurl() {
        return this.impurl;
    }

    public int getLandingType() {
        return this.landingType;
    }

    public String getLoadurl() {
        return this.loadurl;
    }

    public List<String> getMediaFiles() {
        return this.mediaFiles;
    }

    public int getMraid() {
        return this.mraid;
    }

    public int getMulti() {
        return this.multi;
    }

    public NativeBean getNativeResp() {
        return this.nativeResp;
    }

    public String getNurl() {
        return this.nurl;
    }

    public String getPid() {
        return this.pid;
    }

    public List<String> getPreloadAsyncResources() {
        ArrayList arrayList = new ArrayList();
        List<String> list = this.resources;
        if (list != null && !list.isEmpty()) {
            arrayList.addAll(this.resources);
        }
        return arrayList;
    }

    public List<String> getPreloadResources() {
        ArrayList arrayList = new ArrayList();
        List<String> list = this.mediaFiles;
        if (list != null && !list.isEmpty()) {
            arrayList.addAll(this.mediaFiles);
        }
        return arrayList;
    }

    public float getPrice() {
        return this.price;
    }

    public int getRange() {
        return this.range;
    }

    public double getRangeRatio() {
        return this.rangeRatio;
    }

    public VideoResp getVideoResp() {
        return this.videoResp;
    }

    public int getVisibleCheckInterval() {
        return this.visibleCheckInterval;
    }

    public boolean isVideo() {
        if (TextUtils.isEmpty(this.adType)) {
            return false;
        }
        String str = this.adType;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1129415014:
                if (str.equals(CommonConstants.TYPE_INV)) {
                    c = 0;
                    break;
                }
                break;
            case -411658598:
                if (str.equals(CommonConstants.TYPE_BAV)) {
                    c = 1;
                    break;
                }
                break;
            case 112202875:
                if (str.equals("video")) {
                    c = 2;
                    break;
                }
                break;
            case 1357818261:
                if (str.equals(CommonConstants.TYPE_SPV)) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    public synchronized void replaceOnlineResToLocal(String str, String str2) {
        String adurl = getAdurl();
        if (TextUtils.isEmpty(adurl)) {
            return;
        }
        if (adurl.contains(str)) {
            setAdurl(str2);
        }
    }

    public void setAdType(String str) {
        this.adType = str;
    }

    public void setAdm(String str) {
        this.adm = str;
    }

    public void setAdurl(String str) {
        this.adurl = str;
    }

    public void setBundleId(String str) {
        this.bundleId = str;
    }

    public void setClkurl(String str) {
        this.clkurl = str;
    }

    public void setImpurl(String str) {
        this.impurl = str;
    }

    public void setMulti(int i) {
        this.multi = i;
    }

    public void setNurl(String str) {
        this.nurl = str;
    }

    public void setPid(String str) {
        this.pid = str;
    }

    public void setPrice(float f) {
        this.price = f;
    }

    public String toString() {
        return toJsonString(this);
    }
}
