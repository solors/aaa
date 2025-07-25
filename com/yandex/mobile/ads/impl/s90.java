package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class s90 implements t90 {

    /* renamed from: b */
    static final /* synthetic */ KProperty<Object>[] f85152b = {Reflection.m17039e(new MutablePropertyReference1Impl(s90.class, "forceImpressionTrackingListenerReference", "getForceImpressionTrackingListenerReference()Lcom/monetization/ads/base/impression/ForceImpressionTrackingListener;", 0))};
    @NotNull

    /* renamed from: a */
    private final xj1 f85153a = yj1.m26873a();

    @Override // com.yandex.mobile.ads.impl.t90
    /* renamed from: a */
    public final void mo28376a() {
        t90 t90Var = (t90) this.f85153a.getValue(this, f85152b[0]);
        if (t90Var != null) {
            t90Var.mo28376a();
        }
    }

    /* renamed from: a */
    public final void m29671a(@NotNull t90 trackingListener) {
        Intrinsics.checkNotNullParameter(trackingListener, "trackingListener");
        this.f85153a.setValue(this, f85152b[0], trackingListener);
    }
}
