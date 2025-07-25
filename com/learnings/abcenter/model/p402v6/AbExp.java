package com.learnings.abcenter.model.p402v6;

import com.learnings.abcenter.util.AbCenterUtil;
import com.learnings.abcenter.util.CheckUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.learnings.abcenter.model.v6.AbExp */
/* loaded from: classes6.dex */
public class AbExp {
    private List<String> expBucketList;
    private AbCondition expCondition;
    private List<AbExpGroup> expGroupList;
    private Map<Integer, AbExpGroup> expIndexGroupMap;
    private String expName;
    private String expTag;
    private Map<String, AbExpGroup> expTagGroupMap;
    private String expTagTime;

    /* renamed from: id */
    private String f54847id;
    private boolean isEmptyRunningExp;
    private String layerId;
    private boolean retainExperimentHit;

    private static List<AbExpGroup> getAbExpGroupListFromJson(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(AbExpGroup.getFromJson(jSONArray.optJSONObject(i)));
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    private Map<Integer, AbExpGroup> getExpIndexGroupMap() {
        if (this.expIndexGroupMap == null) {
            this.expIndexGroupMap = new HashMap();
            if (!CheckUtil.isListNullOrEmpty(this.expGroupList)) {
                for (AbExpGroup abExpGroup : this.expGroupList) {
                    if (abExpGroup != null) {
                        this.expIndexGroupMap.put(Integer.valueOf(abExpGroup.getGroupIndex()), abExpGroup);
                    }
                }
            }
        }
        return this.expIndexGroupMap;
    }

    private Map<String, AbExpGroup> getExpTagGroupMap() {
        if (this.expTagGroupMap == null) {
            this.expTagGroupMap = new HashMap();
            if (!CheckUtil.isListNullOrEmpty(this.expGroupList)) {
                for (AbExpGroup abExpGroup : this.expGroupList) {
                    if (abExpGroup != null) {
                        this.expTagGroupMap.put(abExpGroup.getGroupTag(), abExpGroup);
                    }
                }
            }
        }
        return this.expTagGroupMap;
    }

    public static AbExp getFromJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            AbExp abExp = new AbExp();
            abExp.setId(AbCenterUtil.optString(jSONObject, "id"));
            abExp.setExpName(AbCenterUtil.optString(jSONObject, "exp_name"));
            abExp.setLayerId(AbCenterUtil.optString(jSONObject, "layer_id"));
            abExp.setExpCondition(AbCondition.getFromJson(jSONObject.optJSONObject("exp_condition")));
            abExp.setRetainExperimentHit(jSONObject.optBoolean("retain_experiment_hit", true));
            abExp.setExpTag(AbCenterUtil.optString(jSONObject, "exp_tag"));
            abExp.setEmptyRunningExp(jSONObject.optBoolean("is_empty_running_exp"));
            abExp.setExpBucketList(AbCenterUtil.jsonArrayToStringList(jSONObject.optJSONArray("exp_buckets")));
            abExp.setExpTagTime(AbCenterUtil.optString(jSONObject, "exp_tag_time"));
            abExp.setExpGroupList(getAbExpGroupListFromJson(jSONObject.optJSONArray("exp_group")));
            return abExp;
        } catch (Throwable unused) {
            return null;
        }
    }

    public AbExpGroup getAbExpGroup(int i) {
        return getExpIndexGroupMap().get(Integer.valueOf(i));
    }

    public List<String> getExpBucketList() {
        return this.expBucketList;
    }

    public AbCondition getExpCondition() {
        return this.expCondition;
    }

    public List<AbExpGroup> getExpGroupList() {
        return this.expGroupList;
    }

    public String getExpName() {
        return this.expName;
    }

    public String getExpTag() {
        return this.expTag;
    }

    public String getExpTagTime() {
        return this.expTagTime;
    }

    public String getId() {
        return this.f54847id;
    }

    public List<String> getKeyList() {
        try {
            return this.expGroupList.get(0).getKeyList();
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getLayerId() {
        return this.layerId;
    }

    public boolean isEmptyRunningExp() {
        return this.isEmptyRunningExp;
    }

    public boolean isRetainExperimentHit() {
        return this.retainExperimentHit;
    }

    public void setEmptyRunningExp(boolean z) {
        this.isEmptyRunningExp = z;
    }

    public void setExpBucketList(List<String> list) {
        this.expBucketList = list;
    }

    public void setExpCondition(AbCondition abCondition) {
        this.expCondition = abCondition;
    }

    public void setExpGroupList(List<AbExpGroup> list) {
        this.expGroupList = list;
    }

    public void setExpName(String str) {
        this.expName = str;
    }

    public void setExpTag(String str) {
        this.expTag = str;
    }

    public void setExpTagTime(String str) {
        this.expTagTime = str;
    }

    public void setId(String str) {
        this.f54847id = str;
    }

    public void setLayerId(String str) {
        this.layerId = str;
    }

    public void setRetainExperimentHit(boolean z) {
        this.retainExperimentHit = z;
    }

    public AbExpGroup getAbExpGroup(String str) {
        return getExpTagGroupMap().get(str);
    }
}
