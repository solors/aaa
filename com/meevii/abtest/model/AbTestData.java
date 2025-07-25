package com.meevii.abtest.model;

import android.text.TextUtils;
import com.learnings.abcenter.model.p402v6.AbResult;
import com.learnings.abcenter.util.CheckUtil;
import com.meevii.abtest.business.AbTagManager;
import com.meevii.abtest.util.AbTestLog;
import com.meevii.abtest.util.AbUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import org.json.JSONArray;

/* loaded from: classes6.dex */
public class AbTestData {
    private Map<String, AbResult.AbResultData> mAllDataMap;
    private String mAllTag;
    private String mDyeingTag;
    private Set<String> mEmptyTestTagSet;
    private List<AbResult.AbFlowDomainResult> mFlowDomainResultList;
    private final TreeSet<String> mDyeingTagSet = new TreeSet<>();
    private final List<String> mAllTagList = new ArrayList();
    private final Map<String, Object> mParamsDataMap = new HashMap();
    private final Map<String, Object> mPublishParamsDataMap = new HashMap();

    private void convertAllTag() {
        this.mAllTagList.clear();
        if (!CheckUtil.isMapNullOrEmpty(this.mAllDataMap)) {
            for (AbResult.AbResultData abResultData : this.mAllDataMap.values()) {
                if (abResultData.getType() == AbResult.AbResultType.EXP && !TextUtils.isEmpty(abResultData.getTag())) {
                    AbTagManager.get().addTag(abResultData.getTag());
                }
            }
        }
        if (!CheckUtil.isCollectionNullOrEmpty(this.mEmptyTestTagSet)) {
            AbTagManager.get().addTags(this.mEmptyTestTagSet);
        }
        this.mAllTagList.addAll(AbTagManager.get().getAllTag());
        if (CheckUtil.isListNullOrEmpty(this.mAllTagList)) {
            return;
        }
        Collections.sort(this.mAllTagList);
        this.mAllTag = AbUtil.collectionToString(this.mAllTagList);
    }

