package com.fyber.inneractive.sdk.player;

import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.g */
/* loaded from: classes4.dex */
public final class RunnableC15153g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C15154h f29948a;

    public RunnableC15153g(C15154h c15154h) {
        this.f29948a = c15154h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C15154h c15154h = this.f29948a;
        c15154h.getClass();
        IAlog.m76529a("player progress monitor: run started", new Object[0]);
        int mo77625b = c15154h.f29949a.mo77625b();
        if (!c15154h.f29952d) {
            IAlog.m76529a("run: 2 seconds passed? played for %d since last play started", Integer.valueOf(mo77625b));
            if (mo77625b >= 2000) {
                IAlog.m76529a("run: setting played 2 seconds flag", new Object[0]);
                c15154h.f29952d = true;
            }
        }
        c15154h.f29949a.mo77633a(mo77625b);
    }
}
