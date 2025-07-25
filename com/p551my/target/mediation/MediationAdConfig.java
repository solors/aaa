package com.p551my.target.mediation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p551my.target.common.MyTargetPrivacy;
import java.util.Map;

/* renamed from: com.my.target.mediation.MediationAdConfig */
/* loaded from: classes7.dex */
public interface MediationAdConfig {
    @Nullable
    AdNetworkConfig getAdNetworkConfig();

    int getAge();

    int getGender();

    @Nullable
    String getPayload();

    @NonNull
    String getPlacementId();

    @NonNull
    MyTargetPrivacy getPrivacy();

    @NonNull
    Map<String, String> getServerParams();

    boolean isUserAgeRestricted();

    boolean isUserConsent();

    boolean isUserConsentSpecified();
}
