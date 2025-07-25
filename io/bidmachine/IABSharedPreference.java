package io.bidmachine;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* renamed from: io.bidmachine.t3 */
/* loaded from: classes9.dex */
interface IABSharedPreference {
    @NonNull
    public static final String IAB_GPP_HDR_STRING = "IABGPP_HDR_GppString";
    @NonNull
    public static final String IAB_GPP_SID = "IABGPP_GppSID";
    @NonNull
    public static final String IAB_TCF_GDPR_APPLIES = "IABTCF_gdprApplies";
    @NonNull
    public static final String IAB_TCF_TC_STRING = "IABTCF_TCString";
    @NonNull
    public static final String IAB_US_PRIVACY_STRING = "IABUSPrivacy_String";
    @NonNull
    public static final String IAB_SUBJECT_TO_GDPR = "IABConsent_SubjectToGDPR";
    @NonNull
    public static final String IAB_CONSENT_STRING = "IABConsent_ConsentString";
    @NonNull
    public static final String[] IAB_KEY_ARRAY = {IAB_SUBJECT_TO_GDPR, "IABTCF_gdprApplies", IAB_CONSENT_STRING, "IABTCF_TCString", "IABUSPrivacy_String", "IABGPP_HDR_GppString", "IABGPP_GppSID"};

    @Nullable
    String getGDPRConsentString();

    @Nullable
    List<Integer> getGPPIds();

    @Nullable
    String getGPPString();

    @Nullable
    Boolean getSubjectToGDPR();

    @Nullable
    Boolean getTcfGdprApplies();

    @Nullable
    String getTcfTcString();

    @Nullable
    String getUSPrivacyString();

    void initialize(@NonNull Context context);
}
