package com.mobilefuse.sdk.telemetry;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: TelemetryBaseTypes.kt */
@Metadata
/* loaded from: classes7.dex */
public final class TelemetryCategory {
    @NotNull

    /* renamed from: AD */
    public static final String f61713AD = "ad";
    @NotNull
    public static final String APP = "app";
    @NotNull
    public static final String BID = "bid";
    @NotNull
    public static final String EID = "eid";
    @NotNull
    public static final String EXCEPTION = "exception";
    @NotNull
    public static final TelemetryCategory INSTANCE = new TelemetryCategory();
    @NotNull
    public static final String SDK = "sdk";

    private TelemetryCategory() {
    }
}
