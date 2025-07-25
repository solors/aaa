package com.bytedance.sdk.component.p233Kg.p235bX.p236bg;

import android.text.TextUtils;
import com.bytedance.sdk.component.p233Kg.p235bX.AbstractRunnableC7230IL;

/* renamed from: com.bytedance.sdk.component.Kg.bX.bg.bg */
/* loaded from: classes3.dex */
public class C7233bg {

    /* renamed from: IL */
    private int f15604IL = 0;

    /* renamed from: bX */
    private long f15605bX;

    /* renamed from: bg */
    private String f15606bg;
    private long eqN;
    private long ldr;

    /* renamed from: zx */
    private long f15607zx;

    /* renamed from: IL */
    public int m89535IL() {
        return this.f15604IL;
    }

    /* renamed from: bX */
    public long m89534bX() {
        return this.f15605bX;
    }

    /* renamed from: bg */
    public String m89533bg() {
        return this.f15606bg;
    }

    public long eqN() {
        return this.eqN;
    }

    public long ldr() {
        return this.ldr;
    }

    public String toString() {
        return this.f15606bg + " times=" + this.f15604IL + ",waitMaxTime=" + this.f15607zx + ",runMaxTime=" + this.ldr + ",runTotalTime=" + this.eqN + ",waitTotalTime=" + this.f15605bX;
    }

    /* renamed from: zx */
    public long m89531zx() {
        return this.f15607zx;
    }

    /* renamed from: bg */
    public void m89532bg(AbstractRunnableC7230IL abstractRunnableC7230IL) {
        synchronized (this) {
            if (TextUtils.isEmpty(this.f15606bg)) {
                this.f15606bg = abstractRunnableC7230IL.m89552IL();
            }
            this.f15605bX += abstractRunnableC7230IL.ldr();
            this.eqN += abstractRunnableC7230IL.m89543iR();
            this.f15607zx = Math.max(this.f15607zx, abstractRunnableC7230IL.ldr());
            this.ldr = Math.max(this.ldr, abstractRunnableC7230IL.m89543iR());
            this.f15604IL++;
        }
        abstractRunnableC7230IL.ldr();
        abstractRunnableC7230IL.m89543iR();
        toString();
    }
}
