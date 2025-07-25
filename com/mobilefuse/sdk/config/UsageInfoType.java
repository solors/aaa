package com.mobilefuse.sdk.config;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ExternalUsageHelpers.kt */
@Metadata
/* loaded from: classes7.dex */
public enum UsageInfoType {
    MODULE("sdkModule"),
    ADAPTER("sdkAdapter");
    
    @NotNull
    private final String telemetryPrefix;

    UsageInfoType(String str) {
        this.telemetryPrefix = str;
    }

    @NotNull
    public final String getTelemetryPrefix() {
        return this.telemetryPrefix;
    }
}
