package com.maticoo.sdk.core.bidding;

/* loaded from: classes6.dex */
public class MaticooBiddingResult {
    private float ecpm;
    private String nurl;
    private String requestId;

    public float getEcpm() {
        return this.ecpm;
    }

    public String getNurl() {
        return this.nurl;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setEcpm(float f) {
        this.ecpm = f;
    }

    public void setNurl(String str) {
        this.nurl = str;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public String toString() {
        return "BidResult{requestId='" + this.requestId + "', ecpm=" + this.ecpm + ", nurl='" + this.nurl + "'}";
    }
}
