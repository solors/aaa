package io.appmetrica.analytics.coreapi.internal.control;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public interface Toggle {
    boolean getActualState();

    void registerObserver(@NotNull ToggleObserver toggleObserver, boolean z);

    void removeObserver(@NotNull ToggleObserver toggleObserver);
}
