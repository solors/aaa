package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzanz {
    public static int zza(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long zzb(zzdy zzdyVar, int i, int i2) {
        zzdyVar.zzL(i);
        if (zzdyVar.zzb() >= 5) {
            int zzg = zzdyVar.zzg();
            if ((8388608 & zzg) == 0 && ((zzg >> 8) & 8191) == i2 && (zzg & 32) != 0 && zzdyVar.zzm() >= 7 && zzdyVar.zzb() >= 7 && (zzdyVar.zzm() & 16) == 16) {
                byte[] bArr = new byte[6];
                zzdyVar.zzH(bArr, 0, 6);
                long j = bArr[3] & 255;
                return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | (j + j) | ((bArr[4] & 255) >> 7);
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }
}
