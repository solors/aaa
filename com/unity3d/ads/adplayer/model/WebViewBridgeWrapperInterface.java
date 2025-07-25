package com.unity3d.ads.adplayer.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.unity3d.ads.adplayer.model.WebViewBridgeInterface */
/* loaded from: classes7.dex */
public interface WebViewBridgeWrapperInterface {
    void handleCallback(@NotNull String str, @NotNull String str2, @NotNull String str3);

    void handleInvocation(@NotNull String str);
}
