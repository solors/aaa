package com.smaato.sdk.core.lgpd;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.locationaware.LocationAware;

/* loaded from: classes7.dex */
public final class SomaLgpdV2Utils {
    @NonNull
    private final LocationAware locationAware;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SomaLgpdV2Utils(@NonNull LocationAware locationAware) {
        this.locationAware = locationAware;
    }

    @NonNull
    public SomaLgpdData createSomaLgpdData() {
        return new SomaLgpdData(this.locationAware);
    }
}
