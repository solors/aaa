package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzejd {
    private final zzdfu zza;

    public zzejd(zzdfu zzdfuVar) {
        this.zza = zzdfuVar;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfca zzfcaVar, zzfbo zzfboVar, View view, zzeiz zzeizVar) {
        zzejb zzejbVar = new zzejb(this, new zzdgc() { // from class: com.google.android.gms.internal.ads.zzeja
            @Override // com.google.android.gms.internal.ads.zzdgc
            public final void zza(boolean z, Context context, zzcwg zzcwgVar) {
            }
        });
        zzder zze = this.zza.zze(new zzcrp(zzfcaVar, zzfboVar, null), zzejbVar);
        zzeizVar.zzd(new zzejc(this, zze));
        return zze.zzg();
    }
}
