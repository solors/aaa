package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.location.impl.g */
/* loaded from: classes9.dex */
public final class C35087g implements LastKnownLocationExtractorProviderFactory {

    /* renamed from: a */
    public final LastKnownLocationExtractorProvider f95723a;

    /* renamed from: b */
    public final C35083c f95724b = new C35083c("location-module-gpl");

    /* renamed from: c */
    public final C35102v f95725c = new C35102v("network", new C35086f(), "location-module-network");

    /* renamed from: d */
    public final C35102v f95726d = new C35102v("gps", new C35085e(), "location-module-gps");

    public C35087g(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f95723a = lastKnownLocationExtractorProvider;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    @NotNull
    public final LastKnownLocationExtractorProvider getGplLastKnownLocationExtractorProvider() {
        return this.f95724b;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    @NotNull
    public final LastKnownLocationExtractorProvider getGpsLastKnownLocationExtractorProvider() {
        return this.f95726d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    @NotNull
    public final LastKnownLocationExtractorProvider getNetworkLastKnownLocationExtractorProvider() {
        return this.f95725c;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    @NotNull
    public final LastKnownLocationExtractorProvider getPassiveLastKnownLocationExtractorProvider() {
        return this.f95723a;
    }
}
