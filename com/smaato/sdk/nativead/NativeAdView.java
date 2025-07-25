package com.smaato.sdk.nativead;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public interface NativeAdView {
    @Nullable
    TextView ctaView();

    @Nullable
    View iconView();

    @Nullable
    View mediaView();

    @Nullable
    View privacyView();

    @Nullable
    View ratingView();

    @Nullable
    View richMediaView();

    @Nullable
    TextView sponsoredView();

    @Nullable
    TextView textView();

    @Nullable
    TextView titleView();

    @Nullable
    View videoView();
}
