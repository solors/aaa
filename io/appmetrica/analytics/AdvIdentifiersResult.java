package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes9.dex */
public class AdvIdentifiersResult {
    @NonNull
    public final AdvId googleAdvId;
    @NonNull
    public final AdvId huaweiAdvId;
    @NonNull
    public final AdvId yandexAdvId;

    /* loaded from: classes9.dex */
    public static class AdvId {
        @Nullable
        public final String advId;
        @NonNull
        public final Details details;
        @Nullable
        public final String errorExplanation;

        public AdvId(@Nullable String str, @NonNull Details details, @Nullable String str2) {
            this.advId = str;
            this.details = details;
            this.errorExplanation = str2;
        }
    }

    /* loaded from: classes9.dex */
    public enum Details {
        OK,
        IDENTIFIER_PROVIDER_UNAVAILABLE,
        INVALID_ADV_ID,
        FEATURE_DISABLED,
        NO_STARTUP,
        INTERNAL_ERROR
    }

    public AdvIdentifiersResult(@NonNull AdvId advId, @NonNull AdvId advId2, @NonNull AdvId advId3) {
        this.googleAdvId = advId;
        this.huaweiAdvId = advId2;
        this.yandexAdvId = advId3;
    }
}
