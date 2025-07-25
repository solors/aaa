package com.zeus.gmc.sdk.mobileads.columbus.p626ad.interstitialad.local;

import com.zeus.gmc.sdk.mobileads.columbus.gson.annotations.Expose;
import com.zeus.gmc.sdk.mobileads.columbus.gson.annotations.SerializedName;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.GsonEntityBase;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.interstitialad.local.LocalConfigInfo */
/* loaded from: classes8.dex */
public class LocalConfigInfo extends GsonEntityBase {
    private static final double GSON_CONTENT_VERSION = 1.0d;
    private static final String cioccoiococ = "LocalConfigInfo";
    @SerializedName("interstitial_offlinestyle")
    @Expose
    private int c2oc2i;
    @SerializedName("switch")
    @Expose
    private int coi222o222;
    @SerializedName("tagId")
    @Expose
    private String coo2iico;

    public int cicc2iiccc() {
        return this.coi222o222;
    }

    public int cicic() {
        return this.c2oc2i;
    }

    public String coo2iico() {
        return this.coo2iico;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.GsonEntityBase
    protected String getTag() {
        return cioccoiococ;
    }
}
