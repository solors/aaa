package com.pubmatic.sdk.common.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.maticoo.sdk.utils.constant.KeyConstants;
import com.pubmatic.sdk.common.utility.POBUtils;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class POBProfileInfo {
    public static final String COUNTRY_FILTERING_ALLOW_MODE = "include";
    public static final String COUNTRY_FILTERING_BLOCK_MODE = "exclude";

    /* renamed from: a */
    private int f70169a;

    /* renamed from: b */
    private int f70170b;

    /* renamed from: c */
    private int f70171c;
    @Nullable

    /* renamed from: f */
    private String f70174f;
    @Nullable

    /* renamed from: g */
    private Set<String> f70175g;
    @Nullable

    /* renamed from: h */
    private String f70176h;

    /* renamed from: e */
    private boolean f70173e = true;

    /* renamed from: d */
    private final long f70172d = System.currentTimeMillis();

    public static POBProfileInfo build(@NonNull JSONObject jSONObject) throws JSONException {
        POBProfileInfo pOBProfileInfo = new POBProfileInfo();
        pOBProfileInfo.f70169a = jSONObject.optInt(KeyConstants.RequestBody.KEY_PID);
        pOBProfileInfo.f70170b = jSONObject.optInt(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER);
        pOBProfileInfo.f70171c = jSONObject.optInt("pdvid");
        pOBProfileInfo.f70174f = jSONObject.optString("adserver");
        JSONObject optJSONObject = jSONObject.optJSONObject("ctFiltering");
        if (optJSONObject != null && optJSONObject.length() > 0) {
            pOBProfileInfo.f70176h = optJSONObject.optString("mode");
            pOBProfileInfo.f70175g = POBUtils.parseJsonArrayToSet(optJSONObject.optJSONArray("codes"));
        }
        boolean z = true;
        if (jSONObject.optInt("enableCrashAnalyticAndroid", 1) == 0) {
            z = false;
        }
        pOBProfileInfo.f70173e = z;
        return pOBProfileInfo;
    }

    @Nullable
    public String getAdServerName() {
        return this.f70174f;
    }

    @Nullable
    public String getCountryFilteringMode() {
        return this.f70176h;
    }

    public long getCreatedDateTime() {
        return this.f70172d;
    }

    @Nullable
    public Set<String> getFilteringCountries() {
        return this.f70175g;
    }

    public int getProfileId() {
        return this.f70169a;
    }

    public int getPublisherId() {
        return this.f70170b;
    }

    public int getVersionId() {
        return this.f70171c;
    }

    public boolean isCrashAnalyticsEnabled() {
        return this.f70173e;
    }

    public boolean isProfileInfoExpired() {
        if (System.currentTimeMillis() - this.f70172d > 86400000) {
            return true;
        }
        return false;
    }
}
