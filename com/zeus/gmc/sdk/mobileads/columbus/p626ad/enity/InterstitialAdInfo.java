package com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity;

import android.text.TextUtils;
import com.zeus.gmc.sdk.mobileads.columbus.common.AdChoice;
import com.zeus.gmc.sdk.mobileads.columbus.common.AdControl;
import com.zeus.gmc.sdk.mobileads.columbus.common.Constants;
import com.zeus.gmc.sdk.mobileads.columbus.common.DspWeightConfig;
import com.zeus.gmc.sdk.mobileads.columbus.common.EndCardStyleInfo;
import com.zeus.gmc.sdk.mobileads.columbus.common.GetappsAppInfo;
import com.zeus.gmc.sdk.mobileads.columbus.common.GlobalAdStyle;
import com.zeus.gmc.sdk.mobileads.columbus.common.JumpControl;
import com.zeus.gmc.sdk.mobileads.columbus.common.VideoStyleInfo;
import com.zeus.gmc.sdk.mobileads.columbus.gson.annotations.Expose;
import com.zeus.gmc.sdk.mobileads.columbus.gson.annotations.SerializedName;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32459ciii2coi2;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32467cioccoiococ;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.interstitialad.CreativeOrientation;
import com.zeus.gmc.sdk.mobileads.columbus.remote.module.util.TimeUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.enity.InterstitialAdInfo */
/* loaded from: classes8.dex */
public class InterstitialAdInfo extends AdInfoEntityBase {
    private static final long DEFAULT_EXPIRED_TIME = TimeUtils.ONE_MINUTE_IN_MS * 40;
    private static final double GSON_CONTENT_VERSION = 1.0d;
    private static final String TAG = "InterstitialAdInfo";
    @SerializedName("brand")
    @Expose
    private String mAdBrand;
    @SerializedName("adChoices")
    @Expose
    private AdChoice mAdChoice;
    @SerializedName("adControl")
    @Expose
    private AdControl mAdControl;
    @SerializedName("summary")
    @Expose
    private String mAdDescription;
    @SerializedName("jumpControl")
    @Expose
    private JumpControl mAdJumpControl;
    @SerializedName("adStarRate")
    @Expose
    private double mAdStarRate;
    @SerializedName("buttonName")
    @Expose
    private String mCallToAction;
    @SerializedName("downloadButtonUrl")
    @Expose
    private String mDownloadButtonUrl;
    @SerializedName("packageName")
    @Expose
    private String mDownloadPackageName;
    @SerializedName("dspBrand")
    @Expose
    private String mDspBrand;
    @SerializedName("dspName")
    @Expose
    private String mDspName;
    @SerializedName(Constants.ENDCARD_SHOW_WAY)
    @Expose
    private int mEndCardShowWay;
    @SerializedName("endCardStyleInfo")
    @Expose
    private EndCardStyleInfo mEndCardStyleInfo;
    @SerializedName("getappsAppInfo")
    @Expose
    private GetappsAppInfo mGetappsAppInfo;
    @SerializedName("globalAdStyle")
    @Expose
    private GlobalAdStyle mGlobalAdStyle;
    @SerializedName("hadClose")
    @Expose
    private boolean mHadClose;
    private String mHiJackUrl;
    @SerializedName("iconUrl")
    @Expose
    private String mIconImageUrl;
    @SerializedName("intersType")
    @Expose
    private int mIntersType;
    @SerializedName("isAdLabel")
    @Expose
    private int mIsAdLabel;
    @SerializedName("landingPageUrl")
    @Expose
    private String mLandingPageUrl;
    @SerializedName("om")
    @Expose
    private List<OMEntity> mOMEntityList;
    @SerializedName("orientation")
    @Expose
    private int mOrientation;
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
    @SerializedName("title")
    @Expose
    private String mTitle;
    @SerializedName("videoStyleInfo")
    @Expose
    private VideoStyleInfo mVideoStyleInfo;
    @SerializedName("weight")
    @Expose
    private int mWeight;
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

    public static final InterstitialAdInfo coo2iico(JSONObject jSONObject) {
        return (InterstitialAdInfo) C32459ciii2coi2.coo2iico(InterstitialAdInfo.class, jSONObject.toString(), TAG);
    }

    public String c222o2o2c2o() {
        return this.mAdBrand;
    }

    public String c22o22co22i() {
        return this.mAdDescription;
    }

    public EndCardStyleInfo c2ccci2iii() {
        return this.mEndCardStyleInfo;
    }

    public int c2cciooo() {
        return this.mIntersType;
    }

    public double c2ccocci() {
        return this.mAdStarRate;
    }

    public int c2cic2() {
        return this.mEndCardShowWay;
    }

    public List<OMEntity> c2ic2icoi() {
        return this.mOMEntityList;
    }

    public List<String> c2iiio() {
        return this.mViewMonitorUrls;
    }

    public boolean c2ooc2c2() {
        return TimeUtils.expired(this.mAdInfoLoadTime, this.mExpiredTime);
    }

    public String cc2iiooocc2() {
        if (TextUtils.isEmpty(this.mDownloadButtonUrl)) {
            return ccii2o2();
        }
        return this.mDownloadButtonUrl;
    }

    public String cc2o22co2c() {
        return this.mDownloadPackageName;
    }

    public String cccc2coi() {
        return this.mSponsored;
    }

    public String cccccioi() {
        return this.mPrivacyUrl;
    }

    public String ccci2() {
        return this.mDspName;
    }

    public int cccoo22o2() {
        return this.mIsAdLabel;
    }

    public String cciccio() {
        return this.mHiJackUrl;
    }

    public String ccii2o2() {
        return this.mLandingPageUrl;
    }

    public int ccoi2oo() {
        return this.mTargetType;
    }

    public List<String> ccoio() {
        return this.mClickMonitorUrls;
    }

    public GetappsAppInfo ci22c2() {
        return this.mGetappsAppInfo;
    }

    public AdChoice cicccco22cc() {
        return this.mAdChoice;
    }

    public String cici2o2oo() {
        return this.mCallToAction;
    }

    public GlobalAdStyle cicoic() {
        return this.mGlobalAdStyle;
    }

    public String ciiio2o() {
        return this.mTitle;
    }

    public JSONObject ciiioc2ioc() {
        return this.mAdJumpControl.toJson();
    }

    public String ciio2c() {
        if (!C32467cioccoiococ.coi222o222(this.mMainImageUrl)) {
            return this.mMainImageUrl.get(0);
        }
        return null;
    }

    public String cioc2() {
        return this.mIconImageUrl;
    }

    public boolean ciocicoc2() {
        return !TextUtils.isEmpty(this.mDownloadPackageName);
    }

    public CreativeOrientation cioii2c22c2() {
        return CreativeOrientation.fromHeader(this.mOrientation);
    }

    public List<DspWeightConfig> cioiic() {
        AdControl adControl = this.mAdControl;
        if (adControl != null) {
            return adControl.cicic();
        }
        return null;
    }

    public VideoStyleInfo co2c2o2() {
        return this.mVideoStyleInfo;
    }

    public String coc22() {
        return this.mPrivacyToken;
    }

    public boolean coccoi2() {
        return this.mHadClose;
    }

    public void coi222o222(String str) {
        this.mHiJackUrl = str;
    }

    public JumpControl coi2ccc2() {
        return this.mAdJumpControl;
    }

    public String coocii() {
        return this.mDspBrand;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.GsonEntityBase
    protected String getTag() {
        return TAG;
    }

    public int getWeight() {
        return this.mWeight;
    }
}
