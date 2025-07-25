package com.learnings.abcenter.model.p401v5;

import android.text.TextUtils;
import com.learnings.abcenter.util.AbCenterUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.learnings.abcenter.model.v5.AbParamsBoundary */
/* loaded from: classes6.dex */
public class AbParamsBoundary {
    private List<String> campaign_id;
    private List<String> country;
    private long create_dt;
    private List<String> device_category;
    private List<Integer> device_ram_type_range;
    private List<String> device_resolution_type;
    private String first_app_version_num;
    private List<AbFlowDomain> flow_domains;
    private String hasAdIdentify;
    private List<Integer> living_days_range;
    private List<String> media_source;
    private List<String> os_version_range;
    private List<AbUserTag> user_tags;
    private String version_num;

    /* renamed from: com.learnings.abcenter.model.v5.AbParamsBoundary$AbFlowDomain */
    /* loaded from: classes6.dex */
    public static class AbFlowDomain {
        private String domain_tag;
        private List<String> domain_tag_value;
        private int priority;

        public static AbFlowDomain getFromJson(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            try {
                AbFlowDomain abFlowDomain = new AbFlowDomain();
                abFlowDomain.setPriority(jSONObject.optInt("priority"));
                abFlowDomain.setDomainTag(AbCenterUtil.optString(jSONObject, "domain_tag"));
                abFlowDomain.setDomainTagValue(AbCenterUtil.jsonArrayToStringList(jSONObject.optJSONArray("domain_tag_value")));
                return abFlowDomain;
            } catch (Throwable unused) {
                return null;
            }
        }

        public String getDomainTag() {
            return this.domain_tag;
        }

        public List<String> getDomainTagValue() {
            return this.domain_tag_value;
        }

        public int getDomainTagValueSize() {
            List<String> list = this.domain_tag_value;
            if (list != null && !list.isEmpty()) {
                return this.domain_tag_value.size();
            }
            return Integer.MAX_VALUE;
        }

        public int getPriority() {
            return this.priority;
        }

        public void setDomainTag(String str) {
            this.domain_tag = str;
        }

        public void setDomainTagValue(List<String> list) {
            this.domain_tag_value = list;
        }

        public void setPriority(int i) {
            this.priority = i;
        }
    }

    /* renamed from: com.learnings.abcenter.model.v5.AbParamsBoundary$AbUserTag */
    /* loaded from: classes6.dex */
    public static class AbUserTag {
        private int is_full_match;
        private int priority;
        private String tag_id;
        private List<String> tag_value;

        public static AbUserTag getFromJson(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            try {
                AbUserTag abUserTag = new AbUserTag();
                abUserTag.setPriority(jSONObject.optInt("priority"));
                abUserTag.setTagId(AbCenterUtil.optString(jSONObject, "tag_id"));
                abUserTag.setTagValue(AbCenterUtil.jsonArrayToStringList(jSONObject.optJSONArray("tag_value")));
                abUserTag.setIsFullMatch(jSONObject.optInt("is_full_match"));
                return abUserTag;
            } catch (Throwable unused) {
                return null;
            }
        }

        public boolean IsFullMatch() {
            if (this.is_full_match == 1) {
                return true;
            }
            return false;
        }

        public int getFullMath() {
            return this.is_full_match;
        }

        public int getPriority() {
            return this.priority;
        }

        public String getTagId() {
            return this.tag_id;
        }

        public int getTagSize() {
            List<String> list = this.tag_value;
            if (list != null && !list.isEmpty()) {
                return this.tag_value.size();
            }
            return Integer.MAX_VALUE;
        }

        public List<String> getTagValue() {
            return this.tag_value;
        }

        public void setIsFullMatch(int i) {
            this.is_full_match = i;
        }

        public void setPriority(int i) {
            this.priority = i;
        }

        public void setTagId(String str) {
            this.tag_id = str;
        }

        public void setTagValue(List<String> list) {
            this.tag_value = list;
        }
    }

