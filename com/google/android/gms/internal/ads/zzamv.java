package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzamv implements zzamj {
    private final zzdy zza;
    private final zzadf zzb;
    @Nullable
    private final String zzc;
    private final int zzd;
    private zzadt zze;
    private String zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private long zzk;
    private int zzl;
    private long zzm;

    public zzamv() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zza(zzdy zzdyVar) {
        zzadf zzadfVar;
        boolean z;
        boolean z2;
        zzcw.zzb(this.zze);
        while (zzdyVar.zzb() > 0) {
            int i = this.zzg;
            boolean z3 = true;
            if (i != 0) {
                if (i != 1) {
                    int min = Math.min(zzdyVar.zzb(), this.zzl - this.zzh);
                    this.zze.zzr(zzdyVar, min);
                    int i2 = this.zzh + min;
                    this.zzh = i2;
                    if (i2 >= this.zzl) {
                        if (this.zzm == -9223372036854775807L) {
                            z3 = false;
                        }
                        zzcw.zzf(z3);
                        this.zze.zzt(this.zzm, 1, this.zzl, 0, null);
                        this.zzm += this.zzk;
                        this.zzh = 0;
                        this.zzg = 0;
                    }
                } else {
                    int min2 = Math.min(zzdyVar.zzb(), 4 - this.zzh);
                    zzdyVar.zzH(this.zza.zzN(), this.zzh, min2);
                    int i3 = this.zzh + min2;
                    this.zzh = i3;
                    if (i3 >= 4) {
                        this.zza.zzL(0);
                        if (!this.zzb.zza(this.zza.zzg())) {
                            this.zzh = 0;
                            this.zzg = 1;
                        } else {
                            this.zzl = this.zzb.zzc;
                            if (!this.zzi) {
                                this.zzk = (zzadfVar.zzg * 1000000) / zzadfVar.zzd;
                                zzz zzzVar = new zzz();
                                zzzVar.zzM(this.zzf);
                                zzzVar.zzaa(this.zzb.zzb);
                                zzzVar.zzR(4096);
                                zzzVar.zzz(this.zzb.zze);
                                zzzVar.zzab(this.zzb.zzd);
                                zzzVar.zzQ(this.zzc);
                                zzzVar.zzY(this.zzd);
                                this.zze.zzm(zzzVar.zzag());
                                this.zzi = true;
                            }
                            this.zza.zzL(0);
                            this.zze.zzr(this.zza, 4);
                            this.zzg = 2;
                        }
                    }
                }
            } else {
                byte[] zzN = zzdyVar.zzN();
                int zzd = zzdyVar.zzd();
                int zze = zzdyVar.zze();
                while (true) {
                    if (zzd < zze) {
                        int i4 = zzd + 1;
                        byte b = zzN[zzd];
                        if ((b & 255) == 255) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (this.zzj && (b & 224) == 224) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.zzj = z;
                        if (z2) {
                            zzdyVar.zzL(i4);
                            this.zzj = false;
                            this.zza.zzN()[1] = zzN[zzd];
                            this.zzh = 2;
                            this.zzg = 1;
                            break;
                        }
                        zzd = i4;
                    } else {
                        zzdyVar.zzL(zze);
                        break;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzb(zzacq zzacqVar, zzanx zzanxVar) {
        zzanxVar.zzc();
        this.zzf = zzanxVar.zzb();
        this.zze = zzacqVar.zzw(zzanxVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzd(long j, int i) {
        this.zzm = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zze() {
        this.zzg = 0;
        this.zzh = 0;
        this.zzj = false;
        this.zzm = -9223372036854775807L;
    }

    public zzamv(@Nullable String str, int i) {
        this.zzg = 0;
        zzdy zzdyVar = new zzdy(4);
        this.zza = zzdyVar;
        zzdyVar.zzN()[0] = -1;
        this.zzb = new zzadf();
        this.zzm = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzc(boolean z) {
    }
}
