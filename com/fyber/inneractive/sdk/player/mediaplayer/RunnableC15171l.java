package com.fyber.inneractive.sdk.player.mediaplayer;

import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.l */
/* loaded from: classes4.dex */
public final class RunnableC15171l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C15175p f29972a;

    public RunnableC15171l(C15175p c15175p) {
        this.f29972a = c15175p;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C15175p c15175p = this.f29972a;
        String m77112b = c15175p.m77112b();
        long currentTimeMillis = System.currentTimeMillis();
        c15175p.setVolume(0.0f, 0.0f);
        IAlog.m76525e(m77112b + "timelog: mute took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
    }
}
