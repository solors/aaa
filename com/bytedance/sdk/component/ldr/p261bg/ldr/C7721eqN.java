package com.bytedance.sdk.component.ldr.p261bg.ldr;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.ldr.bg.ldr.eqN */
/* loaded from: classes3.dex */
public class C7721eqN {

    /* renamed from: IL */
    private final String f16888IL;

    /* renamed from: Kg */
    private String f16889Kg;

    /* renamed from: VB */
    private boolean f16890VB;

    /* renamed from: bX */
    private final boolean f16892bX;

    /* renamed from: bg */
    private final String f16893bg;

    /* renamed from: iR */
    private String f16895iR;
    private final String ldr;

    /* renamed from: zx */
    private final int f16896zx;
    private int eqN = -1;

    /* renamed from: WR */
    private int f16891WR = 0;

    /* renamed from: eo */
    private String f16894eo = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7721eqN(String str, String str2, boolean z, int i, String str3) {
        this.f16893bg = str;
        this.f16888IL = str2;
        this.f16892bX = z;
        this.f16896zx = i;
        this.ldr = str3;
    }

    /* renamed from: IL */
    public String m87955IL() {
        return this.f16888IL;
    }

    /* renamed from: Kg */
    public int m87952Kg() {
        return this.f16891WR;
    }

    /* renamed from: VB */
    public boolean m87951VB() {
        if (this.eqN == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: WR */
    public String m87950WR() {
        return this.f16889Kg;
    }

    /* renamed from: bX */
    public boolean m87949bX() {
        return this.f16892bX;
    }

    /* renamed from: bg */
    public String m87947bg() {
        return this.f16893bg;
    }

    /* renamed from: eo */
    public boolean m87942eo() {
        return this.f16890VB;
    }

    public int eqN() {
        return this.eqN;
    }

    /* renamed from: iR */
    public String m87941iR() {
        return this.f16895iR;
    }

    public String ldr() {
        return this.ldr;
    }

    /* renamed from: zx */
    public int m87940zx() {
        return this.f16896zx;
    }

    /* renamed from: IL */
    public void m87954IL(int i) {
        this.f16891WR = i;
        if (i == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f16895iR)) {
            this.f16895iR = String.valueOf(this.f16891WR);
            return;
        }
        this.f16895iR += "," + this.f16891WR;
    }

    /* renamed from: bX */
    public void m87948bX(String str) {
        this.f16894eo = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(this.f16889Kg)) {
            this.f16889Kg = String.valueOf(this.f16894eo);
            return;
        }
        this.f16889Kg += "," + this.f16894eo;
    }

    /* renamed from: bg */
    public void m87946bg(int i) {
        this.eqN = i;
    }

    /* renamed from: bg */
    public void m87945bg(String str) {
        this.f16895iR = str;
    }

    /* renamed from: bg */
    public void m87943bg(boolean z) {
        this.f16890VB = z;
    }

    /* renamed from: bg */
    public Runnable m87944bg(String str, Map<String, String> map) {
        return C7720bg.m87958bg().mo87965bg(this, str, map);
    }

    /* renamed from: IL */
    public void m87953IL(String str) {
        this.f16889Kg = str;
    }
}
