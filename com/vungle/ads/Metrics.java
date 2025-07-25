package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.vungle.ads.d1 */
/* loaded from: classes7.dex */
public abstract class Metrics {
    @Nullable
    private String meta;
    @NotNull
    private Sdk$SDKMetric.EnumC29430b metricType;

    public Metrics(@NotNull Sdk$SDKMetric.EnumC29430b metricType) {
        Intrinsics.checkNotNullParameter(metricType, "metricType");
        this.metricType = metricType;
    }

    @Nullable
    public final String getMeta() {
        return this.meta;
    }

    @NotNull
    public final Sdk$SDKMetric.EnumC29430b getMetricType() {
        return this.metricType;
    }

    public abstract long getValue();

    public final void setMeta(@Nullable String str) {
        this.meta = str;
    }

    public final void setMetricType(@NotNull Sdk$SDKMetric.EnumC29430b enumC29430b) {
        Intrinsics.checkNotNullParameter(enumC29430b, "<set-?>");
        this.metricType = enumC29430b;
    }
}
