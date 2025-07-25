package com.unity3d.services.core.request.metrics;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SDKMetricsSender.kt */
@Metadata
/* loaded from: classes7.dex */
public interface SDKMetricsSender {

    /* compiled from: SDKMetricsSender.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static void sendEvent(@NotNull SDKMetricsSender sDKMetricsSender, @NotNull String event) {
            Intrinsics.checkNotNullParameter(event, "event");
            sendEvent$default(sDKMetricsSender, event, null, null, 4, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void sendEvent$default(SDKMetricsSender sDKMetricsSender, String str, String str2, Map map, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str2 = null;
                }
                if ((i & 4) != 0) {
                    map = C37559r0.m17284j();
                }
                sDKMetricsSender.sendEvent(str, str2, map);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendEvent");
        }
    }

    @Nullable
    String getMetricEndPoint();

    void sendEvent(@NotNull String str);

    void sendEvent(@NotNull String str, @Nullable String str2, @NotNull Map<String, String> map);

    void sendMetric(@NotNull Metric metric);

    void sendMetricWithInitState(@NotNull Metric metric);

    void sendMetrics(@NotNull List<Metric> list);
}
