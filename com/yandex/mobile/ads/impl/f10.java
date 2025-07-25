package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.view.View;
import com.ironsource.C21114v8;
import com.yandex.div.core.DivViewFacade;
import java.util.Map;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringNumberConversions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class f10 {
    @NotNull

    /* renamed from: a */
    private final C31223qn f78869a;
    @Nullable

    /* renamed from: b */
    private C31300rn f78870b;

    public f10(@NotNull C31223qn mainClickConnector) {
        Intrinsics.checkNotNullParameter(mainClickConnector, "mainClickConnector");
        this.f78869a = mainClickConnector;
    }

    /* renamed from: a */
    public final void m34393a(@NotNull Uri uri, @NotNull DivViewFacade view) {
        Integer num;
        Map m17284j;
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(view, "view");
        String queryParameter = uri.getQueryParameter("assetName");
        if (queryParameter != null) {
            String queryParameter2 = uri.getQueryParameter(C21114v8.C21122h.f54038L);
            if (queryParameter2 != null) {
                Intrinsics.m17074g(queryParameter2);
                num = StringNumberConversions.m16640m(queryParameter2);
            } else {
                num = null;
            }
            if (num == null) {
                C31223qn c31223qn = this.f78869a;
                View view2 = view.getView();
                Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
                c31223qn.m30260a(view2, queryParameter);
                return;
            }
            C31300rn c31300rn = this.f78870b;
            if (c31300rn == null || (m17284j = c31300rn.m29982a()) == null) {
                m17284j = C37559r0.m17284j();
            }
            C31223qn c31223qn2 = (C31223qn) m17284j.get(num);
            if (c31223qn2 != null) {
                View view3 = view.getView();
                Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
                c31223qn2.m30260a(view3, queryParameter);
            }
        }
    }

    /* renamed from: a */
    public final void m34392a(@Nullable C31300rn c31300rn) {
        this.f78870b = c31300rn;
    }
}
