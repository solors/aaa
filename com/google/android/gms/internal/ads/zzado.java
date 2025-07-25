package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzado implements zzacn {
    private final int zza;
    private final int zzb;
    private final String zzc;
    private int zzd;
    private int zze;
    private zzacq zzf;
    private zzadt zzg;

    public zzado(int i, int i2, String str) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final int zzb(zzaco zzacoVar, zzadj zzadjVar) throws IOException {
        int i = this.zze;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        zzadt zzadtVar = this.zzg;
        zzadtVar.getClass();
        int zzf = zzadtVar.zzf(zzacoVar, 1024, true);
        if (zzf == -1) {
            this.zze = 2;
            this.zzg.zzt(0L, 1, this.zzd, 0, null);
            this.zzd = 0;
        } else {
            this.zzd += zzf;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final /* synthetic */ List zzd() {
        return zzfxn.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zze(zzacq zzacqVar) {
        this.zzf = zzacqVar;
        zzadt zzw = zzacqVar.zzw(1024, 4);
        this.zzg = zzw;
        zzz zzzVar = new zzz();
        zzzVar.zzaa(this.zzc);
        zzw.zzm(zzzVar.zzag());
        this.zzf.zzD();
        this.zzf.zzO(new zzadp(-9223372036854775807L));
        this.zze = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long j, long j2) {
        if (j != 0 && this.zze != 1) {
            return;
        }
        this.zze = 1;
        this.zzd = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(zzaco zzacoVar) throws IOException {
        boolean z;
        if (this.zza != -1 && this.zzb != -1) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzf(z);
        zzdy zzdyVar = new zzdy(this.zzb);
        ((zzacc) zzacoVar).zzm(zzdyVar.zzN(), 0, this.zzb, false);
        if (zzdyVar.zzq() == this.zza) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final /* synthetic */ zzacn zzc() {
        return this;
    }
}
