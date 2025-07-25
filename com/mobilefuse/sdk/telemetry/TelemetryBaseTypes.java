package com.mobilefuse.sdk.telemetry;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.mobilefuse.sdk.telemetry.TelemetryBaseActionType */
/* loaded from: classes7.dex */
public enum TelemetryBaseTypes implements TelemetryActionType {
    ACTION_EXCEPTION("exception", "Exception", null, false, false, false, 52, null),
    APP_LAUNCHED("app", "App launched", null, false, false, false, 52, null);
    
    @NotNull
    private final String category;
    private final boolean enabledBreadcrumbSending;
    private final boolean includeImplicitParamsInLogs;
    private final boolean includeInLogsPrinting;
    @NotNull
    private final String logExtraMessage;
    @NotNull
    private final String message;

    TelemetryBaseTypes(String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
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

    /* synthetic */ TelemetryBaseTypes(String str, String str2, String str3, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? true : z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? true : z3);
    }
}
