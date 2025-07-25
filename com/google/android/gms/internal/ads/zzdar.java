package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdar implements zzcyq {
    private int zza = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbp)).intValue();
    private int zzb = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmI)).intValue();

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final synchronized void zzdm(zzfca zzfcaVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbq)).booleanValue()) {
            try {
                zzfbr zzfbrVar = zzfcaVar.zzb.zzb;
                this.zza = zzfbrVar.zzc;
                this.zzb = zzfbrVar.zzd;
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdl(zzbvk zzbvkVar) {
    }
}
