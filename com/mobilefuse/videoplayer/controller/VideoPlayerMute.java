package com.mobilefuse.videoplayer.controller;

import com.mobilefuse.sdk.MuteChangedListener;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.mobilefuse.videoplayer.controller.MuteController */
/* loaded from: classes7.dex */
public interface VideoPlayerMute {
    @Nullable
    MuteChangedListener getMuteChangedListener();

    boolean isMuteAllowed();

    boolean isMuted();

    void setMuteAllowed();

    void setMuteChangedListener(@Nullable MuteChangedListener muteChangedListener);

    void setMuted(boolean z);
}
