package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.dg */
/* loaded from: classes8.dex */
public final class View$OnClickListenerC30165dg implements View.OnClickListener {
    @NotNull

    /* renamed from: a */
    private final ib1 f78119a;
    @NotNull

    /* renamed from: b */
    private final String f78120b;
    @NotNull

    /* renamed from: c */
    private final String f78121c;
    @NotNull

    /* renamed from: d */
    private final sa2 f78122d;

    public View$OnClickListenerC30165dg(@NotNull ib1 adClickHandler, @NotNull String url, @NotNull String assetName, @NotNull sa2 videoTracker) {
        Intrinsics.checkNotNullParameter(adClickHandler, "adClickHandler");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        this.f78119a = adClickHandler;
        this.f78120b = url;
        this.f78121c = assetName;
        this.f78122d = videoTracker;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.f78122d.mo29041a(this.f78121c);
        this.f78119a.mo28740a(this.f78120b);
    }
}
