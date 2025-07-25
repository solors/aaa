package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.ij */
/* loaded from: classes9.dex */
public final class C34621ij implements InterfaceC34133Pa, IPluginReporter {

    /* renamed from: a */
    public final ArrayList f94635a = new ArrayList();

    /* renamed from: b */
    public volatile C33773Ah f94636b;

    @Override // io.appmetrica.analytics.impl.InterfaceC34133Pa, io.appmetrica.analytics.impl.InterfaceC34204Sa
    /* renamed from: a */
    public final void mo21175a(@NonNull C34145Pm c34145Pm) {
        m21537a(new C34212Si(c34145Pm));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        m21537a(new C34486dj());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        m21537a(new C34069Mi());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(@NonNull String str, @Nullable String str2) {
        m21537a(new C34459cj(str, str2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        m21537a(new C34236Ti(adRevenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(@NonNull Map<Thread, StackTraceElement[]> map) {
        m21537a(new C34405aj(map));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
        m21537a(new C34165Qi(eCommerceEvent));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable Throwable th) {
        m21537a(new C33973Ii(str, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str) {
        m21537a(new C34540fj(str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(@NonNull Revenue revenue) {
        m21537a(new C34141Pi(revenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(@NonNull Throwable th) {
        m21537a(new C34021Ki(th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(@NonNull UserProfile userProfile) {
        m21537a(new C34117Oi(userProfile));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        m21537a(new C34045Li());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void sendEventsBuffer() {
        m21537a(new C34513ej());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z) {
        m21537a(new C34188Ri(z));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(@NonNull String str, @Nullable byte[] bArr) {
        m21537a(new C34356Yi(str, bArr));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(@Nullable String str) {
        m21537a(new C34093Ni(str));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34133Pa, io.appmetrica.analytics.impl.InterfaceC34413b0
    /* renamed from: a */
    public final void mo21536a(@NonNull C34217T c34217t) {
        m21537a(new C34432bj(c34217t));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue, boolean z) {
        m21537a(new C34380Zi(adRevenue, z));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable String str2) {
        m21537a(new C33997Ji(str, str2, null));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, @Nullable String str2) {
        m21537a(new C34567gj(str, str2));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(@NonNull PluginErrorDetails pluginErrorDetails) {
        m21537a(new C34260Ui(pluginErrorDetails));
    }

    /* renamed from: a */
    public final synchronized void m21537a(InterfaceC34109Oa interfaceC34109Oa) {
        if (this.f94636b == null) {
            this.f94635a.add(interfaceC34109Oa);
        } else {
            interfaceC34109Oa.mo21570a(this.f94636b);
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable String str2, @NonNull Throwable th) {
        m21537a(new C33997Ji(str, str2, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, @Nullable Map<String, Object> map) {
        m21537a(new C34594hj(str, map));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull PluginErrorDetails pluginErrorDetails, @Nullable String str) {
        m21537a(new C34284Vi(pluginErrorDetails, str));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(@NonNull ModuleEvent moduleEvent) {
        m21537a(new C34332Xi(moduleEvent));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull String str, @Nullable String str2, @Nullable PluginErrorDetails pluginErrorDetails) {
        m21537a(new C34308Wi(str, str2, pluginErrorDetails));
    }

    @Override // io.appmetrica.analytics.IReporter
    @NonNull
    public final IPluginReporter getPluginExtension() {
        return this;
    }
}
