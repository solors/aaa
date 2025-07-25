package com.smaato.sdk.core.datacollector;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.datacollector.LocationProvider;
import com.smaato.sdk.core.util.Objects;

/* loaded from: classes7.dex */
public class DataCollector {
    @NonNull
    private final LocationProvider locationProvider;
    @NonNull
    private final SystemInfoProvider systemInfoProvider;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataCollector(@NonNull SystemInfoProvider systemInfoProvider, @NonNull LocationProvider locationProvider) {
        this.systemInfoProvider = (SystemInfoProvider) Objects.requireNonNull(systemInfoProvider, "Parameter systemInfoProvider cannot be null for DataCollector::new");
        this.locationProvider = (LocationProvider) Objects.requireNonNull(locationProvider, "Parameter locationProvider cannot be null for DataCollector::new");
    }

    @Nullable
    public LocationProvider.DetectedLocation getLocationData() {
        return this.locationProvider.getLocationData();
    }

    @NonNull
    public SystemInfo getSystemInfo() {
        return this.systemInfoProvider.m39641e();
    }
}
