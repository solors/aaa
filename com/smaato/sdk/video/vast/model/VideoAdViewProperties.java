package com.smaato.sdk.video.vast.model;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import com.smaato.sdk.video.vast.model.AutoValue_VideoAdViewProperties;

@AutoValue
/* loaded from: classes7.dex */
public abstract class VideoAdViewProperties {

    @AutoValue.Builder
    /* loaded from: classes7.dex */
    public static abstract class Builder {
        public abstract VideoAdViewProperties build();

        public abstract Builder closeButtonSize(int i);

        public abstract Builder isClickable(boolean z);

        public abstract Builder isSkippable(boolean z);

        public abstract Builder isSoundOn(boolean z);

        public abstract Builder skipInterval(long j);
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_VideoAdViewProperties.C27732b();
    }

    public abstract int closeButtonSize();

    public abstract boolean isClickable();

    public abstract boolean isSkippable();

    public abstract boolean isSoundOn();

    public abstract long skipInterval();
}
