package com.unity3d.services.core.webview.bridge;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: IEventSender.kt */
@Metadata
/* loaded from: classes7.dex */
public interface IEventSender {
    boolean canSend();

    boolean sendEvent(@NotNull Enum<?> r1, @NotNull Enum<?> r2, @NotNull Object... objArr);
}
