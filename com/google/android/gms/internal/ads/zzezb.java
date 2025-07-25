package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzezb {
    private final zzfdw zza;
    private final zzcuz zzb;
    private final Executor zzc;
    private zzeyz zzd;

    public zzezb(zzfdw zzfdwVar, zzcuz zzcuzVar, Executor executor) {
        this.zza = zzfdwVar;
        this.zzb = zzcuzVar;
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public final zzfeg zze() {
        zzfcj zzg = this.zzb.zzg();
        return this.zza.zzc(zzg.zzd, zzg.zzf, zzg.zzj);
    }

    public final ListenableFuture zzc() {
        ListenableFuture listenableFuture;
        zzeyz zzeyzVar = this.zzd;
        if (zzeyzVar == null) {
            if (!((Boolean) zzbes.zza.zze()).booleanValue()) {
                zzeyz zzeyzVar2 = new zzeyz(null, zze(), null);
                this.zzd = zzeyzVar2;
                listenableFuture = zzgch.zzh(zzeyzVar2);
            } else {
                listenableFuture = (zzgby) zzgch.zze((zzgby) zzgch.zzm(zzgby.zzu(this.zzb.zzb().zze(this.zza.zza())), new zzeyy(this), this.zzc), zzdyh.class, new zzeyx(this), this.zzc);
            }
            return zzgch.zzm(listenableFuture, new zzfuc() { // from class: com.google.android.gms.internal.ads.zzeyw
                @Override // com.google.android.gms.internal.ads.zzfuc
                public final Object apply(Object obj) {
                    return (zzeyz) obj;
                }
            }, this.zzc);
        }
        return zzgch.zzh(zzeyzVar);
    }
}
