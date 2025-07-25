package com.p551my.target.mediation;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p551my.target.common.models.IAdLoadingError;
import com.p551my.target.common.models.ImageData;
import com.p551my.target.nativeads.banners.NativePromoBanner;
import java.util.List;

/* renamed from: com.my.target.mediation.MediationNativeAdAdapter */
/* loaded from: classes7.dex */
public interface MediationNativeAdAdapter extends MediationAdapter {

    /* renamed from: com.my.target.mediation.MediationNativeAdAdapter$MediationNativeAdListener */
    /* loaded from: classes7.dex */
    public interface MediationNativeAdListener {
        void closeIfAutomaticallyDisabled(@NonNull MediationNativeAdAdapter mediationNativeAdAdapter);

        void onAdChoicesIconLoad(@Nullable ImageData imageData, boolean z, @NonNull MediationNativeAdAdapter mediationNativeAdAdapter);

        void onClick(@NonNull MediationNativeAdAdapter mediationNativeAdAdapter);

        void onCloseAutomatically(@NonNull MediationNativeAdAdapter mediationNativeAdAdapter);

        void onLoad(@NonNull NativePromoBanner nativePromoBanner, @NonNull MediationNativeAdAdapter mediationNativeAdAdapter);

        void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull MediationNativeAdAdapter mediationNativeAdAdapter);

        void onShow(@NonNull MediationNativeAdAdapter mediationNativeAdAdapter);

        void onVideoComplete(@NonNull MediationNativeAdAdapter mediationNativeAdAdapter);

        void onVideoPause(@NonNull MediationNativeAdAdapter mediationNativeAdAdapter);

        void onVideoPlay(@NonNull MediationNativeAdAdapter mediationNativeAdAdapter);

        boolean shouldCloseAutomatically();
    }

    @Nullable
    View getMediaView(@NonNull Context context);

    void load(@NonNull MediationNativeAdConfig mediationNativeAdConfig, @NonNull MediationNativeAdListener mediationNativeAdListener, @NonNull Context context);

    void registerView(@NonNull View view, @Nullable List<View> list, int i);

    void unregisterView();
}
