package com.unity3d.services.core.request.metrics;

import android.text.TextUtils;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.InitializationStatusReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.collections.CollectionsJVM;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MetricSenderWithBatch.kt */
@Metadata
/* loaded from: classes7.dex */
public final class MetricSenderWithBatch extends MetricSenderBase {
    @NotNull
    private SDKMetricsSender _original;
    @NotNull
    private final LinkedBlockingQueue<Metric> _queue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricSenderWithBatch(@NotNull SDKMetricsSender _original, @NotNull InitializationStatusReader initializationStatusReader) {
        super(initializationStatusReader);
        Intrinsics.checkNotNullParameter(_original, "_original");
        Intrinsics.checkNotNullParameter(initializationStatusReader, "initializationStatusReader");
        this._original = _original;
        this._queue = new LinkedBlockingQueue<>();
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    @Nullable
    public String getMetricEndPoint() {
        return this._original.getMetricEndPoint();
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendEvent(@NotNull String event, @Nullable String str, @NotNull Map<String, String> tags) {
        boolean z;
        List<Metric> m17175e;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(tags, "tags");
        if (event.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            m17175e = CollectionsJVM.m17175e(new Metric(event, str, tags));
            sendMetrics(m17175e);
            return;
        }
        DeviceLog.debug("Metric event not sent due to being empty: " + event);
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendMetric(@NotNull Metric metric) {
        List<Metric> m17175e;
        Intrinsics.checkNotNullParameter(metric, "metric");
        m17175e = CollectionsJVM.m17175e(metric);
        sendMetrics(m17175e);
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public synchronized void sendMetrics(@NotNull List<Metric> metrics) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        this._queue.addAll(metrics);
        if (!TextUtils.isEmpty(this._original.getMetricEndPoint()) && this._queue.size() > 0) {
            ArrayList arrayList = new ArrayList();
            this._queue.drainTo(arrayList);
            this._original.sendMetrics(arrayList);
        }
    }

    public final void sendQueueIfNeeded() {
        List<Metric> m17166m;
        m17166m = C37563v.m17166m();
        sendMetrics(m17166m);
    }

    public final void updateOriginal(@NotNull SDKMetricsSender metrics) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        this._original = metrics;
    }
}
