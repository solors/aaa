package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.cache.InterfaceC14264a;

/* renamed from: com.fyber.inneractive.sdk.util.k */
/* loaded from: classes4.dex */
public final class RunnableC15455k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC14264a f30602a;

    public RunnableC15455k(InterfaceC14264a interfaceC14264a) {
        this.f30602a = interfaceC14264a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC14264a interfaceC14264a;
        try {
            if (AbstractC15459m.f30607a != null && (interfaceC14264a = this.f30602a) != null) {
                AbstractC15459m.f30607a.getSharedPreferences("IAConfigurationPreferences", 0).edit().remove(interfaceC14264a.mo77938b()).apply();
            }
        } catch (Throwable unused) {
        }
    }
}
