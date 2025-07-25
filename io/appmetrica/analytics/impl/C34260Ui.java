package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.Ui */
/* loaded from: classes9.dex */
public final class C34260Ui implements InterfaceC34109Oa {

    /* renamed from: a */
    public final /* synthetic */ PluginErrorDetails f93583a;

    public C34260Ui(PluginErrorDetails pluginErrorDetails) {
        this.f93583a = pluginErrorDetails;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34109Oa
    /* renamed from: a */
    public final void mo21570a(InterfaceC34133Pa interfaceC34133Pa) {
        interfaceC34133Pa.getPluginExtension().reportUnhandledException(this.f93583a);
    }
}
