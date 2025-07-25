package io.bidmachine.media3.common.audio;

import io.bidmachine.media3.common.PlaybackParameters;
import io.bidmachine.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes9.dex */
public interface AudioProcessorChain {
    PlaybackParameters applyPlaybackParameters(PlaybackParameters playbackParameters);

    boolean applySkipSilenceEnabled(boolean z);

    AudioProcessor[] getAudioProcessors();

    long getMediaDuration(long j);

    long getSkippedOutputFrameCount();
}
