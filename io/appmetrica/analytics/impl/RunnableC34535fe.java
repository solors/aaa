package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.fe */
/* loaded from: classes9.dex */
public final class RunnableC34535fe implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f94376a;

    /* renamed from: b */
    public final /* synthetic */ String f94377b;

    /* renamed from: c */
    public final /* synthetic */ PluginErrorDetails f94378c;

    /* renamed from: d */
    public final /* synthetic */ C34562ge f94379d;

    public RunnableC34535fe(C34562ge c34562ge, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f94379d = c34562ge;
        this.f94376a = str;
        this.f94377b = str2;
        this.f94378c = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC34133Pa) this.f94379d.f94460d.get()).getPluginExtension().reportError(this.f94376a, this.f94377b, this.f94378c);
    }
}
