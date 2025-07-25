package com.chartboost.sdk.callbacks;

import com.chartboost.sdk.events.DismissEvent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public interface DismissibleAdCallback extends AdCallback {
    void onAdDismiss(@NotNull DismissEvent dismissEvent);
}
