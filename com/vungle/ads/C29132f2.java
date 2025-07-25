package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Metrics.kt */
@Metadata
/* renamed from: com.vungle.ads.f2 */
/* loaded from: classes7.dex */
public final class C29132f2 extends Metrics {
    @Nullable
    private Long value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29132f2(@NotNull Sdk$SDKMetric.EnumC29430b metricType) {
        super(metricType);
        Intrinsics.checkNotNullParameter(metricType, "metricType");
    }

    public final void addValue(long j) {
        long j2;
        Long l = this.value;
        if (l != null) {
            j2 = l.longValue();
        } else {
            j2 = 0;
        }
        this.value = Long.valueOf(j2 + j);
    }

    @Nullable
    /* renamed from: getValue  reason: collision with other method in class */
    public final Long m110293getValue() {
        return this.value;
    }

    public final void markTime() {
        this.value = Long.valueOf(System.currentTimeMillis());
    }

    public final void setValue(@Nullable Long l) {
        this.value = l;
    }

    @Override // com.vungle.ads.Metrics
    public long getValue() {
        Long l = this.value;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }
}
