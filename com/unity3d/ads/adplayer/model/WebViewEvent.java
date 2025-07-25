package com.unity3d.ads.adplayer.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: WebViewEvent.kt */
@Metadata
/* loaded from: classes7.dex */
public interface WebViewEvent {
    @NotNull
    String getCategory();

    @NotNull
    String getName();

    @NotNull
    Object[] getParameters();
}
