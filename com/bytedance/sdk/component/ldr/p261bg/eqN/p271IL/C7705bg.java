package com.bytedance.sdk.component.ldr.p261bg.eqN.p271IL;

/* renamed from: com.bytedance.sdk.component.ldr.bg.eqN.IL.bg */
/* loaded from: classes3.dex */
public class C7705bg {

    /* renamed from: IL */
    private int f16859IL;

    /* renamed from: bg */
    private int f16860bg;

    C7705bg(int i, int i2, long j) {
        if (i2 >= i) {
            this.f16860bg = i;
            this.f16859IL = i2;
            return;
        }
        throw new IllegalStateException("atMostBatchSendCount should meet a condition (atMostBatchSendCount >= maxCacheCount)");
    }

    /* renamed from: bX */
    public static C7705bg m88000bX() {
        return new C7705bg(1, 100, 172800000L);
    }

    public static C7705bg eqN() {
        return new C7705bg(1, 100, -1L);
    }

    /* renamed from: zx */
    public static C7705bg m87998zx() {
        return new C7705bg(3, 100, 172800000L);
    }

    /* renamed from: IL */
    public int m88001IL() {
        return this.f16859IL;
    }

    /* renamed from: bg */
    public int m87999bg() {
        return this.f16860bg;
    }
}
