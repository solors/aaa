package com.unity3d.services.core.request.metrics;

import com.unity3d.services.core.properties.InitializationStatusReader;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.collections.MapsJVM;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.C38513v;

/* compiled from: MetricSenderBase.kt */
@Metadata
/* loaded from: classes7.dex */
public abstract class MetricSenderBase implements SDKMetricsSender {
    @NotNull
    private final InitializationStatusReader _initStatusReader;

    public MetricSenderBase(@NotNull InitializationStatusReader _initStatusReader) {
        Intrinsics.checkNotNullParameter(_initStatusReader, "_initStatusReader");
        this._initStatusReader = _initStatusReader;
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendEvent(@NotNull String str) {
        SDKMetricsSender.DefaultImpls.sendEvent(this, str);
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendMetricWithInitState(@NotNull Metric metric) {
        Map m17291g;
        Map m17276r;
        Intrinsics.checkNotNullParameter(metric, "metric");
        m17291g = MapsJVM.m17291g(C38513v.m14532a("state", this._initStatusReader.getInitializationStateString(SdkProperties.getCurrentInitializationState())));
        m17276r = C37559r0.m17276r(metric.getTags(), m17291g);
        sendMetric(Metric.copy$default(metric, null, null, m17276r, 3, null));
    }
}
