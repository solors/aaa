package com.pubmatic.sdk.openwrap.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.p047a.p048a.p071o.p073b.SignedToken;
import com.applovin.mediation.openwrap.ALPubMaticOpenWrapConstants;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.openwrap.core.POBRequest;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class POBImpression {
    @Nullable

    /* renamed from: a */
    private Map<String, List<String>> f70623a;
    @NonNull
    protected POBRequest.AdPosition adPosition;
    @NonNull
    protected final String adUnitId;
    @Nullable

    /* renamed from: b */
    private POBBanner f70624b;
    @Nullable

    /* renamed from: c */
    private POBVideo f70625c;
    @Nullable

    /* renamed from: d */
    private POBNative f70626d;

    /* renamed from: e */
    private boolean f70627e;

    /* renamed from: f */
    private boolean f70628f;
    @Nullable
    protected String gpid;
    @NonNull

    /* renamed from: id */
    protected final String f70629id;
    @Nullable
    protected String pmZoneId;
    @Nullable
    protected String testCreativeId;

    public POBImpression(@NonNull String str, @NonNull String str2) {
        this.f70629id = str;
        this.adUnitId = str2;
        this.adPosition = POBRequest.AdPosition.UNKNOWN;
    }

    @Nullable
    /* renamed from: a */
    Map<String, List<String>> m40309a() {
        return this.f70623a;
    }

    @Nullable
    /* renamed from: b */
    String m40308b() {
        return this.pmZoneId;
    }

    @NonNull
    public POBRequest.AdPosition getAdPosition() {
        return this.adPosition;
    }

    @NonNull
    public String getAdUnitId() {
        return this.adUnitId;
    }

    @Nullable
    public POBBanner getBanner() {
        return this.f70624b;
    }

    @Nullable
    protected String getCustomData() {
        Map<String, List<String>> m40309a = m40309a();
        if (m40309a != null && !m40309a.isEmpty()) {
            StringBuilder sb2 = null;
            for (String str : m40309a.keySet()) {
                if (sb2 == null) {
                    sb2 = new StringBuilder();
                } else {
                    sb2.append(SignedToken.f2767c);
                }
                sb2.append(str);
                sb2.append("=");
                List<String> list = m40309a.get(str);
                if (list != null) {
                    int i = 0;
                    for (String str2 : list) {
                        if (i > 0) {
                            sb2.append(",");
                        }
                        sb2.append(str2);
                        i++;
                    }
                }
            }
            if (sb2 != null) {
                return sb2.toString();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Nullable
    public JSONObject getExtJson(@Nullable JSONArray jSONArray) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (jSONArray != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("keywords", jSONArray);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.putOpt("pubmatic", jSONObject2);
                jSONObject.putOpt("bidder", jSONObject3);
            }
            if (!POBUtils.isNullOrEmpty(this.gpid)) {
                jSONObject.putOpt(ALPubMaticOpenWrapConstants.GPID, this.gpid);
            } else if (!POBUtils.isNullOrEmpty(this.adUnitId)) {
                jSONObject.putOpt(ALPubMaticOpenWrapConstants.GPID, this.adUnitId);
            }
            if (this.f70628f) {
                jSONObject.putOpt(Reporting.EventType.REWARD, 1);
            }
            return jSONObject;
        } catch (JSONException unused) {
            POBLog.warn("POBImpression", "Not able to generate Ext Json.", new Object[0]);
            return null;
        }
    }

    @NonNull
    public String getId() {
        return this.f70629id;
    }

    @NonNull
    public JSONObject getImpressionJson() throws JSONException {
        JSONArray jSONArray;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.f70629id);
        if (POBInstanceProvider.getSdkConfig().isUseInternalBrowser()) {
            jSONObject.put("clickbrowser", 0);
        } else {
            jSONObject.put("clickbrowser", 1);
        }
        jSONObject.put("displaymanager", "PubMatic_OpenWrap_SDK");
        jSONObject.put("displaymanagerver", "4.4.0");
        jSONObject.put("tagid", this.adUnitId);
        String m40308b = m40308b();
        if (!POBUtils.isNullOrEmpty(m40308b)) {
            jSONArray = new JSONArray();
            jSONArray.put(putKeyValueObject("pmZoneId", m40308b));
        } else {
            jSONArray = null;
        }
        String testCreativeId = getTestCreativeId();
        if (!POBUtils.isNullOrEmpty(testCreativeId)) {
            if (jSONArray == null) {
                jSONArray = new JSONArray();
            }
            jSONArray.put(putKeyValueObject("testcrid", testCreativeId));
        }
        String customData = getCustomData();
        if (customData != null) {
            if (jSONArray == null) {
                jSONArray = new JSONArray();
            }
            jSONArray.put(putKeyValueObject("dctr", customData));
        }
        JSONObject extJson = getExtJson(jSONArray);
        if (extJson != null && extJson.length() > 0) {
            jSONObject.putOpt("ext", extJson);
        }
        jSONObject.put("secure", POBInstanceProvider.getSdkConfig().isRequestSecureCreative() ? 1 : 0);
        POBBanner pOBBanner = this.f70624b;
        if (pOBBanner != null) {
            pOBBanner.setAdPosition(this.adPosition);
            POBBanner pOBBanner2 = this.f70624b;
            jSONObject.put("banner", pOBBanner2.getRTBJson(pOBBanner2.getSupportedAPIs(false), false));
        }
        POBVideo pOBVideo = this.f70625c;
        if (pOBVideo != null) {
            pOBVideo.setPosition(this.adPosition);
            jSONObject.put("video", this.f70625c.getRTBJson());
        }
        POBNative pOBNative = this.f70626d;
        if (pOBNative != null) {
            jSONObject.put("native", pOBNative.getRTBJson());
        }
        jSONObject.put("instl", this.f70627e ? 1 : 0);
        return jSONObject;
    }

    @Nullable
    public POBNative getNative() {
        return this.f70626d;
    }

    @Nullable
    public String getTestCreativeId() {
        return this.testCreativeId;
    }

    @Nullable
    public POBVideo getVideo() {
        return this.f70625c;
    }

    public boolean isInterstitial() {
        return this.f70627e;
    }

    public boolean isRewardedAd() {
        return this.f70628f;
    }

    @NonNull
    protected JSONObject putKeyValueObject(@Nullable String str, @Nullable Object... objArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("key", str);
            jSONObject.putOpt("value", new JSONArray(objArr));
        } catch (JSONException unused) {
            POBLog.warn("POBImpression", "Not able to generate Json with key/value pair.", new Object[0]);
        }
        return jSONObject;
    }

    public void setAdPosition(@NonNull POBRequest.AdPosition adPosition) {
        this.adPosition = adPosition;
    }

    public void setBanner(@Nullable POBBanner pOBBanner) {
        this.f70624b = pOBBanner;
    }

    public void setCustomParam(@Nullable Map<String, List<String>> map) {
        this.f70623a = map;
    }

    public void setGpid(@NonNull String str) {
        this.gpid = str;
    }

    public void setInterstitial(boolean z) {
        this.f70627e = z;
    }

    public void setNative(@Nullable POBNative pOBNative) {
        this.f70626d = pOBNative;
    }

    public void setPMZoneId(@Nullable String str) {
        this.pmZoneId = str;
    }

    public void setTestCreativeId(@Nullable String str) {
        this.testCreativeId = str;
    }

    public void setVideo(@Nullable POBVideo pOBVideo) {
        this.f70625c = pOBVideo;
    }

    public POBImpression(@NonNull String str, @NonNull String str2, boolean z, boolean z2) {
        this(str, str2);
        this.f70628f = z;
        this.f70627e = z2;
    }
}
