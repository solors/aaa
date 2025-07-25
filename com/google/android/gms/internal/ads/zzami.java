package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzami implements zzamj {
    private final List zza;
    private final zzadt[] zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private long zzf = -9223372036854775807L;

    public zzami(List list) {
        this.zza = list;
        this.zzb = new zzadt[list.size()];
    }

    private final boolean zzf(zzdy zzdyVar, int i) {
        if (zzdyVar.zzb() == 0) {
            return false;
        }
        if (zzdyVar.zzm() != i) {
            this.zzc = false;
        }
        this.zzd--;
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zza(zzdy zzdyVar) {
        zzadt[] zzadtVarArr;
        if (this.zzc) {
            if (this.zzd != 2 || zzf(zzdyVar, 32)) {
                if (this.zzd != 1 || zzf(zzdyVar, 0)) {
                    int zzd = zzdyVar.zzd();
                    int zzb = zzdyVar.zzb();
                    for (zzadt zzadtVar : this.zzb) {
                        zzdyVar.zzL(zzd);
                        zzadtVar.zzr(zzdyVar, zzb);
                    }
                    this.zze += zzb;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzb(zzacq zzacqVar, zzanx zzanxVar) {
        for (int i = 0; i < this.zzb.length; i++) {
            zzanu zzanuVar = (zzanu) this.zza.get(i);
            zzanxVar.zzc();
            zzadt zzw = zzacqVar.zzw(zzanxVar.zza(), 3);
            zzz zzzVar = new zzz();
            zzzVar.zzM(zzanxVar.zzb());
            zzzVar.zzaa("application/dvbsubs");
            zzzVar.zzN(Collections.singletonList(zzanuVar.zzb));
            zzzVar.zzQ(zzanuVar.zza);
            zzw.zzm(zzzVar.zzag());
            this.zzb[i] = zzw;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzc(boolean z) {
        boolean z2;
        if (this.zzc) {
            if (this.zzf != -9223372036854775807L) {
                z2 = true;
            } else {
                z2 = false;
            }
            zzcw.zzf(z2);
            for (zzadt zzadtVar : this.zzb) {
                zzadtVar.zzt(this.zzf, 1, this.zze, 0, null);
            }
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzd(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.zzc = true;
        this.zzf = j;
        this.zze = 0;
        this.zzd = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zze() {
        this.zzc = false;
        this.zzf = -9223372036854775807L;
    }
}
