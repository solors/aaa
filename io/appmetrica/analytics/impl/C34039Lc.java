package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleObserver;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.Lc */
/* loaded from: classes9.dex */
public final class C34039Lc implements ModuleServiceLifecycleController {

    /* renamed from: a */
    public final C34076N1 f93179a;

    public C34039Lc(@NotNull C34076N1 c34076n1) {
        this.f93179a = c34076n1;
    }

    /* renamed from: a */
    public static final void m22473a(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onFirstClientConnected();
    }

    /* renamed from: b */
    public static final void m22472b(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onAllClientsDisconnected();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController
    public final void registerObserver(@NotNull final ModuleServiceLifecycleObserver moduleServiceLifecycleObserver) {
        this.f93179a.m22414b(new InterfaceC34052M1() { // from class: io.appmetrica.analytics.impl.ko
            @Override // io.appmetrica.analytics.impl.InterfaceC34052M1
            /* renamed from: a */
            public final void mo21399a(Intent intent) {
                C34039Lc.m22473a(ModuleServiceLifecycleObserver.this, intent);
            }
        });
        this.f93179a.m22418a(new InterfaceC34052M1() { // from class: io.appmetrica.analytics.impl.lo
            @Override // io.appmetrica.analytics.impl.InterfaceC34052M1
            /* renamed from: a */
            public final void mo21399a(Intent intent) {
                C34039Lc.m22472b(ModuleServiceLifecycleObserver.this, intent);
            }
        });
    }
}
