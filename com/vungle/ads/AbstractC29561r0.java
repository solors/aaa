package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Metrics.kt */
@Metadata
/* renamed from: com.vungle.ads.r0 */
/* loaded from: classes7.dex */
public abstract class AbstractC29561r0 extends Metrics {
    @Nullable
    private Long valueFirst;
    @Nullable
    private Long valueSecond;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC29561r0(@NotNull Sdk$SDKMetric.EnumC29430b metricType) {
        super(metricType);
        Intrinsics.checkNotNullParameter(metricType, "metricType");
    }

    @Nullable
    public final Long getValueFirst() {
        return this.valueFirst;
    }

    @Nullable
    public final Long getValueSecond() {
        return this.valueSecond;
    }

    public final void setValueFirst(@Nullable Long l) {
        this.valueFirst = l;
    }

    public final void setValueSecond(@Nullable Long l) {
        this.valueSecond = l;
    }
}
