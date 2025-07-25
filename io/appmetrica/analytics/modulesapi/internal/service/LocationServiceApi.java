package io.appmetrica.analytics.modulesapi.internal.service;

import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes9.dex */
public interface LocationServiceApi {
    @NotNull
    LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory();

    @Nullable
    Location getLocation();

    @NotNull
    LocationReceiverProviderFactory getLocationReceiverProviderFactory();

    @NotNull
    PermissionExtractor getPermissionExtractor();

    void registerControllerObserver(@NotNull LocationControllerObserver locationControllerObserver);

    void registerSource(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider);

    void registerSource(@NotNull LocationReceiverProvider locationReceiverProvider);

    void unregisterSource(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider);

    void unregisterSource(@NotNull LocationReceiverProvider locationReceiverProvider);

    void updateLocationFilter(@NotNull LocationFilter locationFilter);
}
