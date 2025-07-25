package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.widget.PopupMenu;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class nw1 {
    @NotNull

    /* renamed from: a */
    private final C30359g3 f83167a;
    @NotNull

    /* renamed from: b */
    private final o11 f83168b;
    @NotNull

    /* renamed from: c */
    private final e21 f83169c;
    @NotNull

    /* renamed from: d */
    private final f61 f83170d;
    @NotNull

    /* renamed from: e */
    private final sw1 f83171e;

    public nw1(@NotNull Context context, @NotNull C30359g3 adConfiguration, @NotNull C30149d8<?> adResponse, @NotNull o11 clickReporterCreator, @NotNull e21 nativeAdEventController, @NotNull v31 nativeAdViewAdapter, @NotNull f61 nativeOpenUrlHandlerCreator, @NotNull sw1 socialMenuCreator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(clickReporterCreator, "clickReporterCreator");
        Intrinsics.checkNotNullParameter(nativeAdEventController, "nativeAdEventController");
        Intrinsics.checkNotNullParameter(nativeAdViewAdapter, "nativeAdViewAdapter");
        Intrinsics.checkNotNullParameter(nativeOpenUrlHandlerCreator, "nativeOpenUrlHandlerCreator");
        Intrinsics.checkNotNullParameter(socialMenuCreator, "socialMenuCreator");
        this.f83167a = adConfiguration;
        this.f83168b = clickReporterCreator;
        this.f83169c = nativeAdEventController;
        this.f83170d = nativeOpenUrlHandlerCreator;
        this.f83171e = socialMenuCreator;
    }

    /* renamed from: a */
    public final void m31255a(@NotNull View view, @NotNull ew1 action) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(action, "action");
        List<hw1> m34415c = action.m34415c();
        if (!m34415c.isEmpty()) {
            PopupMenu m29520a = this.f83171e.m29520a(view, m34415c);
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            m29520a.setOnMenuItemClickListener(new mw1(new u12(new C30710k9(context, this.f83167a)), this.f83168b, m34415c, this.f83169c, this.f83170d));
            m29520a.show();
        }
    }
}
