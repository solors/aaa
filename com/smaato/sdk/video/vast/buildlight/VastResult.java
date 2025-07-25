package com.smaato.sdk.video.vast.buildlight;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.collections.Sets;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes7.dex */
public final class VastResult<Result> {
    @NonNull
    public final Set<Integer> errors;
    @Nullable
    public final Result value;

    /* loaded from: classes7.dex */
    public static class Builder<Result> {
        @Nullable
        private Set<Integer> errors;
        @Nullable
        private Result value;

        @NonNull
        public VastResult<Result> build() {
            if (this.value == null && this.errors == null) {
                throw new IllegalStateException("VastResult should contain value or list of errors at least");
            }
            return new VastResult<>(Sets.toImmutableSet(this.errors), this.value);
        }

        @NonNull
        public Builder<Result> setErrors(@Nullable Set<Integer> set) {
            this.errors = set;
            return this;
        }

        @NonNull
        public Builder<Result> setResult(@Nullable Result result) {
            this.value = result;
            return this;
        }
    }

    @NonNull
    public static <Result> VastResult<Result> error(int i) {
        return new VastResult<>(Collections.singleton(Integer.valueOf(i)), null);
    }

    private VastResult(@NonNull Set<Integer> set, @Nullable Result result) {
        this.errors = (Set) Objects.requireNonNull(set);
        this.value = result;
    }

    @NonNull
    public static <Result> VastResult<Result> error(@NonNull Set<Integer> set) {
        return new VastResult<>(set, null);
    }
}
