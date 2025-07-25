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

/* renamed from: com.yandex.mobile.ads.impl.fb */
/* loaded from: classes8.dex */
public final class C30303fb {
    @NotNull

    /* renamed from: a */
    private final Context f79035a;
    @NotNull

    /* renamed from: b */
    private final C30616jb f79036b;
    @NotNull

    /* renamed from: c */
    private final C31027ob f79037c;
    @NotNull

    /* renamed from: d */
    private final C30227eb f79038d;

    public /* synthetic */ C30303fb(Context context, C30616jb c30616jb) {
        this(context, c30616jb, new C31027ob(), new C30227eb(context, true, 12));
    }

    @SuppressLint({"InflateParams"})
    @NotNull
    /* renamed from: a */
    public final ViewGroup m34181a() {
        View inflate = LayoutInflater.from(this.f79035a).inflate(C29880R.C29885layout.monetization_ads_internal_adtune_container, (ViewGroup) null);
        Intrinsics.m17073h(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup adTuneContainer = (ViewGroup) inflate;
        this.f79037c.getClass();
        Intrinsics.checkNotNullParameter(adTuneContainer, "adTuneContainer");
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) adTuneContainer.findViewById(C29880R.C29884id.adtune_content_container);
        if (extendedViewContainer != null) {
            extendedViewContainer.setMeasureSpecProvider(this.f79038d);
        }
        this.f79037c.getClass();
        Intrinsics.checkNotNullParameter(adTuneContainer, "adTuneContainer");
        ViewGroup viewGroup = (ViewGroup) adTuneContainer.findViewById(C29880R.C29884id.adtune_webview_container);
        if (viewGroup != null) {
            viewGroup.addView(this.f79036b);
        }
        return adTuneContainer;
    }

    public C30303fb(@NotNull Context context, @NotNull C30616jb adtuneOptOutWebView, @NotNull C31027ob adtuneViewProvider, @NotNull C30227eb adtuneMeasureSpecProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adtuneOptOutWebView, "adtuneOptOutWebView");
        Intrinsics.checkNotNullParameter(adtuneViewProvider, "adtuneViewProvider");
        Intrinsics.checkNotNullParameter(adtuneMeasureSpecProvider, "adtuneMeasureSpecProvider");
        this.f79035a = context;
        this.f79036b = adtuneOptOutWebView;
        this.f79037c = adtuneViewProvider;
        this.f79038d = adtuneMeasureSpecProvider;
    }
}
