package com.smaato.sdk.core.openmeasurement;

import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public class VideoProps {
    public final boolean isAutoPlay;
    public final boolean isSkippable;
    public final float skipOffset;

    private VideoProps(boolean z, float f) {
        this.isAutoPlay = true;
        this.isSkippable = z;
        this.skipOffset = f;
    }

    @NonNull
    public static VideoProps buildForNonSkippableVideo() {
        return new VideoProps(false);
    }

    @NonNull
    public static VideoProps buildForSkippableVideo(float f) {
        return new VideoProps(true, f);
    }

    private VideoProps(boolean z) {
        this(z, Float.MIN_VALUE);
    }
}
