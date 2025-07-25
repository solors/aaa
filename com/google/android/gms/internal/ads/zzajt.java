package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzajt {
    private zzadt zzb;
    private zzacq zzc;
    private zzajo zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private final zzajm zza = new zzajm();
    private zzajq zzj = new zzajq();

    protected abstract long zza(zzdy zzdyVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzb(boolean z) {
        int i;
        if (z) {
            this.zzj = new zzajq();
            this.zzf = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.zzh = i;
        this.zze = -1L;
        this.zzg = 0L;
    }

    protected abstract boolean zzc(zzdy zzdyVar, long j, zzajq zzajqVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zze(zzaco zzacoVar, zzadj zzadjVar) throws IOException {
        boolean z;
        zzcw.zzb(this.zzb);
        int i = zzei.zza;
        int i2 = this.zzh;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    return -1;
                }
                long zzd = this.zzd.zzd(zzacoVar);
                if (zzd >= 0) {
                    zzadjVar.zza = zzd;
                    return 1;
                }
                if (zzd < -1) {
                    zzi(-(zzd + 2));
                }
                if (!this.zzl) {
                    zzadm zze = this.zzd.zze();
                    zzcw.zzb(zze);
                    this.zzc.zzO(zze);
                    this.zzl = true;
                }
                if (this.zzk <= 0 && !this.zza.zze(zzacoVar)) {
                    this.zzh = 3;
                    return -1;
                }
                this.zzk = 0L;
                zzdy zza = this.zza.zza();
                long zza2 = zza(zza);
                if (zza2 >= 0) {
                    long j = this.zzg;
                    if (j + zza2 >= this.zze) {
                        long zzf = zzf(j);
                        this.zzb.zzr(zza, zza.zze());
                        this.zzb.zzt(zzf, 1, zza.zze(), 0, null);
                        this.zze = -1L;
                    }
                }
                this.zzg += zza2;
            } else {
                zzacoVar.zzk((int) this.zzf);
                this.zzh = 2;
                return 0;
            }
        } else {
            while (this.zza.zze(zzacoVar)) {
                long zzf2 = zzacoVar.zzf();
                long j2 = this.zzf;
                this.zzk = zzf2 - j2;
                if (zzc(this.zza.zza(), j2, this.zzj)) {
                    this.zzf = zzacoVar.zzf();
                } else {
                    zzab zzabVar = this.zzj.zza;
                    this.zzi = zzabVar.zzE;
                    if (!this.zzm) {
                        this.zzb.zzm(zzabVar);
                        this.zzm = true;
                    }
                    zzajo zzajoVar = this.zzj.zzb;
                    if (zzajoVar != null) {
                        this.zzd = zzajoVar;
                    } else if (zzacoVar.zzd() == -1) {
                        this.zzd = new zzajr(null);
                    } else {
                        zzajn zzb = this.zza.zzb();
                        if ((zzb.zza & 4) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.zzd = new zzaji(this, this.zzf, zzacoVar.zzd(), zzb.zzd + zzb.zze, zzb.zzb, z);
                    }
                    this.zzh = 2;
                    this.zza.zzd();
                }
            }
            this.zzh = 3;
            return -1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long zzf(long j) {
        return (j * 1000000) / this.zzi;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long zzg(long j) {
        return (this.zzi * j) / 1000000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzh(zzacq zzacqVar, zzadt zzadtVar) {
        this.zzc = zzacqVar;
        this.zzb = zzadtVar;
        zzb(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzi(long j) {
        this.zzg = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzj(long j, long j2) {
        this.zza.zzc();
        if (j == 0) {
            zzb(!this.zzl);
        } else if (this.zzh != 0) {
            long zzg = zzg(j2);
            this.zze = zzg;
            zzajo zzajoVar = this.zzd;
            int i = zzei.zza;
            zzajoVar.zzg(zzg);
            this.zzh = 2;
        }
    }
}
