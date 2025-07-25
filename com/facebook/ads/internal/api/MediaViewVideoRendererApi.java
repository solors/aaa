package com.facebook.ads.internal.api;

import android.view.View;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Keep;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.VideoStartReason;
import com.inmobi.commons.core.configs.CrashConfig;

@Keep
/* loaded from: classes3.dex */
public interface MediaViewVideoRendererApi extends AdComponentViewApiProvider {
    void destroy();

    void disengageSeek(VideoStartReason videoStartReason);

    void engageSeek();

    @IntRange(from = 0)
    int getCurrentTimeMs();

    @IntRange(from = 0)
    int getDuration();

    View getVideoView();

    @FloatRange(from = 0.0d, m105511to = CrashConfig.DEFAULT_CRASH_SAMPLING_PERCENT)
    float getVolume();

    void initialize(AdViewConstructorParams adViewConstructorParams, MediaViewVideoRenderer mediaViewVideoRenderer);

    void pause(boolean z);

    void play(VideoStartReason videoStartReason);

    void seekTo(@IntRange(from = 0) int i);

    void setVolume(@FloatRange(from = 0.0d, m105511to = 1.0d) float f);

    boolean shouldAutoplay();
}
