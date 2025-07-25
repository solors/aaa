package com.smaato.sdk.core.util;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public final class Metadata {
    @NonNull
    private final Bundle args;

    /* loaded from: classes7.dex */
    public static class Builder {
        @NonNull
        private final Bundle args = new Bundle();

        @NonNull
        public Metadata build() {
            return new Metadata(this.args);
        }

        @NonNull
        public Builder putInt(@NonNull String str, int i) {
            this.args.putInt(str, i);
            return this;
        }
    }

    @Nullable
    public Integer getInt(@NonNull String str) {
        int i = this.args.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        return Integer.valueOf(i);
    }

    private Metadata(@NonNull Bundle bundle) {
        this.args = (Bundle) Objects.requireNonNull(bundle);
    }
}