    private void convertDyeingTag(JSONArray jSONArray) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(optString) && this.mAllTagList.contains(optString)) {
                    this.mDyeingTagSet.add(optString);
                }
            }
        }
        if (!CheckUtil.isCollectionNullOrEmpty(this.mEmptyTestTagSet)) {
            this.mDyeingTagSet.addAll(this.mEmptyTestTagSet);
        }
        if (!CheckUtil.isCollectionNullOrEmpty(this.mDyeingTagSet)) {
            this.mDyeingTag = AbUtil.collectionToString(this.mDyeingTagSet);
        }
    }

    private void convertParams() {
        if (CheckUtil.isMapNullOrEmpty(this.mAllDataMap)) {
            return;
        }
        for (AbResult.AbResultData abResultData : this.mAllDataMap.values()) {
            if (abResultData != null) {
                String key = abResultData.getKey();
                Object transformObject = AbUtil.transformObject(abResultData.getValue());
                if (!TextUtils.isEmpty(key) && transformObject != null) {
                    this.mParamsDataMap.put(key, transformObject);
                    if (abResultData.getType() != AbResult.AbResultType.STRATEGY && !TextUtils.isEmpty(abResultData.getTag())) {
                        this.mPublishParamsDataMap.put(key, transformObject);
                    }
                }
            }
        }
    }

    public static AbTestData create(AbResult abResult, JSONArray jSONArray) {
        AbTestData abTestData = new AbTestData();
        abTestData.mAllDataMap = abResult.getAllDataMap();
        abTestData.mEmptyTestTagSet = abResult.getEmptyExpTagSet();
        abTestData.mFlowDomainResultList = abResult.getFlowDomainResultList();
        abTestData.convertAllTag();
        abTestData.convertDyeingTag(jSONArray);
        abTestData.convertParams();
        return abTestData;
    }

    public boolean dyeing(String str, String str2) {
        boolean z = false;
        if (this.mAllDataMap == null) {
            AbTestLog.log("dyeing fail, allDataMap is null");
            return false;
        }
        boolean z2 = true;
        if (!this.mDyeingTagSet.contains(str2)) {
            this.mDyeingTagSet.add(str2);
            z2 = false;
            z = true;
        }
        if (z) {
            this.mDyeingTag = AbUtil.collectionToString(this.mDyeingTagSet);
        } else if (z2) {
            AbTestLog.log("dyeing fail, key: " + str + " is already dyed");
        } else {
            AbTestLog.log("dyeing fail, key: " + str + " is no matching tag");
        }
        return z;
    }

    public AbResult.AbResultData getAbResultData(String str) {
        return this.mAllDataMap.get(str);
    }

    public String getAllTag() {
        return this.mAllTag;
    }

    public String getDyeingTag() {
        return this.mDyeingTag;
    }

    public TreeSet<String> getDyeingTagSet() {
        return this.mDyeingTagSet;
    }

    public String getDyeingTime(String str) {
        AbResult.AbResultData abResultData = getAbResultData(str);
        if (abResultData != null && !TextUtils.isEmpty(abResultData.getDyeingTime())) {
            return abResultData.getDyeingTime();
        }
        return "";
    }

    public Map<String, String> getFlowDomainData() {
        if (CheckUtil.isListNullOrEmpty(this.mFlowDomainResultList)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (AbResult.AbFlowDomainResult abFlowDomainResult : this.mFlowDomainResultList) {
            if (abFlowDomainResult != null && !abFlowDomainResult.isEmpty()) {
                for (AbResult.AbFlowDomainResult.AbFlowDomainData abFlowDomainData : abFlowDomainResult.getAbFlowDomainDataList()) {
                    if (abFlowDomainData != null && !TextUtils.isEmpty(abFlowDomainData.getDomainTag()) && !TextUtils.isEmpty(abFlowDomainData.getDomainValue())) {
                        hashMap.put(abFlowDomainData.getDomainTag(), abFlowDomainData.getDomainValue());
                    }
                }
            }
        }
        return hashMap;
    }

    public List<String> getFlowDomainResult() {
        ArrayList arrayList = new ArrayList();
        if (CheckUtil.isListNullOrEmpty(this.mFlowDomainResultList)) {
            return arrayList;
        }
        AbResult.AbFlowDomainResult abFlowDomainResult = this.mFlowDomainResultList.get(0);
        if (abFlowDomainResult != null && !abFlowDomainResult.isEmpty()) {
            for (AbResult.AbFlowDomainResult.AbFlowDomainData abFlowDomainData : abFlowDomainResult.getAbFlowDomainDataList()) {
                if (abFlowDomainData != null && !TextUtils.isEmpty(abFlowDomainData.getDomainTag())) {
                    arrayList.add(abFlowDomainData.getDomainTag());
                }
            }
        }
        return arrayList;
    }

    public List<AbResult.AbFlowDomainResult> getFlowDomainResultList() {
        return this.mFlowDomainResultList;
    }

    public AbResult.AbGroupStatus getGroupStatus(String str) {
        AbResult.AbResultData abResultData = getAbResultData(str);
        if (abResultData == null) {
            return AbResult.AbGroupStatus.UNKNOWN;
        }
        return abResultData.getGroupStatus();
    }

    public Map<String, Object> getParamsDataMap() {
        return this.mParamsDataMap;
    }

    public Map<String, Object> getPublishParamsData() {
        return this.mPublishParamsDataMap;
    }

    public String getTagFromParamsKey(String str) {
        AbResult.AbResultData abResultData = this.mAllDataMap.get(str);
        if (abResultData != null) {
            return abResultData.getTag();
        }
        return null;
    }

    public boolean isDyeing(String str) {
        String tagFromParamsKey = getTagFromParamsKey(str);
        if (TextUtils.isEmpty(tagFromParamsKey)) {
            return false;
        }
        return this.mDyeingTagSet.contains(tagFromParamsKey);
    }

    public void removeLastDyeingTag(String str) {
        if (!TextUtils.isEmpty(str) && this.mDyeingTagSet.remove(str)) {
            this.mDyeingTag = AbUtil.collectionToString(this.mDyeingTagSet);
        }
    }
}
