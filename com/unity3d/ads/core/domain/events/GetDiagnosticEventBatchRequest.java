package com.unity3d.ads.core.domain.events;

import gatewayprotocol.p687v1.DiagnosticEventRequestKt;
import gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: GetDiagnosticEventBatchRequest.kt */
@Metadata
/* loaded from: classes7.dex */
public final class GetDiagnosticEventBatchRequest {
    @NotNull
    public final DiagnosticEventRequestOuterClass.DiagnosticEventRequest invoke(@NotNull List<DiagnosticEventRequestOuterClass.DiagnosticEvent> diagnosticEvents) {
        Intrinsics.checkNotNullParameter(diagnosticEvents, "diagnosticEvents");
        DiagnosticEventRequestKt.Dsl.Companion companion = DiagnosticEventRequestKt.Dsl.Companion;
        DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder newBuilder = DiagnosticEventRequestOuterClass.DiagnosticEventRequest.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
        DiagnosticEventRequestKt.Dsl _create = companion._create(newBuilder);
        _create.addAllBatch(_create.getBatch(), diagnosticEvents);
        return _create._build();
    }
}
