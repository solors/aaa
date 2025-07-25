package com.bytedance.adsdk.p183IL.ldr;

/* renamed from: com.bytedance.adsdk.IL.ldr.eqN */
/* loaded from: classes3.dex */
public class C6862eqN {

    /* renamed from: IL */
    private int f14753IL;

    /* renamed from: bg */
    private float f14754bg;

    /* renamed from: bg */
    public void m90623bg(float f) {
        float f2 = this.f14754bg + f;
        this.f14754bg = f2;
        int i = this.f14753IL + 1;
        this.f14753IL = i;
        if (i == Integer.MAX_VALUE) {
            this.f14754bg = f2 / 2.0f;
            this.f14753IL = i / 2;
        }
    }
}
