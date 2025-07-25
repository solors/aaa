package com.five_corp.p372ad.internal.movie.partialcache.mediacodec;

import android.media.MediaFormat;

/* renamed from: com.five_corp.ad.internal.movie.partialcache.mediacodec.n */
/* loaded from: classes4.dex */
public final class RunnableC14007n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ MediaFormat f26114a;

    /* renamed from: b */
    public final /* synthetic */ C14008o f26115b;

    public RunnableC14007n(C14008o c14008o, MediaFormat mediaFormat) {
        this.f26115b = c14008o;
        this.f26114a = mediaFormat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14008o c14008o = this.f26115b;
        if (c14008o.f26122g != 2) {
            return;
        }
        c14008o.f26118c.mo78160a(c14008o, this.f26114a);
    }
}
