package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzddk;
import com.google.android.gms.internal.ads.zzdee;
import com.google.android.gms.internal.ads.zzffh;
import com.google.android.gms.internal.ads.zzgcs;
import com.google.android.gms.internal.ads.zzher;
import com.google.android.gms.internal.ads.zzhfj;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes4.dex */
public final class zzbf implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzbf(zzhfj zzhfjVar, zzhfj zzhfjVar2, zzhfj zzhfjVar3, zzhfj zzhfjVar4) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
        this.zzc = zzhfjVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdee zzdeeVar = (zzw) this.zza.zzb();
        zzdee zzdeeVar2 = (zzbm) this.zzb.zzb();
        zzgcs zzc = zzffh.zzc();
        if (((Integer) this.zzc.zzb()).intValue() == 2) {
            zzdeeVar = zzdeeVar2;
        }
        return new zzddk(zzdeeVar, zzc);
    }
}
