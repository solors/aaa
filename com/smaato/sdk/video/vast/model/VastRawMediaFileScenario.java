package com.smaato.sdk.video.vast.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.utils.VastModels;
import java.util.List;

/* loaded from: classes7.dex */
public final class VastRawMediaFileScenario {
    @Nullable
    public final AdParameters adParameters;
    public final long duration;
    @Nullable
    public final MediaFile mediaFile;
    public final long skipOffset;
    @NonNull
    public final List<Tracking> trackingEvents;
    @Nullable
    public final VastIconScenario vastIconScenario;
    @NonNull
    public final VastScenarioCreativeData vastScenarioCreativeData;
    @Nullable
    public final VideoClicks videoClicks;

    /* loaded from: classes7.dex */
    public static class Builder {
        @Nullable
        private AdParameters adParameters;
        private long duration;
        @Nullable
        private MediaFile mediaFile;
        private long skipOffset;
        @Nullable
        private List<Tracking> trackingEvents;
        @Nullable
        private VastIconScenario vastIconScenario;
        @Nullable
        private VastScenarioCreativeData vastScenarioCreativeData;
        @Nullable
        private VideoClicks videoClicks;

        @NonNull
        public VastRawMediaFileScenario build() {
            Objects.requireNonNull(this.vastScenarioCreativeData, "Cannot build VastMediaFileScenario: vastScenarioCreativeData is missing");
            return new VastRawMediaFileScenario(VastModels.toImmutableList(this.trackingEvents), this.vastScenarioCreativeData, this.mediaFile, this.duration, this.skipOffset, this.adParameters, this.videoClicks, this.vastIconScenario);
        }

        @NonNull
        public Builder setAdParameters(@Nullable AdParameters adParameters) {
            this.adParameters = adParameters;
            return this;
        }

        @NonNull
        public Builder setDuration(long j) {
            this.duration = j;
            return this;
        }

        @NonNull
        public Builder setMediaFile(@Nullable MediaFile mediaFile) {
            this.mediaFile = mediaFile;
            return this;
        }

        @NonNull
        public Builder setSkipOffset(long j) {
            this.skipOffset = j;
            return this;
        }

        @NonNull
        public Builder setTrackingEvents(@Nullable List<Tracking> list) {
            this.trackingEvents = list;
            return this;
        }

        @NonNull
        public Builder setVastIconScenario(@Nullable VastIconScenario vastIconScenario) {
            this.vastIconScenario = vastIconScenario;
            return this;
        }

        @NonNull
        public Builder setVastScenarioCreativeData(@Nullable VastScenarioCreativeData vastScenarioCreativeData) {
            this.vastScenarioCreativeData = vastScenarioCreativeData;
            return this;
        }

        @NonNull
        public Builder setVideoClicks(@Nullable VideoClicks videoClicks) {
            this.videoClicks = videoClicks;
            return this;
        }

        public Builder() {
        }

        private Builder(@NonNull VastRawMediaFileScenario vastRawMediaFileScenario) {
            this.trackingEvents = vastRawMediaFileScenario.trackingEvents;
            this.vastScenarioCreativeData = vastRawMediaFileScenario.vastScenarioCreativeData;
            this.mediaFile = vastRawMediaFileScenario.mediaFile;
            this.duration = vastRawMediaFileScenario.duration;
            this.skipOffset = vastRawMediaFileScenario.skipOffset;
            this.adParameters = vastRawMediaFileScenario.adParameters;
            this.videoClicks = vastRawMediaFileScenario.videoClicks;
            this.vastIconScenario = vastRawMediaFileScenario.vastIconScenario;
        }
    }

    public Builder newBuilder() {
        return new Builder();
    }

    private VastRawMediaFileScenario(@NonNull List<Tracking> list, @NonNull VastScenarioCreativeData vastScenarioCreativeData, @Nullable MediaFile mediaFile, long j, long j2, @Nullable AdParameters adParameters, @Nullable VideoClicks videoClicks, @Nullable VastIconScenario vastIconScenario) {
        this.mediaFile = mediaFile;
        this.vastScenarioCreativeData = vastScenarioCreativeData;
        this.duration = j;
        this.skipOffset = j2;
        this.trackingEvents = list;
        this.adParameters = adParameters;
        this.videoClicks = videoClicks;
        this.vastIconScenario = vastIconScenario;
    }
}
