package com.p551my.target.instreamads;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.my.target.instreamads.InstreamAudioAdPlayer */
/* loaded from: classes7.dex */
public interface InstreamAudioAdPlayer {

    /* renamed from: com.my.target.instreamads.InstreamAudioAdPlayer$AdPlayerListener */
    /* loaded from: classes7.dex */
    public interface AdPlayerListener {
        void onAdAudioCompleted();

        void onAdAudioError(@NonNull String str);

        void onAdAudioPaused();

        void onAdAudioResumed();

        void onAdAudioStarted();

        void onAdAudioStopped();

        void onVolumeChanged(float f);
    }

    void destroy();

    float getAdAudioDuration();

    float getAdAudioPosition();

    @Nullable
    AdPlayerListener getAdPlayerListener();

    @NonNull
    Context getCurrentContext();

    void pauseAdAudio();

    void playAdAudio(@NonNull Uri uri);

    void resumeAdAudio();

    void setAdPlayerListener(@Nullable AdPlayerListener adPlayerListener);

    void setVolume(float f);

    void stopAdAudio();
}
