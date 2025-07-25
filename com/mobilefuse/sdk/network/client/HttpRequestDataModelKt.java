package com.mobilefuse.sdk.network.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: HttpRequestDataModel.kt */
@Metadata
/* loaded from: classes7.dex */
public final class HttpRequestDataModelKt {
    @NotNull
    public static final String getTelemetryBody(@NotNull HttpParamsPostBody telemetryBody) {
        Intrinsics.checkNotNullParameter(telemetryBody, "$this$telemetryBody");
        return telemetryBody.getParams().toString();
    }
}
