package com.five_corp.p372ad.internal.movie.partialcache.mediacodec;

import android.os.HandlerThread;

/* renamed from: com.five_corp.ad.internal.movie.partialcache.mediacodec.j */
/* loaded from: classes4.dex */
public final class RunnableC14003j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C14008o f26105a;

    public RunnableC14003j(C14008o c14008o) {
        this.f26105a = c14008o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26105a.f26121f.removeCallbacksAndMessages(null);
        HandlerThread handlerThread = this.f26105a.f26120e;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        C14008o c14008o = this.f26105a;
        c14008o.f26120e = null;
        c14008o.f26121f = null;
        c14008o.f26117b.release();
    }
}
