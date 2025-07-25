package com.fyber.inneractive.sdk.player.mediaplayer;

import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.j */
/* loaded from: classes4.dex */
public final class RunnableC15169j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f29969a;

    /* renamed from: b */
    public final /* synthetic */ C15175p f29970b;

    public RunnableC15169j(C15175p c15175p, int i) {
        this.f29970b = c15175p;
        this.f29969a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C15175p c15175p = this.f29970b;
        int i = this.f29969a;
        String m77112b = c15175p.m77112b();
        long currentTimeMillis = System.currentTimeMillis();
        c15175p.seekTo(i);
        IAlog.m76525e(m77112b + "timelog: seekTo took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
    }
}
