package com.chartboost.sdk.callbacks;

import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ClickEvent;
import com.chartboost.sdk.events.ImpressionEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public interface AdCallback {
    void onAdClicked(@NotNull ClickEvent clickEvent, @Nullable ClickError clickError);

    void onAdLoaded(@NotNull CacheEvent cacheEvent, @Nullable CacheError cacheError);

    void onAdRequestedToShow(@NotNull ShowEvent showEvent);

    void onAdShown(@NotNull ShowEvent showEvent, @Nullable ShowError showError);

    void onImpressionRecorded(@NotNull ImpressionEvent impressionEvent);
}
