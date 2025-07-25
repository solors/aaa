package com.zeus.gmc.sdk.mobileads.columbus.common;

import com.zeus.gmc.sdk.mobileads.columbus.gson.annotations.Expose;
import com.zeus.gmc.sdk.mobileads.columbus.gson.annotations.SerializedName;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.GsonEntityBase;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.player.C32282ccoc2oic;

/* loaded from: classes8.dex */
public class EndCardStyleInfo extends GsonEntityBase {
    private static final double GSON_CONTENT_VERSION = 1.0d;
    private static final String c2oc2o = "EndCardStyleInfo";
    @SerializedName("endCardUrl")
    @Expose
    private String cioccoiococ;
    @SerializedName("endCardStyleId")
    @Expose
    private String coo2iico = "2.2";
    @SerializedName("closeEnterTime")
    @Expose
    private int coi222o222 = 0;
    @SerializedName("clickAbleArea")
    @Expose
    private int c2oc2i = 2;

    public String c2oicci2() {
        return this.cioccoiococ;
    }

    public int ccoc2oic() {
        return this.coi222o222;
    }

    public int cicc2iiccc() {
        return this.c2oc2i;
    }

    public void cicic() {
        if (!C32282ccoc2oic.coi222o222(this.coo2iico)) {
            this.coo2iico = "2.2";
        }
        int i = this.coi222o222;
        if (i < 0 || i > 15) {
            this.coi222o222 = 0;
        }
        int i2 = this.c2oc2i;
        if (i2 < 1 || i2 > 3) {
            this.c2oc2i = 2;
        }
    }

    public String coiio2() {
        return this.coo2iico;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.GsonEntityBase
    protected String getTag() {
        return c2oc2o;
    }
}
