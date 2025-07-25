package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfff implements zzher {
    public static zzfff zza() {
        zzfff zzfffVar;
        zzfffVar = zzffe.zza;
        return zzfffVar;
    }

    public static zzgcs zzc() {
        zzgcs zzgcsVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfF)).booleanValue()) {
            zzgcsVar = zzbzw.zzc;
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfE)).booleanValue()) {
                zzgcsVar = zzbzw.zza;
            } else {
                zzgcsVar = zzbzw.zzf;
            }
        }
        zzhez.zzb(zzgcsVar);
        return zzgcsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* synthetic */ Object zzb() {
        return zzc();
    }
}
