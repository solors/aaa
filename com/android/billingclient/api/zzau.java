package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import com.android.billingclient.api.BillingResult;
import org.json.JSONException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@6.1.0 */
/* loaded from: classes2.dex */
public final class zzau extends com.google.android.gms.internal.play_billing.zzg {
    final BillingConfigResponseListener zza;
    final zzbi zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzau(BillingConfigResponseListener billingConfigResponseListener, zzbi zzbiVar, zzat zzatVar) {
        this.zza = billingConfigResponseListener;
        this.zzb = zzbiVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzh
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            zzbi zzbiVar = this.zzb;
            BillingResult billingResult = zzbk.zzj;
            zzbiVar.zza(zzbh.zza(63, 13, billingResult));
            this.zza.onBillingConfigResponse(billingResult, null);
            return;
        }
        int zzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundle, "BillingClient");
        String zzg = com.google.android.gms.internal.play_billing.zzb.zzg(bundle, "BillingClient");
        BillingResult.Builder newBuilder = BillingResult.newBuilder();
        newBuilder.setResponseCode(zzb);
        newBuilder.setDebugMessage(zzg);
        if (zzb != 0) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "getBillingConfig() failed. Response code: " + zzb);
            BillingResult build = newBuilder.build();
            this.zzb.zza(zzbh.zza(23, 13, build));
            this.zza.onBillingConfigResponse(build, null);
        } else if (!bundle.containsKey("BILLING_CONFIG")) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "getBillingConfig() returned a bundle with neither an error nor a billing config response");
            newBuilder.setResponseCode(6);
            BillingResult build2 = newBuilder.build();
            this.zzb.zza(zzbh.zza(64, 13, build2));
            this.zza.onBillingConfigResponse(build2, null);
        } else {
            try {
                this.zza.onBillingConfigResponse(newBuilder.build(), new BillingConfig(bundle.getString("BILLING_CONFIG")));
            } catch (JSONException e) {
                com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e);
                zzbi zzbiVar2 = this.zzb;
                BillingResult billingResult2 = zzbk.zzj;
                zzbiVar2.zza(zzbh.zza(65, 13, billingResult2));
                this.zza.onBillingConfigResponse(billingResult2, null);
            }
        }
    }
}
