package com.mobilefuse.sdk.state;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AdState.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AdStateKt {
    public static final boolean hasAd(@NotNull Stateful<AdState> hasAd) {
        Intrinsics.checkNotNullParameter(hasAd, "$this$hasAd");
        return hasAd.stateIsNot(AdState.IDLE, AdState.NOT_FILLED, AdState.CLOSED, AdState.DESTROYED);
    }
}
