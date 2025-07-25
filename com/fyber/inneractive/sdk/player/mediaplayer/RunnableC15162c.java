package com.fyber.inneractive.sdk.player.mediaplayer;

import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.c */
/* loaded from: classes4.dex */
public final class RunnableC15162c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C15175p f29959a;

    public RunnableC15162c(C15175p c15175p) {
        this.f29959a = c15175p;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAlog.m76529a("%sCannot wait for video size anymore", this.f29959a.m77112b());
        C15175p c15175p = this.f29959a;
        if (c15175p.f29991r == 0) {
            IAlog.m76529a("%sCannot wait for video size anymore. duration is still 0 - aborting", c15175p.m77112b());
            C15175p c15175p2 = this.f29959a;
            c15175p2.onError(c15175p2, 0, 0);
            return;
        }
        IAlog.m76529a("%sCannot wait for video size anymore. moving into ready", c15175p.m77112b());
        C15175p c15175p3 = this.f29959a;
        c15175p3.f29979f = true;
        c15175p3.m77110c();
    }
}
