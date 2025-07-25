package com.zeus.gmc.sdk.mobileads.columbus.common;

import com.zeus.gmc.sdk.mobileads.columbus.gson.annotations.Expose;
import com.zeus.gmc.sdk.mobileads.columbus.gson.annotations.SerializedName;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.GsonEntityBase;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.player.C32282ccoc2oic;

/* loaded from: classes8.dex */
public class VideoStyleInfo extends GsonEntityBase {
    private static final double GSON_CONTENT_VERSION = 1.0d;
    private static final String cco22 = "VideoStyleInfo";
    @SerializedName(Constants.VIDEO_STYLE_ID)
    @Expose
    private String coo2iico = "1.2";
    @SerializedName("clickAbleArea")
    @Expose
    private int coi222o222 = 2;
    @SerializedName("skipTime")
    @Expose
    private int c2oc2i = 5;
    @SerializedName("ctaEnterTime")
    @Expose
    private int cioccoiococ = 3;
    @SerializedName("ctaAppearStyle")
    @Expose
    private int c2oc2o = 3;

    public String c22o22co22i() {
        return this.coo2iico;
    }

    public int c2oicci2() {
        return this.c2oc2i;
    }

    public int ccoc2oic() {
        return this.c2oc2o;
    }

    public int cicc2iiccc() {
        return this.coi222o222;
    }

    public void cicic() {
        if (!C32282ccoc2oic.cioccoiococ(this.coo2iico)) {
            this.coo2iico = "1.2";
        }
        int i = this.coi222o222;
        if (i < 1 || i > 3) {
            this.coi222o222 = 2;
        }
        int i2 = this.c2oc2i;
        if (i2 < 0 || i2 > 15) {
            this.c2oc2i = 5;
        }
        int i3 = this.cioccoiococ;
        if (i3 < 0 || i3 > 15) {
            this.cioccoiococ = 3;
        }
        int i4 = this.c2oc2o;
        if (i4 < 1 || i4 > 3) {
            this.c2oc2o = 3;
        }
    }

    public int coiio2() {
        return this.cioccoiococ;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.GsonEntityBase
    protected String getTag() {
        return cco22;
    }
}
