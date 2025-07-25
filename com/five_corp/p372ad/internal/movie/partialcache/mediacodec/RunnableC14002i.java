package com.five_corp.p372ad.internal.movie.partialcache.mediacodec;

import android.os.Handler;

/* renamed from: com.five_corp.ad.internal.movie.partialcache.mediacodec.i */
/* loaded from: classes4.dex */
public final class RunnableC14002i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C14008o f26104a;

    public RunnableC14002i(C14008o c14008o) {
        this.f26104a = c14008o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14008o.m78182a(this.f26104a);
        C14008o.m78179b(this.f26104a);
        Handler handler = this.f26104a.f26121f;
        if (handler != null) {
            handler.postDelayed(this, 10L);
        }
    }
}
