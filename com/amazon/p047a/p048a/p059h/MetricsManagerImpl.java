package com.amazon.p047a.p048a.p059h;

import com.amazon.p047a.p048a.p071o.KiwiLogger;

/* renamed from: com.amazon.a.a.h.d */
/* loaded from: classes2.dex */
public class MetricsManagerImpl implements MetricsManager {

    /* renamed from: a */
    private static final KiwiLogger f2413a = new KiwiLogger("MetricsManagerImpl");

    /* renamed from: b */
    private MetricBatch f2414b = new MetricBatch();

    @Override // com.amazon.p047a.p048a.p059h.MetricsManager
    /* renamed from: a */
    public synchronized void mo103110a(Metric metric) {
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2413a;
            kiwiLogger.m102829a("Recording Metric: " + metric);
        }
        this.f2414b.m103114a(metric);
    }

    @Override // com.amazon.p047a.p048a.p059h.MetricsManager
    /* renamed from: a */
    public synchronized MetricBatch mo103111a() {
        if (this.f2414b.m103115a()) {
            return this.f2414b;
        }
        MetricBatch metricBatch = this.f2414b;
        this.f2414b = new MetricBatch();
        return metricBatch;
    }
}
