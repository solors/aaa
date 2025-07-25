package com.smaato.sdk.core.gdpr;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.locationaware.LocationAware;
import com.smaato.sdk.core.util.Objects;

/* loaded from: classes7.dex */
public class SomaGdprDataSource {
    @NonNull
    private final IabCmpV2DataStorage iabCmpV2DataStorage;
    private final LocationAware locationAware;

    public SomaGdprDataSource(@NonNull IabCmpV2DataStorage iabCmpV2DataStorage, @NonNull LocationAware locationAware) {
        this.iabCmpV2DataStorage = (IabCmpV2DataStorage) Objects.requireNonNull(iabCmpV2DataStorage, "iabCmpV2DataStorage can not be null for SomaGdprDataSource::new");
        this.locationAware = locationAware;
    }

    @NonNull
    public SomaGdprData getSomaGdprData() {
        return new SomaGdprV2Utils(this.locationAware).createSomaGdprData(this.iabCmpV2DataStorage.getCmpData());
    }
}
