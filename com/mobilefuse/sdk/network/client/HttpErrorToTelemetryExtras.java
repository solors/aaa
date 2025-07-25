package com.mobilefuse.sdk.network.client;

import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.network.client.HttpError;
import com.mobilefuse.sdk.telemetry.TelemetryActionParam;
import com.mobilefuse.sdk.telemetry.TelemetryBaseParamType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.mobilefuse.sdk.network.client.HttpErrorToTelemetryExtrasKt */
/* loaded from: classes7.dex */
public final class HttpErrorToTelemetryExtras {
    @NotNull
    public static final List<TelemetryActionParam> toHttpTelemetryExtras(@NotNull HttpError.ConnectionError toHttpTelemetryExtras) {
        List<TelemetryActionParam> m17160s;
        Intrinsics.checkNotNullParameter(toHttpTelemetryExtras, "$this$toHttpTelemetryExtras");
        m17160s = C37563v.m17160s(new TelemetryActionParam(TelemetryBaseParamType.STATUS_CODE, Integer.valueOf(toHttpTelemetryExtras.getStatusCode()), true));
        toTelemetryExtras(toHttpTelemetryExtras);
        return m17160s;
    }

    @NotNull
    public static final List<TelemetryActionParam> toTelemetryExtras(@NotNull BaseError toTelemetryExtras) {
        Intrinsics.checkNotNullParameter(toTelemetryExtras, "$this$toTelemetryExtras");
        ArrayList arrayList = new ArrayList();
        String message = toTelemetryExtras.getMessage();
        if (message != null) {
            TelemetryBaseParamType telemetryBaseParamType = TelemetryBaseParamType.REASON;
            arrayList.add(new TelemetryActionParam(telemetryBaseParamType, "Error Message: " + message, true));
        }
        return arrayList;
    }
}
