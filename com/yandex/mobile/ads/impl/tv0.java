package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.ironsource.C21114v8;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider;
import com.monetization.ads.nativeads.CustomizableMediaView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class tv0 implements MediatedNativeAdViewProvider {
    @NotNull

    /* renamed from: a */
    private final View f85970a;
    @NotNull

    /* renamed from: b */
    private final f41 f85971b;

    public tv0(@NotNull View nativeAdView, @NotNull f41 nativeAdWeakViewProvider) {
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        Intrinsics.checkNotNullParameter(nativeAdWeakViewProvider, "nativeAdWeakViewProvider");
        this.f85970a = nativeAdView;
        this.f85971b = nativeAdWeakViewProvider;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    @Nullable
    public final TextView getAgeView() {
        View m34235a = this.f85971b.m34235a("age");
        if (m34235a instanceof TextView) {
            return (TextView) m34235a;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    @Nullable
    public final TextView getBodyView() {
        View m34235a = this.f85971b.m34235a("body");
        if (m34235a instanceof TextView) {
            return (TextView) m34235a;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    @Nullable
    public final TextView getCallToActionView() {
        View m34235a = this.f85971b.m34235a("call_to_action");
        if (m34235a instanceof TextView) {
            return (TextView) m34235a;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    @Nullable
    public final TextView getDomainView() {
        View m34235a = this.f85971b.m34235a(C21114v8.C21123i.f54109D);
        if (m34235a instanceof TextView) {
            return (TextView) m34235a;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    @Nullable
    public final ImageView getFeedbackView() {
        View m34235a = this.f85971b.m34235a("feedback");
        if (m34235a instanceof ImageView) {
            return (ImageView) m34235a;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    @Nullable
    public final ImageView getIconView() {
        View m34235a = this.f85971b.m34235a("icon");
        if (m34235a instanceof ImageView) {
            return (ImageView) m34235a;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    @Nullable
    public final FrameLayout getMediaView() {
        View m34235a = this.f85971b.m34235a("media");
        if (m34235a instanceof CustomizableMediaView) {
            return (CustomizableMediaView) m34235a;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    @NotNull
    public final View getNativeAdView() {
        return this.f85970a;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    @Nullable
    public final TextView getPriceView() {
        View m34235a = this.f85971b.m34235a("price");
        if (m34235a instanceof TextView) {
            return (TextView) m34235a;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    @Nullable
    public final View getRatingView() {
        return this.f85971b.m34235a("rating");
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    @Nullable
    public final TextView getReviewCountView() {
        View m34235a = this.f85971b.m34235a("review_count");
        if (m34235a instanceof TextView) {
            return (TextView) m34235a;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    @Nullable
    public final TextView getSponsoredView() {
        View m34235a = this.f85971b.m34235a("sponsored");
        if (m34235a instanceof TextView) {
            return (TextView) m34235a;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    @Nullable
    public final TextView getTitleView() {
        View m34235a = this.f85971b.m34235a("title");
        if (m34235a instanceof TextView) {
            return (TextView) m34235a;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    @Nullable
    public final TextView getWarningView() {
        View m34235a = this.f85971b.m34235a("warning");
        if (m34235a instanceof TextView) {
            return (TextView) m34235a;
        }
        return null;
    }
}
