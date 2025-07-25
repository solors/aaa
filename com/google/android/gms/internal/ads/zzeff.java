package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzeff extends zzbqt {
    private final zzecz zza;

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zze(String str) throws RemoteException {
        ((zzees) this.zza.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzees) this.zza.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzg() throws RemoteException {
        ((zzees) this.zza.zzc).zzo();
    }
}
