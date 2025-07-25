package io.appmetrica.analytics.modulesapi.internal.service;

import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes9.dex */
public abstract class LocationServiceExtension {
    @Nullable
    public abstract Consumer<Location> getLocationConsumer();

    @Nullable
    public abstract Toggle getLocationControllerAppStateToggle();

    @Nullable
    public abstract ModuleLocationSourcesServiceController getLocationSourcesController();
}
