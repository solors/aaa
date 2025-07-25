package com.mobilefuse.videoplayer.controller;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.mobilefuse.videoplayer.controller.ExternalFullscreenControlBridge */
/* loaded from: classes7.dex */
public interface VideoPlayerFullscreen {
    void onFullscreenChangeStarted(boolean z, @NotNull Functions<Unit> functions);
}
