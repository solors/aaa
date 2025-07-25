package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.s4 */
/* loaded from: classes9.dex */
public final class C34874s4 implements ClientStorageProvider {

    /* renamed from: a */
    public final InterfaceC35046yk f95319a;

    public C34874s4(@NotNull InterfaceC35046yk interfaceC35046yk) {
        this.f95319a = interfaceC35046yk;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider
    @NotNull
    public final ModulePreferences modulePreferences(@NotNull String str) {
        return new C33967Ic(str, this.f95319a);
    }
}
