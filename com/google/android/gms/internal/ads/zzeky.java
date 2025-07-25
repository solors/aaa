package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzeky {
    private final zzeld zza;
    private final String zzb;
    @Nullable
    private com.google.android.gms.ads.internal.client.zzdy zzc;

    public zzeky(zzeld zzeldVar, String str) {
        this.zza = zzeldVar;
        this.zzb = str;
    }

    @Nullable
    public final synchronized String zza() {
        String str;
        str = null;
        try {
            com.google.android.gms.ads.internal.client.zzdy zzdyVar = this.zzc;
            if (zzdyVar != null) {
                str = zzdyVar.zzg();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
        return str;
    }

    @Nullable
    public final synchronized String zzb() {
        String str;
        str = null;
        try {
            com.google.android.gms.ads.internal.client.zzdy zzdyVar = this.zzc;
            if (zzdyVar != null) {
                str = zzdyVar.zzg();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
        return str;
    }

    public final synchronized void zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, int i) throws RemoteException {
        this.zzc = null;
        zzele zzeleVar = new zzele(i);
        zzekx zzekxVar = new zzekx(this);
        this.zza.zzb(zzmVar, this.zzb, zzeleVar, zzekxVar);
    }

    public final synchronized boolean zze() throws RemoteException {
        return this.zza.zza();
    }
}
