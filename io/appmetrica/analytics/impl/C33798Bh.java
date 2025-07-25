package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Bh */
/* loaded from: classes9.dex */
public class C33798Bh implements InterfaceC34133Pa {

    /* renamed from: a */
    public final C34589he f92625a = new C34589he();

    @Override // io.appmetrica.analytics.impl.InterfaceC34133Pa, io.appmetrica.analytics.impl.InterfaceC34204Sa
    /* renamed from: a */
    public final void mo21175a(@NonNull C34145Pm c34145Pm) {
    }

    @Override // io.appmetrica.analytics.IReporter
    @NonNull
    public final IPluginReporter getPluginExtension() {
        return this.f92625a;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable String str2) {
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public void reportEvent(@NonNull ModuleEvent moduleEvent) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34133Pa, io.appmetrica.analytics.impl.InterfaceC34413b0
    /* renamed from: a */
    public final void mo21536a(@NonNull C34217T c34217t) {
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public void reportAdRevenue(@NonNull AdRevenue adRevenue, boolean z) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable String str2, @Nullable Throwable th) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable Throwable th) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, @Nullable String str2) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, @Nullable Map<String, Object> map) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void sendEventsBuffer() {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(@NonNull Map<Thread, StackTraceElement[]> map) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(@NonNull Revenue revenue) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(@NonNull Throwable th) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(@NonNull UserProfile userProfile) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(@Nullable String str) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(@NonNull String str, @Nullable String str2) {
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(@NonNull String str, @Nullable byte[] bArr) {
    }
}
