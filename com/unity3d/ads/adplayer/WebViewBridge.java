package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.WebViewEvent;
import ge.SharedFlow;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WebViewBridge.kt */
@Metadata
/* loaded from: classes7.dex */
public interface WebViewBridge {
    @NotNull
    SharedFlow<Invocation> getOnInvocation();

    void handleCallback(@NotNull String str, @NotNull String str2, @NotNull String str3);

    void handleInvocation(@NotNull String str);

    @Nullable
    Object request(@NotNull String str, @NotNull String str2, @NotNull Object[] objArr, @NotNull Continuation<? super Object[]> continuation);

    @Nullable
    Object sendEvent(@NotNull WebViewEvent webViewEvent, @NotNull Continuation<? super Unit> continuation);
}
