package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzabz {
    public static void zza(long j, zzdy zzdyVar, zzadt[] zzadtVarArr) {
        int i;
        boolean z;
        while (true) {
            boolean z2 = true;
            if (zzdyVar.zzb() > 1) {
                int zzc = zzc(zzdyVar);
                int zzc2 = zzc(zzdyVar);
                int zzd = zzdyVar.zzd() + zzc2;
                if (zzc2 != -1 && zzc2 <= zzdyVar.zzb()) {
                    if (zzc == 4 && zzc2 >= 8) {
                        int zzm = zzdyVar.zzm();
                        int zzq = zzdyVar.zzq();
                        if (zzq == 49) {
                            i = zzdyVar.zzg();
                            zzq = 49;
                        } else {
                            i = 0;
                        }
                        int zzm2 = zzdyVar.zzm();
                        if (zzq == 47) {
                            zzdyVar.zzM(1);
                            zzq = 47;
                        }
                        if (zzm == 181 && ((zzq == 49 || zzq == 47) && zzm2 == 3)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (zzq == 49) {
                            if (i != 1195456820) {
                                z2 = false;
                            }
                            z &= z2;
                        }
                        if (z) {
                            zzb(j, zzdyVar, zzadtVarArr);
                        }
                    }
                } else {
                    zzdo.zzf("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    zzd = zzdyVar.zze();
                }
                zzdyVar.zzL(zzd);
            } else {
                return;
            }
        }
    }

    public static void zzb(long j, zzdy zzdyVar, zzadt[] zzadtVarArr) {
        boolean z;
        int zzm = zzdyVar.zzm();
        if ((zzm & 64) != 0) {
            int i = zzm & 31;
            zzdyVar.zzM(1);
            int zzd = zzdyVar.zzd();
            for (zzadt zzadtVar : zzadtVarArr) {
                int i2 = i * 3;
                zzdyVar.zzL(zzd);
                zzadtVar.zzr(zzdyVar, i2);
                if (j != -9223372036854775807L) {
                    z = true;
                } else {
                    z = false;
                }
                zzcw.zzf(z);
                zzadtVar.zzt(j, 1, i2, 0, null);
            }
        }
    }

    private static int zzc(zzdy zzdyVar) {
        int i = 0;
        while (zzdyVar.zzb() != 0) {
            int zzm = zzdyVar.zzm();
            i += zzm;
            if (zzm != 255) {
                return i;
            }
        }
        return -1;
    }
}
