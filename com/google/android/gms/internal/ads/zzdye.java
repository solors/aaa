package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdye implements zzdyg {
    private final Map zza;
    private final zzgcs zzb;
    private final zzcyo zzc;

    public zzdye(Map map, zzgcs zzgcsVar, zzcyo zzcyoVar) {
        this.zza = map;
        this.zzb = zzgcsVar;
        this.zzc = zzcyoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdyg
    public final ListenableFuture zzb(final zzbvk zzbvkVar) {
        this.zzc.zzdl(zzbvkVar);
        ListenableFuture zzg = zzgch.zzg(new zzdvy(3));
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzic)).split(",")) {
            final zzhfj zzhfjVar = (zzhfj) this.zza.get(str.trim());
            if (zzhfjVar != null) {
                zzg = zzgch.zzf(zzg, zzdvy.class, new zzgbo() { // from class: com.google.android.gms.internal.ads.zzdyc
                    @Override // com.google.android.gms.internal.ads.zzgbo
                    public final ListenableFuture zza(Object obj) {
                        zzdvy zzdvyVar = (zzdvy) obj;
                        return ((zzdyg) zzhfjVar.zzb()).zzb(zzbvkVar);
                    }
                }, this.zzb);
            }
        }
        zzgch.zzr(zzg, new zzdyd(this), zzbzw.zzg);
        return zzg;
    }
}
