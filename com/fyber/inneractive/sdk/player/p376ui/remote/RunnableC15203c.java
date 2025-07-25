package com.fyber.inneractive.sdk.player.p376ui.remote;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.remoteui.EnumC15542a;

/* renamed from: com.fyber.inneractive.sdk.player.ui.remote.c */
/* loaded from: classes4.dex */
public final class RunnableC15203c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C15204d f30089a;

    public RunnableC15203c(C15204d c15204d) {
        this.f30089a = c15204d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAlog.m76529a("%s : remote UI failed task executed", "RemoteUIWebviewController");
        C15204d c15204d = this.f30089a;
        if (!c15204d.f30097h) {
            c15204d.mo76362a(EnumC15542a.TEMPLATE_LOAD_TIMEOUT, "Loading remote UI timed out", true, null);
        }
    }
}
