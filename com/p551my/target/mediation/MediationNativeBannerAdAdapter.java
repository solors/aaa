package com.p551my.target.mediation;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p551my.target.common.models.IAdLoadingError;
import com.p551my.target.common.models.ImageData;
import com.p551my.target.nativeads.banners.NativeBanner;
import java.util.List;

/* renamed from: com.my.target.mediation.MediationNativeBannerAdAdapter */
/* loaded from: classes7.dex */
public interface MediationNativeBannerAdAdapter extends MediationAdapter {

    /* renamed from: com.my.target.mediation.MediationNativeBannerAdAdapter$MediationNativeBannerAdListener */
    /* loaded from: classes7.dex */
    public interface MediationNativeBannerAdListener {
        void closeIfAutomaticallyDisabled(@NonNull MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter);

        void onAdChoicesIconLoad(@Nullable ImageData imageData, boolean z, @NonNull MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter);

        void onClick(@NonNull MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter);

        void onCloseAutomatically(@NonNull MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter);

        void onLoad(@NonNull NativeBanner nativeBanner, @NonNull MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter);

        void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter);

        void onShow(@NonNull MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter);

        boolean shouldCloseAutomatically();
    }

    @Nullable
    View getIconView(@NonNull Context context);

    void load(@NonNull MediationNativeBannerAdConfig mediationNativeBannerAdConfig, @NonNull MediationNativeBannerAdListener mediationNativeBannerAdListener, @NonNull Context context);

    void registerView(@NonNull View view, @Nullable List<View> list, int i);

    void unregisterView();
}
