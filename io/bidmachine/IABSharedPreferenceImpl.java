package io.bidmachine;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.utils.SharedPreferenceUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.bidmachine.u3 */
/* loaded from: classes9.dex */
class IABSharedPreferenceImpl implements IABSharedPreference {
    @Nullable
    private String iabGDPRConsentString;
    @Nullable
    private List<Integer> iabGPPIds;
    @Nullable
    private String iabGPPString;
    @Nullable
    private Boolean iabSubjectToGDPR;
    @Nullable
    private Boolean iabTcfGdprApplies;
    @Nullable
    private String iabTcfTcString;
    @Nullable
    private String iabUSPrivacyString;
    @NonNull
    private final SharedPreferences.OnSharedPreferenceChangeListener sharedPreferenceListener = new SharedPreferences$OnSharedPreferenceChangeListenerC37110a();

    /* compiled from: IABSharedPreferenceImpl.java */
    /* renamed from: io.bidmachine.u3$a */
    /* loaded from: classes9.dex */
    class SharedPreferences$OnSharedPreferenceChangeListenerC37110a implements SharedPreferences.OnSharedPreferenceChangeListener {
        SharedPreferences$OnSharedPreferenceChangeListenerC37110a() {
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            IABSharedPreferenceImpl.this.updateMapper(sharedPreferences, str);
        }
    }

    private void updateConsentString(@NonNull SharedPreferences sharedPreferences) {
        this.iabGDPRConsentString = SharedPreferenceUtils.optString(sharedPreferences, IABSharedPreference.IAB_CONSENT_STRING, null);
    }

    private void updateGDPRSubject(@NonNull SharedPreferences sharedPreferences) {
        Boolean bool = null;
        String optString = SharedPreferenceUtils.optString(sharedPreferences, IABSharedPreference.IAB_SUBJECT_TO_GDPR, null);
        if (optString != null) {
            bool = Boolean.valueOf(optString.equals("1"));
        }
        this.iabSubjectToGDPR = bool;
    }

    private void updateGPPIds(@NonNull SharedPreferences sharedPreferences) {
        String optString = SharedPreferenceUtils.optString(sharedPreferences, "IABGPP_GppSID", null);
        if (TextUtils.isEmpty(optString)) {
            this.iabGPPIds = null;
            return;
        }
        try {
            String[] split = optString.split("_");
            if (split.length == 0) {
                this.iabGPPIds = null;
                return;
            }
            this.iabGPPIds = new ArrayList();
            for (String str : split) {
                Integer parseIntOrDefault = Utils.parseIntOrDefault(str, (Integer) null);
                if (parseIntOrDefault != null) {
                    this.iabGPPIds.add(parseIntOrDefault);
                }
            }
        } catch (Throwable th) {
            Logger.m20086w(th);
            this.iabGPPIds = null;
        }
    }

    private void updateGPPString(@NonNull SharedPreferences sharedPreferences) {
        this.iabGPPString = SharedPreferenceUtils.optString(sharedPreferences, "IABGPP_HDR_GppString", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateMapper(@NonNull SharedPreferences sharedPreferences, @Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 83641339:
                if (str.equals("IABTCF_gdprApplies")) {
                    c = 0;
                    break;
                }
                break;
            case 126060329:
                if (str.equals("IABGPP_GppSID")) {
                    c = 1;
                    break;
                }
                break;
            case 743443760:
                if (str.equals("IABUSPrivacy_String")) {
                    c = 2;
                    break;
                }
                break;
            case 969191740:
                if (str.equals(IABSharedPreference.IAB_CONSENT_STRING)) {
                    c = 3;
                    break;
                }
                break;
            case 1218895378:
                if (str.equals("IABTCF_TCString")) {
                    c = 4;
                    break;
                }
                break;
            case 1233058135:
                if (str.equals(IABSharedPreference.IAB_SUBJECT_TO_GDPR)) {
                    c = 5;
                    break;
                }
                break;
            case 2023018157:
                if (str.equals("IABGPP_HDR_GppString")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                updateTcfGdprApplies(sharedPreferences);
                return;
            case 1:
                updateGPPIds(sharedPreferences);
                return;
            case 2:
                updateUSPrivacyString(sharedPreferences);
                return;
            case 3:
                updateConsentString(sharedPreferences);
                return;
            case 4:
                updateTcfTcString(sharedPreferences);
                return;
            case 5:
                updateGDPRSubject(sharedPreferences);
                return;
            case 6:
                updateGPPString(sharedPreferences);
                return;
            default:
                return;
        }
    }

    private void updateTcfGdprApplies(@NonNull SharedPreferences sharedPreferences) {
        int optInt = SharedPreferenceUtils.optInt(sharedPreferences, "IABTCF_gdprApplies", -1);
        if (optInt == 1) {
            this.iabTcfGdprApplies = Boolean.TRUE;
        } else if (optInt == 0) {
            this.iabTcfGdprApplies = Boolean.FALSE;
        } else {
            this.iabTcfGdprApplies = null;
        }
    }

    private void updateTcfTcString(@NonNull SharedPreferences sharedPreferences) {
        this.iabTcfTcString = SharedPreferenceUtils.optString(sharedPreferences, "IABTCF_TCString", null);
    }

    private void updateUSPrivacyString(@NonNull SharedPreferences sharedPreferences) {
        this.iabUSPrivacyString = SharedPreferenceUtils.optString(sharedPreferences, "IABUSPrivacy_String", null);
    }

    @Override // io.bidmachine.IABSharedPreference
    @Nullable
    public String getGDPRConsentString() {
        return this.iabGDPRConsentString;
    }

    @Override // io.bidmachine.IABSharedPreference
    @Nullable
    public List<Integer> getGPPIds() {
        return this.iabGPPIds;
    }

    @Override // io.bidmachine.IABSharedPreference
    @Nullable
    public String getGPPString() {
        return this.iabGPPString;
    }

    @Override // io.bidmachine.IABSharedPreference
    @Nullable
    public Boolean getSubjectToGDPR() {
        return this.iabSubjectToGDPR;
    }

    @Override // io.bidmachine.IABSharedPreference
    @Nullable
    public Boolean getTcfGdprApplies() {
        return this.iabTcfGdprApplies;
    }

    @Override // io.bidmachine.IABSharedPreference
    @Nullable
    public String getTcfTcString() {
        return this.iabTcfTcString;
    }

    @Override // io.bidmachine.IABSharedPreference
    @Nullable
    public String getUSPrivacyString() {
        return this.iabUSPrivacyString;
    }

    @Override // io.bidmachine.IABSharedPreference
    public void initialize(@NonNull Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this.sharedPreferenceListener);
        for (String str : IABSharedPreference.IAB_KEY_ARRAY) {
            updateMapper(defaultSharedPreferences, str);
        }
    }
}
