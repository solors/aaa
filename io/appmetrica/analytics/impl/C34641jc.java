package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.jc */
/* loaded from: classes9.dex */
public final class C34641jc extends C33798Bh implements InterfaceC33916Ga {
    @Override // io.appmetrica.analytics.impl.InterfaceC33916Ga
    /* renamed from: a */
    public final void mo21516a(@Nullable Activity activity) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33916Ga
    /* renamed from: b */
    public final void mo21508b(@Nullable Activity activity) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33916Ga
    /* renamed from: g */
    public final List<String> mo21504g() {
        return new ArrayList();
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull PluginErrorDetails pluginErrorDetails, @Nullable String str) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33916Ga, io.appmetrica.analytics.impl.InterfaceC34908tc
    /* renamed from: a */
    public final void mo20846a(@Nullable Location location) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33916Ga
    /* renamed from: b */
    public final void mo21507b(@NonNull String str) {
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull String str, @Nullable String str2, @Nullable PluginErrorDetails pluginErrorDetails) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33916Ga
    /* renamed from: a */
    public final void mo21515a(@NonNull AnrListener anrListener) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33916Ga, io.appmetrica.analytics.impl.InterfaceC33791Ba
    /* renamed from: b */
    public final void mo21506b(@NonNull String str, @Nullable String str2) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33916Ga
    /* renamed from: a */
    public final void mo21514a(@NonNull ExternalAttribution externalAttribution) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33916Ga, io.appmetrica.analytics.impl.InterfaceC33791Ba
    /* renamed from: b */
    public final boolean mo21509b() {
        return false;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33916Ga
    /* renamed from: a */
    public final void mo21513a(@NonNull C33904Fn c33904Fn) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33916Ga
    /* renamed from: a */
    public final void mo21512a(@NonNull EnumC34763o enumC34763o) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33916Ga, io.appmetrica.analytics.impl.InterfaceC33791Ba
    /* renamed from: a */
    public final void mo21511a(@NonNull String str) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33916Ga, io.appmetrica.analytics.impl.InterfaceC34908tc
    /* renamed from: a */
    public final void mo20840a(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33916Ga
    /* renamed from: a */
    public final void mo21510a(@NonNull String str, boolean z) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33916Ga, io.appmetrica.analytics.impl.InterfaceC34908tc
    /* renamed from: a */
    public final void mo20839a(boolean z) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33916Ga
    /* renamed from: c */
    public final void mo21505c() {
    }

    @Override // io.appmetrica.analytics.impl.C33798Bh, io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(@NonNull ModuleEvent moduleEvent) {
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(@NonNull PluginErrorDetails pluginErrorDetails) {
    }

    @Override // io.appmetrica.analytics.impl.C33798Bh, io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue, boolean z) {
    }
}
