package com.zeus.gmc.sdk.mobileads.columbus.p626ad.cache;

import com.zeus.gmc.sdk.mobileads.columbus.gson.annotations.Expose;
import com.zeus.gmc.sdk.mobileads.columbus.gson.annotations.SerializedName;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.GsonEntityBase;
import java.util.List;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.cache.AdCacheInfo */
/* loaded from: classes8.dex */
public class AdCacheInfo extends GsonEntityBase {
    private static final double GSON_CONTENT_VERSION = 1.0d;
    private static final String cco22 = "AdCacheInfo";
    @SerializedName("poolSize")
    @Expose
    private int c2oc2i;
    @SerializedName("cleanWhen")
    @Expose
    private int c2oc2o;
    @SerializedName("loadWhen")
    @Expose
    private List<Integer> cioccoiococ;
    @SerializedName("tagIdType")
    @Expose
    private int coi222o222;
    @SerializedName("tagId")
    @Expose
    private String coo2iico;

    public AdCacheInfo() {
    }

    public int c2oicci2() {
        return this.coi222o222;
    }

    public int ccoc2oic() {
        return this.c2oc2i;
    }

    public List<Integer> cicc2iiccc() {
        return this.cioccoiococ;
    }

    public int cicic() {
        return this.c2oc2o;
    }

    public String coiio2() {
        int i = this.coi222o222;
        if (i == 1) {
            return C32111coo2iico.cii2c2;
        }
        if (i != 4 && i != 16) {
            return "";
        }
        return C32111coo2iico.ciii2coi2;
    }

    public String coo2iico() {
        return this.coo2iico;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.GsonEntityBase
    protected String getTag() {
        return cco22;
    }

    public AdCacheInfo(String str, int i, int i2) {
        this.coo2iico = str;
        this.coi222o222 = i;
        this.c2oc2i = i2;
    }
}