    private static List<AbUserTag> getAbUserTagListFromJson(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(AbUserTag.getFromJson(jSONArray.optJSONObject(i)));
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static List<AbFlowDomain> getFlowDomainListFromJson(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(AbFlowDomain.getFromJson(jSONArray.optJSONObject(i)));
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static AbParamsBoundary getFromJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            AbParamsBoundary abParamsBoundary = new AbParamsBoundary();
            abParamsBoundary.setCountry(AbCenterUtil.jsonArrayToStringList(jSONObject.optJSONArray("country")));
            abParamsBoundary.setHasAdIdentify(AbCenterUtil.optString(jSONObject, "hasAdIdentify"));
            abParamsBoundary.setMediaSource(AbCenterUtil.jsonArrayToStringList(jSONObject.optJSONArray("media_source")));
            abParamsBoundary.setFirstAppVersionNum(AbCenterUtil.optString(jSONObject, "first_app_version_num"));
            abParamsBoundary.setVersionNum(AbCenterUtil.optString(jSONObject, "version_num"));
            abParamsBoundary.setDeviceCategory(AbCenterUtil.jsonArrayToStringList(jSONObject.optJSONArray("device_category")));
            abParamsBoundary.setLivingDaysRange(AbCenterUtil.jsonArrayToIntegerList(jSONObject.optJSONArray("living_days_range")));
            abParamsBoundary.setOsVersionRange(AbCenterUtil.jsonArrayToStringList(jSONObject.optJSONArray("os_version_range")));
            abParamsBoundary.setDeviceRamTypeRange(AbCenterUtil.jsonArrayToIntegerList(jSONObject.optJSONArray("device_ram_type_range")));
            abParamsBoundary.setDeviceResolutionType(AbCenterUtil.jsonArrayToStringList(jSONObject.optJSONArray("device_resolution_type")));
            abParamsBoundary.setCreateDt(jSONObject.optLong("create_dt"));
            abParamsBoundary.setCampaignId(AbCenterUtil.jsonArrayToStringList(jSONObject.optJSONArray("campaign_id")));
            abParamsBoundary.setUserTags(getAbUserTagListFromJson(jSONObject.optJSONArray("user_tags")));
            abParamsBoundary.setFlowDomains(getFlowDomainListFromJson(jSONObject.optJSONArray("flow_domains")));
            return abParamsBoundary;
        } catch (Throwable unused) {
            return null;
        }
    }

    public Map<String, AbFlowDomain> getAbFlowDomainMap() {
        HashMap hashMap = new HashMap();
        if (!isListValid(this.flow_domains)) {
            return hashMap;
        }
        for (AbFlowDomain abFlowDomain : this.flow_domains) {
            String domainTag = abFlowDomain.getDomainTag();
            if (!TextUtils.isEmpty(domainTag)) {
                hashMap.put(domainTag, abFlowDomain);
            }
        }
        return hashMap;
    }

    public Map<String, AbUserTag> getAbUserTagMap() {
        HashMap hashMap = new HashMap();
        if (!isListValid(this.user_tags)) {
            return hashMap;
        }
        for (AbUserTag abUserTag : this.user_tags) {
            String tagId = abUserTag.getTagId();
            if (!TextUtils.isEmpty(tagId)) {
                hashMap.put(tagId, abUserTag);
            }
        }
        return hashMap;
    }

    public List<String> getCampaignId() {
        return this.campaign_id;
    }

    public List<String> getCountries() {
        return this.country;
    }

    public long getCreateDt() {
        return this.create_dt;
    }

    public List<String> getDeviceCategory() {
        return this.device_category;
    }

    public List<Integer> getDeviceRamTypeRange() {
        return this.device_ram_type_range;
    }

    public List<String> getDeviceResolutionType() {
        return this.device_resolution_type;
    }

    public String getFirstAppVersionNum() {
        return this.first_app_version_num;
    }

    public List<AbFlowDomain> getFlowDomains() {
        return this.flow_domains;
    }

    public String getHasAdIdentify() {
        return this.hasAdIdentify;
    }

    public List<Integer> getLivingDaysRange() {
        return this.living_days_range;
    }

    public List<String> getMediaSource() {
        return this.media_source;
    }

    public List<String> getOsVersionRange() {
        return this.os_version_range;
    }

    public List<AbUserTag> getUserTags() {
        return this.user_tags;
    }

    public String getVersionNum() {
        return this.version_num;
    }

    public boolean isListValid(List<?> list) {
        if (list != null && !list.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean isRangeValid(List<?> list) {
        if (list == null || list.size() != 2 || list.get(0) == null) {
            return false;
        }
        return true;
    }

    public void setCampaignId(List<String> list) {
        this.campaign_id = list;
    }

    public void setCountry(List<String> list) {
        this.country = list;
    }

    public void setCreateDt(long j) {
        this.create_dt = j;
    }

    public void setDeviceCategory(List<String> list) {
        this.device_category = list;
    }

    public void setDeviceRamTypeRange(List<Integer> list) {
        this.device_ram_type_range = list;
    }

    public void setDeviceResolutionType(List<String> list) {
        this.device_resolution_type = list;
    }

    public void setFirstAppVersionNum(String str) {
        this.first_app_version_num = str;
    }

    public void setFlowDomains(List<AbFlowDomain> list) {
        this.flow_domains = list;
    }

    public void setHasAdIdentify(String str) {
        this.hasAdIdentify = str;
    }

    public void setLivingDaysRange(List<Integer> list) {
        this.living_days_range = list;
    }

    public void setMediaSource(List<String> list) {
        this.media_source = list;
    }

    public void setOsVersionRange(List<String> list) {
        this.os_version_range = list;
    }

    public void setUserTags(List<AbUserTag> list) {
        this.user_tags = list;
    }

    public void setVersionNum(String str) {
        this.version_num = str;
    }
}
