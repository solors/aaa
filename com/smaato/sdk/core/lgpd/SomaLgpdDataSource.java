package com.smaato.sdk.core.lgpd;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.locationaware.LocationAware;

/* loaded from: classes7.dex */
public class SomaLgpdDataSource {
    private final LocationAware locationAware;

    public SomaLgpdDataSource(@NonNull LocationAware locationAware) {
        this.locationAware = locationAware;
    }

    @NonNull
    public SomaLgpdData getSomaLgpdData() {
        return new SomaLgpdV2Utils(this.locationAware).createSomaLgpdData();
    }
}
