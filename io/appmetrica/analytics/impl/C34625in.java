package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceConfiguration;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.in */
/* loaded from: classes9.dex */
public final class C34625in implements InterfaceC34785ol {

    /* renamed from: a */
    public final UtilityServiceProvider f94641a;

    public C34625in(@NotNull UtilityServiceProvider utilityServiceProvider) {
        this.f94641a = utilityServiceProvider;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34785ol
    /* renamed from: a */
    public final void mo20741a(@NotNull C34650jl c34650jl) {
        this.f94641a.updateConfiguration(new UtilityServiceConfiguration(c34650jl.f94742v, c34650jl.f94741u));
    }
}
