package com.bytedance.sdk.component.p256bg;

import android.text.TextUtils;

/* renamed from: com.bytedance.sdk.component.bg.xxp */
/* loaded from: classes3.dex */
public class C7602xxp {

    /* renamed from: IL */
    public final String f16567IL;

    /* renamed from: Kg */
    public final String f16568Kg;

    /* renamed from: bX */
    public final String f16569bX;

    /* renamed from: bg */
    public final int f16570bg;
    public final String eqN;

    /* renamed from: iR */
    public final String f16571iR;
    public final String ldr;

    /* renamed from: zx */
    public final String f16572zx;

    /* renamed from: com.bytedance.sdk.component.bg.xxp$bg */
    /* loaded from: classes3.dex */
    public static final class C7604bg {

        /* renamed from: IL */
        private String f16573IL;

        /* renamed from: bX */
        private String f16574bX;

        /* renamed from: bg */
        private String f16575bg;
        private String eqN;

        /* renamed from: iR */
        private String f16576iR;
        private String ldr;

        /* renamed from: zx */
        private String f16577zx;

        private C7604bg() {
        }

        /* renamed from: IL */
        public C7604bg m88431IL(String str) {
            this.f16573IL = str;
            return this;
        }

        /* renamed from: bX */
        public C7604bg m88429bX(String str) {
            this.f16574bX = str;
            return this;
        }

        /* renamed from: bg */
        public C7604bg m88426bg(String str) {
            this.f16575bg = str;
            return this;
        }

        public C7604bg eqN(String str) {
            this.eqN = str;
            return this;
        }

        /* renamed from: iR */
        public C7604bg m88424iR(String str) {
            this.f16576iR = str;
            return this;
        }

        public C7604bg ldr(String str) {
            this.ldr = str;
            return this;
        }

        /* renamed from: zx */
        public C7604bg m88422zx(String str) {
            this.f16577zx = str;
            return this;
        }

        /* renamed from: bg */
        public C7602xxp m88428bg() {
            return new C7602xxp(this);
        }
    }

    /* renamed from: bg */
    public static C7604bg m88435bg() {
        return new C7604bg();
    }

    public String toString() {
        return "methodName: " + this.eqN + ", params: " + this.f16572zx + ", callbackId: " + this.ldr + ", type: " + this.f16569bX + ", version: " + this.f16567IL + ", ";
    }

    private C7602xxp(String str, int i) {
        this.f16567IL = null;
        this.f16569bX = null;
        this.eqN = null;
        this.f16572zx = null;
        this.ldr = str;
        this.f16571iR = null;
        this.f16570bg = i;
        this.f16568Kg = null;
    }

    /* renamed from: bg */
    public static C7602xxp m88433bg(String str, int i) {
        return new C7602xxp(str, i);
    }

    /* renamed from: bg */
    public static boolean m88434bg(C7602xxp c7602xxp) {
        return c7602xxp == null || c7602xxp.f16570bg != 1 || TextUtils.isEmpty(c7602xxp.eqN) || TextUtils.isEmpty(c7602xxp.f16572zx);
    }

    private C7602xxp(C7604bg c7604bg) {
        this.f16567IL = c7604bg.f16575bg;
        this.f16569bX = c7604bg.f16573IL;
        this.eqN = c7604bg.f16574bX;
        this.f16572zx = c7604bg.eqN;
        this.ldr = c7604bg.f16577zx;
        this.f16571iR = c7604bg.ldr;
        this.f16570bg = 1;
        this.f16568Kg = c7604bg.f16576iR;
    }
}
