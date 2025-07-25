package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfpi {
    final /* synthetic */ zzfpk zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfpi(zzfpk zzfpkVar, byte[] bArr, zzfpj zzfpjVar) {
        this.zza = zzfpkVar;
        this.zzb = bArr;
    }

    public final zzfpi zza(int i) {
        this.zzd = i;
        return this;
    }

    public final zzfpi zzb(int i) {
        this.zzc = i;
        return this;
    }

    public final synchronized void zzc() {
        try {
            zzfpk zzfpkVar = this.zza;
            if (zzfpkVar.zzb) {
                zzfpkVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(this.zzc);
                this.zza.zza.zzg(this.zzd);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e) {
            Log.d("GASS", "Clearcut log failed", e);
        }
    }
}
