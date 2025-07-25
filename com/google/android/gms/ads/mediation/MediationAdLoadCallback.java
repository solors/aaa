package com.google.android.gms.ads.mediation;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes4.dex */
public interface MediationAdLoadCallback<MediationAdT, MediationAdCallbackT> {
    void onFailure(@NonNull AdError adError);

    @Deprecated
    void onFailure(@NonNull String str);

    @NonNull
    MediationAdCallbackT onSuccess(@NonNull MediationAdT mediationadt);
}
