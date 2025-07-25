package com.unity3d.services.core.webview.bridge;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: INativeCallbackSubject.kt */
@Metadata
/* loaded from: classes7.dex */
public interface INativeCallbackSubject {
    @NotNull
    NativeCallback getCallback(@NotNull String str);

    void remove(@NotNull NativeCallback nativeCallback);
}
