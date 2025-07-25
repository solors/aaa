package com.smaato.sdk.video.vast.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import com.smaato.sdk.video.vast.utils.VastModels;

/* loaded from: classes7.dex */
public class VastBeacon {

    /* renamed from: ID */
    public static final String f72486ID = "id";
    @Nullable

    /* renamed from: id */
    public final String f72487id;
    @NonNull
    public final String uri;

    /* loaded from: classes7.dex */
    public static class Builder {
        @Nullable

        /* renamed from: id */
        private String f72488id;
        @Nullable
        private String uri;

        @NonNull
        public VastBeacon build() throws VastElementMissingException {
            VastModels.requireNonNull(this.uri, "Cannot build VastBeacon: uri is missing");
            return new VastBeacon(this.uri, this.f72488id);
        }

        @NonNull
        public Builder setId(@Nullable String str) {
            this.f72488id = str;
            return this;
        }

        @NonNull
        public Builder setUri(@Nullable String str) {
            this.uri = str;
            return this;
        }
    }

    VastBeacon(@NonNull String str, @Nullable String str2) {
        this.uri = str;
        this.f72487id = str2;
    }
}
