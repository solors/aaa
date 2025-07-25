package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class zd2 {
    @NotNull

    /* renamed from: a */
    private final ac1 f88832a;
    @NotNull

    /* renamed from: b */
    private final nu1 f88833b;

    public zd2(@NotNull ac1 parentHtmlWebView) {
        Intrinsics.checkNotNullParameter(parentHtmlWebView, "parentHtmlWebView");
        this.f88832a = parentHtmlWebView;
        this.f88833b = new nu1();
    }

    /* renamed from: a */
    public final void m26254a(@NotNull final Map<String, String> trackingParameters) {
        Intrinsics.checkNotNullParameter(trackingParameters, "trackingParameters");
        this.f88833b.m31279a(new Runnable() { // from class: com.yandex.mobile.ads.impl.s13
            {
                zd2.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zd2.m26255a(zd2.this, trackingParameters);
            }
        });
    }

    /* renamed from: a */
    public static final void m26255a(zd2 this$0, Map trackingParameters) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(trackingParameters, "$trackingParameters");
        this$0.f88832a.setVisibility(0);
        um0.m28725d(new Object[0]);
        le0 mo34634i = this$0.f88832a.mo34634i();
        if (mo34634i != null) {
            mo34634i.mo28929a(this$0.f88832a, trackingParameters);
        }
    }
}
