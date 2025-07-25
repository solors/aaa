package net.pubnative.lite.sdk.models;

/* loaded from: classes10.dex */
public interface AdRequestFactory {

    /* loaded from: classes10.dex */
    public interface Callback {
        void onRequestCreated(AdRequest adRequest);
    }

    AdRequest buildRequest(String str, String str2, AdSize adSize, String str3, boolean z, IntegrationType integrationType, String str4, Integer num, boolean z2);

    void createAdRequest(String str, String str2, AdSize adSize, boolean z, boolean z2, Callback callback);

    void setAdFormat(String str);

    void setIntegrationType(IntegrationType integrationType);

    void setMediationVendor(String str);
}
