package com.mobilefuse.videoplayer.controller;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VideoPlayerFullscreen.kt */
@Metadata
/* loaded from: classes7.dex */
public interface FullscreenController {
    void enableExternalFullscreenControl(@NotNull VideoPlayerFullscreen videoPlayerFullscreen);

    boolean getEnterFullscreenOnVideoTap();

    boolean getFullscreen();

    boolean getFullscreenAllowed();

    @Nullable
    FullscreenChangedListener getFullscreenChangedListener();

    void setEnterFullscreenOnVideoTap(boolean z);

    void setFullscreen(boolean z);

    void setFullscreenAllowed();

    void setFullscreenChangedListener(@Nullable FullscreenChangedListener fullscreenChangedListener);
}
