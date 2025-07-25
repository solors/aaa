package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;

/* renamed from: com.bytedance.sdk.openadsdk.core.model.Lq */
/* loaded from: classes3.dex */
public class C8948Lq {

    /* renamed from: IL */
    private int f19807IL;

    /* renamed from: bX */
    private int f19808bX;

    /* renamed from: bg */
    private String f19809bg;
    private double eqN;
    private String ldr;

    /* renamed from: zx */
    private boolean f19810zx;

    /* renamed from: IL */
    public int m84307IL() {
        return this.f19807IL;
    }

    /* renamed from: bX */
    public int m84304bX() {
        return this.f19808bX;
    }

    /* renamed from: bg */
    public String m84303bg() {
        return this.f19809bg;
    }

    public double eqN() {
        return this.eqN;
    }

    /* renamed from: iR */
    public String m84299iR() {
        return this.ldr;
    }

    public boolean ldr() {
        return this.f19810zx;
    }

    /* renamed from: zx */
    public boolean m84298zx() {
        if (!TextUtils.isEmpty(this.f19809bg) && this.f19807IL > 0 && this.f19808bX > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: IL */
    public void m84306IL(int i) {
        this.f19808bX = i;
    }

    /* renamed from: bg */
    public void m84301bg(String str) {
        this.f19809bg = str;
    }

    /* renamed from: IL */
    public void m84305IL(String str) {
        this.ldr = str;
    }

    /* renamed from: bg */
    public void m84302bg(int i) {
        this.f19807IL = i;
    }

    /* renamed from: bg */
    public void m84300bg(boolean z) {
        this.f19810zx = z;
    }
}
