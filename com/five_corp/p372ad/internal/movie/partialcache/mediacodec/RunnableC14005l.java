package com.five_corp.p372ad.internal.movie.partialcache.mediacodec;

import java.nio.ByteBuffer;

/* renamed from: com.five_corp.ad.internal.movie.partialcache.mediacodec.l */
/* loaded from: classes4.dex */
public final class RunnableC14005l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f26108a;

    /* renamed from: b */
    public final /* synthetic */ ByteBuffer f26109b;

    /* renamed from: c */
    public final /* synthetic */ C14008o f26110c;

    public RunnableC14005l(C14008o c14008o, int i, ByteBuffer byteBuffer) {
        this.f26110c = c14008o;
        this.f26108a = i;
        this.f26109b = byteBuffer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14008o c14008o = this.f26110c;
        if (c14008o.f26122g != 2) {
            return;
        }
        C13994a c13994a = new C13994a(this.f26108a, this.f26109b);
        if (!c14008o.f26118c.mo78159a(c14008o, c13994a) && c14008o.f26122g == 2) {
            c14008o.f26119d.postDelayed(new RunnableC14004k(c14008o, c13994a), 100L);
        }
    }
}
