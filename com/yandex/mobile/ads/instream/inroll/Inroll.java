package com.yandex.mobile.ads.instream.inroll;

import androidx.annotation.MainThread;
import com.yandex.mobile.ads.instream.InstreamAdBreak;
import com.yandex.mobile.ads.instream.InstreamAdBreakEventListener;
import com.yandex.mobile.ads.instream.player.p625ad.InstreamAdPlayer;
import com.yandex.mobile.ads.instream.player.p625ad.InstreamAdView;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
@MainThread
/* loaded from: classes8.dex */
public interface Inroll {
    @NotNull
    InstreamAdBreak getInstreamAdBreak();

    void invalidate();

    void pause();

    void play(@NotNull InstreamAdView instreamAdView);

    void prepare(@NotNull InstreamAdPlayer instreamAdPlayer);

    void resume();

    void setListener(@Nullable InstreamAdBreakEventListener instreamAdBreakEventListener);

    void setVideoAdPlaybackListener(@Nullable VideoAdPlaybackListener videoAdPlaybackListener);
}
