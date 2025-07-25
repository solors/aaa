package com.smaato.sdk.video.vast.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import com.smaato.sdk.video.vast.utils.VastModels;
import java.util.List;

/* loaded from: classes7.dex */
public final class VastIconScenario {
    @Nullable
    public final String apiFramework;
    public final long duration;
    @Nullable
    public final Float height;
    @Nullable
    public final IconClicks iconClicks;
    @NonNull
    public final List<String> iconViewTrackings;
    public final long offset;
    @Nullable
    public final String program;
    @Nullable
    public final Float pxRatio;
    @NonNull
    public final VastScenarioResourceData resourceData;
    @Nullable
    public final Float width;
    @Nullable
    public final String xPosition;
    @Nullable
    public final String yPosition;

    /* loaded from: classes7.dex */
    public static class Builder {
        @Nullable
        private String apiFramework;
        private long duration;
        @Nullable
        private Float height;
        @Nullable
        private IconClicks iconClicks;
        @Nullable
        private List<String> iconViewTrackings;
        private long offset;
        @Nullable
        private String program;
        @Nullable
        private Float pxRatio;
        @Nullable
        private VastScenarioResourceData resourceData;
        @Nullable
        private Float width;
        @Nullable
        private String xPosition;
        @Nullable
        private String yPosition;

        @NonNull
        public VastIconScenario build() throws VastElementMissingException {
            VastModels.requireNonNull(this.resourceData, "Cannot build VastIconScenario: resourceData is missing");
            return new VastIconScenario(this.resourceData, VastModels.toImmutableList(this.iconViewTrackings), this.width, this.height, this.program, this.xPosition, this.yPosition, this.offset, this.duration, this.pxRatio, this.iconClicks, this.apiFramework);
        }

        @NonNull
        public Builder setApiFramework(@Nullable String str) {
            this.apiFramework = str;
            return this;
        }

        @NonNull
        public Builder setDuration(long j) {
            this.duration = j;
            return this;
        }

        @NonNull
        public Builder setHeight(@Nullable Float f) {
            this.height = f;
            return this;
        }

        @NonNull
        public Builder setIconClicks(@Nullable IconClicks iconClicks) {
            this.iconClicks = iconClicks;
            return this;
        }

        @NonNull
        public Builder setIconViewTrackings(@Nullable List<String> list) {
            this.iconViewTrackings = list;
            return this;
        }

        @NonNull
        public Builder setOffset(long j) {
            this.offset = j;
            return this;
        }

        @NonNull
        public Builder setProgram(@Nullable String str) {
            this.program = str;
            return this;
        }

        @NonNull
        public Builder setPxRatio(@Nullable Float f) {
            this.pxRatio = f;
            return this;
        }

        @NonNull
        public Builder setVastScenarioResourceData(@Nullable VastScenarioResourceData vastScenarioResourceData) {
            this.resourceData = vastScenarioResourceData;
            return this;
        }

        @NonNull
        public Builder setWidth(@Nullable Float f) {
            this.width = f;
            return this;
        }

        @NonNull
        public Builder setXPosition(@Nullable String str) {
            this.xPosition = str;
            return this;
        }

        @NonNull
        public Builder setYPosition(@Nullable String str) {
            this.yPosition = str;
            return this;
        }
    }

    private VastIconScenario(@NonNull VastScenarioResourceData vastScenarioResourceData, @NonNull List<String> list, @Nullable Float f, @Nullable Float f2, @Nullable String str, @Nullable String str2, @Nullable String str3, long j, long j2, @Nullable Float f3, @Nullable IconClicks iconClicks, @Nullable String str4) {
        this.iconViewTrackings = list;
        this.resourceData = vastScenarioResourceData;
        this.program = str;
        this.width = f;
        this.height = f2;
        this.xPosition = str2;
        this.yPosition = str3;
        this.offset = j;
        this.duration = j2;
        this.pxRatio = f3;
        this.iconClicks = iconClicks;
        this.apiFramework = str4;
    }
}
