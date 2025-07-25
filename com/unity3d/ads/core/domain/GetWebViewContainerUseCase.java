package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.WebViewContainer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GetWebViewContainerUseCase.kt */
@Metadata
/* loaded from: classes7.dex */
public interface GetWebViewContainerUseCase {
    @Nullable
    Object invoke(@NotNull CoroutineScope coroutineScope, @NotNull Continuation<? super WebViewContainer> continuation);
}
