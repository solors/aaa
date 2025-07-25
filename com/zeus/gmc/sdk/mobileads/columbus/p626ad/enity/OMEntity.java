package com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity;

import com.pubmatic.sdk.nativead.POBNativeConstants;
import com.zeus.gmc.sdk.mobileads.columbus.gson.annotations.Expose;
import com.zeus.gmc.sdk.mobileads.columbus.gson.annotations.SerializedName;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32459ciii2coi2;
import org.json.JSONObject;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.enity.OMEntity */
/* loaded from: classes8.dex */
public class OMEntity extends GsonEntityBase {
    private static final double GSON_CONTENT_VERSION = 1.0d;
    private static final String TAG = "OMEntity";
    @SerializedName("vendor_key")
    @Expose
    private String mVendorKey;
    @SerializedName(POBNativeConstants.NATIVE_VERIFICATION_PARAMETERS)
    @Expose
    private String mVerificationParameters;
    @SerializedName("verification_url")
    @Expose
    private String mVerificationUrl;

    public static final OMEntity coo2iico(JSONObject jSONObject) {
        return (OMEntity) C32459ciii2coi2.coo2iico(OMEntity.class, jSONObject.toString(), TAG);
    }

    public String ccoc2oic() {
        return this.mVerificationUrl;
    }

    public String cicc2iiccc() {
        return this.mVerificationParameters;
    }

    public String cicic() {
        return this.mVendorKey;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.GsonEntityBase
    protected String getTag() {
        return "OMEntity1.0";
    }
}
