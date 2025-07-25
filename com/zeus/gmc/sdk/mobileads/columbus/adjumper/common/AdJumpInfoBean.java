package com.zeus.gmc.sdk.mobileads.columbus.adjumper.common;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class AdJumpInfoBean implements Serializable {
    private int browserType;
    private String cosdkVersion;
    private String creativeType;
    private long mAdId;
    private JSONObject mAdJumpControl;
    private String mAppClientId;
    private String mAppRef;
    private String mAppSignature;
    private Map<String, String> mCustomMap;
    private String mDeepLink;
    private String mDownloadPackageName;
    private String mDspName;
    private String mEx;
    private String mLandingPageUrl;
    private int mMaxJumpTimes;
    private String mNonce;
    private String mTagID;
    private int mTargetType;

    /* loaded from: classes8.dex */
    public static final class Builder {
        private long adId;
        private String appClientId;
        private String appRef;
        private String appSignature;
        private int browserType;
        private String cosdkVersion;
        private String creativeType;
        private Map<String, String> customMap = new HashMap();
        private String deeplink;
        private String downloadPackageName;
        private String dspName;

        /* renamed from: ex */
        private String f89357ex;
        private String landingPageUrl;
        private JSONObject mAdJumpControl;
        private int maxJumptimes;
        private String nonce;
        private String tagID;
        private int targetType;

        public AdJumpInfoBean build() {
            return new AdJumpInfoBean(this);
        }

        public Builder setAdId(long j) {
            this.adId = j;
            return this;
        }

        public Builder setAdJumpControl(JSONObject jSONObject) {
            this.mAdJumpControl = jSONObject;
            return this;
        }

        public Builder setAppClientId(String str) {
            this.appClientId = str;
            return this;
        }

        public Builder setAppRef(String str) {
            this.appRef = str;
            return this;
        }

        public Builder setAppSignature(String str) {
            this.appSignature = str;
            return this;
        }

        public Builder setBrowserType(int i) {
            this.browserType = i;
            return this;
        }

        public Builder setCosdkVersion(String str) {
            this.cosdkVersion = str;
            return this;
        }

        public Builder setCreativeType(String str) {
            this.creativeType = str;
            return this;
        }

        public Builder setCustomMap(String str, String str2) {
            if (this.customMap == null) {
                this.customMap = new HashMap();
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                this.customMap.put(str, str2);
            }
            return this;
        }

        public Builder setDeeplink(String str) {
            this.deeplink = str;
            return this;
        }

        public Builder setDownloadPackageName(String str) {
            this.downloadPackageName = str;
            return this;
        }

        public Builder setDspName(String str) {
            this.dspName = str;
            return this;
        }

        public Builder setEx(String str) {
            this.f89357ex = str;
            return this;
        }

        public Builder setLandingPageUrl(String str) {
            this.landingPageUrl = str;
            return this;
        }

        public Builder setMaxJumptimes(int i) {
            this.maxJumptimes = i;
            return this;
        }

        public Builder setNonce(String str) {
            this.nonce = str;
            return this;
        }

        public Builder setTagID(String str) {
            this.tagID = str;
            return this;
        }

        public Builder setTargetType(int i) {
            this.targetType = i;
            return this;
        }
    }

    public long getAdId() {
        return this.mAdId;
    }

    public JSONObject getAdJumpControl() {
        return this.mAdJumpControl;
    }

    public String getAppClientId() {
        return this.mAppClientId;
    }

    public String getAppRef() {
        return this.mAppRef;
    }

    public String getAppSignature() {
        return this.mAppSignature;
    }

    public int getBrowserType() {
        return this.browserType;
    }

    public String getCosdkVersion() {
        return this.cosdkVersion;
    }

    public String getCreativeType() {
        return this.creativeType;
    }

    public Map<String, String> getCustomMap() {
        return this.mCustomMap;
    }

    public String getDeeplink() {
        return this.mDeepLink;
    }

    public String getDownloadPackageName() {
        return this.mDownloadPackageName;
    }

    public String getDspName() {
        return this.mDspName;
    }

    public String getEx() {
        return this.mEx;
    }

    public String getLandingPageUrl() {
        return this.mLandingPageUrl;
    }

    public int getMaxJumpTimes() {
        return this.mMaxJumpTimes;
    }

    public String getNonce() {
        return this.mNonce;
    }

    public String getTagID() {
        return this.mTagID;
    }

    public int getTargetType() {
        return this.mTargetType;
    }

    private AdJumpInfoBean(Builder builder) {
        this.mTargetType = builder.targetType;
        this.mMaxJumpTimes = builder.maxJumptimes;
        this.mAdId = builder.adId;
        this.mLandingPageUrl = builder.landingPageUrl;
        this.mDownloadPackageName = builder.downloadPackageName;
        this.mDspName = builder.dspName;
        this.mAppRef = builder.appRef;
        this.mAppClientId = builder.appClientId;
        this.mAppSignature = builder.appSignature;
        this.mNonce = builder.nonce;
        this.mDeepLink = builder.deeplink;
        this.mAdJumpControl = builder.mAdJumpControl;
        this.mTagID = builder.tagID;
        this.mEx = builder.f89357ex;
        this.browserType = builder.browserType;
        this.cosdkVersion = builder.cosdkVersion;
        this.creativeType = builder.creativeType;
        this.mCustomMap = builder.customMap;
    }
}
