package com.smaato.sdk.richmedia.mraid.dataprovider;

import android.media.AudioManager;
import android.net.Uri;
import android.provider.Settings;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public final class MusicPlaybackVolume {
    private static final Uri TARGET_URI = Settings.System.CONTENT_URI.buildUpon().appendPath("volume_music_speaker").build();
    @Nullable
    private final AudioManager audioManager;
    private final int maxVolume;

    public MusicPlaybackVolume(@Nullable AudioManager audioManager) {
        int streamMaxVolume;
        this.audioManager = audioManager;
        if (audioManager == null) {
            streamMaxVolume = Integer.MAX_VALUE;
        } else {
            streamMaxVolume = audioManager.getStreamMaxVolume(3);
        }
        this.maxVolume = streamMaxVolume;
    }

    public int getCurrentVolume() {
        AudioManager audioManager = this.audioManager;
        if (audioManager == null) {
            return 0;
        }
        return audioManager.getStreamVolume(3);
    }

    public int getMaxVolume() {
        return this.maxVolume;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public Uri getUri() {
        return TARGET_URI;
    }
}
