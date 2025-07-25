package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes4.dex */
final class zzfj implements Runnable {
    final /* synthetic */ zzfk zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfj(zzfk zzfkVar) {
        this.zza = zzfkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbl zzblVar;
        zzbl zzblVar2;
        zzfk zzfkVar = this.zza;
        zzblVar = zzfkVar.zza;
        if (zzblVar != null) {
            try {
                zzblVar2 = zzfkVar.zza;
                zzblVar2.zze(1);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
