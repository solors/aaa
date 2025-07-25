package io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public interface ApplicationStateProvider {
    @NotNull
    ApplicationState getCurrentState();

    @NotNull
    ApplicationState registerStickyObserver(@NotNull ApplicationStateObserver applicationStateObserver);
}
