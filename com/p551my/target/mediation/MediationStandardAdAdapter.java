package com.p551my.target.mediation;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import com.p551my.target.ads.MyTargetView;
import com.p551my.target.common.models.IAdLoadingError;

/* renamed from: com.my.target.mediation.MediationStandardAdAdapter */
/* loaded from: classes7.dex */
public interface MediationStandardAdAdapter extends MediationAdapter {

    /* renamed from: com.my.target.mediation.MediationStandardAdAdapter$MediationStandardAdListener */
    /* loaded from: classes7.dex */
    public interface MediationStandardAdListener {
        void onClick(@NonNull MediationStandardAdAdapter mediationStandardAdAdapter);

        void onLoad(@NonNull View view, @NonNull MediationStandardAdAdapter mediationStandardAdAdapter);

        void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull MediationStandardAdAdapter mediationStandardAdAdapter);

        void onShow(@NonNull MediationStandardAdAdapter mediationStandardAdAdapter);
    }

    void load(@NonNull MediationAdConfig mediationAdConfig, @NonNull MyTargetView.AdSize adSize, @NonNull MediationStandardAdListener mediationStandardAdListener, @NonNull Context context);
}
