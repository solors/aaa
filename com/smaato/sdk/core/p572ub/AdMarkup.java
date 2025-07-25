package com.smaato.sdk.core.p572ub;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.p568ad.Expiration;
import com.smaato.sdk.core.p572ub.AutoValue_AdMarkup;

@AutoValue.CopyAnnotations
@AutoValue
/* renamed from: com.smaato.sdk.core.ub.AdMarkup */
/* loaded from: classes7.dex */
public abstract class AdMarkup {

    @AutoValue.Builder
    /* renamed from: com.smaato.sdk.core.ub.AdMarkup$Builder */
    /* loaded from: classes7.dex */
    public static abstract class Builder {
        public abstract Builder adFormat(String str);

        public abstract Builder adSpaceId(String str);

        public abstract AdMarkup build();

        public abstract Builder bundleId(String str);

        public abstract Builder creativeId(String str);

        public abstract Builder expiresAt(Expiration expiration);

        public abstract Builder impressionCountingType(ImpressionCountingType impressionCountingType);

        public abstract Builder markup(String str);

        public abstract Builder sessionId(String str);
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_AdMarkup.C27278b().impressionCountingType(ImpressionCountingType.STANDARD);
    }

    @NonNull
    public abstract String adFormat();

    @NonNull
    public abstract String adSpaceId();

    @Nullable
    public abstract String bundleId();

    @Nullable
    public abstract String creativeId();

    @NonNull
    public abstract Expiration expiresAt();

    @NonNull
    public abstract ImpressionCountingType impressionCountingType();

    @NonNull
    public abstract String markup();

    @NonNull
    public abstract String sessionId();
}
