package com.applovin.sdk;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.applovin.sdk.AppLovinSdkConfiguration;

/* loaded from: classes2.dex */
public interface AppLovinTermsAndPrivacyPolicyFlowSettings {
    AppLovinSdkConfiguration.ConsentFlowUserGeography getDebugUserGeography();

    @Nullable
    Uri getPrivacyPolicyUri();

    @Nullable
    Uri getTermsOfServiceUri();

    boolean isEnabled();

    void setDebugUserGeography(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography);

    void setEnabled(boolean z);

    void setPrivacyPolicyUri(Uri uri);

    void setTermsOfServiceUri(Uri uri);
}
