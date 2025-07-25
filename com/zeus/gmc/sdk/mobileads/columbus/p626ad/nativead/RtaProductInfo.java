package com.zeus.gmc.sdk.mobileads.columbus.p626ad.nativead;

import com.zeus.gmc.sdk.mobileads.columbus.gson.annotations.Expose;
import com.zeus.gmc.sdk.mobileads.columbus.gson.annotations.SerializedName;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.GsonEntityBase;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.nativead.RtaProductInfo */
/* loaded from: classes8.dex */
public class RtaProductInfo extends GsonEntityBase {
    private static final double GSON_CONTENT_VERSION = 1.0d;
    private static final String cioccoiococ = "RtaProductInfo";
    @SerializedName("landingPage")
    @Expose
    private String c2oc2i;
    @SerializedName("imgUrl")
    @Expose
    private String coi222o222;
    @SerializedName("productName")
    @Expose
    private String coo2iico;

    public String getImgUrl() {
        return this.coi222o222;
    }

    public String getLandingPage() {
        return this.c2oc2i;
    }

    public String getProductName() {
        return this.coo2iico;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.GsonEntityBase
    protected String getTag() {
        return cioccoiococ;
    }
}
