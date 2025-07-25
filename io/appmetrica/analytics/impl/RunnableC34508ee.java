package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.ee */
/* loaded from: classes9.dex */
public final class RunnableC34508ee implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ PluginErrorDetails f94259a;

    /* renamed from: b */
    public final /* synthetic */ String f94260b;

    /* renamed from: c */
    public final /* synthetic */ C34562ge f94261c;

    public RunnableC34508ee(C34562ge c34562ge, PluginErrorDetails pluginErrorDetails, String str) {
        this.f94261c = c34562ge;
        this.f94259a = pluginErrorDetails;
        this.f94260b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC34133Pa) this.f94261c.f94460d.get()).getPluginExtension().reportError(this.f94259a, this.f94260b);
    }
}
