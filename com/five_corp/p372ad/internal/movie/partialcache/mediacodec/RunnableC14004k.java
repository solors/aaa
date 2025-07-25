package com.five_corp.p372ad.internal.movie.partialcache.mediacodec;

/* renamed from: com.five_corp.ad.internal.movie.partialcache.mediacodec.k */
/* loaded from: classes4.dex */
public final class RunnableC14004k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C13994a f26106a;

    /* renamed from: b */
    public final /* synthetic */ C14008o f26107b;

    public RunnableC14004k(C14008o c14008o, C13994a c13994a) {
        this.f26107b = c14008o;
        this.f26106a = c13994a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14008o c14008o = this.f26107b;
        if (c14008o.f26122g != 2) {
            return;
        }
        C13994a c13994a = this.f26106a;
        if (!c14008o.f26118c.mo78159a(c14008o, c13994a) && c14008o.f26122g == 2) {
            c14008o.f26119d.postDelayed(new RunnableC14004k(c14008o, c13994a), 100L);
        }
    }
}
