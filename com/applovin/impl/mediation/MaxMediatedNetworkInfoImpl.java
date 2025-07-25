package com.applovin.impl.mediation;

import androidx.annotation.NonNull;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.p552ot.pubsub.p553a.C26484a;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class MaxMediatedNetworkInfoImpl implements MaxMediatedNetworkInfo {

    /* renamed from: a */
    private final JSONObject f7969a;

    public MaxMediatedNetworkInfoImpl(JSONObject jSONObject) {
        this.f7969a = jSONObject;
    }

    @Override // com.applovin.mediation.MaxMediatedNetworkInfo
    public String getAdapterClassName() {
        return JsonUtils.getString(this.f7969a, C26484a.f69235r, "");
    }

    @Override // com.applovin.mediation.MaxMediatedNetworkInfo
    public String getAdapterVersion() {
        return JsonUtils.getString(this.f7969a, "version", "");
    }

    @Override // com.applovin.mediation.MaxMediatedNetworkInfo
    public String getName() {
        return JsonUtils.getString(this.f7969a, "name", "");
    }

    @Override // com.applovin.mediation.MaxMediatedNetworkInfo
    public String getSdkVersion() {
        return JsonUtils.getString(this.f7969a, "sdk_version", "");
    }

    @NonNull
    public String toString() {
        return "MaxMediatedNetworkInfo{name=" + getName() + ", adapterClassName=" + getAdapterClassName() + ", adapterVersion=" + getAdapterVersion() + ", sdkVersion=" + getSdkVersion() + '}';
    }
}
