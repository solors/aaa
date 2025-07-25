package com.mobilefuse.sdk.video;

import com.mobilefuse.sdk.video.ClickthroughBehaviour;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ClickthroughBehaviour.kt */
@Metadata
/* loaded from: classes7.dex */
public final class ClickthroughBehaviourKt {
    public static final boolean canAcceptSource(@NotNull ClickthroughBehaviour canAcceptSource, @NotNull String source) {
        Intrinsics.checkNotNullParameter(canAcceptSource, "$this$canAcceptSource");
        Intrinsics.checkNotNullParameter(source, "source");
        return canAcceptSource.getAcceptableSources$mobilefuse_sdk_common_release().contains(source);
    }

    @Nullable
    public static final ClickthroughBehaviour fromValue(@NotNull ClickthroughBehaviour.Companion fromValue, @NotNull String value) {
        ClickthroughBehaviour[] values;
        Intrinsics.checkNotNullParameter(fromValue, "$this$fromValue");
        Intrinsics.checkNotNullParameter(value, "value");
        for (ClickthroughBehaviour clickthroughBehaviour : ClickthroughBehaviour.values()) {
            if (Intrinsics.m17075f(clickthroughBehaviour.getValue(), value)) {
                return clickthroughBehaviour;
            }
        }
        return null;
    }
}
