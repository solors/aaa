package com.mobilefuse.sdk.telemetry;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.mobilefuse.sdk.telemetry.TelemetryAdLifecycleEvent */
/* loaded from: classes7.dex */
public final class TelemetrySdkTypes {
    @NotNull
    public static final String AD_CLICKED = "onAdClicked";
    @NotNull
    public static final String AD_CLOSED = "onAdClosed";
    @NotNull
    public static final String AD_COLLAPSED = "onAdCollapsed";
    @NotNull
    public static final String AD_EARNED_REWARD = "onAdEarnedReward";
    @NotNull
    public static final String AD_ERROR = "onAdError";
    @NotNull
    public static final String AD_EXPANDED = "onAdExpanded";
    @NotNull
    public static final String AD_EXPIRED = "onAdExpired";
    @NotNull
    public static final String AD_LOADED = "onAdLoaded";
    @NotNull
    public static final String AD_NOT_FILLED = "onAdNotFilled";
    @NotNull
    public static final String AD_RENDERED = "onAdRendered";
    @NotNull
    public static final TelemetrySdkTypes INSTANCE = new TelemetrySdkTypes();

    private TelemetrySdkTypes() {
    }
}
