package com.smaato.sdk.richmedia.mraid.dataprovider;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import java.util.Locale;

/* loaded from: classes7.dex */
public final class MraidAudioVolumeLevel {
    @Nullable
    private final String audioVolumeLevel;

    private MraidAudioVolumeLevel(@Nullable String str) {
        this.audioVolumeLevel = str;
    }

    @NonNull
    public static MraidAudioVolumeLevel create(int i, int i2) {
        if (i2 == 0) {
            return new MraidAudioVolumeLevel(null);
        }
        return new MraidAudioVolumeLevel(String.format(Locale.US, "%.1f", Float.valueOf((i * 100.0f) / i2)));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MraidAudioVolumeLevel.class == obj.getClass()) {
            return Objects.equals(this.audioVolumeLevel, ((MraidAudioVolumeLevel) obj).audioVolumeLevel);
        }
        return false;
    }

    @Nullable
    public String getAudioVolumeLevel() {
        return this.audioVolumeLevel;
    }

    public int hashCode() {
        return Objects.hash(this.audioVolumeLevel);
    }
}
