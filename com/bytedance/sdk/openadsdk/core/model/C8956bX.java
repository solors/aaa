package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.component.utils.C7741PX;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.model.bX */
/* loaded from: classes3.dex */
public class C8956bX {

    /* renamed from: iR */
    private int f19832iR;

    /* renamed from: bg */
    private String f19831bg = "";

    /* renamed from: IL */
    private String f19829IL = "";

    /* renamed from: bX */
    private String f19830bX = "";
    private String eqN = "";

    /* renamed from: zx */
    private double f19833zx = -1.0d;
    private int ldr = -1;

    /* renamed from: IL */
    public String m84269IL() {
        return this.f19829IL;
    }

    /* renamed from: Kg */
    public JSONObject m84266Kg() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_name", m84269IL());
            jSONObject.put("app_size", ldr());
            jSONObject.put("comment_num", m84258zx());
            jSONObject.put(DownloadModel.DOWNLOAD_URL, m84263bg());
            jSONObject.put("package_name", m84265bX());
            jSONObject.put("score", eqN());
            jSONObject.put("app_category", m84259iR());
        } catch (Exception e) {
            C7741PX.m87880IL(e.toString());
        }
        return jSONObject;
    }

    /* renamed from: bX */
    public String m84265bX() {
        return this.f19830bX;
    }

    /* renamed from: bg */
    public String m84263bg() {
        return this.f19831bg;
    }

    public double eqN() {
        return this.f19833zx;
    }

    /* renamed from: iR */
    public String m84259iR() {
        return this.eqN;
    }

    public int ldr() {
        return this.f19832iR;
    }

    /* renamed from: zx */
    public int m84258zx() {
        return this.ldr;
    }

    /* renamed from: IL */
    public void m84267IL(String str) {
        this.f19829IL = str;
    }

    /* renamed from: bX */
    public void m84264bX(String str) {
        this.f19830bX = str;
    }

    /* renamed from: bg */
    public void m84260bg(String str) {
        this.f19831bg = str;
    }

    public void eqN(String str) {
        this.eqN = str;
    }

    /* renamed from: IL */
    public void m84268IL(int i) {
        this.f19832iR = i;
    }

    /* renamed from: bg */
    public void m84262bg(double d) {
        if (d >= 1.0d && d <= 5.0d) {
            this.f19833zx = d;
        } else {
            this.f19833zx = -1.0d;
        }
    }

    /* renamed from: bg */
    public void m84261bg(int i) {
        if (i <= 0) {
            this.ldr = -1;
        } else {
            this.ldr = i;
        }
    }
}
