package com.fyber.inneractive.sdk.player.p376ui.remote;

import com.fyber.inneractive.sdk.util.AbstractC15465p;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.ui.remote.b */
/* loaded from: classes4.dex */
public final class RunnableC15202b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C15204d f30088a;

    public RunnableC15202b(C15204d c15204d) {
        this.f30088a = c15204d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAlog.m76529a("%s : remote UI load timeout task executed", "RemoteUIWebviewController");
        C15204d c15204d = this.f30088a;
        c15204d.f30091b.loadData("", null, null);
        c15204d.f30096g = true;
        IAlog.m76529a("%s : UI load timed out", "RemoteUIWebviewController");
        AbstractC15465p.f30612b.post(c15204d.f30101l);
    }
}
