package com.smaato.sdk.core.gdpr;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.Objects;

/* loaded from: classes7.dex */
public class IabCmpV2DataStorage implements IabCmpDataStorage {
    @NonNull
    private final SharedPreferences defaultSharedPreferences;

    public IabCmpV2DataStorage(@NonNull SharedPreferences sharedPreferences) {
        this.defaultSharedPreferences = (SharedPreferences) Objects.requireNonNull(sharedPreferences, "defaultSharedPreferences must not be null for IabCmpV2DataStorage::new");
    }

    @NonNull
    private String getAsString(String str, String str2) {
        Object obj = this.defaultSharedPreferences.getAll().get(str);
        if (obj == null) {
            return str2;
        }
        if (obj instanceof String) {
            String str3 = (String) obj;
            if ("true".equals(str3)) {
                return "1";
            }
            if ("false".equals(str3)) {
                return "0";
            }
            return str3;
        }
        return String.valueOf(obj);
    }

    @Override // com.smaato.sdk.core.gdpr.IabCmpDataStorage
    @NonNull
    public CmpData getCmpData() {
        return CmpV2Data.buildEmpty(isCmpPresent(), getSubjectToGdpr(), getConsentString()).build();
    }

    public String getCmpSdkVersion() {
        return getAsString(CmpApiConstants.IABTCF_CMP_SDK_VERSION, "");
    }

    @Override // com.smaato.sdk.core.gdpr.IabCmpDataStorage
    @NonNull
    public String getConsentString() {
        return getAsString("IABTCF_TCString", "");
    }

    @Override // com.smaato.sdk.core.gdpr.IabCmpDataStorage
    public int getConsentVersion() {
        return 2;
    }

    public String getPolicyVersion() {
        return getAsString(CmpApiConstants.IABTCF_POLICY_VERSION, "");
    }

    @NonNull
    public String getPublisherCC() {
        return getAsString(CmpApiConstants.IABTCF_PUBLISHER_CC, "AA");
    }

    @NonNull
    public String getPublisherConsent() {
        return getAsString(CmpApiConstants.IABTCF_PUBLISHER_CONSENT, "");
    }

    @NonNull
    public String getPublisherCustomPurposesConsents() {
        return getAsString(CmpApiConstants.IABTCF_PUBLISHER_CUSTOM_PURPOSES_CONSENTS, "");
    }

    @NonNull
    public String getPublisherCustomPurposesLegitimateInterests() {
        return getAsString(CmpApiConstants.IABTCF_PUBLISHER_CUSTOM_PURPOSES_LEGITIMATE_INTERESTS, "");
    }

    @NonNull
    public String getPublisherLegitimateInterests() {
        return getAsString(CmpApiConstants.IABTCF_PUBLISHER_LEGITIMATE_INTERESTS, "");
    }

    @NonNull
    public String getPublisherRestrictions() {
        return getAsString(CmpApiConstants.IABTCF_PUBLISHER_RERSTRICTIONS, "");
    }

    @NonNull
    public String getPurposeLegitimateInterests() {
        return getAsString(CmpApiConstants.IABTCF_PURPOSE_LEGITIMATE_INTERESTS, "");
    }

    public String getPurposeOneTreatment() {
        return getAsString(CmpApiConstants.IABTCF_PURPOSE_ONE_TREATMENT, "");
    }

    @Override // com.smaato.sdk.core.gdpr.IabCmpDataStorage
    @NonNull
    public String getPurposesString() {
        return getAsString(CmpApiConstants.IABTCF_PURPOSE_CONSENTS, "");
    }

    public String getSdkId() {
        return getAsString(CmpApiConstants.IABTCF_CMP_SDK_ID, "");
    }

    @NonNull
    public String getSpecialFeaturesOptIns() {
        return getAsString(CmpApiConstants.IABTCF_SPECIAL_FEATURES_OPT_INS, "");
    }

    @Override // com.smaato.sdk.core.gdpr.IabCmpDataStorage
    @NonNull
    public SubjectToGdpr getSubjectToGdpr() {
        SubjectToGdpr[] values;
        String asString = getAsString("IABTCF_gdprApplies", null);
        for (SubjectToGdpr subjectToGdpr : SubjectToGdpr.values()) {
            if (subjectToGdpr.f71527id.equals(asString)) {
                return subjectToGdpr;
            }
        }
        return SubjectToGdpr.CMP_GDPR_UNKNOWN;
    }

    public String getUseNonStandardStacks() {
        return getAsString(CmpApiConstants.IABTCF_USE_NON_STANDARD_STACKS, "");
    }

    @NonNull
    public String getVendorLegitimateInterests() {
        return getAsString(CmpApiConstants.IABTCF_VENDOR_LEGITIMATE_INTERESTS, "");
    }

    @Override // com.smaato.sdk.core.gdpr.IabCmpDataStorage
    @NonNull
    public String getVendorsString() {
        return getAsString(CmpApiConstants.IABTCF_VENDOR_CONSENT, "");
    }

    @Override // com.smaato.sdk.core.gdpr.IabCmpDataStorage
    public boolean isCmpPresent() {
        return this.defaultSharedPreferences.contains("IABTCF_TCString");
    }

    public boolean isPurposeConsentGivenForPurposeId(int i) {
        String purposesString = getPurposesString();
        if (i > 0 && purposesString.length() >= i && purposesString.charAt(i - 1) == '1') {
            return true;
        }
        return false;
    }

    public boolean isPurposeLegitimateInterestsGivenForVendorId(int i) {
        String purposeLegitimateInterests = getPurposeLegitimateInterests();
        if (i > 0 && purposeLegitimateInterests.length() >= i && purposeLegitimateInterests.charAt(i - 1) == '1') {
            return true;
        }
        return false;
    }

    public boolean isVendorConsentGivenForVendorId(int i) {
        String vendorsString = getVendorsString();
        if (i > 0 && vendorsString.length() >= i && vendorsString.charAt(i - 1) == '1') {
            return true;
        }
        return false;
    }

    public boolean isVendorLegitimateInterestsGivenForVendorId(int i) {
        String vendorLegitimateInterests = getVendorLegitimateInterests();
        if (i > 0 && vendorLegitimateInterests.length() >= i && vendorLegitimateInterests.charAt(i - 1) == '1') {
            return true;
        }
        return false;
    }
}
