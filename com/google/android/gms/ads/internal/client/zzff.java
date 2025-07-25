package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes4.dex */
final class zzff implements Runnable {
    final /* synthetic */ zzfg zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzff(zzfg zzfgVar) {
        this.zza = zzfgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfi zzfiVar = this.zza.zza;
        if (zzfi.zzb(zzfiVar) != null) {
            try {
                zzfi.zzb(zzfiVar).zze(1);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
