package com.mobilefuse.sdk.telemetry;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: TelemetryBaseTypes.kt */
@Metadata
/* loaded from: classes7.dex */
public enum TelemetryBaseParamType implements TelemetryParamType {
    EXCEPTION_DETAILS("exceptionDetails", false, 2, null),
    STATUS_CODE("statusCode", false, 2, null),
    REASON("reason", false, 2, null),
    URL("url", false, 2, null),
    BODY("body", false, 2, null),
    HEADERS("headers", false, 2, null),
    REQUEST_METHOD("requestMethod", false, 2, null),
    REQUEST_ACTION_INSTANCE("requestActionInstance", false),
    DATA_VALID("dataValid", false, 2, null);
    
    private final boolean printInLogs;
    @NotNull
    private final String value;

    TelemetryBaseParamType(String str, boolean z) {
        this.value = str;
        this.printInLogs = z;
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryParamType
    public boolean getPrintInLogs() {
        return this.printInLogs;
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryParamType
    @NotNull
    public String getValue() {
        return this.value;
    }

    /* synthetic */ TelemetryBaseParamType(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? true : z);
    }
}
