package io.appmetrica.analytics.coreutils.internal.services;

import io.appmetrica.analytics.coreutils.impl.C33723k;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

@Metadata
/* loaded from: classes9.dex */
public final class UtilityServiceProvider {

    /* renamed from: a */
    private final InterfaceC38501j f92449a;

    /* renamed from: b */
    private final WaitForActivationDelayBarrier f92450b;

    public UtilityServiceProvider() {
        InterfaceC38501j m14554a;
        m14554a = LazyJVM.m14554a(new C33723k(this));
        this.f92449a = m14554a;
        this.f92450b = new WaitForActivationDelayBarrier();
    }

    @NotNull
    public final WaitForActivationDelayBarrier getActivationBarrier() {
        return this.f92450b;
    }

    @NotNull
    public final FirstExecutionConditionServiceImpl getFirstExecutionService() {
        return (FirstExecutionConditionServiceImpl) this.f92449a.getValue();
    }

    public final void initAsync() {
        this.f92450b.activate();
    }

    public final void updateConfiguration(@NotNull UtilityServiceConfiguration utilityServiceConfiguration) {
        getFirstExecutionService().updateConfig(utilityServiceConfiguration);
    }
}
