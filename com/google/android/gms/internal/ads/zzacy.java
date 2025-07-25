package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.primitives.UnsignedBytes;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzacy {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final long zzj;
    @Nullable
    public final zzacx zzk;
    @Nullable
    private final zzay zzl;

    private zzacy(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, @Nullable zzacx zzacxVar, @Nullable zzay zzayVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = i5;
        this.zzf = zzi(i5);
        this.zzg = i6;
        this.zzh = i7;
        this.zzi = zzh(i7);
        this.zzj = j;
        this.zzk = zzacxVar;
        this.zzl = zzayVar;
    }

    private static int zzh(int i) {
        if (i != 8) {
            if (i != 12) {
                if (i != 16) {
                    if (i != 20) {
                        if (i != 24) {
                            return -1;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    private static int zzi(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long zza() {
        long j = this.zzj;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.zze;
    }

    public final long zzb(long j) {
        return Math.max(0L, Math.min((j * this.zze) / 1000000, this.zzj - 1));
    }

    public final zzab zzc(byte[] bArr, @Nullable zzay zzayVar) {
        bArr[4] = UnsignedBytes.MAX_POWER_OF_TWO;
        zzay zzd = zzd(zzayVar);
        zzz zzzVar = new zzz();
        zzzVar.zzaa("audio/flac");
        int i = this.zzd;
        if (i <= 0) {
            i = -1;
        }
        zzzVar.zzR(i);
        zzzVar.zzz(this.zzg);
        zzzVar.zzab(this.zze);
        zzzVar.zzU(zzei.zzn(this.zzh));
        zzzVar.zzN(Collections.singletonList(bArr));
        zzzVar.zzT(zzd);
        return zzzVar.zzag();
    }

    @Nullable
    public final zzay zzd(@Nullable zzay zzayVar) {
        zzay zzayVar2 = this.zzl;
        if (zzayVar2 == null) {
            return zzayVar;
        }
        return zzayVar2.zzd(zzayVar);
    }

    public final zzacy zze(List list) {
        return new zzacy(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(new zzay(list)));
    }

    public final zzacy zzf(@Nullable zzacx zzacxVar) {
        return new zzacy(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, zzacxVar, this.zzl);
    }

    public final zzacy zzg(List list) {
        return new zzacy(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(zzadz.zzb(list)));
    }

    public zzacy(byte[] bArr, int i) {
        zzdx zzdxVar = new zzdx(bArr, bArr.length);
        zzdxVar.zzl(i * 8);
        this.zza = zzdxVar.zzd(16);
        this.zzb = zzdxVar.zzd(16);
        this.zzc = zzdxVar.zzd(24);
        this.zzd = zzdxVar.zzd(24);
        int zzd = zzdxVar.zzd(20);
        this.zze = zzd;
        this.zzf = zzi(zzd);
        this.zzg = zzdxVar.zzd(3) + 1;
        int zzd2 = zzdxVar.zzd(5) + 1;
        this.zzh = zzd2;
        this.zzi = zzh(zzd2);
        this.zzj = zzdxVar.zze(36);
        this.zzk = null;
        this.zzl = null;
    }
}
