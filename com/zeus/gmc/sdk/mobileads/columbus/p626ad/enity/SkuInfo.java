package com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity;

import com.zeus.gmc.sdk.mobileads.columbus.gson.annotations.Expose;
import com.zeus.gmc.sdk.mobileads.columbus.gson.annotations.SerializedName;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.enity.SkuInfo */
/* loaded from: classes8.dex */
public class SkuInfo extends GsonEntityBase {
    private static final double GSON_CONTENT_VERSION = 1.0d;
    private static final String TAG = "SkuInfo";
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("dcprice")
    @Expose
    private String dcprice;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("skuId")
    @Expose
    private String skuId;

    public String ccoc2oic() {
        return this.price;
    }

    public String cicc2iiccc() {
        return this.dcprice;
    }

    public String cicic() {
        return this.currency;
    }

    public String coiio2() {
        return this.skuId;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.GsonEntityBase
    protected String getTag() {
        return TAG;
    }
}
