package com.p551my.target.mediation;

import android.content.Context;
import androidx.annotation.NonNull;
import com.p551my.target.common.models.IAdLoadingError;

/* renamed from: com.my.target.mediation.MediationInterstitialAdAdapter */
/* loaded from: classes7.dex */
public interface MediationInterstitialAdAdapter extends MediationAdapter {

    /* renamed from: com.my.target.mediation.MediationInterstitialAdAdapter$MediationInterstitialAdListener */
    /* loaded from: classes7.dex */
    public interface MediationInterstitialAdListener {
        void onClick(@NonNull MediationInterstitialAdAdapter mediationInterstitialAdAdapter);

        void onDismiss(@NonNull MediationInterstitialAdAdapter mediationInterstitialAdAdapter);

        void onDisplay(@NonNull MediationInterstitialAdAdapter mediationInterstitialAdAdapter);

        void onLoad(@NonNull MediationInterstitialAdAdapter mediationInterstitialAdAdapter);

        void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull MediationInterstitialAdAdapter mediationInterstitialAdAdapter);

        void onVideoCompleted(@NonNull MediationInterstitialAdAdapter mediationInterstitialAdAdapter);
    }

    void dismiss();

    void load(@NonNull MediationAdConfig mediationAdConfig, @NonNull MediationInterstitialAdListener mediationInterstitialAdListener, @NonNull Context context);

    void show(@NonNull Context context);
}
