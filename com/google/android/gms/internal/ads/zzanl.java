package com.google.android.gms.internal.ads;

import androidx.core.view.InputDeviceCompat;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzanl implements zzany {
    private final zzank zza;
    private final zzdy zzb = new zzdy(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzanl(zzank zzankVar) {
        this.zza = zzankVar;
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final void zza(zzdy zzdyVar, int i) {
        int i2;
        boolean z;
        int i3 = i & 1;
        if (i3 != 0) {
            i2 = zzdyVar.zzd() + zzdyVar.zzm();
        } else {
            i2 = -1;
        }
        if (this.zzf) {
            if (i3 != 0) {
                this.zzf = false;
                zzdyVar.zzL(i2);
                this.zzd = 0;
            } else {
                return;
            }
        }
        while (zzdyVar.zzb() > 0) {
            int i4 = this.zzd;
            if (i4 < 3) {
                if (i4 == 0) {
                    int zzm = zzdyVar.zzm();
                    zzdyVar.zzL(zzdyVar.zzd() - 1);
                    if (zzm == 255) {
                        this.zzf = true;
                        return;
                    }
                }
                int min = Math.min(zzdyVar.zzb(), 3 - this.zzd);
                zzdyVar.zzH(this.zzb.zzN(), this.zzd, min);
                int i5 = this.zzd + min;
                this.zzd = i5;
                if (i5 == 3) {
                    this.zzb.zzL(0);
                    this.zzb.zzK(3);
                    this.zzb.zzM(1);
                    zzdy zzdyVar2 = this.zzb;
                    int zzm2 = zzdyVar2.zzm();
                    if ((zzm2 & 128) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int zzm3 = zzdyVar2.zzm();
                    this.zze = z;
                    this.zzc = (zzm3 | ((zzm2 & 15) << 8)) + 3;
                    int zzc = this.zzb.zzc();
                    int i6 = this.zzc;
                    if (zzc < i6) {
                        int zzc2 = this.zzb.zzc();
                        this.zzb.zzF(Math.min((int) InputDeviceCompat.SOURCE_TOUCHSCREEN, Math.max(i6, zzc2 + zzc2)));
                    }
                }
            } else {
                int min2 = Math.min(zzdyVar.zzb(), this.zzc - i4);
                zzdyVar.zzH(this.zzb.zzN(), this.zzd, min2);
                int i7 = this.zzd + min2;
                this.zzd = i7;
                int i8 = this.zzc;
                if (i7 != i8) {
                    continue;
                } else {
                    if (this.zze) {
                        if (zzei.zzf(this.zzb.zzN(), 0, i8, -1) == 0) {
                            this.zzb.zzK(this.zzc - 4);
                        } else {
                            this.zzf = true;
                            return;
                        }
                    } else {
                        this.zzb.zzK(i8);
                    }
                    this.zzb.zzL(0);
                    this.zza.zza(this.zzb);
                    this.zzd = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final void zzb(zzef zzefVar, zzacq zzacqVar, zzanx zzanxVar) {
        this.zza.zzb(zzefVar, zzacqVar, zzanxVar);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final void zzc() {
        this.zzf = true;
    }
}
