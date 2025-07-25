package com.smaato.sdk.video.vast.model;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public class UniversalAdId {
    public static final UniversalAdId DEFAULT = new UniversalAdId("unknown", "unknown", "unknown");
    static final String DEFAULT_VALUE = "unknown";
    public static final String ID_REGISTRY = "idRegistry";
    public static final String ID_VALUE = "idValue";
    public static final String NAME = "UniversalAdId";
    @NonNull
    public final String idRegistry;
    @NonNull
    public final String idValue;
    @NonNull
    public final String value;

    /* loaded from: classes7.dex */
    public static class Builder {
        @Nullable
        private String idRegistry;
        @Nullable
        private String idValue;
        @Nullable
        private String value;

        @NonNull
        public UniversalAdId build() {
            if (TextUtils.isEmpty(this.value) && TextUtils.isEmpty(this.idValue) && TextUtils.isEmpty(this.idRegistry)) {
                return UniversalAdId.DEFAULT;
            }
            if (TextUtils.isEmpty(this.idRegistry)) {
                this.idRegistry = "unknown";
            }
            if (TextUtils.isEmpty(this.idValue)) {
                this.idValue = "unknown";
            }
            if (TextUtils.isEmpty(this.value)) {
                this.value = "unknown";
            }
            return new UniversalAdId(this.idRegistry, this.idValue, this.value);
        }

        @NonNull
        public Builder setIdRegistry(@Nullable String str) {
            this.idRegistry = str;
            return this;
        }

        @NonNull
        public Builder setIdValue(@Nullable String str) {
            this.idValue = str;
            return this;
        }

        @NonNull
        public Builder setValue(@Nullable String str) {
            this.value = str;
            return this;
        }
    }

    public UniversalAdId(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        this.idRegistry = str;
        this.idValue = str2;
        this.value = str3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UniversalAdId universalAdId = (UniversalAdId) obj;
        if (!this.idRegistry.equals(universalAdId.idRegistry) || !this.idValue.equals(universalAdId.idValue)) {
            return false;
        }
        return this.value.equals(universalAdId.value);
    }

    public int hashCode() {
        return (((this.idRegistry.hashCode() * 31) + this.idValue.hashCode()) * 31) + this.value.hashCode();
    }
}
