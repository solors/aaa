package com.yandex.mobile.ads.nativeads;

import android.view.View;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.impl.u41;
import com.yandex.mobile.ads.impl.z31;
import java.util.Map;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.nativeads.g */
/* loaded from: classes8.dex */
public final class C32036g {
    @NotNull
    /* renamed from: a */
    public static z31 m25937a(@NotNull NativeAdViewBinder binder) {
        Map m17284j;
        Intrinsics.checkNotNullParameter(binder, "binder");
        View nativeAdView = binder.getNativeAdView();
        u41 u41Var = u41.f86102c;
        m17284j = C37559r0.m17284j();
        return new z31(new z31.C31951a(nativeAdView, u41Var, m17284j).m26448a(binder.getAgeView()).m26444b(binder.getBodyView()).m26441c(binder.getCallToActionView()).m26438d(binder.getDomainView()).m26450a(binder.getFaviconView()).m26445b(binder.getFeedbackView()).m26442c(binder.getIconView()).m26447a((CustomizableMediaView) binder.getMediaView()).m26436e(binder.getPriceView()).m26453a(binder.getRatingView()).m26434f(binder.getReviewCountView()).m26433g(binder.getSponsoredView()).m26432h(binder.getTitleView()).m26431i(binder.getWarningView()), 0);
    }
}
