package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzand implements zzany {
    private final zzamj zza;
    private final zzdx zzb = new zzdx(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzef zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzand(zzamj zzamjVar) {
        this.zza = zzamjVar;
    }

    private final void zze(int i) {
        this.zzc = i;
        this.zzd = 0;
    }

    private final boolean zzf(zzdy zzdyVar, @Nullable byte[] bArr, int i) {
        int min = Math.min(zzdyVar.zzb(), i - this.zzd);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            zzdyVar.zzM(min);
        } else {
            zzdyVar.zzH(bArr, this.zzd, min);
        }
        int i2 = this.zzd + min;
        this.zzd = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // com.google.android.gms.internal.ads.zzany
    public final void zza(zzdy zzdyVar, int i) throws zzbc {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        long j;
        int i6;
        int i7;
        boolean z2;
        zzcw.zzb(this.zze);
        int i8 = -1;
        int i9 = 2;
        boolean z3 = 0;
        int i10 = 1;
        if ((i & 1) != 0) {
            int i11 = this.zzc;
            if (i11 != 0 && i11 != 1) {
                if (i11 != 2) {
                    int i12 = this.zzj;
                    if (i12 != -1) {
                        zzdo.zzf("PesReader", "Unexpected start indicator: expected " + i12 + " more bytes");
                    }
                    if (zzdyVar.zze() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.zza.zzc(z2);
                } else {
                    zzdo.zzf("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zze(1);
        }
        int i13 = i;
        while (zzdyVar.zzb() > 0) {
            int i14 = this.zzc;
            if (i14 != 0) {
                if (i14 != i10) {
                    if (i14 != i9) {
                        int zzb = zzdyVar.zzb();
                        int i15 = this.zzj;
                        if (i15 == i8) {
                            i5 = z3;
                        } else {
                            i5 = zzb - i15;
                        }
                        if (i5 > 0) {
                            zzb -= i5;
                            zzdyVar.zzK(zzdyVar.zzd() + zzb);
                        }
                        this.zza.zza(zzdyVar);
                        int i16 = this.zzj;
                        if (i16 != i8) {
                            int i17 = i16 - zzb;
                            this.zzj = i17;
                            if (i17 == 0) {
                                this.zza.zzc(z3);
                                zze(i10);
                            }
                        }
                    } else {
                        if (zzf(zzdyVar, this.zzb.zza, Math.min(10, this.zzi)) && zzf(zzdyVar, null, this.zzi)) {
                            this.zzb.zzl(z3);
                            if (this.zzf) {
                                this.zzb.zzn(4);
                                long zzd = this.zzb.zzd(3);
                                this.zzb.zzn(i10);
                                int zzd2 = this.zzb.zzd(15) << 15;
                                this.zzb.zzn(i10);
                                long zzd3 = this.zzb.zzd(15);
                                this.zzb.zzn(i10);
                                if (!this.zzh && this.zzg) {
                                    this.zzb.zzn(4);
                                    this.zzb.zzn(i10);
                                    this.zzb.zzn(i10);
                                    long zzd4 = this.zzb.zzd(15);
                                    this.zzb.zzn(i10);
                                    i7 = zzd2;
                                    this.zze.zzb((this.zzb.zzd(3) << 30) | (this.zzb.zzd(15) << 15) | zzd4);
                                    this.zzh = true;
                                } else {
                                    i7 = zzd2;
                                }
                                j = this.zze.zzb((zzd << 30) | i7 | zzd3);
                            } else {
                                j = -9223372036854775807L;
                            }
                            if (true != this.zzk) {
                                i6 = 0;
                            } else {
                                i6 = 4;
                            }
                            i13 |= i6;
                            this.zza.zzd(j, i13);
                            zze(3);
                            i8 = -1;
                            i9 = 2;
                            z3 = 0;
                            i10 = 1;
                        }
                    }
                    i2 = i9;
                    z = z3;
                    i3 = i10;
                } else if (zzf(zzdyVar, this.zzb.zza, 9)) {
                    z = false;
                    this.zzb.zzl(0);
                    int zzd5 = this.zzb.zzd(24);
                    i3 = 1;
                    if (zzd5 != 1) {
                        zzdo.zzf("PesReader", "Unexpected start code prefix: " + zzd5);
                        i8 = -1;
                        this.zzj = -1;
                        i4 = 0;
                        i2 = 2;
                    } else {
                        this.zzb.zzn(8);
                        zzdx zzdxVar = this.zzb;
                        int zzd6 = zzdxVar.zzd(16);
                        zzdxVar.zzn(5);
                        this.zzk = this.zzb.zzp();
                        i2 = 2;
                        this.zzb.zzn(2);
                        this.zzf = this.zzb.zzp();
                        this.zzg = this.zzb.zzp();
                        this.zzb.zzn(6);
                        int zzd7 = this.zzb.zzd(8);
                        this.zzi = zzd7;
                        if (zzd6 == 0) {
                            this.zzj = -1;
                            i8 = -1;
                        } else {
                            int i18 = (zzd6 - 3) - zzd7;
                            this.zzj = i18;
                            if (i18 < 0) {
                                zzdo.zzf("PesReader", "Found negative packet payload size: " + i18);
                                i8 = -1;
                                this.zzj = -1;
                            } else {
                                i8 = -1;
                            }
                        }
                        i4 = 2;
                    }
                    zze(i4);
                } else {
                    i8 = -1;
                    z = false;
                    i3 = 1;
                    i2 = 2;
                }
            } else {
                i2 = i9;
                z = z3;
                i3 = i10;
                zzdyVar.zzM(zzdyVar.zzb());
            }
            i10 = i3;
            z3 = z;
            i9 = i2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final void zzb(zzef zzefVar, zzacq zzacqVar, zzanx zzanxVar) {
        this.zze = zzefVar;
        this.zza.zzb(zzacqVar, zzanxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final void zzc() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zze();
    }

    public final boolean zzd(boolean z) {
        if (this.zzc == 3 && this.zzj == -1) {
            return true;
        }
        return false;
    }
}
