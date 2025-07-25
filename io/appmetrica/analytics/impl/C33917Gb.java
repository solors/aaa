package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.Gb */
/* loaded from: classes9.dex */
public final class C33917Gb implements InterfaceC33867Eb {

    /* renamed from: a */
    public final C34112Od f92904a = new C34112Od();

    /* renamed from: b */
    public final C34802pb f92905b = new C34802pb();

    /* renamed from: c */
    public final C34134Pb f92906c = new C34134Pb();

    @Override // io.appmetrica.analytics.impl.InterfaceC33867Eb
    /* renamed from: a */
    public final void mo22587a(@NotNull Object obj) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    @NotNull
    public final LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory() {
        return this.f92905b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33867Eb, io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    @Nullable
    public final Location getLocation() {
        return null;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    @NotNull
    public final LocationReceiverProviderFactory getLocationReceiverProviderFactory() {
        return this.f92906c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    @NotNull
    public final PermissionExtractor getPermissionExtractor() {
        return this.f92904a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33867Eb
    /* renamed from: a */
    public final void mo22586a(boolean z) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(@NotNull LocationReceiverProvider locationReceiverProvider) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(@NotNull LocationReceiverProvider locationReceiverProvider) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33867Eb
    public final void init() {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33867Eb
    /* renamed from: b */
    public final void mo22585b(@NotNull Object obj) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerControllerObserver(@NotNull LocationControllerObserver locationControllerObserver) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void updateLocationFilter(@NotNull LocationFilter locationFilter) {
    }
}
