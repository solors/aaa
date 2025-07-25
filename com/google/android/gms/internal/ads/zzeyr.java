package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzeyr implements zzezf {
    private final zzfdw zza;
    private final Executor zzb;
    private final zzgcd zzc = new zzeyp(this);

    public zzeyr(zzfdw zzfdwVar, Executor executor) {
        this.zza = zzfdwVar;
        this.zzb = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zza(zzcuz zzcuzVar, zzeyz zzeyzVar) throws Exception {
        zzfdw zzfdwVar = this.zza;
        zzfeg zzfegVar = zzeyzVar.zzb;
        zzbvk zzbvkVar = zzeyzVar.zza;
        zzfef zzb = zzfdwVar.zzb(zzfegVar);
        if (zzb != null && zzbvkVar != null) {
            zzgch.zzr(zzcuzVar.zzb().zzg(zzbvkVar), this.zzc, this.zzb);
        }
        return zzgch.zzh(new zzeyq(zzfegVar, zzbvkVar, zzb));
    }

    public final ListenableFuture zzb(zzezg zzezgVar, zzeze zzezeVar, final zzcuz zzcuzVar) {
        return (zzgby) zzgch.zze((zzgby) zzgch.zzn(zzgby.zzu(new zzezb(this.zza, zzcuzVar, this.zzb).zzc()), new zzgbo() { // from class: com.google.android.gms.internal.ads.zzeyn
            {
                zzeyr.this = this;
            }

            @Override // com.google.android.gms.internal.ads.zzgbo
            public final ListenableFuture zza(Object obj) {
                return zzeyr.this.zza(zzcuzVar, (zzeyz) obj);
            }
        }, this.zzb), Exception.class, new zzeyo(this), this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzezf
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzezg zzezgVar, zzeze zzezeVar, Object obj) {
        return zzb(zzezgVar, zzezeVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzezf
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
