package com.unity3d.services.core.cache;

import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CacheEventSender.kt */
@Metadata
/* loaded from: classes7.dex */
public final class CacheEventSender implements Serializable {
    @NotNull
    private final IEventSender eventSender;

    public CacheEventSender(@NotNull IEventSender eventSender) {
        Intrinsics.checkNotNullParameter(eventSender, "eventSender");
        this.eventSender = eventSender;
    }

    public final boolean sendEvent(@NotNull CacheEvent eventId, @NotNull Object... params) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(params, "params");
        return this.eventSender.sendEvent(WebViewEventCategory.CACHE, eventId, Arrays.copyOf(params, params.length));
    }
}
