package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.AppMetricaPlugins;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.C0 */
/* loaded from: classes9.dex */
public final class C33806C0 implements AppMetricaPlugins {

    /* renamed from: a */
    public final C33856E0 f92662a;

    public C33806C0(@NotNull C33856E0 c33856e0) {
        this.f92662a = c33856e0;
    }

    @Override // io.appmetrica.analytics.plugins.AppMetricaPlugins
    public final void reportError(@NotNull PluginErrorDetails pluginErrorDetails, @Nullable String str) {
        this.f92662a.m22686a(pluginErrorDetails, str);
    }

    @Override // io.appmetrica.analytics.plugins.AppMetricaPlugins
    public final void reportUnhandledException(@NotNull PluginErrorDetails pluginErrorDetails) {
        this.f92662a.m22687a(pluginErrorDetails);
    }

    public C33806C0() {
        this(new C33856E0());
    }

    @Override // io.appmetrica.analytics.plugins.AppMetricaPlugins
    public final void reportError(@NotNull String str, @Nullable String str2, @Nullable PluginErrorDetails pluginErrorDetails) {
        this.f92662a.m22685a(str, str2, pluginErrorDetails);
    }
}
