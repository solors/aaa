package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.amazon.device.ads.DtbConstants;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzacm {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] zzc = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] zzd = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, IronSourceConstants.IS_AD_UNIT_CAPPED, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    private static final int[] zze = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    private static final int[] zzf = {5, 8, 10, 12};
    private static final int[] zzg = {6, 9, 12, 15};
    private static final int[] zzh = {2, 4, 6, 8};
    private static final int[] zzi = {9, 11, 13, 16};
    private static final int[] zzj = {5, 8, 10, 12};

    public static int zza(byte[] bArr) {
        int i;
        zzdx zzg2 = zzg(bArr);
        zzg2.zzn(42);
        if (true != zzg2.zzp()) {
            i = 8;
        } else {
            i = 12;
        }
        return zzg2.zzd(i) + 1;
    }

    public static int zzb(byte[] bArr) {
        zzdx zzg2 = zzg(bArr);
        zzg2.zzn(32);
        return zzf(zzg2, zzj, true) + 1;
    }

    public static zzab zzc(byte[] bArr, @Nullable String str, @Nullable String str2, int i, @Nullable zzu zzuVar) {
        int i2;
        int i3;
        zzdx zzg2 = zzg(bArr);
        zzg2.zzn(60);
        int i4 = zzb[zzg2.zzd(6)];
        int i5 = zzc[zzg2.zzd(4)];
        int zzd2 = zzg2.zzd(5);
        if (zzd2 >= 29) {
            i2 = -1;
        } else {
            i2 = (zzd[zzd2] * 1000) / 2;
        }
        zzg2.zzn(10);
        if (zzg2.zzd(2) > 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i6 = i4 + i3;
        zzz zzzVar = new zzz();
        zzzVar.zzM(str);
        zzzVar.zzaa("audio/vnd.dts");
        zzzVar.zzy(i2);
        zzzVar.zzz(i6);
        zzzVar.zzab(i5);
        zzzVar.zzF(null);
        zzzVar.zzQ(str2);
        zzzVar.zzY(i);
        return zzzVar.zzag();
    }

    public static zzack zzd(byte[] bArr) throws zzbc {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        int i6;
        zzdx zzg2 = zzg(bArr);
        zzg2.zzn(40);
        int zzd2 = zzg2.zzd(2);
        boolean zzp = zzg2.zzp();
        if (true != zzp) {
            i = 16;
        } else {
            i = 20;
        }
        if (true != zzp) {
            i2 = 8;
        } else {
            i2 = 12;
        }
        zzg2.zzn(i2);
        int zzd3 = zzg2.zzd(i) + 1;
        boolean zzp2 = zzg2.zzp();
        int i7 = 0;
        if (zzp2) {
            i3 = zzg2.zzd(2);
            int zzd4 = zzg2.zzd(3) + 1;
            if (zzg2.zzp()) {
                zzg2.zzn(36);
            }
            int zzd5 = zzg2.zzd(3) + 1;
            int zzd6 = zzg2.zzd(3) + 1;
            if (zzd5 == 1 && zzd6 == 1) {
                int i8 = zzd2 + 1;
                int zzd7 = zzg2.zzd(i8);
                for (int i9 = 0; i9 < i8; i9++) {
                    if (((zzd7 >> i9) & 1) == 1) {
                        zzg2.zzn(8);
                    }
                }
                int i10 = zzd4 * 512;
                if (zzg2.zzp()) {
                    zzg2.zzn(2);
                    int zzd8 = (zzg2.zzd(2) + 1) << 2;
                    int zzd9 = zzg2.zzd(2) + 1;
                    while (i7 < zzd9) {
                        zzg2.zzn(zzd8);
                        i7++;
                    }
                }
                i7 = i10;
            } else {
                throw zzbc.zzc("Multiple audio presentations or assets not supported");
            }
        } else {
            i3 = -1;
        }
        zzg2.zzn(i);
        zzg2.zzn(12);
        if (zzp2) {
            if (zzg2.zzp()) {
                zzg2.zzn(4);
            }
            if (zzg2.zzp()) {
                zzg2.zzn(24);
            }
            if (zzg2.zzp()) {
                zzg2.zzo(zzg2.zzd(10) + 1);
            }
            zzg2.zzn(5);
            int i11 = zze[zzg2.zzd(4)];
            i5 = zzg2.zzd(8) + 1;
            i4 = i11;
        } else {
            i4 = -2147483647;
            i5 = -1;
        }
        if (zzp2) {
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        i6 = 48000;
                    } else {
                        throw zzbc.zza("Unsupported reference clock code in DTS HD header: " + i3, null);
                    }
                } else {
                    i6 = 44100;
                }
            } else {
                i6 = 32000;
            }
            j = zzei.zzu(i7, 1000000L, i6, RoundingMode.DOWN);
        } else {
            j = -9223372036854775807L;
        }
        return new zzack("audio/vnd.dts.hd;profile=lbr", i5, i4, zzd3, j, 0, null);
    }

    public static zzack zze(byte[] bArr, AtomicInteger atomicInteger) throws zzbc {
        char c;
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        zzdx zzg2 = zzg(bArr);
        int zzd2 = zzg2.zzd(32);
        int zzf2 = zzf(zzg2, zzf, true) + 1;
        if (zzd2 == 1078008818) {
            c = 1;
        } else {
            c = 0;
        }
        if (c != 0) {
            if (zzg2.zzp()) {
                int i5 = zzf2 - 2;
                if ((((char) (bArr[i5] << 8)) | (bArr[zzf2 - 1] & 255)) == zzei.zze(bArr, 0, i5, 65535)) {
                    int zzd3 = zzg2.zzd(2);
                    if (zzd3 != 0) {
                        if (zzd3 != 1) {
                            if (zzd3 == 2) {
                                i3 = 384;
                            } else {
                                throw zzbc.zza("Unsupported base duration index in DTS UHD header: " + zzd3, null);
                            }
                        } else {
                            i3 = DtbConstants.DEFAULT_PLAYER_HEIGHT;
                        }
                    } else {
                        i3 = 512;
                    }
                    int zzd4 = zzg2.zzd(3) + 1;
                    int zzd5 = zzg2.zzd(2);
                    if (zzd5 != 0) {
                        if (zzd5 != 1) {
                            if (zzd5 == 2) {
                                i4 = 48000;
                            } else {
                                throw zzbc.zza("Unsupported clock rate index in DTS UHD header: " + zzd5, null);
                            }
                        } else {
                            i4 = 44100;
                        }
                    } else {
                        i4 = 32000;
                    }
                    if (zzg2.zzp()) {
                        zzg2.zzn(36);
                    }
                    i = (1 << zzg2.zzd(2)) * i4;
                    j = zzei.zzu(i3 * zzd4, 1000000L, i4, RoundingMode.DOWN);
                } else {
                    throw zzbc.zza("CRC check failed", null);
                }
            } else {
                throw zzbc.zzc("Only supports full channel mask-based audio presentation");
            }
        } else {
            j = -9223372036854775807L;
            i = -2147483647;
        }
        int i6 = i;
        long j2 = j;
        int i7 = 0;
        for (char c2 = 0; c2 < c; c2 = 1) {
            i7 += zzf(zzg2, zzg, true);
        }
        for (int i8 = 0; i8 <= 0; i8++) {
            if (c != 0) {
                atomicInteger.set(zzf(zzg2, zzh, true));
            }
            if (atomicInteger.get() != 0) {
                i2 = zzf(zzg2, zzi, true);
            } else {
                i2 = 0;
            }
            i7 += i2;
        }
        return new zzack("audio/vnd.dts.uhd;profile=p2", 2, i6, zzf2 + i7, j2, 0, null);
    }

    private static int zzf(zzdx zzdxVar, int[] iArr, boolean z) {
        int i = 0;
        for (int i2 = 0; i2 < 3 && zzdxVar.zzp(); i2++) {
            i++;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            i3 += 1 << iArr[i4];
        }
        return i3 + zzdxVar.zzd(iArr[i]);
    }

    private static zzdx zzg(byte[] bArr) {
        byte b = bArr[0];
        if (b != Byte.MAX_VALUE && b != 100 && b != 64 && b != 113) {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b2 = copyOf[0];
            if (b2 == -2 || b2 == -1 || b2 == 37 || b2 == -14 || b2 == -24) {
                for (int i = 0; i < copyOf.length - 1; i += 2) {
                    byte b3 = copyOf[i];
                    int i2 = i + 1;
                    copyOf[i] = copyOf[i2];
                    copyOf[i2] = b3;
                }
            }
            int length = copyOf.length;
            zzdx zzdxVar = new zzdx(copyOf, length);
            if (copyOf[0] == 31) {
                zzdx zzdxVar2 = new zzdx(copyOf, length);
                while (zzdxVar2.zza() >= 16) {
                    zzdxVar2.zzn(2);
                    zzdxVar.zzg(zzdxVar2.zzd(14), 14);
                }
            }
            zzdxVar.zzk(copyOf, copyOf.length);
            return zzdxVar;
        }
        return new zzdx(bArr, bArr.length);
    }
}
