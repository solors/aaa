package com.meevii.adsdk.common;

/* loaded from: classes6.dex */
public class ResponseAd {
    static long mAdTimeoutMs = 3600000;
    Object mAd;
    long mCreateTime = System.currentTimeMillis();
    RequestAd mRequestAd;

    public ResponseAd(RequestAd requestAd, Object obj) {
        this.mRequestAd = requestAd;
        this.mAd = obj;
    }

    public Object getAd() {
        return this.mAd;
    }

    public RequestAd getRequestAd() {
        return this.mRequestAd;
    }

    public boolean isExpired() {
        if (Math.abs(System.currentTimeMillis() - this.mCreateTime) > mAdTimeoutMs) {
            return true;
        }
        return false;
    }
}
