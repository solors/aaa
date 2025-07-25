package com.learnings.abcenter.model.p402v6;

import android.text.TextUtils;
import com.learnings.abcenter.util.AbCenterUtil;
import com.learnings.abcenter.util.CheckUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.learnings.abcenter.model.v6.AbFlowDomainTree */
/* loaded from: classes6.dex */
public class AbFlowDomainTree {
    private List<AbFlowDomainTree> childrenDomainList;
    private Map<String, AbFlowDomainTree> childrenDomainMap;
    private String domainTag;
    private List<String> flowDomainBucketList;

    /* renamed from: id */
    private String f54849id;
    private boolean keepHitting;

    public static List<AbFlowDomainTree> getAbFlowDomainTreeListFromJson(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(getFromJson(jSONArray.optJSONObject(i)));
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static AbFlowDomainTree getFromJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            AbFlowDomainTree abFlowDomainTree = new AbFlowDomainTree();
            abFlowDomainTree.setId(AbCenterUtil.optString(jSONObject, "id"));
            abFlowDomainTree.setDomainTag(AbCenterUtil.optString(jSONObject, "domain_tag"));
            abFlowDomainTree.setKeepHitting(jSONObject.optBoolean("keep_hitting"));
            abFlowDomainTree.setFlowDomainBucketList(AbCenterUtil.jsonArrayToStringList(jSONObject.optJSONArray("flow_domain_buckets")));
            abFlowDomainTree.setChildrenDomainList(getAbFlowDomainTreeListFromJson(jSONObject.optJSONArray("children_domains")));
            return abFlowDomainTree;
        } catch (Throwable unused) {
            return null;
        }
    }

    public List<AbFlowDomainTree> getChildrenDomainList() {
        return this.childrenDomainList;
    }

    public AbFlowDomainTree getChildrenFlowDomain(String str) {
        if (this.childrenDomainMap == null) {
            this.childrenDomainMap = new HashMap();
            if (!CheckUtil.isListNullOrEmpty(this.childrenDomainList)) {
                for (AbFlowDomainTree abFlowDomainTree : this.childrenDomainList) {
                    if (abFlowDomainTree != null) {
                        String domainTag = abFlowDomainTree.getDomainTag();
                        if (!TextUtils.isEmpty(domainTag)) {
                            this.childrenDomainMap.put(domainTag, abFlowDomainTree);
                        }
                    }
                }
            }
        }
        return this.childrenDomainMap.get(str);
    }

    public String getDomainTag() {
        return this.domainTag;
    }

    public List<String> getFlowDomainBucketList() {
        return this.flowDomainBucketList;
    }

    public String getId() {
        return this.f54849id;
    }

    public boolean isKeepHitting() {
        return this.keepHitting;
    }

    public void setChildrenDomainList(List<AbFlowDomainTree> list) {
        this.childrenDomainList = list;
    }

    public void setDomainTag(String str) {
        this.domainTag = str;
    }

    public void setFlowDomainBucketList(List<String> list) {
        this.flowDomainBucketList = list;
    }

    public void setId(String str) {
        this.f54849id = str;
    }

    public void setKeepHitting(boolean z) {
        this.keepHitting = z;
    }
}
