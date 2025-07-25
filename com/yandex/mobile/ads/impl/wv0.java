package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class wv0 {
    @NotNull

    /* renamed from: a */
    private final Context f87423a;
    @NotNull

    /* renamed from: b */
    private final ru0<?, ?> f87424b;
    @NotNull

    /* renamed from: c */
    private final Map<String, Object> f87425c;

    public wv0(@NotNull Context context, @NotNull ru0 mediatedAdController, @NotNull LinkedHashMap mediatedReportData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediatedAdController, "mediatedAdController");
        Intrinsics.checkNotNullParameter(mediatedReportData, "mediatedReportData");
        this.f87423a = context;
        this.f87424b = mediatedAdController;
        this.f87425c = mediatedReportData;
    }

    /* renamed from: a */
    public final void m27738a() {
        this.f87424b.m29936e(this.f87423a, this.f87425c);
    }
}
