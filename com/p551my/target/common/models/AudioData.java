package com.p551my.target.common.models;

import androidx.annotation.NonNull;
import com.p551my.target.AbstractC25730e5;

/* renamed from: com.my.target.common.models.AudioData */
/* loaded from: classes7.dex */
public final class AudioData extends AbstractC25730e5 {
    private int bitrate;

    private AudioData(@NonNull String str) {
        super(str);
    }

    @NonNull
    public static AudioData newAudioData(@NonNull String str) {
        return new AudioData(str);
    }

    public int getBitrate() {
        return this.bitrate;
    }

    public void setBitrate(int i) {
        this.bitrate = i;
    }
}
