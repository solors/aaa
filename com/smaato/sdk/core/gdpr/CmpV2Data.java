package com.smaato.sdk.core.gdpr;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.smaato.sdk.core.gdpr.AutoValue_CmpV2Data;
import java.util.HashSet;
import java.util.Set;

@AutoValue
/* loaded from: classes7.dex */
public abstract class CmpV2Data implements CmpData {

    @AutoValue.Builder
    /* loaded from: classes7.dex */
    public static abstract class Builder {
        public abstract CmpV2Data build();

        public abstract Builder setCmpPresent(boolean z);

        public abstract Builder setCmpSdkVersion(@NonNull String str);

        public abstract Builder setConsentString(@NonNull String str);

        public abstract Builder setPolicyVersion(@NonNull String str);

        public abstract Builder setPublisherCC(@NonNull String str);

        public abstract Builder setPublisherConsent(@NonNull Set<Integer> set);

        public abstract Builder setPublisherCustomPurposesConsents(@NonNull Set<Integer> set);

        public abstract Builder setPublisherCustomPurposesLegitimateInterests(@NonNull Set<Integer> set);

        public abstract Builder setPublisherLegitimateInterests(@NonNull Set<Integer> set);

        public abstract Builder setPublisherRestrictions(@NonNull String str);

        public abstract Builder setPurposeLegitimateInterests(@NonNull Set<Integer> set);

        public abstract Builder setPurposeOneTreatment(@NonNull Boolean bool);

        public abstract Builder setPurposesConsent(@NonNull Set<Integer> set);

        public abstract Builder setSdkId(@NonNull String str);

        public abstract Builder setSpecialFeaturesOptIns(@NonNull Set<Integer> set);

        public abstract Builder setSubjectToGdpr(@NonNull SubjectToGdpr subjectToGdpr);

        public abstract Builder setUseNonStandardStacks(@NonNull Boolean bool);

        public abstract Builder setVendorConsent(@NonNull Set<Integer> set);

        public abstract Builder setVendorLegitimateInterests(@NonNull Set<Integer> set);
    }

    public static Builder buildEmpty(boolean z, @NonNull SubjectToGdpr subjectToGdpr, @NonNull String str) {
        Builder publisherCC = new AutoValue_CmpV2Data.C27113b().setCmpPresent(z).setSubjectToGdpr(subjectToGdpr).setConsentString(str).setVendorConsent(new HashSet()).setPurposesConsent(new HashSet()).setSdkId("").setCmpSdkVersion("").setPolicyVersion("").setPublisherCC("");
        Boolean bool = Boolean.FALSE;
        return publisherCC.setPurposeOneTreatment(bool).setUseNonStandardStacks(bool).setVendorLegitimateInterests(new HashSet()).setPurposeLegitimateInterests(new HashSet()).setSpecialFeaturesOptIns(new HashSet()).setPublisherConsent(new HashSet()).setPublisherLegitimateInterests(new HashSet()).setPublisherLegitimateInterests(new HashSet()).setPublisherLegitimateInterests(new HashSet());
    }

    public static Builder builder() {
        return new AutoValue_CmpV2Data.C27113b();
    }

    @NonNull
    public abstract String getCmpSdkVersion();

    @Override // com.smaato.sdk.core.gdpr.CmpData
    @NonNull
    public abstract String getConsentString();

    @NonNull
    public abstract String getPolicyVersion();

    @NonNull
    public abstract String getPublisherCC();

    @Nullable
    public abstract Set<Integer> getPublisherConsent();

    @Nullable
    public abstract Set<Integer> getPublisherCustomPurposesConsents();

    @Nullable
    public abstract Set<Integer> getPublisherCustomPurposesLegitimateInterests();

    @Nullable
    public abstract Set<Integer> getPublisherLegitimateInterests();

    @Nullable
    public abstract String getPublisherRestrictions();

    @NonNull
    public abstract Set<Integer> getPurposeLegitimateInterests();

    @NonNull
    public abstract Boolean getPurposeOneTreatment();

    @Override // com.smaato.sdk.core.gdpr.CmpData
    @NonNull
    public abstract Set<Integer> getPurposesConsent();

    @NonNull
    public abstract String getSdkId();

    @NonNull
    public abstract Set<Integer> getSpecialFeaturesOptIns();

    @Override // com.smaato.sdk.core.gdpr.CmpData
    @NonNull
    public abstract SubjectToGdpr getSubjectToGdpr();

    @NonNull
    public abstract Boolean getUseNonStandardStacks();

    @Override // com.smaato.sdk.core.gdpr.CmpData
    @NonNull
    public abstract Set<Integer> getVendorConsent();

    @NonNull
    public abstract Set<Integer> getVendorLegitimateInterests();

    @Override // com.smaato.sdk.core.gdpr.CmpData
    public abstract boolean isCmpPresent();
}
