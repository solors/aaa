package com.unity3d.ads.core.domain;

import com.unity3d.ads.IUnityAdsTokenListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GetAsyncHeaderBiddingToken.kt */
@Metadata
/* loaded from: classes7.dex */
public interface GetAsyncHeaderBiddingToken {
    @Nullable
    Object invoke(@Nullable IUnityAdsTokenListener iUnityAdsTokenListener, @NotNull Continuation<? super Unit> continuation);
}
