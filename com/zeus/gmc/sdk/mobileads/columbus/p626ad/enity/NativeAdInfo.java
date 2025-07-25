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
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.nativead.RtaProductInfo;
import com.zeus.gmc.sdk.mobileads.columbus.remote.module.util.TimeUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.enity.NativeAdInfo */
/* loaded from: classes8.dex */
public class NativeAdInfo extends AdInfoEntityBase {
    private static final long DEFAULT_EXPIRED_TIME = TimeUtils.ONE_MINUTE_IN_MS * 40;
    private static final double GSON_CONTENT_VERSION = 1.0d;
    private static final String TAG = "NativeAdInfo";
    @SerializedName("iconPath")
    @Expose
    private String iconPath;
    @SerializedName("imgPath")
    @Expose
    private String imgPath;
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
    @SerializedName("categoryName")
    @Expose
    private String mCategoryName;
    @SerializedName("landingPageUrl")
    @Expose
    private String mCustomActionUrl;
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
    @SerializedName("iconUrl")
    @Expose
    private String mIconImageUrl;
    @SerializedName("om")
    @Expose
    private List<OMEntity> mOMEntityList;
    @SerializedName("privacyToken")
    @Expose
    private String mPrivacyToken;
    @SerializedName("privacyUrl")
    @Expose
    private String mPrivacyUrl;
    @SerializedName("rtaProductInfos")
    @Expose
    private List<RtaProductInfo> mRtaProductInfos;
    @SerializedName("rtaType")
    @Expose
    private String mRtaType;
    @SerializedName("sku")
    @Expose
    private SkuInfo mSkuInfo;
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
    @SerializedName("sourceType")
    @Expose
    private int sourceType;
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
    @SerializedName("loadWhen")
    @Expose
    private int loadWhen = -1;
    @SerializedName("isLocalAd")
    @Expose
    private boolean mIsLocalAd = false;

    public String c222o2o2c2o() {
        return this.mAdBrand;
    }

    public List<String> c22ic() {
        return this.mViewMonitorUrls;
    }

    public String c22o22co22i() {
        return this.mAdDescription;
    }

    public List<DspWeightConfig> c2ccci2iii() {
        AdControl adControl = this.mAdControl;
        if (adControl != null) {
            return adControl.cicic();
        }
        return Collections.emptyList();
    }

    public GlobalAdStyle c2cciooo() {
        return this.mGlobalAdStyle;
    }

    public double c2ccocci() {
        return this.mAdStarRate;
    }

    public String c2cic2() {
        return this.mDspName;
    }

    public List<OMEntity> c2ic2icoi() {
        return this.mOMEntityList;
    }

    public int c2iiio() {
        return this.sourceType;
    }

    public void c2oc2i(int i) {
        this.sourceType = i;
    }

    public int c2ooc2c2() {
        return this.mTargetType;
    }

    public List<String> cc2iiooocc2() {
        return this.mClickMonitorUrls;
    }

    public String cc2o22co2c() {
        return this.mCustomActionUrl;
    }

    public List<RtaProductInfo> cccc2coi() {
        if (coic2cccc2()) {
            return this.mRtaProductInfos;
        }
        return Collections.emptyList();
    }

    public RtaProductInfo cccccioi() {
        if (coic2cccc2()) {
            return this.mRtaProductInfos.get(0);
        }
        return null;
    }

    public String ccci2() {
        return this.mDownloadPackageName;
    }

    public String cccoo22o2() {
        return this.iconPath;
    }

    public GetappsAppInfo cciccio() {
        return this.mGetappsAppInfo;
    }

    public int ccii2o2() {
        return this.loadWhen;
    }

    public boolean cciicii2o22() {
        int i;
        if (!this.mIsLocalAd && (i = this.sourceType) != 2 && i != 3) {
            return false;
        }
        return true;
    }

    public String ccoi2oo() {
        return this.mRtaType;
    }

    public String ccoio() {
        return this.mCategoryName;
    }

    public int ci22c2() {
        return this.mEndCardShowWay;
    }

    public boolean ci2cci2() {
        return true;
    }

    public String cicccco22cc() {
        return this.mSponsored;
    }

    public String cici2o2oo() {
        return this.mCallToAction;
    }

    public EndCardStyleInfo cicoic() {
        return this.mEndCardStyleInfo;
    }

    public boolean cii2co() {
        return TimeUtils.expired(this.mAdInfoLoadTime, this.mExpiredTime);
    }

    public AdChoice ciiiioccoc() {
        return this.mAdChoice;
    }

    public String ciiio2o() {
        if (cccccioi() != null && !TextUtils.isEmpty(cccccioi().getProductName())) {
            return cccccioi().getProductName();
        }
        return this.mTitle;
    }

    public JSONObject ciiioc2ioc() {
        JumpControl jumpControl = this.mAdJumpControl;
        if (jumpControl != null) {
            return jumpControl.toJson();
        }
        return null;
    }

    public String ciio2c() {
        if (cccccioi() != null && !TextUtils.isEmpty(cccccioi().getImgUrl())) {
            return cccccioi().getImgUrl();
        }
        if (!C32467cioccoiococ.coi222o222(this.mMainImageUrl)) {
            return this.mMainImageUrl.get(0);
        }
        return null;
    }

    public String cioc2() {
        return this.mIconImageUrl;
    }

    public VideoStyleInfo ciocicoc2() {
        return this.mVideoStyleInfo;
    }

    public String cioii2c22c2() {
        return this.mPrivacyToken;
    }

    public String cioiic() {
        return this.mDspBrand;
    }

    public SkuInfo co2c2o2() {
        return this.mSkuInfo;
    }

    public String coc22() {
        return this.mPrivacyUrl;
    }

    public boolean coc2coo() {
        return !TextUtils.isEmpty(this.mDownloadPackageName);
    }

    public long coccoi2() {
        AdControl adControl = this.mAdControl;
        if (adControl != null) {
            return adControl.ccoc2oic();
        }
        return 0L;
    }

    public void coi222o222(int i) {
        this.loadWhen = i;
    }

    public String coi2ccc2() {
        return this.imgPath;
    }

    public boolean coic2cccc2() {
        return !C32467cioccoiococ.coi222o222(this.mRtaProductInfos);
    }

    public void coo2iico(boolean z) {
        this.mIsLocalAd = z;
    }

    public String coocii() {
        if (TextUtils.isEmpty(this.mDownloadButtonUrl)) {
            return cc2o22co2c();
        }
        return this.mDownloadButtonUrl;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.GsonEntityBase
    protected String getTag() {
        return TAG;
    }

    public int getWeight() {
        return this.mWeight;
    }

    public static final NativeAdInfo coo2iico(JSONObject jSONObject) {
        return (NativeAdInfo) C32459ciii2coi2.coo2iico(NativeAdInfo.class, jSONObject.toString(), TAG);
    }

    public void c2oc2i(String str) {
        this.imgPath = str;
    }

    public void coi222o222(String str) {
        this.iconPath = str;
    }
}
