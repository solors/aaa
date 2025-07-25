package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ko */
/* loaded from: classes8.dex */
public final class View$OnClickListenerC30740ko implements View.OnClickListener {
    @NotNull

    /* renamed from: a */
    private final ia0 f81505a;
    @NotNull

    /* renamed from: b */
    private final ra0 f81506b;
    @NotNull

    /* renamed from: c */
    private final InterfaceC31487tu f81507c;

    public View$OnClickListenerC30740ko(@NotNull ia0 fullScreenCloseButtonListener, @NotNull ra0 fullScreenHtmlWebViewAdapter, @NotNull InterfaceC31487tu debugEventsReporter) {
        Intrinsics.checkNotNullParameter(fullScreenCloseButtonListener, "fullScreenCloseButtonListener");
        Intrinsics.checkNotNullParameter(fullScreenHtmlWebViewAdapter, "fullScreenHtmlWebViewAdapter");
        Intrinsics.checkNotNullParameter(debugEventsReporter, "debugEventsReporter");
        this.f81505a = fullScreenCloseButtonListener;
        this.f81506b = fullScreenHtmlWebViewAdapter;
        this.f81507c = debugEventsReporter;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        this.f81506b.mo30093a();
        this.f81505a.mo29676c();
        this.f81507c.mo28635a(EnumC31398su.f85385c);
    }
}
