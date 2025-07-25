package com.maticoo.sdk.utils.model;

import com.maticoo.sdk.utils.SdkUtil;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class InteractInfo {
    private List<String> domainsList;

    /* renamed from: id */
    private String f55036id;
    private int intervalTime;

    public static InteractInfo jsonToAd(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        InteractInfo interactInfo = new InteractInfo();
        interactInfo.setId(String.valueOf(jSONObject.optInt("id")));
        interactInfo.setIntervalTime(jSONObject.optInt("ri"));
        JSONArray optJSONArray = jSONObject.optJSONArray("domains");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(optJSONArray.optString(i));
            }
        }
        SdkUtil.setInternalHosts(arrayList);
        interactInfo.setDomainsList(arrayList);
        return interactInfo;
    }

    public List<String> getDomainsList() {
        return this.domainsList;
    }

    public String getId() {
        return this.f55036id;
    }

    public int getIntervalTime() {
        return this.intervalTime;
    }

    public void setDomainsList(List<String> list) {
        this.domainsList = list;
    }

    public void setId(String str) {
        this.f55036id = str;
    }

    public void setIntervalTime(int i) {
        this.intervalTime = i;
    }
}
