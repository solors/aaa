package com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity;

import android.text.TextUtils;
import com.zeus.gmc.sdk.mobileads.columbus.common.JumpControl;
import com.zeus.gmc.sdk.mobileads.columbus.gson.annotations.Expose;
import com.zeus.gmc.sdk.mobileads.columbus.gson.annotations.SerializedName;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32459ciii2coi2;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32467cioccoiococ;
import com.zeus.gmc.sdk.mobileads.columbus.remote.module.util.TimeUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.enity.BannerAdInfo */
/* loaded from: classes8.dex */
public class BannerAdInfo extends AdInfoEntityBase {
    private static final long DEFAULT_EXPIRED_TIME = TimeUtils.ONE_MINUTE_IN_MS * 40;
    private static final double GSON_CONTENT_VERSION = 1.0d;
    private static final String TAG = "BannerAdInfo";
    @SerializedName("summary")
    @Expose
    private String mAdDescription;
    @SerializedName("jumpControl")
    @Expose
    private JumpControl mAdJumpControl;
    @SerializedName("adStarRate")
    @Expose
    private double mAdStarRate;
    @SerializedName("bannerRefreshInterval")
    @Expose
    private int mBannerRefreshInterval;
    @SerializedName("buttonName")
    @Expose
    private String mCallToAction;
    @SerializedName("packageName")
    @Expose
    private String mDownloadPackageName;
    @SerializedName("dspBrand")
    @Expose
    private String mDspBrand;
    @SerializedName("dspName")
    @Expose
    private String mDspName;
    @SerializedName("height")
    @Expose
    private int mHeight;
    private String mHiJackUrl;
    @SerializedName("iconUrl")
    @Expose
    private String mIconImageUrl;
    @SerializedName("landingPageUrl")
    @Expose
    private String mLandingPageUrl;
    @SerializedName("om")
    @Expose
    private List<OMEntity> mOMEntityList;
    @SerializedName("privacyToken")
    @Expose
    private String mPrivacyToken;
    @SerializedName("privacyUrl")
    @Expose
    private String mPrivacyUrl;
    @SerializedName("adMark")
    @Expose
    private String mSponsored;
    @SerializedName("targetType")
    @Expose
    private int mTargetType;
    @SerializedName("template")
    @Expose
    private String mTemplate;
    @SerializedName("title")
    @Expose
    private String mTitle;
    @SerializedName("width")
    @Expose
    private int mWidth;
    private long mAdInfoLoadTime = System.currentTimeMillis();
    private long mExpiredTime = DEFAULT_EXPIRED_TIME;
    @SerializedName("viewMonitorUrls")
    @Expose
    private List<String> mViewMonitorUrls = new ArrayList();
    @SerializedName("clickMonitorUrls")
    @Expose
    private List<String> mClickMonitorUrls = new ArrayList();
    @SerializedName("imgUrls")
    @Expose
    private List<String> mMainImageUrl = new ArrayList();

    public static final BannerAdInfo coo2iico(JSONObject jSONObject) {
        return (BannerAdInfo) C32459ciii2coi2.coo2iico(BannerAdInfo.class, jSONObject.toString(), TAG);
    }

    public String c222o2o2c2o() {
        return this.mCallToAction;
    }

    public String c22o22co22i() {
        return this.mAdDescription;
    }

    public List<OMEntity> c2ccci2iii() {
        return this.mOMEntityList;
    }

    public String c2cciooo() {
        return this.mTemplate;
    }

    public String c2ccocci() {
        return this.mTitle;
    }

    public String c2cic2() {
        return this.mLandingPageUrl;
    }

    public boolean c2ic2icoi() {
        return !TextUtils.isEmpty(this.mDownloadPackageName);
    }

    public String cc2iiooocc2() {
        return this.mDownloadPackageName;
    }

    public String cc2o22co2c() {
        return this.mDspBrand;
    }

    public int ccci2() {
        return this.mHeight;
    }

    public List<String> cccoo22o2() {
        return this.mViewMonitorUrls;
    }

    public int cciccio() {
        return this.mTargetType;
    }

    public boolean ccii2o2() {
        return TimeUtils.expired(this.mAdInfoLoadTime, this.mExpiredTime);
    }

    public List<String> ccoio() {
        return this.mClickMonitorUrls;
    }

    public String ci22c2() {
        return this.mPrivacyToken;
    }

    public String cici2o2oo() {
        if (!C32467cioccoiococ.coi222o222(this.mMainImageUrl)) {
            return this.mMainImageUrl.get(0);
        }
        return null;
    }

    public String cicoic() {
        return this.mPrivacyUrl;
    }

    public int ciiio2o() {
        return this.mBannerRefreshInterval;
    }

    public double ciiioc2ioc() {
        return this.mAdStarRate;
    }

    public String ciio2c() {
        return this.mIconImageUrl;
    }

    public JSONObject cioc2() {
        return this.mAdJumpControl.toJson();
    }

    public String cioiic() {
        return this.mHiJackUrl;
    }

    public String coccoi2() {
        return this.mSponsored;
    }

    public void coi222o222(String str) {
        this.mHiJackUrl = str;
    }

    public int coi2ccc2() {
        return this.mWidth;
    }

    public String coocii() {
        return this.mDspName;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.GsonEntityBase
    protected String getTag() {
        return TAG;
    }
}
