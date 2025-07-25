package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;

/* renamed from: io.appmetrica.analytics.impl.ge */
/* loaded from: classes9.dex */
public final class C34562ge implements IPluginReporter {

    /* renamed from: a */
    public final C34643je f94457a = new C34643je();

    /* renamed from: b */
    public final C34670ke f94458b = new C34670ke();

    /* renamed from: c */
    public final IHandlerExecutor f94459c = C34848r4.m21050i().m21054e().m21639a();

    /* renamed from: d */
    public final Provider f94460d;

    public C34562ge(@NonNull Provider<InterfaceC34133Pa> provider) {
        this.f94460d = provider;
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull PluginErrorDetails pluginErrorDetails, @Nullable String str) {
        C34643je c34643je = this.f94457a;
        c34643je.f94706a.mo20778a(pluginErrorDetails);
        if (c34643je.f94708c.mo20778a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).f95187a) {
            this.f94458b.getClass();
            this.f94459c.execute(new RunnableC34508ee(this, pluginErrorDetails, str));
        }
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(@NonNull PluginErrorDetails pluginErrorDetails) {
        this.f94457a.f94706a.mo20778a(pluginErrorDetails);
        this.f94458b.getClass();
        this.f94459c.execute(new RunnableC34481de(this, pluginErrorDetails));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull String str, @Nullable String str2, @Nullable PluginErrorDetails pluginErrorDetails) {
        this.f94457a.f94707b.mo20778a(str);
        this.f94458b.getClass();
        this.f94459c.execute(new RunnableC34535fe(this, str, str2, pluginErrorDetails));
    }
}
