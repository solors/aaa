package com.zeus.gmc.sdk.mobileads.columbus.common;

import com.zeus.gmc.sdk.mobileads.columbus.gson.annotations.Expose;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32459ciii2coi2;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.GsonEntityBase;

/* loaded from: classes8.dex */
public class JumpControl extends GsonEntityBase {
    private static final double GSON_CONTENT_VERSION = 1.0d;
    private static final String TAG = "JumpControl";
    @Expose
    private int autoLaunch;
    @Expose
    private String callee;
    @Expose
    private String clickTrackUrl;
    @Expose
    private int jumpMode;
    @Expose
    private int mode;
    @Expose
    private int sendLog;
    @Expose
    private int targetType;

    public static final JumpControl coo2iico(String str) {
        return (JumpControl) C32459ciii2coi2.coo2iico(JumpControl.class, str, TAG);
    }

    public int c222o2o2c2o() {
        return this.targetType;
    }

    public int c22o22co22i() {
        return this.sendLog;
    }

    public void c2oc2i(int i) {
        this.jumpMode = i;
    }

    public void c2oc2o(int i) {
        this.sendLog = i;
    }

    public int c2oicci2() {
        return this.mode;
    }

    public void cco22(int i) {
        this.targetType = i;
    }

    public String ccoc2oic() {
        return this.clickTrackUrl;
    }

    public String cicc2iiccc() {
        return this.callee;
    }

    public int cicic() {
        return this.autoLaunch;
    }

    public void cioccoiococ(int i) {
        this.mode = i;
    }

    public void coi222o222(String str) {
        this.callee = str;
    }

    public int coiio2() {
        return this.jumpMode;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.GsonEntityBase
    protected String getTag() {
        return TAG;
    }

    public void c2oc2i(String str) {
        this.clickTrackUrl = str;
    }

    public void coi222o222(int i) {
        this.autoLaunch = i;
    }
}
