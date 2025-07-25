package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.location.impl.o */
/* loaded from: classes9.dex */
public final class C35095o implements LocationReceiverProviderFactory {

    /* renamed from: a */
    public final C35097q f95749a;

    public C35095o(@NotNull C35097q c35097q) {
        this.f95749a = c35097q;
    }

    @NotNull
    /* renamed from: a */
    public final C35097q m20680a() {
        return this.f95749a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory
    public final LocationReceiverProvider getPassiveLocationReceiverProvider() {
        return this.f95749a;
    }
}
