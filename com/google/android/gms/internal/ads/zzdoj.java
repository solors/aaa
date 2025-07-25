package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdoj implements zzher {
    private final zzhfj zza;

    public zzdoj(zzhfj zzhfjVar) {
        this.zza = zzhfjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        if (((zzcvk) this.zza).zza().zzo.zza == 3) {
            return "rewarded_interstitial";
        }
        return "rewarded";
    }
}
