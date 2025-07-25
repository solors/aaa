package com.bytedance.adsdk.p183IL;

import android.graphics.Bitmap;
import com.bytedance.component.sdk.annotation.RestrictTo;
import java.util.List;

/* renamed from: com.bytedance.adsdk.IL.eo */
/* loaded from: classes3.dex */
public class C6821eo {

    /* renamed from: IL */
    private final int f14638IL;

    /* renamed from: Kg */
    private final String f14639Kg;

    /* renamed from: WR */
    private final int[][] f14640WR;

    /* renamed from: bX */
    private final String f14641bX;

    /* renamed from: bg */
    private final int f14642bg;

    /* renamed from: eo */
    private Bitmap f14643eo;
    private final String eqN;

    /* renamed from: iR */
    private final List<C6822bg> f14644iR;
    private final String ldr;

    /* renamed from: zx */
    private final String f14645zx;

    /* renamed from: com.bytedance.adsdk.IL.eo$bg */
    /* loaded from: classes3.dex */
    public static class C6822bg {

        /* renamed from: IL */
        public int f14646IL;

        /* renamed from: bX */
        public String f14647bX;

        /* renamed from: bg */
        public int f14648bg;
        public String eqN;
        public int ldr;

        /* renamed from: zx */
        public int f14649zx;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public C6821eo(int i, int i2, String str, String str2, String str3, String str4, List<C6822bg> list, String str5, int[][] iArr) {
        this.f14642bg = i;
        this.f14638IL = i2;
        this.f14641bX = str;
        this.eqN = str2;
        this.f14645zx = str3;
        this.ldr = str4;
        this.f14644iR = list;
        this.f14639Kg = str5;
        this.f14640WR = iArr;
    }

    /* renamed from: IL */
    public int m90771IL() {
        return this.f14638IL;
    }

    /* renamed from: Kg */
    public String m90770Kg() {
        return this.eqN;
    }

    /* renamed from: WR */
    public String m90769WR() {
        return this.f14645zx;
    }

    /* renamed from: bX */
    public List<C6822bg> m90768bX() {
        return this.f14644iR;
    }

    /* renamed from: bg */
    public int m90767bg() {
        return this.f14642bg;
    }

    /* renamed from: eo */
    public Bitmap m90765eo() {
        return this.f14643eo;
    }

    public String eqN() {
        return this.ldr;
    }

    /* renamed from: iR */
    public String m90764iR() {
        return this.f14641bX;
    }

    public int[][] ldr() {
        return this.f14640WR;
    }

    /* renamed from: zx */
    public String m90763zx() {
        return this.f14639Kg;
    }

    /* renamed from: bg */
    public void m90766bg(Bitmap bitmap) {
        this.f14643eo = bitmap;
    }
}
