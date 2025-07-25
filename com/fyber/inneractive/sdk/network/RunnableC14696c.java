package com.fyber.inneractive.sdk.network;

/* renamed from: com.fyber.inneractive.sdk.network.c */
/* loaded from: classes4.dex */
public final class RunnableC14696c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f27854a;

    /* renamed from: b */
    public final /* synthetic */ long f27855b;

    /* renamed from: c */
    public final /* synthetic */ C14702f f27856c;

    public RunnableC14696c(C14702f c14702f, int i, long j) {
        this.f27856c = c14702f;
        this.f27854a = i;
        this.f27855b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f27856c.f27868d.sendEmptyMessageDelayed(this.f27854a, this.f27855b);
    }
}
