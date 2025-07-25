package com.pubmatic.sdk.openwrap.core.internal;

import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.base.POBAdBuilding;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.openwrap.core.POBBid;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class POBBidsBuilder implements POBAdBuilding<POBBid> {
    @Nullable

    /* renamed from: a */
    private String f70680a;
    @Nullable

    /* renamed from: b */
    private String f70681b;

    /* renamed from: c */
    private int f70682c;

    /* renamed from: d */
    private int f70683d;
    @Nullable

    /* renamed from: e */
    private String f70684e;
    @Nullable

    /* renamed from: f */
    private POBAdBuilding.POBAdBuilderListener<POBBid> f70685f;

    @Nullable
    /* renamed from: a */
    private JSONArray m40287a(@Nullable JSONObject jSONObject) {
        if (POBUtils.isJsonObjectNullOrEmpty(jSONObject)) {
            return null;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("prebid");
        if (POBUtils.isJsonObjectNullOrEmpty(optJSONObject)) {
            return null;
        }
        return optJSONObject.optJSONArray("seatnonbid");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0107  */
    @Override // com.pubmatic.sdk.common.base.POBAdBuilding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void build(@androidx.annotation.NonNull com.pubmatic.sdk.common.models.POBAdResponse<com.pubmatic.sdk.openwrap.core.POBBid> r14) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pubmatic.sdk.openwrap.core.internal.POBBidsBuilder.build(com.pubmatic.sdk.common.models.POBAdResponse):void");
    }

    @Nullable
    public String getPartnerId() {
        return this.f70681b;
    }

    public void setCreativeType(@Nullable String str) {
        this.f70684e = str;
    }

    public void setHeight(int i) {
        this.f70683d = i;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdBuilding
    public void setListener(@Nullable POBAdBuilding.POBAdBuilderListener<POBBid> pOBAdBuilderListener) {
        this.f70685f = pOBAdBuilderListener;
    }

    public void setPartnerId(@Nullable String str) {
        this.f70681b = str;
    }

    public void setPartnerName(@Nullable String str) {
        this.f70680a = str;
    }

    public void setWidth(int i) {
        this.f70682c = i;
    }
}
