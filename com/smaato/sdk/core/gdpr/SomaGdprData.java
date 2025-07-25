package com.smaato.sdk.core.gdpr;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.locationaware.LocationAware;
import com.smaato.sdk.core.util.Objects;
import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class SomaGdprData {
    @NonNull
    private final String consentString;
    private final int gdprVersion;
    private final LocationAware locationAware;
    @NonNull
    private final EnumMap<PiiParam, Boolean> piiParamToConsentMap;
    @NonNull
    private final SubjectToGdpr subjectToGdpr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SomaGdprData(@NonNull SubjectToGdpr subjectToGdpr, @NonNull String str, @NonNull EnumMap<PiiParam, Boolean> enumMap, @NonNull LocationAware locationAware, int i) {
        this.subjectToGdpr = (SubjectToGdpr) Objects.requireNonNull(subjectToGdpr, "subjectToGdpr must not be null for SomaGdprData::new");
        this.consentString = (String) Objects.requireNonNull(str, "consentString must not be null for SomaGdprData::new");
        EnumMap<PiiParam, Boolean> enumMap2 = new EnumMap<>((EnumMap<PiiParam, ? extends Boolean>) Objects.requireNonNull(enumMap, "piiParamToConsentMap must not be null for SomaGdprData::new"));
        this.piiParamToConsentMap = enumMap2;
        this.locationAware = locationAware;
        this.gdprVersion = i;
        for (Map.Entry<PiiParam, Boolean> entry : enumMap2.entrySet()) {
            if (entry.getValue() == null) {
                throw new IllegalArgumentException("piiParamToConsentMap must not contain null value for SomaGdprData::new");
            }
        }
    }

    @NonNull
    public String getConsentString() {
        return this.consentString;
    }

    public int getGdprVersion() {
        return this.gdprVersion;
    }

    @NonNull
    public SubjectToGdpr getSubjectToGdpr() {
        return this.subjectToGdpr;
    }

    @Nullable
    public Boolean isGdprEnabled() {
        boolean z;
        SubjectToGdpr subjectToGdpr = this.subjectToGdpr;
        if (subjectToGdpr == SubjectToGdpr.CMP_GDPR_UNKNOWN) {
            return Boolean.valueOf(this.locationAware.isConsentCountry());
        }
        if (subjectToGdpr == SubjectToGdpr.CMP_GDPR_ENABLED) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public boolean isUsageAllowedFor(@NonNull PiiParam piiParam) {
        return Objects.equals(this.piiParamToConsentMap.get(piiParam), Boolean.TRUE);
    }

    public String toString() {
        return "SomaGdprData{subjectToGdpr=" + this.subjectToGdpr + ", consentString='" + this.consentString + "', piiParamToConsentMap=" + this.piiParamToConsentMap + '}';
    }
}
