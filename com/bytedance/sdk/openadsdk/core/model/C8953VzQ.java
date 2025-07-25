package com.bytedance.sdk.openadsdk.core.model;

/* renamed from: com.bytedance.sdk.openadsdk.core.model.VzQ */
/* loaded from: classes3.dex */
public class C8953VzQ {

    /* renamed from: bg */
    private long f19823bg = 10000;

    /* renamed from: IL */
    private long f19821IL = 10000;

    /* renamed from: bX */
    private long f19822bX = 10;
    private long eqN = 20;

    /* renamed from: zx */
    private String f19824zx = "";

    /* renamed from: IL */
    public long m84278IL() {
        return this.f19821IL;
    }

    /* renamed from: bX */
    public long m84276bX() {
        return this.f19822bX;
    }

    /* renamed from: bg */
    public long m84274bg() {
        return this.f19823bg;
    }

    public long eqN() {
        return this.eqN;
    }

    /* renamed from: zx */
    public String m84271zx() {
        return this.f19824zx;
    }

    /* renamed from: IL */
    public void m84277IL(long j) {
        if (j < 0) {
            this.f19821IL = 20L;
        } else {
            this.f19821IL = j;
        }
    }

    /* renamed from: bX */
    public void m84275bX(long j) {
        if (j <= 0) {
            this.f19822bX = 10L;
        } else {
            this.f19822bX = j;
        }
    }

    /* renamed from: bg */
    public void m84273bg(long j) {
        if (j <= 0) {
            this.f19823bg = 10L;
        } else {
            this.f19823bg = j;
        }
    }

    public void eqN(long j) {
        if (j < 0) {
            this.eqN = 20L;
        } else {
            this.eqN = j;
        }
    }

    /* renamed from: bg */
    public void m84272bg(String str) {
        this.f19824zx = str;
    }
}
