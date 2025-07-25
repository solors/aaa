package com.smaato.sdk.video.vast.buildlight;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.collections.Sets;
import com.smaato.sdk.video.vast.model.MediaFile;
import java.util.Set;

/* loaded from: classes7.dex */
public final class MediaFileResult {
    @NonNull
    public final Set<Integer> errors;
    @Nullable
    public final MediaFile mediaFile;

    /* loaded from: classes7.dex */
    public static class Builder {
        @Nullable
        private Set<Integer> errors;
        @Nullable
        private MediaFile mediaFile;

        @NonNull
        public MediaFileResult build() {
            return new MediaFileResult(Sets.toImmutableSet(this.errors), this.mediaFile);
        }

        @NonNull
        public Builder setErrors(@Nullable Set<Integer> set) {
            this.errors = set;
            return this;
        }

        @NonNull
        public Builder setMediaFile(@Nullable MediaFile mediaFile) {
            this.mediaFile = mediaFile;
            return this;
        }
    }

    private MediaFileResult(@NonNull Set<Integer> set, @Nullable MediaFile mediaFile) {
        this.errors = (Set) Objects.requireNonNull(set);
        this.mediaFile = mediaFile;
    }
}
