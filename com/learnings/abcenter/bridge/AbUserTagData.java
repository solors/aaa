package com.learnings.abcenter.bridge;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.learnings.abcenter.AbCenterHelper;
import com.learnings.abcenter.calculate.p400v6.module.FlowDomainModule;
import com.learnings.abcenter.model.p401v5.AbConfigV5;
import com.learnings.abcenter.model.p401v5.AbExperiment;
import com.learnings.abcenter.model.p401v5.AbParamsBoundary;
import com.learnings.abcenter.model.p402v6.AbResult;
import com.learnings.abcenter.util.AbCenterConstant;
import com.learnings.abcenter.util.AbCenterUtil;
import com.learnings.abcenter.util.CheckUtil;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class AbUserTagData {
    public static final String AREA_CAMPAIGN_ID = "campaignId";
    public static final String AREA_LIVING_DAY = "livingDay";
    public static final String AREA_MEDIA_SOURCE = "mediaSource";
    public static final String AREA_OS_VERSION = "osVersion";
    private Map<String, String> allTagData;
    private String appVersion;
    private Map<String, String> calculateMoFlowDomainData;
    private String campaignId;
    private String deviceCategory;
    private double deviceRam;
    private String deviceResolution;
    private String firstAppVersion;
    private long firstInstallTime;
    private String hasAdIdentify;
    private int livingDays;
    private String mediaSource;
    private Map<String, String> originMoFlowDomainData;
    private Map<String, String> originPmFlowDomainData;
    private String osVersion;

    public static Map<String, String> getConfigUserTagAreaData(AbConfigV5 abConfigV5, AbUserTagData abUserTagData) {
        AbParamsBoundary boundary;
        HashMap hashMap = new HashMap();
        if (abConfigV5 == null) {
            return hashMap;
        }
        if (abConfigV5.getExperimentList() != null && !abConfigV5.getExperimentList().isEmpty()) {
            for (AbExperiment abExperiment : abConfigV5.getExperimentList()) {
                if (abExperiment != null && (boundary = abExperiment.getBoundary()) != null) {
                    if (boundary.isRangeValid(boundary.getLivingDaysRange())) {
                        hashMap.put(AREA_LIVING_DAY, String.valueOf(abUserTagData.getLivingDays()));
                    }
                    if (boundary.isRangeValid(boundary.getOsVersionRange())) {
                        hashMap.put("osVersion", abUserTagData.getOsVersion());
                    }
                    if (boundary.isListValid(boundary.getMediaSource())) {
                        hashMap.put(AREA_MEDIA_SOURCE, abUserTagData.getMediaSource());
                    }
                    if (boundary.isListValid(boundary.getCampaignId())) {
                        hashMap.put(AREA_CAMPAIGN_ID, abUserTagData.getCampaignId());
                    }
                    List<AbParamsBoundary.AbUserTag> userTags = boundary.getUserTags();
                    if (boundary.isListValid(userTags)) {
                        for (AbParamsBoundary.AbUserTag abUserTag : userTags) {
                            if (abUserTag != null && !TextUtils.isEmpty(abUserTag.getTagId())) {
                                hashMap.put(abUserTag.getTagId(), abUserTagData.getTagValue(abUserTag.getTagId()));
                            }
                        }
                    }
                }
            }
        }
        return hashMap;
    }

    private String getDefaultString(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str;
    }

    @NonNull
    private static JSONArray getJsonArray(AbResult.AbFlowDomainResult abFlowDomainResult) {
        JSONArray jSONArray = new JSONArray();
        for (AbResult.AbFlowDomainResult.AbFlowDomainData abFlowDomainData : abFlowDomainResult.getAbFlowDomainDataList()) {
            if (abFlowDomainData != null && !TextUtils.isEmpty(abFlowDomainData.getDomainTag())) {
                jSONArray.put(abFlowDomainData.getDomainTag());
            }
        }
        return jSONArray;
    }

    public static boolean isConfigUserTagAreaChange(AbUserTagData abUserTagData, Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            Map<String, String> areaCheckMap = abUserTagData.getAreaCheckMap();
            for (String str : map.keySet()) {
                String str2 = map.get(str);
                String str3 = areaCheckMap.get(str);
                if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
                    if (!TextUtils.equals(str2, str3)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public Map<String, String> getAllTagData() {
        if (this.allTagData == null) {
            this.allTagData = new HashMap();
        }
        return this.allTagData;
    }

    public String getAppVersion() {
        return getDefaultString(this.appVersion);
    }

    public Map<String, String> getAreaCheckMap() {
        HashMap hashMap = new HashMap();
        hashMap.put(AREA_MEDIA_SOURCE, getMediaSource());
        hashMap.put(AREA_CAMPAIGN_ID, getCampaignId());
        hashMap.put("osVersion", getOsVersion());
        hashMap.put(AREA_LIVING_DAY, String.valueOf(getLivingDays()));
        hashMap.putAll(getAllTagData());
        return hashMap;
    }

    public Map<String, String> getCalculateMoFlowDomainData() {
        if (this.calculateMoFlowDomainData == null) {
            this.calculateMoFlowDomainData = new HashMap();
        }
        return this.calculateMoFlowDomainData;
    }

    public String getCalculateMoFlowDomainValue(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return getDefaultString(getCalculateMoFlowDomainData().get(str));
    }

    public String getCampaignId() {
        return getDefaultString(this.campaignId);
    }

    public String getDeviceCategory() {
        return getDefaultString(this.deviceCategory);
    }

    public double getDeviceRam() {
        return this.deviceRam;
    }

    public String getDeviceResolution() {
        return getDefaultString(this.deviceResolution);
    }

    public String getFirstAppVersion() {
        return getDefaultString(this.firstAppVersion);
    }

    public long getFirstInstallTime() {
        return this.firstInstallTime;
    }

    public String getHasAdIdentify() {
        return this.hasAdIdentify;
    }

    public int getLivingDays() {
        return this.livingDays;
    }

    public String getMediaSource() {
        return getDefaultString(this.mediaSource);
    }

    public Map<String, String> getOriginMoFlowDomainData() {
        if (this.originMoFlowDomainData == null) {
            this.originMoFlowDomainData = new HashMap();
        }
        return this.originMoFlowDomainData;
    }

    public String getOriginMoFlowDomainValue(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return getDefaultString(getOriginMoFlowDomainData().get(str));
    }

    public Map<String, String> getOriginPmFlowDomainData() {
        if (this.originPmFlowDomainData == null) {
            this.originPmFlowDomainData = new HashMap();
        }
        return this.originPmFlowDomainData;
    }

    public String getOsVersion() {
        return getDefaultString(this.osVersion);
    }

    public String getTagValue(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return getDefaultString(getAllTagData().get(str));
    }

    public void setAllTagData(Map<String, String> map) {
        this.allTagData = map;
    }

    public void setAppVersion(String str) {
        this.appVersion = str;
    }

    public void setCalculateMoFlowDomainData(Map<String, String> map) {
        this.calculateMoFlowDomainData = map;
    }

    public void setCampaignId(String str) {
        this.campaignId = str;
    }

    public void setDeviceCategory(String str) {
        this.deviceCategory = str;
    }

    public void setDeviceRam(double d) {
        this.deviceRam = d;
    }

    public void setDeviceResolution(String str) {
        this.deviceResolution = str;
    }

    public void setFirstAppVersion(String str) {
        this.firstAppVersion = str;
    }

    public void setFirstInstallTime(long j) {
        this.firstInstallTime = j;
    }

    public void setHasAdIdentify(String str) {
        this.hasAdIdentify = str;
    }

    public void setLivingDays(int i) {
        this.livingDays = i;
    }

    public void setMediaSource(String str) {
        this.mediaSource = str;
    }

    public void setOriginMoFlowDomainData(Map<String, String> map) {
        this.originMoFlowDomainData = map;
    }

    public void setOriginPmFlowDomainData(Map<String, String> map) {
        this.originPmFlowDomainData = map;
    }

    public void setOsVersion(String str) {
        this.osVersion = str;
    }

    public String toJson(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version_num", AbCenterUtil.versionName2VersionNum(getAppVersion()));
            jSONObject.put("country", AbCenterUtil.getCountry(context));
            jSONObject.put("device_category", getDeviceCategory());
            jSONObject.put("media_source", getMediaSource());
            jSONObject.put("campaign_id", getCampaignId());
            jSONObject.put("first_app_version_num", AbCenterUtil.versionName2VersionNum(getFirstAppVersion()));
            jSONObject.put("living_days", getLivingDays());
            jSONObject.put("os_version_num", AbCenterUtil.versionName2VersionNum(getOsVersion()));
            jSONObject.put("device_ram_type", BigDecimal.valueOf(getDeviceRam()).setScale(4, RoundingMode.HALF_UP).doubleValue());
            jSONObject.put("device_resolution_type", getDeviceResolution());
            jSONObject.put("create_dt", getFirstInstallTime());
            jSONObject.put("hasAdIdentify", AbCenterUtil.equals("yes", getHasAdIdentify()));
            jSONObject.put(FirebaseAnalytics.Param.GROUP_ID, AbCenterUtil.getGroupId(context));
            JSONArray jSONArray = new JSONArray();
            String originMoFlowDomainValue = getOriginMoFlowDomainValue(AbCenterConstant.AD_FLOW_DOMAIN_TAG);
            if (!TextUtils.isEmpty(originMoFlowDomainValue)) {
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put(AbCenterConstant.AD_FLOW_DOMAIN_TAG);
                jSONArray2.put(originMoFlowDomainValue);
                jSONArray.put(jSONArray2);
            }
            List<AbResult.AbFlowDomainResult> flowDomainListResult = FlowDomainModule.getFlowDomainListResult(context, AbCenterHelper.From.AD_SDK);
            if (!CheckUtil.isListNullOrEmpty(flowDomainListResult)) {
                for (AbResult.AbFlowDomainResult abFlowDomainResult : flowDomainListResult) {
                    if (abFlowDomainResult != null && !abFlowDomainResult.isEmpty()) {
                        jSONArray.put(getJsonArray(abFlowDomainResult));
                    }
                }
            }
            List<AbResult.AbFlowDomainResult> flowDomainListResult2 = FlowDomainModule.getFlowDomainListResult(context, AbCenterHelper.From.ABTEST_SDK);
            if (!CheckUtil.isListNullOrEmpty(flowDomainListResult2)) {
                for (AbResult.AbFlowDomainResult abFlowDomainResult2 : flowDomainListResult2) {
                    if (abFlowDomainResult2 != null && !abFlowDomainResult2.isEmpty()) {
                        jSONArray.put(getJsonArray(abFlowDomainResult2));
                    }
                }
            }
            jSONObject.put("flow_domains_path", jSONArray);
            JSONArray jSONArray3 = new JSONArray();
            for (String str : getAllTagData().keySet()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("tag_id", str);
                jSONObject2.put("tag_value", getTagValue(str));
                jSONArray3.put(jSONObject2);
            }
            jSONObject.put("user_tags", jSONArray3);
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    public String toString() {
        return "{\n\tfirstAppVersion='" + getFirstAppVersion() + "\n\tappVersion='" + getAppVersion() + "\n\tfirstInstallTime=" + getFirstInstallTime() + "\n\tdeviceCategory='" + getDeviceCategory() + "\n\tdeviceResolution='" + getDeviceResolution() + "\n\tdeviceRam=" + getDeviceRam() + "\n\tlivingDays=" + getLivingDays() + "\n\thasAdIdentify=" + getHasAdIdentify() + "\n\tmediaSource='" + getMediaSource() + "\n\tcampaignId='" + getCampaignId() + "\n\tosVersion='" + getOsVersion() + "\n\totherData=" + getAllTagData() + "\n\tmoFlowDomainData=" + getOriginMoFlowDomainData() + "\n\tpmFlowDomainData=" + getOriginPmFlowDomainData() + "\n}";
    }
}
