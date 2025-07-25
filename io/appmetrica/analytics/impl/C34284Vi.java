package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.Vi */
/* loaded from: classes9.dex */
public final class C34284Vi implements InterfaceC34109Oa {

    /* renamed from: a */
    public final /* synthetic */ PluginErrorDetails f93617a;

    /* renamed from: b */
    public final /* synthetic */ String f93618b;

    public C34284Vi(PluginErrorDetails pluginErrorDetails, String str) {
        this.f93617a = pluginErrorDetails;
        this.f93618b = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34109Oa
    /* renamed from: a */
    public final void mo21570a(InterfaceC34133Pa interfaceC34133Pa) {
        interfaceC34133Pa.getPluginExtension().reportError(this.f93617a, this.f93618b);
    }
}
