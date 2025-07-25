package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.Wi */
/* loaded from: classes9.dex */
public final class C34308Wi implements InterfaceC34109Oa {

    /* renamed from: a */
    public final /* synthetic */ String f93657a;

    /* renamed from: b */
    public final /* synthetic */ String f93658b;

    /* renamed from: c */
    public final /* synthetic */ PluginErrorDetails f93659c;

    public C34308Wi(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f93657a = str;
        this.f93658b = str2;
        this.f93659c = pluginErrorDetails;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34109Oa
    /* renamed from: a */
    public final void mo21570a(InterfaceC34133Pa interfaceC34133Pa) {
        interfaceC34133Pa.getPluginExtension().reportError(this.f93657a, this.f93658b, this.f93659c);
    }
}
