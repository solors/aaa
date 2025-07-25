package io.bidmachine;

import androidx.annotation.NonNull;
import io.bidmachine.models.DataRestrictions;
import io.bidmachine.models.TargetingInfo;

/* loaded from: classes9.dex */
public interface InitializationParams extends GeneralParams {
    @Override // io.bidmachine.GeneralParams
    @NonNull
    /* synthetic */ DataRestrictions getDataRestrictions();

    @Override // io.bidmachine.GeneralParams
    @NonNull
    /* synthetic */ TargetingInfo getTargetingInfo();

    @Override // io.bidmachine.GeneralParams
    /* synthetic */ boolean isTestMode();
}
