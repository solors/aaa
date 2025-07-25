package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Metrics.kt */
@Metadata
/* renamed from: com.vungle.ads.g2 */
/* loaded from: classes7.dex */
public class C29136g2 extends AbstractC29561r0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29136g2(@NotNull Sdk$SDKMetric.EnumC29430b metricType) {
        super(metricType);
        Intrinsics.checkNotNullParameter(metricType, "metricType");
    }

    private final long getCurrentTime() {
        return System.currentTimeMillis();
    }

    public final long calculateIntervalDuration() {
        long j;
        long currentTime = getCurrentTime();
        Long valueSecond = getValueSecond();
        if (valueSecond != null) {
            j = valueSecond.longValue();
        } else {
            j = currentTime;
        }
        Long valueFirst = getValueFirst();
        if (valueFirst != null) {
            currentTime = valueFirst.longValue();
        }
        return j - currentTime;
    }

    @Override // com.vungle.ads.Metrics
    public long getValue() {
        return calculateIntervalDuration();
    }

    public void markEnd() {
        setValueSecond(Long.valueOf(getCurrentTime()));
    }

    public void markStart() {
        setValueFirst(Long.valueOf(getCurrentTime()));
    }
}
