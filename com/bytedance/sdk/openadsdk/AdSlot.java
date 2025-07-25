package com.bytedance.sdk.openadsdk;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.p153iR.C6507IL;
import com.bytedance.sdk.component.utils.C7741PX;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class AdSlot {
    public static final int TYPE_BANNER = 1;
    public static final int TYPE_CACHED_SPLASH = 4;
    public static final int TYPE_FEED = 5;
    public static final int TYPE_FULL_SCREEN_VIDEO = 8;
    public static final int TYPE_INTERACTION_AD = 2;
    public static final int TYPE_OPEN_AD = 3;
    public static final int TYPE_REWARD_VIDEO = 7;
    private Map<String, Object> DDQ;

    /* renamed from: Fy */
    private int f17119Fy;

    /* renamed from: IL */
    private int f17120IL;
    private Bundle JAA;

    /* renamed from: Ja */
    private String f17121Ja;

    /* renamed from: Kg */
    private String f17122Kg;

    /* renamed from: LZ */
    private int f17123LZ;

    /* renamed from: Lq */
    private String f17124Lq;

    /* renamed from: PX */
    private int f17125PX;

    /* renamed from: Ta */
    private boolean f17126Ta;

    /* renamed from: Uw */
    private boolean f17127Uw;

    /* renamed from: VB */
    private String f17128VB;
    private String VzQ;

    /* renamed from: WR */
    private int f17129WR;

    /* renamed from: bX */
    private int f17130bX;

    /* renamed from: bg */
    private String f17131bg;

    /* renamed from: eo */
    private String f17132eo;
    private float eqN;

    /* renamed from: iR */
    private boolean f17133iR;
    private JSONArray kMt;
    private int ldr;
    private int rri;

    /* renamed from: tC */
    private int f17134tC;
    private String tuV;

    /* renamed from: vb */
    private String f17135vb;
    private String xxp;
    private boolean yDt;

    /* renamed from: zx */
    private float f17136zx;

    public static int getPosition(int i) {
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 4;
        }
        if (i != 3 && i != 4 && i != 7 && i != 8) {
            return 3;
        }
        return 5;
    }

    public static AdSlot getSlot(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Builder builder = new Builder();
        try {
            int optInt = jSONObject.optInt("mImgAcceptedWidth", 640);
            int optInt2 = jSONObject.optInt("mImgAcceptedHeight", 320);
            double optDouble = jSONObject.optDouble("mExpressViewAcceptedWidth", 0.0d);
            double optDouble2 = jSONObject.optDouble("mExpressViewAcceptedHeight", 0.0d);
            builder.setCodeId(jSONObject.optString("mCodeId", null));
            builder.setAdCount(jSONObject.optInt("mAdCount", 1));
            builder.setIsAutoPlay(jSONObject.optBoolean("mIsAutoPlay"));
            builder.setImageAcceptedSize(optInt, optInt2);
            builder.setExpressViewAcceptedSize(Double.valueOf(optDouble).floatValue(), Double.valueOf(optDouble2).floatValue());
            builder.setSupportDeepLink(jSONObject.optBoolean("mSupportDeepLink", false));
            builder.setRewardName(jSONObject.optString("mRewardName", null));
            builder.setRewardAmount(jSONObject.optInt("mRewardAmount"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra", null));
            builder.setUserID(jSONObject.optString("mUserID", null));
            builder.setNativeAdType(jSONObject.optInt("mNativeAdType"));
            builder.isExpressAd(jSONObject.optBoolean("mIsExpressAd"));
            builder.withBid(jSONObject.optString("mBidAdm"));
            builder.setAdId(jSONObject.optString("mAdId"));
            builder.setCreativeId(jSONObject.optString("mCreativeId"));
            builder.setExt(jSONObject.optString("mExt"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra"));
        } catch (Exception unused) {
        }
        AdSlot build = builder.build();
        build.setDurationSlotType(jSONObject.optInt("mDurationSlotType"));
        return build;
    }

    public int getAdCount() {
        return this.ldr;
    }

    public String getAdId() {
        return this.f17135vb;
    }

    public String getBidAdm() {
        return this.f17124Lq;
    }

    public JSONArray getBiddingTokens() {
        return this.kMt;
    }

    public String getCodeId() {
        return this.f17131bg;
    }

    public String getCreativeId() {
        return this.xxp;
    }

    public int getDurationSlotType() {
        return this.rri;
    }

    public float getExpressViewAcceptedHeight() {
        return this.f17136zx;
    }

    public float getExpressViewAcceptedWidth() {
        return this.eqN;
    }

    public String getExt() {
        return this.VzQ;
    }

    public int getImgAcceptedHeight() {
        return this.f17130bX;
    }

    public int getImgAcceptedWidth() {
        return this.f17120IL;
    }

    public int getIsRotateBanner() {
        return this.f17119Fy;
    }

    public String getLinkId() {
        return this.f17121Ja;
    }

    public String getMediaExtra() {
        return this.f17132eo;
    }

    public int getNativeAdType() {
        return this.f17125PX;
    }

    public Bundle getNetworkExtrasBundle() {
        return this.JAA;
    }

    @Nullable
    public Map<String, Object> getRequestExtraMap() {
        return this.DDQ;
    }

    @Deprecated
    public int getRewardAmount() {
        return this.f17129WR;
    }

    @Deprecated
    public String getRewardName() {
        return this.f17122Kg;
    }

    public int getRotateOrder() {
        return this.f17134tC;
    }

    public int getRotateTime() {
        return this.f17123LZ;
    }

    public String getUserData() {
        return this.tuV;
    }

    public String getUserID() {
        return this.f17128VB;
    }

    public boolean isAutoPlay() {
        return this.f17126Ta;
    }

    public boolean isExpressAd() {
        return this.yDt;
    }

    public boolean isPreload() {
        return this.f17127Uw;
    }

    public boolean isSupportDeepLink() {
        return this.f17133iR;
    }

    public void setAdCount(int i) {
        this.ldr = i;
    }

    public void setBiddingTokens(JSONArray jSONArray) {
        this.kMt = jSONArray;
    }

    public void setDurationSlotType(int i) {
        this.rri = i;
    }

    public void setIsRotateBanner(int i) {
        this.f17119Fy = i;
    }

    public void setNativeAdType(int i) {
        this.f17125PX = i;
    }

    public void setPreload(boolean z) {
        this.f17127Uw = z;
    }

    public void setRotateOrder(int i) {
        this.f17134tC = i;
    }

    public void setRotateTime(int i) {
        this.f17123LZ = i;
    }

    public void setUserData(String str) {
        this.tuV = str;
    }

    public JSONObject toJsonObj() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mCodeId", this.f17131bg);
            jSONObject.put("mAdCount", this.ldr);
            jSONObject.put("mIsAutoPlay", this.f17126Ta);
            jSONObject.put("mImgAcceptedWidth", this.f17120IL);
            jSONObject.put("mImgAcceptedHeight", this.f17130bX);
            jSONObject.put("mExpressViewAcceptedWidth", this.eqN);
            jSONObject.put("mExpressViewAcceptedHeight", this.f17136zx);
            jSONObject.put("mSupportDeepLink", this.f17133iR);
            jSONObject.put("mRewardName", this.f17122Kg);
            jSONObject.put("mRewardAmount", this.f17129WR);
            jSONObject.put("mMediaExtra", this.f17132eo);
            jSONObject.put("mUserID", this.f17128VB);
            jSONObject.put("mNativeAdType", this.f17125PX);
            jSONObject.put("mIsExpressAd", this.yDt);
            jSONObject.put("mAdId", this.f17135vb);
            jSONObject.put("mCreativeId", this.xxp);
            jSONObject.put("mExt", this.VzQ);
            jSONObject.put("mBidAdm", this.f17124Lq);
            jSONObject.put("mUserData", this.tuV);
            jSONObject.put("mDurationSlotType", this.rri);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public String toString() {
        return super.toString();
    }

    private AdSlot() {
        this.f17126Ta = true;
        this.yDt = false;
        this.f17119Fy = 0;
        this.f17123LZ = 0;
        this.f17134tC = 0;
    }

    /* loaded from: classes3.dex */
    public static class Builder {

        /* renamed from: Kg */
        private String f17139Kg;

        /* renamed from: LZ */
        private Bundle f17140LZ;

        /* renamed from: Lq */
        private String f17141Lq;

        /* renamed from: PX */
        private float f17142PX;

        /* renamed from: Ta */
        private boolean f17143Ta;

        /* renamed from: VB */
        private float f17144VB;
        private String VzQ;

        /* renamed from: bg */
        private String f17147bg;

        /* renamed from: eo */
        private int f17148eo;
        private int rri;

        /* renamed from: tC */
        private String f17150tC;

        /* renamed from: vb */
        private String f17151vb;
        private String xxp;
        private String yDt;

        /* renamed from: IL */
        private int f17138IL = 640;

        /* renamed from: bX */
        private int f17146bX = 320;
        private final boolean eqN = true;

        /* renamed from: zx */
        private int f17152zx = 1;
        private final String ldr = "";

        /* renamed from: iR */
        private final int f17149iR = 0;

        /* renamed from: WR */
        private String f17145WR = "defaultUser";
        private boolean tuV = true;

        /* renamed from: Fy */
        private Map<String, Object> f17137Fy = null;

        public AdSlot build() {
            AdSlot adSlot = new AdSlot();
            adSlot.f17131bg = this.f17147bg;
            adSlot.ldr = this.f17152zx;
            adSlot.f17133iR = true;
            adSlot.f17120IL = this.f17138IL;
            adSlot.f17130bX = this.f17146bX;
            float f = this.f17144VB;
            if (f <= 0.0f) {
                adSlot.eqN = this.f17138IL;
                adSlot.f17136zx = this.f17146bX;
            } else {
                adSlot.eqN = f;
                adSlot.f17136zx = this.f17142PX;
            }
            adSlot.f17122Kg = "";
            adSlot.f17129WR = 0;
            adSlot.f17132eo = this.f17139Kg;
            adSlot.f17128VB = this.f17145WR;
            adSlot.f17125PX = this.f17148eo;
            adSlot.f17126Ta = this.tuV;
            adSlot.yDt = this.f17143Ta;
            adSlot.f17124Lq = this.yDt;
            adSlot.f17135vb = this.f17141Lq;
            adSlot.xxp = this.f17151vb;
            adSlot.VzQ = this.xxp;
            adSlot.tuV = this.VzQ;
            adSlot.DDQ = this.f17137Fy;
            adSlot.f17121Ja = this.f17150tC;
            adSlot.rri = this.rri;
            return adSlot;
        }

        public Builder isExpressAd(boolean z) {
            this.f17143Ta = z;
            return this;
        }

        public Builder setAdCount(int i) {
            if (i <= 0) {
                i = 1;
            }
            if (i > 20) {
                i = 20;
            }
            this.f17152zx = i;
            return this;
        }

        public Builder setAdId(String str) {
            this.f17141Lq = str;
            return this;
        }

        public Builder setCodeId(String str) {
            this.f17147bg = str;
            return this;
        }

        public Builder setCreativeId(String str) {
            this.f17151vb = str;
            return this;
        }

        public Builder setDurationSlotType(int i) {
            this.rri = i;
            return this;
        }

        public Builder setExpressViewAcceptedSize(float f, float f2) {
            this.f17144VB = f;
            this.f17142PX = f2;
            return this;
        }

        public Builder setExt(String str) {
            this.xxp = str;
            return this;
        }

        public Builder setImageAcceptedSize(int i, int i2) {
            this.f17138IL = i;
            this.f17146bX = i2;
            return this;
        }

        public Builder setIsAutoPlay(boolean z) {
            this.tuV = z;
            return this;
        }

        public Builder setLinkId(String str) {
            this.f17150tC = str;
            return this;
        }

        public Builder setMediaExtra(String str) {
            this.f17139Kg = str;
            return this;
        }

        public Builder setNativeAdType(int i) {
            this.f17148eo = i;
            return this;
        }

        public Builder setNetworkExtrasBundle(Bundle bundle) {
            this.f17140LZ = bundle;
            return this;
        }

        public Builder setRequestExtraMap(Map<String, Object> map) {
            this.f17137Fy = map;
            return this;
        }

        public Builder setUserData(String str) {
            this.VzQ = str;
            return this;
        }

        public Builder setUserID(String str) {
            this.f17145WR = str;
            return this;
        }

        public Builder withBid(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (C7741PX.eqN()) {
                C6507IL.m91683bg(str);
            }
            this.yDt = str;
            return this;
        }

        @Deprecated
        public Builder setRewardAmount(int i) {
            return this;
        }

        @Deprecated
        public Builder setRewardName(String str) {
            return this;
        }

        @Deprecated
        public Builder setSupportDeepLink(boolean z) {
            return this;
        }
    }
}
