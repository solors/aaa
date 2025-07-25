package com.unity3d.ads.core.data.repository;

import gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.p687v1.NativeConfigurationOuterClass;
import ge.SharedFlow;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: DiagnosticEventRepository.kt */
@Metadata
/* loaded from: classes7.dex */
public interface DiagnosticEventRepository {
    void addDiagnosticEvent(@NotNull DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent);

    void clear();

    void configure(@NotNull NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEventsConfiguration);

    void flush();

    @NotNull
    SharedFlow<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> getDiagnosticEvents();
}
