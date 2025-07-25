package com.smaato.sdk.video.vast.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.utils.VastModels;
import java.util.List;

/* loaded from: classes7.dex */
public final class VastMediaFileScenario {
    @Nullable
    public final AdParameters adParameters;
    public final long duration;
    @NonNull
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
        public VastMediaFileScenario build() {
            Objects.requireNonNull(this.vastScenarioCreativeData, "Cannot build VastMediaFileScenario: vastScenarioCreativeData is missing");
            Objects.requireNonNull(this.mediaFile, "Cannot build VastMediaFileScenario: mediaFile is missing");
            return new VastMediaFileScenario(this.mediaFile, VastModels.toImmutableList(this.trackingEvents), this.vastScenarioCreativeData, this.duration, this.skipOffset, this.adParameters, this.videoClicks, this.vastIconScenario);
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

        private Builder(@NonNull VastMediaFileScenario vastMediaFileScenario) {
            this.mediaFile = vastMediaFileScenario.mediaFile;
            this.trackingEvents = vastMediaFileScenario.trackingEvents;
            this.vastScenarioCreativeData = vastMediaFileScenario.vastScenarioCreativeData;
            this.duration = vastMediaFileScenario.duration;
            this.skipOffset = vastMediaFileScenario.skipOffset;
            this.adParameters = vastMediaFileScenario.adParameters;
            this.videoClicks = vastMediaFileScenario.videoClicks;
            this.vastIconScenario = vastMediaFileScenario.vastIconScenario;
        }
    }

    public Builder newBuilder() {
        return new Builder();
    }

    private VastMediaFileScenario(@NonNull MediaFile mediaFile, @NonNull List<Tracking> list, @NonNull VastScenarioCreativeData vastScenarioCreativeData, long j, long j2, @Nullable AdParameters adParameters, @Nullable VideoClicks videoClicks, @Nullable VastIconScenario vastIconScenario) {
        this.mediaFile = (MediaFile) Objects.requireNonNull(mediaFile);
        this.trackingEvents = (List) Objects.requireNonNull(list);
        this.vastScenarioCreativeData = (VastScenarioCreativeData) Objects.requireNonNull(vastScenarioCreativeData);
        this.duration = j;
        this.skipOffset = j2;
        this.adParameters = adParameters;
        this.videoClicks = videoClicks;
        this.vastIconScenario = vastIconScenario;
    }
}
