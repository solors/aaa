package io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes9.dex */
public interface ChargeTypeProvider {
    @Nullable
    Integer getBatteryLevel();

    @NotNull
    ChargeType getChargeType();

    void registerChargeTypeListener(@NotNull ChargeTypeChangeListener chargeTypeChangeListener);
}
