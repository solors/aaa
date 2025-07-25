package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.utils.daV;

/* loaded from: classes3.dex */
public class JAA {

    /* renamed from: IL */
    public long f19779IL;

    /* renamed from: Kg */
    private long f19780Kg;

    /* renamed from: VB */
    private int f19781VB;

    /* renamed from: WR */
    private long f19782WR;

    /* renamed from: bg */
    public boolean f19784bg;

    /* renamed from: eo */
    private long f19785eo;

    /* renamed from: iR */
    private long f19786iR;
    private long ldr;

    /* renamed from: zx */
    private long f19787zx;

    /* renamed from: bX */
    private daV f19783bX = daV.m82420IL();
    private daV eqN = daV.m82420IL();

    /* renamed from: IL */
    public void m84329IL(daV dav) {
        this.eqN = dav;
        this.f19782WR = dav.m82417bg(this.f19783bX);
    }

    /* renamed from: Kg */
    public int m84328Kg() {
        return this.f19781VB;
    }

    /* renamed from: bX */
    public long m84327bX() {
        return this.ldr;
    }

    /* renamed from: bg */
    public void m84322bg(daV dav, daV dav2, int i, daV dav3) {
        this.f19787zx = dav.m82417bg(this.f19783bX);
        this.ldr = dav2.m82417bg(dav);
        this.f19786iR = i;
        this.f19780Kg = dav3.m82417bg(dav2);
    }

    public long eqN() {
        return this.f19786iR;
    }

    /* renamed from: iR */
    public long m84321iR() {
        return this.f19785eo;
    }

    public long ldr() {
        return this.f19782WR;
    }

    /* renamed from: zx */
    public long m84320zx() {
        return this.f19780Kg;
    }

    /* renamed from: IL */
    public long m84330IL() {
        return this.f19787zx;
    }

    /* renamed from: bg */
    public void m84323bg(daV dav) {
        this.f19783bX = dav;
    }

    /* renamed from: bg */
    public daV m84326bg() {
        return this.f19783bX;
    }

    /* renamed from: bg */
    public void m84324bg(long j) {
        this.f19785eo = j;
    }

    /* renamed from: bg */
    public void m84325bg(int i) {
        this.f19781VB = i;
    }
}
