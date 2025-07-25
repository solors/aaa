package com.google.android.gms.internal.ads;

import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzaet extends zzaex {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzaet(zzadt zzadtVar) {
        super(zzadtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    protected final boolean zza(zzdy zzdyVar) throws zzaew {
        String str;
        if (!this.zzc) {
            int zzm = zzdyVar.zzm();
            int i = zzm >> 4;
            this.zze = i;
            if (i == 2) {
                int i2 = zzb[(zzm >> 2) & 3];
                zzz zzzVar = new zzz();
                zzzVar.zzaa("audio/mpeg");
                zzzVar.zzz(1);
                zzzVar.zzab(i2);
                this.zza.zzm(zzzVar.zzag());
                this.zzd = true;
            } else if (i != 7 && i != 8) {
                if (i != 10) {
                    throw new zzaew("Audio format not supported: " + i);
                }
            } else {
                zzz zzzVar2 = new zzz();
                if (i == 7) {
                    str = "audio/g711-alaw";
                } else {
                    str = "audio/g711-mlaw";
                }
                zzzVar2.zzaa(str);
                zzzVar2.zzz(1);
                zzzVar2.zzab(8000);
                this.zza.zzm(zzzVar2.zzag());
                this.zzd = true;
            }
            this.zzc = true;
        } else {
            zzdyVar.zzM(1);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    protected final boolean zzb(zzdy zzdyVar, long j) throws zzbc {
        if (this.zze == 2) {
            int zzb2 = zzdyVar.zzb();
            this.zza.zzr(zzdyVar, zzb2);
            this.zza.zzt(j, 1, zzb2, 0, null);
            return true;
        }
        int zzm = zzdyVar.zzm();
        if (zzm == 0 && !this.zzd) {
            int zzb3 = zzdyVar.zzb();
            byte[] bArr = new byte[zzb3];
            zzdyVar.zzH(bArr, 0, zzb3);
            zzabi zza = zzabk.zza(bArr);
            zzz zzzVar = new zzz();
            zzzVar.zzaa("audio/mp4a-latm");
            zzzVar.zzA(zza.zzc);
            zzzVar.zzz(zza.zzb);
            zzzVar.zzab(zza.zza);
            zzzVar.zzN(Collections.singletonList(bArr));
            this.zza.zzm(zzzVar.zzag());
            this.zzd = true;
            return false;
        } else if (this.zze == 10 && zzm != 1) {
            return false;
        } else {
            int zzb4 = zzdyVar.zzb();
            this.zza.zzr(zzdyVar, zzb4);
            this.zza.zzt(j, 1, zzb4, 0, null);
            return true;
        }
    }
}
