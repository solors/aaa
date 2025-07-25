package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfgt implements zzdcx, zzcwj, zzddb {
    private final zzfhh zza;
    private final zzfgw zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfgt(Context context, zzfhh zzfhhVar) {
        this.zza = zzfhhVar;
        this.zzb = zzfgv.zza(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zzb() {
        if (((Boolean) zzbee.zzd.zze()).booleanValue()) {
            zzfhh zzfhhVar = this.zza;
            zzfgw zzfgwVar = this.zzb;
            zzfgwVar.zzg(true);
            zzfhhVar.zza(zzfgwVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcx
    public final void zzl() {
        if (((Boolean) zzbee.zzd.zze()).booleanValue()) {
            this.zzb.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwj
    public final void zzq(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbee.zzd.zze()).booleanValue()) {
            zzfhh zzfhhVar = this.zza;
            zzfgw zzfgwVar = this.zzb;
            zzfgwVar.zzc(zzeVar.zza().toString());
            zzfgwVar.zzg(false);
            zzfhhVar.zza(zzfgwVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcx
    public final void zzk() {
    }
}
