package com.zeus.gmc.sdk.mobileads.columbus.common;

import com.zeus.gmc.sdk.mobileads.columbus.gson.annotations.Expose;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32459ciii2coi2;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.GsonEntityBase;
import java.util.List;

/* loaded from: classes8.dex */
public class AdControl extends GsonEntityBase {
    private static final double GSON_CONTENT_VERSION = 1.0d;
    private static final String TAG = "AdControl";
    @Expose
    private List<DspWeightConfig> dspWeight;
    @Expose
    private long duration;
    @Expose
    private long endTimeInMills;
    @Expose
    private long startTimeInMills;

    public static final AdControl deserialize(String str) {
        return (AdControl) C32459ciii2coi2.coo2iico(AdControl.class, str, TAG);
    }

    public long ccoc2oic() {
        return this.endTimeInMills;
    }

    public long cicc2iiccc() {
        return this.duration;
    }

    public List<DspWeightConfig> cicic() {
        return this.dspWeight;
    }

    public long coiio2() {
        return this.startTimeInMills;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.GsonEntityBase
    protected String getTag() {
        return TAG;
    }
}
