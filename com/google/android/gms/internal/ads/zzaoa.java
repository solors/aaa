package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzaoa {
    private final List zza;
    private final zzadt[] zzb;

    public zzaoa(List list) {
        this.zza = list;
        this.zzb = new zzadt[list.size()];
    }

    public final void zza(long j, zzdy zzdyVar) {
        if (zzdyVar.zzb() >= 9) {
            int zzg = zzdyVar.zzg();
            int zzg2 = zzdyVar.zzg();
            int zzm = zzdyVar.zzm();
            if (zzg == 434 && zzg2 == 1195456820 && zzm == 3) {
                zzabz.zzb(j, zzdyVar, this.zzb);
            }
        }
    }

    public final void zzb(zzacq zzacqVar, zzanx zzanxVar) {
        for (int i = 0; i < this.zzb.length; i++) {
            zzanxVar.zzc();
            zzadt zzw = zzacqVar.zzw(zzanxVar.zza(), 3);
            zzab zzabVar = (zzab) this.zza.get(i);
            String str = zzabVar.zzo;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            zzcw.zze(z, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            zzz zzzVar = new zzz();
            zzzVar.zzM(zzanxVar.zzb());
            zzzVar.zzaa(str);
            zzzVar.zzac(zzabVar.zze);
            zzzVar.zzQ(zzabVar.zzd);
            zzzVar.zzx(zzabVar.zzI);
            zzzVar.zzN(zzabVar.zzr);
            zzw.zzm(zzzVar.zzag());
            this.zzb[i] = zzw;
        }
    }
}
