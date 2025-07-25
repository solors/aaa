package com.unity3d.ads.adplayer;

import android.view.InputEvent;
import ge.StateFlow;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WebViewContainer.kt */
@Metadata
/* loaded from: classes7.dex */
public interface WebViewContainer {
    @Nullable
    Object addJavascriptInterface(@NotNull WebViewBridge webViewBridge, @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object destroy(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object evaluateJavascript(@NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @NotNull
    StateFlow<InputEvent> getLastInputEvent();

    @Nullable
    Object loadUrl(@NotNull String str, @NotNull Continuation<? super Unit> continuation);
}
