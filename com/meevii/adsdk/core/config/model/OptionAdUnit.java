package com.meevii.adsdk.core.config.model;

import com.ironsource.C21059u3;
import com.learnings.abcenter.util.AbCenterUtil;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class OptionAdUnit {
    private String adType;
    private String adUnitId;
    private List<AttachNetwork> attachNetwork;
    private double bidFloor;
    private String groupName;
    private String idType;
    private String paymentNetwork;
    private double price;
    private int priority;
    private String requestNetwork;
    private int retryType;
    private Segment segment;

    private static List<AttachNetwork> getAttachNetworkListFromJson(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(AttachNetwork.getFromJson(jSONArray.optJSONObject(i)));
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static OptionAdUnit getFromJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            OptionAdUnit optionAdUnit = new OptionAdUnit();
            optionAdUnit.setAdType(AbCenterUtil.optString(jSONObject, "adType"));
            optionAdUnit.setAdUnitId(AbCenterUtil.optString(jSONObject, "adUnitId"));
            optionAdUnit.setGroupName(AbCenterUtil.optString(jSONObject, "groupName"));
            optionAdUnit.setIdType(AbCenterUtil.optString(jSONObject, "idType"));
            optionAdUnit.setPriority(jSONObject.optInt("priority"));
            optionAdUnit.setRequestNetwork(AbCenterUtil.optString(jSONObject, "requestNetwork"));
            optionAdUnit.setPaymentNetwork(AbCenterUtil.optString(jSONObject, "paymentNetwork"));
            optionAdUnit.setPrice(jSONObject.optDouble("price", 0.0d));
            optionAdUnit.setBidFloor(jSONObject.optDouble("bidFloor", 0.0d));
            optionAdUnit.setRetryType(jSONObject.optInt("retryType"));
            optionAdUnit.setAttachNetwork(getAttachNetworkListFromJson(jSONObject.optJSONArray("attachNetwork")));
            optionAdUnit.setSegment(Segment.getFromJson(jSONObject.optJSONObject(C21059u3.f53755i)));
            return optionAdUnit;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getAdType() {
        return this.adType;
    }

    public String getAdUnitId() {
        return this.adUnitId;
    }

    public List<AttachNetwork> getAttachNetwork() {
        return this.attachNetwork;
    }

    public double getBidFloor() {
        return this.bidFloor;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public String getIdType() {
        return this.idType;
    }

    public String getPaymentNetwork() {
        return this.paymentNetwork;
    }

    public double getPrice() {
        return this.price;
    }

    public int getPriority() {
        return this.priority;
    }

    public String getRequestNetwork() {
        return this.requestNetwork;
    }

    public int getRetryType() {
        return this.retryType;
    }

    public Segment getSegment() {
        return this.segment;
    }

    public void setAdType(String str) {
        this.adType = str;
    }

    public void setAdUnitId(String str) {
        this.adUnitId = str;
    }

    public void setAttachNetwork(List<AttachNetwork> list) {
        this.attachNetwork = list;
    }

    public void setBidFloor(double d) {
        this.bidFloor = d;
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }

    public void setIdType(String str) {
        this.idType = str;
    }

    public void setPaymentNetwork(String str) {
        this.paymentNetwork = str;
    }

    public void setPrice(double d) {
        this.price = d;
    }

    public void setPriority(int i) {
        this.priority = i;
    }

    public void setRequestNetwork(String str) {
        this.requestNetwork = str;
    }

    public void setRetryType(int i) {
        this.retryType = i;
    }

    public void setSegment(Segment segment) {
        this.segment = segment;
    }
}
