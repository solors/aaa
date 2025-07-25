package com.mobilefuse.sdk.telemetry;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: TelemetrySdkTypes.kt */
@Metadata
/* loaded from: classes7.dex */
public enum TelemetrySdkActionType implements TelemetryActionType {
    ADVERTISING_ID_OBTAINED("sdk", "Advertising ID obtained", null, false, false, false, 60, null),
    GOOGLE_PLAY_SERVICES_NOT_AVAILABLE("sdk", "Google Play Services is not available. Use zeros for Advertising ID", null, false, false, false, 60, null),
    SDK_SET_PRIVACY_PREFERENCES("sdk", "Set Privacy Preferences", null, false, false, false, 60, null),
    SDK_SET_TEST_MODE_GLOBALLY("sdk", "Set Test Mode globally", null, false, false, false, 60, null),
    SDK_SET_SPOOF_MODE_GLOBALLY("sdk", "Set Spoof Mode globally", null, false, false, false, 60, null),
    EID_REQUEST_SENT(TelemetryCategory.EID, "EID request sent", null, false, false, false, 52, null),
    EID_RESPONSE_RECEIVED(TelemetryCategory.EID, "EID response received", null, false, false, false, 52, null),
    BID_REQUEST_SENT("bid", "Bid Request sent", "Sending Bid Request " + TelemetryHelpersKt.getEscapedName(TelemetryBaseParamType.REQUEST_METHOD) + " request to " + TelemetryHelpersKt.getEscapedName(TelemetryBaseParamType.URL), false, false, false, 56, null),
    BID_RESPONSE_RECEIVED("bid", "Bid Response received", null, false, false, false, 60, null),
    WINING_BID_SELECTED("bid", "Selected winning Bid", null, false, false, false, 60, null),
    BID_INELIGIBLE_RESPONSE("bid", "Bid Response ineligible for impression", null, false, false, false, 60, null),
    AD_INSTANCE_CREATED("ad", "Ad instance created", null, false, false, false, 60, null),
    AD_INSTANCE_DESTROYED("ad", "Ad instance destroyed", null, false, false, false, 60, null),
    AD_INSTANCE_RENDERER_CREATED("ad", "Ad instance renderer created", null, false, false, false, 60, null),
    AD_LOAD_REQUESTED("ad", "Ad instance loadAd() called", null, false, false, false, 60, null),
    AD_BIDDING_LOAD_REQUESTED("ad", "Ad instance loadAdFromBiddingToken() called", null, false, false, false, 60, null),
    AD_SHOW_REQUESTED("ad", "Ad instance showAd() called", null, false, false, false, 60, null),
    AD_INSTANCE_SET_MUTED("ad", "Ad instance setMuted", null, false, false, false, 60, null),
    AD_INSTANCE_SET_TEST_MODE("ad", "Ad instance setTestMode", null, false, false, false, 60, null),
    AD_LIFECYCLE_EVENT("ad", "Ad instance lifecycle event callbacks", null, false, false, false, 60, null);
    
    @NotNull
    private final String category;
    private final boolean enabledBreadcrumbSending;
    private final boolean includeImplicitParamsInLogs;
    private final boolean includeInLogsPrinting;
    @NotNull
    private final String logExtraMessage;
    @NotNull
    private final String message;

    TelemetrySdkActionType(String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.category = str;
        this.message = str2;
        this.logExtraMessage = str3;
        this.enabledBreadcrumbSending = z;
        this.includeInLogsPrinting = z2;
        this.includeImplicitParamsInLogs = z3;
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryActionType
    @NotNull
    public String getCategory() {
        return this.category;
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryActionType
    public boolean getEnabledBreadcrumbSending() {
        return this.enabledBreadcrumbSending;
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryActionType
    public boolean getIncludeImplicitParamsInLogs() {
        return this.includeImplicitParamsInLogs;
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryActionType
    public boolean getIncludeInLogsPrinting() {
        return this.includeInLogsPrinting;
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryActionType
    @NotNull
    public String getLogExtraMessage() {
        return this.logExtraMessage;
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryActionType
    @NotNull
    public String getMessage() {
        return this.message;
    }

    /* synthetic */ TelemetrySdkActionType(String str, String str2, String str3, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? true : z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? true : z3);
    }
}
