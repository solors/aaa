package com.smaato.sdk.video.vast.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.video.vast.utils.VastModels;
import java.util.List;

/* loaded from: classes7.dex */
public class Extension {
    public static final String NAME = "Extension";
    public static final String TYPE = "type";
    @NonNull
    public final List<Verification> adVerifications;
    @Nullable
    public final String type;

    /* loaded from: classes7.dex */
    public static class Builder {
        @Nullable
        private List<Verification> adVerifications;
        @Nullable
        private String type;

        @NonNull
        public Extension build() {
            List<Verification> immutableList = VastModels.toImmutableList(this.adVerifications);
            this.adVerifications = immutableList;
            return new Extension(this.type, immutableList);
        }

        @NonNull
        public Builder setAdVerifications(@Nullable List<Verification> list) {
            this.adVerifications = list;
            return this;
        }

        @NonNull
        public Builder setType(@Nullable String str) {
            this.type = str;
            return this;
        }
    }

    public Extension(@Nullable String str, @NonNull List<Verification> list) {
        this.type = str;
        this.adVerifications = list;
    }
}
