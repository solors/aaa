package com.zeus.gmc.sdk.mobileads.columbus.common;

import com.zeus.gmc.sdk.mobileads.columbus.gson.annotations.Expose;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32459ciii2coi2;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.GsonEntityBase;

/* loaded from: classes8.dex */
public class DspWeightConfig extends GsonEntityBase {
    private static final double GSON_CONTENT_VERSION = 1.0d;
    private static final String TAG = "DspWeightConfig";
    @Expose
    private String dsp;
    @Expose
    private int weight;

    public static final AdControl deserialize(String str) {
        return (AdControl) C32459ciii2coi2.coo2iico(AdControl.class, str, TAG);
    }

    public String getDsp() {
        return this.dsp;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.GsonEntityBase
    protected String getTag() {
        return TAG;
    }

    public int getWeight() {
        return this.weight;
    }
}
