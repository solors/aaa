package com.learnings.abcenter.model.p402v6;

import com.learnings.abcenter.util.AbCenterUtil;
import com.learnings.abcenter.util.CheckUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.learnings.abcenter.model.v6.AbExpGroup */
/* loaded from: classes6.dex */
public class AbExpGroup {
    private Map<String, Object> groupData;
    private int groupIndex;
    private String groupTag;
    private boolean isClosed;

    public static AbExpGroup getFromJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            AbExpGroup abExpGroup = new AbExpGroup();
            abExpGroup.setGroupIndex(jSONObject.optInt("group_index"));
            abExpGroup.setGroupTag(AbCenterUtil.optString(jSONObject, "group_tag"));
            abExpGroup.setClosed(jSONObject.optBoolean("is_closed"));
            abExpGroup.setGroupData(AbValue.getGroupData(jSONObject));
            return abExpGroup;
        } catch (Throwable unused) {
            return null;
        }
    }

    public Map<String, Object> getGroupData() {
        return this.groupData;
    }

    public int getGroupIndex() {
        return this.groupIndex;
    }

    public String getGroupTag() {
        return this.groupTag;
    }

    public List<String> getKeyList() {
        ArrayList arrayList = new ArrayList();
        if (!CheckUtil.isMapNullOrEmpty(this.groupData)) {
            arrayList.addAll(this.groupData.keySet());
        }
        return arrayList;
    }

    public boolean isClosed() {
        return this.isClosed;
    }

    public void setClosed(boolean z) {
        this.isClosed = z;
    }

    public void setGroupData(Map<String, Object> map) {
        this.groupData = map;
    }

    public void setGroupIndex(int i) {
        this.groupIndex = i;
    }

    public void setGroupTag(String str) {
        this.groupTag = str;
    }
}
