package com.smaato.sdk.video.vast.buildlight;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.collections.Sets;
import com.smaato.sdk.video.vast.model.VastScenario;
import java.util.Set;

/* loaded from: classes7.dex */
public final class VastScenarioResult {
    @NonNull
    public final Set<String> errorUrls;
    @NonNull
    public final Set<Integer> errors;
    @Nullable
    public final VastScenario vastScenario;

    /* loaded from: classes7.dex */
    public static class Builder {
        @Nullable
        private Set<String> errorUrls;
        @Nullable
        private Set<Integer> errors;
        @Nullable
        private VastScenario vastScenario;

        @NonNull
        public VastScenarioResult build() {
            return new VastScenarioResult(Sets.toImmutableSet(this.errorUrls), Sets.toImmutableSet(this.errors), this.vastScenario);
        }

        @NonNull
        public Builder setErrorUrls(@Nullable Set<String> set) {
            this.errorUrls = set;
            return this;
        }

        @NonNull
        public Builder setErrors(@Nullable Set<Integer> set) {
            this.errors = set;
            return this;
        }

        @NonNull
        public Builder setVastScenario(@Nullable VastScenario vastScenario) {
            this.vastScenario = vastScenario;
            return this;
        }
    }

    private VastScenarioResult(@NonNull Set<String> set, @NonNull Set<Integer> set2, @Nullable VastScenario vastScenario) {
        this.errorUrls = (Set) Objects.requireNonNull(set);
        this.errors = (Set) Objects.requireNonNull(set2);
        this.vastScenario = vastScenario;
    }
}
