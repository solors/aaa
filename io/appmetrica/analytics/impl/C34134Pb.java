package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.Pb */
/* loaded from: classes9.dex */
public final class C34134Pb implements LocationReceiverProviderFactory {

    /* renamed from: a */
    public final C34158Qb f93332a = new C34158Qb();

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory
    @NotNull
    public final LocationReceiverProvider getPassiveLocationReceiverProvider() {
        return this.f93332a;
    }
}
