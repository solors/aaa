package com.smaato.sdk.core.gdpr;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import com.smaato.sdk.core.gdpr.AutoValue_CmpV1Data;
import java.util.Set;

@AutoValue
/* loaded from: classes7.dex */
public abstract class CmpV1Data implements CmpData {

    @AutoValue.Builder
    /* loaded from: classes7.dex */
    public static abstract class Builder {
        @NonNull
        public abstract CmpV1Data build();

        @NonNull
        public abstract Builder setCmpPresent(boolean z);

        @NonNull
        public abstract Builder setConsentString(@NonNull String str);

        @NonNull
        public abstract Builder setPurposesConsent(@NonNull Set<Integer> set);

        @NonNull
        public abstract Builder setSubjectToGdpr(@NonNull SubjectToGdpr subjectToGdpr);

        @NonNull
        public abstract Builder setVendorConsent(@NonNull Set<Integer> set);
    }

    public static Builder builder() {
        return new AutoValue_CmpV1Data.C27111b();
    }

    @Override // com.smaato.sdk.core.gdpr.CmpData
    @NonNull
    public abstract String getConsentString();

    @Override // com.smaato.sdk.core.gdpr.CmpData
    @NonNull
    public abstract Set<Integer> getPurposesConsent();

    @Override // com.smaato.sdk.core.gdpr.CmpData
    @NonNull
    public abstract SubjectToGdpr getSubjectToGdpr();

    @Override // com.smaato.sdk.core.gdpr.CmpData
    @NonNull
    public abstract Set<Integer> getVendorConsent();

    @Override // com.smaato.sdk.core.gdpr.CmpData
    public abstract boolean isCmpPresent();
}
