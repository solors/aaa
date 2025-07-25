package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzekr implements com.google.android.gms.ads.internal.client.zza, zzdds {
    private com.google.android.gms.ads.internal.client.zzbi zza;

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        com.google.android.gms.ads.internal.client.zzbi zzbiVar = this.zza;
        if (zzbiVar != null) {
            try {
                zzbiVar.zzb();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Remote Exception at onAdClicked.", e);
            }
        }
    }

    public final synchronized void zza(com.google.android.gms.ads.internal.client.zzbi zzbiVar) {
        this.zza = zzbiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final synchronized void zzdd() {
        com.google.android.gms.ads.internal.client.zzbi zzbiVar = this.zza;
        if (zzbiVar != null) {
            try {
                zzbiVar.zzb();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Remote Exception at onPhysicalClick.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final synchronized void zzu() {
    }
}
