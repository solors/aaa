package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.de */
/* loaded from: classes9.dex */
public final class RunnableC34481de implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ PluginErrorDetails f94201a;

    /* renamed from: b */
    public final /* synthetic */ C34562ge f94202b;

    public RunnableC34481de(C34562ge c34562ge, PluginErrorDetails pluginErrorDetails) {
        this.f94202b = c34562ge;
        this.f94201a = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC34133Pa) this.f94202b.f94460d.get()).getPluginExtension().reportUnhandledException(this.f94201a);
    }
}
