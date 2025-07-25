package com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity;

import com.zeus.gmc.sdk.mobileads.columbus.common.Constants;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.nativead.RtaProductInfo;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import org.json.JSONObject;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.enity.ClickAreaInfo */
/* loaded from: classes8.dex */
public class ClickAreaInfo {
    private static final String TAG = "ClickAreaInfo";

    /* renamed from: dh */
    private int f89353dh;

    /* renamed from: dw */
    private int f89354dw;
    private boolean isCta;
    private RtaProductInfo mRtaProductInfo;
    private float rawX;
    private float rawY;
    private String view;

    /* renamed from: x */
    private float f89355x;

    /* renamed from: y */
    private float f89356y;

    public ClickAreaInfo() {
    }

    public void c2oc2i(float f) {
        this.f89355x = f;
    }

    public void cioccoiococ(float f) {
        this.f89356y = f;
    }

    public void coi222o222(float f) {
        this.rawY = f;
    }

    public void coo2iico(float f) {
        this.rawX = f;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            float f = this.f89355x;
            if (f != 0.0f) {
                jSONObject.putOpt("x", Float.valueOf(f));
            }
            float f2 = this.f89356y;
            if (f2 != 0.0f) {
                jSONObject.putOpt("y", Float.valueOf(f2));
            }
            float f3 = this.rawX;
            if (f3 != 0.0f) {
                jSONObject.putOpt("rawX", Float.valueOf(f3));
            }
            float f4 = this.rawY;
            if (f4 != 0.0f) {
                jSONObject.putOpt("rawY", Float.valueOf(f4));
            }
            int i = this.f89354dw;
            if (i != 0) {
                jSONObject.putOpt("dw", Integer.valueOf(i));
            }
            int i2 = this.f89353dh;
            if (i2 != 0) {
                jSONObject.putOpt("dh", Integer.valueOf(i2));
            }
            jSONObject.putOpt("view", this.view);
        } catch (Exception e) {
            MLog.m25888e(TAG, "ClickAreaInfo toString error", e);
        }
        return jSONObject.toString();
    }

    public ClickAreaInfo(String str) {
        this.view = str;
    }

    public void coi222o222(int i) {
        this.f89354dw = i;
    }

    public void coo2iico(int i) {
        this.f89353dh = i;
    }

    public boolean coi222o222() {
        return this.isCta || Constants.CTA.equals(this.view);
    }

    public void coo2iico(String str) {
        this.view = str;
    }

    public void coo2iico(boolean z) {
        this.isCta = z;
    }

    public RtaProductInfo coo2iico() {
        return this.mRtaProductInfo;
    }

    public void coo2iico(RtaProductInfo rtaProductInfo) {
        this.mRtaProductInfo = rtaProductInfo;
    }
}
