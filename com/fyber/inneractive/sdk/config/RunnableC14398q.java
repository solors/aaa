package com.fyber.inneractive.sdk.config;

import java.util.Iterator;

/* renamed from: com.fyber.inneractive.sdk.config.q */
/* loaded from: classes4.dex */
public final class RunnableC14398q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C14411s f27229a;

    public RunnableC14398q(C14411s c14411s) {
        this.f27229a = c14411s;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14411s c14411s = this.f27229a;
        Iterator it = c14411s.f27276c.iterator();
        while (it.hasNext()) {
            ((InterfaceC14399r) it.next()).onGlobalConfigChanged(c14411s, c14411s.f27275b);
        }
    }
}
