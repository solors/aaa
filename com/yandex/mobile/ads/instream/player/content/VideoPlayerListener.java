package com.yandex.mobile.ads.instream.player.content;

import androidx.annotation.MainThread;
import kotlin.Metadata;

@Metadata
@MainThread
/* loaded from: classes8.dex */
public interface VideoPlayerListener {
    void onVideoCompleted();

    void onVideoError();

    void onVideoPaused();

    void onVideoPrepared();

    void onVideoResumed();
}
