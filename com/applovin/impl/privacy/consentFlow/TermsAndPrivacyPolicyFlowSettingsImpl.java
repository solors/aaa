package com.applovin.impl.privacy.consentFlow;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.C5434n;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings;

/* loaded from: classes2.dex */
public class TermsAndPrivacyPolicyFlowSettingsImpl implements AppLovinTermsAndPrivacyPolicyFlowSettings {

    /* renamed from: a */
    private boolean f9088a;

    /* renamed from: b */
    private AppLovinSdkConfiguration.ConsentFlowUserGeography f9089b;

    /* renamed from: c */
    private Uri f9090c;

    /* renamed from: d */
    private Uri f9091d;

    public TermsAndPrivacyPolicyFlowSettingsImpl(boolean z, AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, Uri uri, Uri uri2) {
        this.f9088a = z;
        this.f9089b = consentFlowUserGeography;
        this.f9090c = uri;
        this.f9091d = uri2;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public AppLovinSdkConfiguration.ConsentFlowUserGeography getDebugUserGeography() {
        return this.f9089b;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    @Nullable
    public Uri getPrivacyPolicyUri() {
        return this.f9090c;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    @Nullable
    public Uri getTermsOfServiceUri() {
        return this.f9091d;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public boolean isEnabled() {
        return this.f9088a;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setDebugUserGeography(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography) {
        C5434n.m94899g("ConsentFlowSettingsImpl", "Setting user debug geography: " + consentFlowUserGeography);
        this.f9089b = consentFlowUserGeography;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setEnabled(boolean z) {
        C5434n.m94899g("ConsentFlowSettingsImpl", "Setting Terms and Privacy Policy Flow enabled: " + z);
        this.f9088a = z;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setPrivacyPolicyUri(Uri uri) {
        C5434n.m94899g("ConsentFlowSettingsImpl", "Setting privacy policy: " + uri);
        this.f9090c = uri;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setTermsOfServiceUri(Uri uri) {
        C5434n.m94899g("ConsentFlowSettingsImpl", "Setting terms of service: " + uri);
        this.f9091d = uri;
    }

    @NonNull
    public String toString() {
        return "ConsentFlowSettings{isEnabled=" + this.f9088a + ", privacyPolicyUri=" + this.f9090c + ", termsOfServiceUri=" + this.f9091d + '}';
    }
}
