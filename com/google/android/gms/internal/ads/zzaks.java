package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzaks {
    private final zzdy zza = new zzdy();
    private final int[] zzb = new int[256];
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzb(zzaks zzaksVar, zzdy zzdyVar, int i) {
        int zzo;
        if (i >= 4) {
            zzdyVar.zzM(3);
            int i2 = i - 4;
            if ((zzdyVar.zzm() & 128) != 0) {
                if (i2 >= 7 && (zzo = zzdyVar.zzo()) >= 4) {
                    zzaksVar.zzh = zzdyVar.zzq();
                    zzaksVar.zzi = zzdyVar.zzq();
                    zzaksVar.zza.zzI(zzo - 4);
                    i2 -= 7;
                } else {
                    return;
                }
            }
            zzdy zzdyVar2 = zzaksVar.zza;
            int zzd = zzdyVar2.zzd();
            int zze = zzdyVar2.zze();
            if (zzd < zze && i2 > 0) {
                int min = Math.min(i2, zze - zzd);
                zzdyVar.zzH(zzdyVar2.zzN(), zzd, min);
                zzaksVar.zza.zzL(zzd + min);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzc(zzaks zzaksVar, zzdy zzdyVar, int i) {
        if (i < 19) {
            return;
        }
        zzaksVar.zzd = zzdyVar.zzq();
        zzaksVar.zze = zzdyVar.zzq();
        zzdyVar.zzM(11);
        zzaksVar.zzf = zzdyVar.zzq();
        zzaksVar.zzg = zzdyVar.zzq();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzd(zzaks zzaksVar, zzdy zzdyVar, int i) {
        if (i % 5 != 2) {
            return;
        }
        zzdyVar.zzM(2);
        int i2 = 0;
        Arrays.fill(zzaksVar.zzb, 0);
        int i3 = i / 5;
        int i4 = 0;
        while (i4 < i3) {
            int zzm = zzdyVar.zzm();
            int zzm2 = zzdyVar.zzm();
            int zzm3 = zzdyVar.zzm();
            int zzm4 = zzdyVar.zzm();
            double d = zzm2;
            double d2 = zzm3 - 128;
            double d3 = zzm4 - 128;
            zzaksVar.zzb[zzm] = Math.max(0, Math.min((int) (d + (d3 * 1.772d)), 255)) | (zzdyVar.zzm() << 24) | (Math.max(i2, Math.min((int) ((1.402d * d2) + d), 255)) << 16) | (Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)) << 8);
            i4++;
            i2 = 0;
        }
        zzaksVar.zzc = true;
    }

    @Nullable
    public final zzco zza() {
        int i;
        int i2;
        if (this.zzd != 0 && this.zze != 0 && this.zzh != 0 && this.zzi != 0) {
            zzdy zzdyVar = this.zza;
            if (zzdyVar.zze() != 0 && zzdyVar.zzd() == zzdyVar.zze() && this.zzc) {
                zzdyVar.zzL(0);
                int i3 = this.zzh * this.zzi;
                int[] iArr = new int[i3];
                int i4 = 0;
                while (i4 < i3) {
                    int zzm = this.zza.zzm();
                    if (zzm != 0) {
                        i = i4 + 1;
                        iArr[i4] = this.zzb[zzm];
                    } else {
                        int zzm2 = this.zza.zzm();
                        if (zzm2 != 0) {
                            int i5 = zzm2 & 63;
                            if ((zzm2 & 64) != 0) {
                                i5 = (i5 << 8) | this.zza.zzm();
                            }
                            if ((zzm2 & 128) == 0) {
                                i2 = this.zzb[0];
                            } else {
                                i2 = this.zzb[this.zza.zzm()];
                            }
                            i = i5 + i4;
                            Arrays.fill(iArr, i4, i, i2);
                        }
                    }
                    i4 = i;
                }
                Bitmap createBitmap = Bitmap.createBitmap(iArr, this.zzh, this.zzi, Bitmap.Config.ARGB_8888);
                zzcm zzcmVar = new zzcm();
                zzcmVar.zzc(createBitmap);
                zzcmVar.zzh(this.zzf / this.zzd);
                zzcmVar.zzi(0);
                zzcmVar.zze(this.zzg / this.zze, 0);
                zzcmVar.zzf(0);
                zzcmVar.zzk(this.zzh / this.zzd);
                zzcmVar.zzd(this.zzi / this.zze);
                return zzcmVar.zzp();
            }
            return null;
        }
        return null;
    }

    public final void zze() {
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zza.zzI(0);
        this.zzc = false;
    }
}
