package com.monetization.ads.mediation.nativeads;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public interface MediatedNativeAdViewProvider {
    @Nullable
    TextView getAgeView();

    @Nullable
    TextView getBodyView();

    @Nullable
    TextView getCallToActionView();

    @Nullable
    TextView getDomainView();

    @Nullable
    ImageView getFeedbackView();

    @Nullable
    ImageView getIconView();

    @Nullable
    FrameLayout getMediaView();

    @NotNull
    View getNativeAdView();

    @Nullable
    TextView getPriceView();

    @Nullable
    View getRatingView();

    @Nullable
    TextView getReviewCountView();

    @Nullable
    TextView getSponsoredView();

    @Nullable
    TextView getTitleView();

    @Nullable
    TextView getWarningView();
}
