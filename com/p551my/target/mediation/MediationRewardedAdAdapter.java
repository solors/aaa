package com.p551my.target.mediation;

import android.content.Context;
import androidx.annotation.NonNull;
import com.p551my.target.ads.Reward;
import com.p551my.target.common.models.IAdLoadingError;

/* renamed from: com.my.target.mediation.MediationRewardedAdAdapter */
/* loaded from: classes7.dex */
public interface MediationRewardedAdAdapter extends MediationAdapter {

    /* renamed from: com.my.target.mediation.MediationRewardedAdAdapter$MediationRewardedAdListener */
    /* loaded from: classes7.dex */
    public interface MediationRewardedAdListener {
        void onClick(@NonNull MediationRewardedAdAdapter mediationRewardedAdAdapter);

        void onDismiss(@NonNull MediationRewardedAdAdapter mediationRewardedAdAdapter);

        void onDisplay(@NonNull MediationRewardedAdAdapter mediationRewardedAdAdapter);

        void onLoad(@NonNull MediationRewardedAdAdapter mediationRewardedAdAdapter);

        void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull MediationRewardedAdAdapter mediationRewardedAdAdapter);

        void onReward(@NonNull Reward reward, @NonNull MediationRewardedAdAdapter mediationRewardedAdAdapter);
    }

    void dismiss();

    void load(@NonNull MediationAdConfig mediationAdConfig, @NonNull MediationRewardedAdListener mediationRewardedAdListener, @NonNull Context context);

    void show(@NonNull Context context);
}
