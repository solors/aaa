package com.vungle.ads;

import com.ironsource.C21320zk;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1012v8.PrivacyConsent;
import p1012v8.PrivacyManager;

@Metadata
/* renamed from: com.vungle.ads.m2 */
/* loaded from: classes7.dex */
public final class VunglePrivacySettings {
    @NotNull
    public static final VunglePrivacySettings INSTANCE = new VunglePrivacySettings();

    private VunglePrivacySettings() {
    }

    @NotNull
    public static final String getCCPAStatus() {
        return PrivacyManager.INSTANCE.getCcpaStatus();
    }

    @NotNull
    public static final String getCOPPAStatus() {
        return PrivacyManager.INSTANCE.getCoppaStatus().name();
    }

    @NotNull
    public static final String getGDPRMessageVersion() {
        return PrivacyManager.INSTANCE.getConsentMessageVersion();
    }

    @NotNull
    public static final String getGDPRSource() {
        return PrivacyManager.INSTANCE.getConsentSource();
    }

    @NotNull
    public static final String getGDPRStatus() {
        return PrivacyManager.INSTANCE.getConsentStatus();
    }

    public static final long getGDPRTimestamp() {
        return PrivacyManager.INSTANCE.getConsentTimestamp();
    }

    public static final void setCCPAStatus(boolean z) {
        PrivacyConsent privacyConsent;
        if (z) {
            privacyConsent = PrivacyConsent.OPT_IN;
        } else {
            privacyConsent = PrivacyConsent.OPT_OUT;
        }
        PrivacyManager.INSTANCE.updateCcpaConsent(privacyConsent);
    }

    public static final void setCOPPAStatus(boolean z) {
        PrivacyManager.INSTANCE.updateCoppaConsent(z);
    }

    public static final void setGDPRStatus(boolean z, @Nullable String str) {
        String value;
        if (z) {
            value = PrivacyConsent.OPT_IN.getValue();
        } else {
            value = PrivacyConsent.OPT_OUT.getValue();
        }
        PrivacyManager.INSTANCE.updateGdprConsent(value, C21320zk.f54769b, str);
    }
}
