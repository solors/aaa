package com.bytedance.sdk.component.p254bX.p255bg;

import android.os.SystemClock;

/* renamed from: com.bytedance.sdk.component.bX.bg.bg */
/* loaded from: classes3.dex */
public class C7569bg {

    /* renamed from: IL */
    long f16493IL;

    /* renamed from: Kg */
    long f16494Kg;

    /* renamed from: bX */
    long f16495bX;

    /* renamed from: bg */
    long f16496bg = SystemClock.elapsedRealtime();
    long eqN;

    /* renamed from: iR */
    long f16497iR;
    long ldr;

    /* renamed from: zx */
    long f16498zx;

    /* renamed from: IL */
    public void m88518IL() {
        this.eqN = SystemClock.elapsedRealtime();
    }

    /* renamed from: Kg */
    public long m88517Kg() {
        return this.eqN;
    }

    /* renamed from: Lq */
    public void m88516Lq() {
        this.f16493IL = SystemClock.elapsedRealtime();
    }

    /* renamed from: PX */
    public long m88515PX() {
        return this.f16494Kg;
    }

    /* renamed from: Ta */
    public void m88514Ta() {
        this.f16494Kg = SystemClock.elapsedRealtime();
    }

    /* renamed from: VB */
    public void m88513VB() {
        this.f16497iR = SystemClock.elapsedRealtime();
    }

    /* renamed from: WR */
    public long m88512WR() {
        return this.f16498zx;
    }

    /* renamed from: bX */
    public void m88511bX() {
        this.f16498zx = SystemClock.elapsedRealtime();
    }

    /* renamed from: bg */
    public void m88510bg() {
        this.f16495bX = SystemClock.elapsedRealtime();
    }

    /* renamed from: eo */
    public long m88509eo() {
        return this.f16497iR;
    }

    public long eqN() {
        return this.f16496bg;
    }

    /* renamed from: iR */
    public long m88508iR() {
        return this.f16495bX;
    }

    public long ldr() {
        return this.ldr;
    }

    public String toString() {
        return "RequestHttpTime{requestBuildTs=" + this.f16496bg + ", asyncCallExecTs=" + this.f16493IL + ", requestStartExecTs=" + this.f16495bX + ", requestConnectStartTs=" + this.eqN + ", requestConnectFinishTs=" + this.f16498zx + ", reqCallServerStartTs=" + this.f16497iR + ", reqCallServerFinishTs=" + this.f16494Kg + '}';
    }

    public long yDt() {
        return this.f16493IL;
    }

    /* renamed from: zx */
    public void m88507zx() {
        this.ldr = SystemClock.elapsedRealtime();
    }
}
