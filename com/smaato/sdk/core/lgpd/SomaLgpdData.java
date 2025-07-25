package com.smaato.sdk.core.lgpd;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.SmaatoSdk;
import com.smaato.sdk.core.locationaware.LocationAware;

/* loaded from: classes7.dex */
public class SomaLgpdData {
    private final LocationAware locationAware;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SomaLgpdData(@NonNull LocationAware locationAware) {
        this.locationAware = locationAware;
    }

    @Nullable
    public Boolean isLgpdConsentEnabled() {
        return SmaatoSdk.isLGPDConsentEnabled();
    }

    public boolean isLgpdEnabled() {
        return this.locationAware.isConsentCountry();
    }

    public boolean isUsageAllowedFor() {
        Boolean isLGPDConsentEnabled = SmaatoSdk.isLGPDConsentEnabled();
        if (isLGPDConsentEnabled != null) {
            return isLGPDConsentEnabled.booleanValue();
        }
        return true;
    }
}
