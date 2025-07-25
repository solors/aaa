package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.C29880R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.ab */
/* loaded from: classes8.dex */
public final class C29927ab {
    @NotNull

    /* renamed from: a */
    private final Context f76747a;
    @NotNull

    /* renamed from: b */
    private final C31101pb f76748b;
    @NotNull

    /* renamed from: c */
    private final C31027ob f76749c;
    @NotNull

    /* renamed from: d */
    private final C30227eb f76750d;

    public /* synthetic */ C29927ab(Context context, C31101pb c31101pb) {
        this(context, c31101pb, new C31027ob(), new C30227eb(context, false, 14));
    }

    @SuppressLint({"InflateParams"})
    @NotNull
    /* renamed from: a */
    public final ViewGroup m35931a() {
        View inflate = LayoutInflater.from(this.f76747a).inflate(C29880R.C29885layout.monetization_ads_internal_adtune_container, (ViewGroup) null);
        Intrinsics.m17073h(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup adTuneContainer = (ViewGroup) inflate;
        this.f76749c.getClass();
        Intrinsics.checkNotNullParameter(adTuneContainer, "adTuneContainer");
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) adTuneContainer.findViewById(C29880R.C29884id.adtune_content_container);
        if (extendedViewContainer != null) {
            extendedViewContainer.setMeasureSpecProvider(this.f76750d);
        }
        this.f76749c.getClass();
        Intrinsics.checkNotNullParameter(adTuneContainer, "adTuneContainer");
        ViewGroup viewGroup = (ViewGroup) adTuneContainer.findViewById(C29880R.C29884id.adtune_webview_container);
        if (viewGroup != null) {
            viewGroup.addView(this.f76748b);
        }
        return adTuneContainer;
    }

    public C29927ab(@NotNull Context context, @NotNull C31101pb adtuneWebView, @NotNull C31027ob adtuneViewProvider, @NotNull C30227eb adtuneMeasureSpecProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adtuneWebView, "adtuneWebView");
        Intrinsics.checkNotNullParameter(adtuneViewProvider, "adtuneViewProvider");
        Intrinsics.checkNotNullParameter(adtuneMeasureSpecProvider, "adtuneMeasureSpecProvider");
        this.f76747a = context;
        this.f76748b = adtuneWebView;
        this.f76749c = adtuneViewProvider;
        this.f76750d = adtuneMeasureSpecProvider;
    }
}
