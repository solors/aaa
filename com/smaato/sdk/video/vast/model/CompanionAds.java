package com.smaato.sdk.video.vast.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import com.smaato.sdk.video.vast.utils.VastModels;
import java.util.List;

/* loaded from: classes7.dex */
public class CompanionAds {
    public static final String COMPANION = "Companion";
    public static final String NAME = "CompanionAds";
    public static final String REQUIRED = "required";
    @NonNull
    public final List<Companion> companions;
    @Nullable
    public final Required required;

    /* loaded from: classes7.dex */
    public static class Builder {
        @Nullable
        private List<Companion> companions;
        @Nullable
        private Required required;

        @NonNull
        public CompanionAds build() throws VastElementMissingException {
            VastModels.requireNonEmpty(this.companions, "Cannot build CompanionAds: companions are missing");
            return new CompanionAds(VastModels.toImmutableList(this.companions), this.required);
        }

        @NonNull
        public Builder setCompanions(@Nullable List<Companion> list) {
            this.companions = list;
            return this;
        }

        @NonNull
        public Builder setRequired(@Nullable Required required) {
            this.required = required;
            return this;
        }
    }

    /* loaded from: classes7.dex */
    public enum Required {
        ALL,
        ANY,
        NONE;

        @Nullable
        public static Required parse(@Nullable String str) {
            Required[] values;
            for (Required required : values()) {
                if (required.name().equalsIgnoreCase(str)) {
                    return required;
                }
            }
            return null;
        }
    }

    CompanionAds(@NonNull List<Companion> list, @Nullable Required required) {
        this.companions = list;
        this.required = required;
    }
}
