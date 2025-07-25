package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Metrics.kt */
@Metadata
/* renamed from: com.vungle.ads.v1 */
/* loaded from: classes7.dex */
public final class C29572v1 extends C29136g2 {
    private boolean alreadyLogged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29572v1(@NotNull Sdk$SDKMetric.EnumC29430b metricType) {
        super(metricType);
        Intrinsics.checkNotNullParameter(metricType, "metricType");
    }

    public final boolean alreadyMetered$vungle_ads_release() {
        if (getValueFirst() != null && getValueSecond() != null) {
            return true;
        }
        return false;
    }

    public final boolean isLogged() {
        return this.alreadyLogged;
    }

    @Override // com.vungle.ads.C29136g2
    public void markEnd() {
        if (getValueSecond() == null) {
            super.markEnd();
        }
    }

    public final void markLogged() {
        this.alreadyLogged = true;
    }

    @Override // com.vungle.ads.C29136g2
    public void markStart() {
        if (getValueFirst() == null) {
            super.markStart();
        }
    }
}
