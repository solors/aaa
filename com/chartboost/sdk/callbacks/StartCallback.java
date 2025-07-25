package com.chartboost.sdk.callbacks;

import com.chartboost.sdk.events.StartError;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public interface StartCallback {
    void onStartCompleted(@Nullable StartError startError);
}
