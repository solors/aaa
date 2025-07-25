package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzabn {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {24000, 22050, 16000};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] zzg = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int zza(ByteBuffer byteBuffer) {
        int i = 3;
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
                i = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
            }
            return zzb[i] * 256;
        }
        return 1536;
    }

    public static int zzb(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            int i = ((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1;
            return i + i;
        }
        byte b = bArr[4];
        return zzf((b & 192) >> 6, b & 63);
    }

    public static zzab zzc(zzdy zzdyVar, String str, String str2, @Nullable zzu zzuVar) {
        zzdx zzdxVar = new zzdx();
        zzdxVar.zzj(zzdyVar);
        int i = zzc[zzdxVar.zzd(2)];
        zzdxVar.zzn(8);
        int i2 = zze[zzdxVar.zzd(3)];
        if (zzdxVar.zzd(1) != 0) {
            i2++;
        }
        int i3 = zzf[zzdxVar.zzd(5)] * 1000;
        zzdxVar.zzf();
        zzdyVar.zzL(zzdxVar.zzb());
        zzz zzzVar = new zzz();
        zzzVar.zzM(str);
        zzzVar.zzaa("audio/ac3");
        zzzVar.zzz(i2);
        zzzVar.zzab(i);
        zzzVar.zzF(zzuVar);
        zzzVar.zzQ(str2);
        zzzVar.zzy(i3);
        zzzVar.zzV(i3);
        return zzzVar.zzag();
    }

    public static zzab zzd(zzdy zzdyVar, String str, String str2, @Nullable zzu zzuVar) {
        String str3;
        zzdx zzdxVar = new zzdx();
        zzdxVar.zzj(zzdyVar);
        int zzd2 = zzdxVar.zzd(13) * 1000;
        zzdxVar.zzn(3);
        int i = zzc[zzdxVar.zzd(2)];
        zzdxVar.zzn(10);
        int i2 = zze[zzdxVar.zzd(3)];
        if (zzdxVar.zzd(1) != 0) {
            i2++;
        }
        zzdxVar.zzn(3);
        int zzd3 = zzdxVar.zzd(4);
        zzdxVar.zzn(1);
        if (zzd3 > 0) {
            zzdxVar.zzn(6);
            if (zzdxVar.zzd(1) != 0) {
                i2 += 2;
            }
            zzdxVar.zzn(1);
        }
        if (zzdxVar.zza() > 7) {
            zzdxVar.zzn(7);
            if (zzdxVar.zzd(1) != 0) {
                str3 = "audio/eac3-joc";
                zzdxVar.zzf();
                zzdyVar.zzL(zzdxVar.zzb());
                zzz zzzVar = new zzz();
                zzzVar.zzM(str);
                zzzVar.zzaa(str3);
                zzzVar.zzz(i2);
                zzzVar.zzab(i);
                zzzVar.zzF(zzuVar);
                zzzVar.zzQ(str2);
                zzzVar.zzV(zzd2);
                return zzzVar.zzag();
            }
        }
        str3 = "audio/eac3";
        zzdxVar.zzf();
        zzdyVar.zzL(zzdxVar.zzb());
        zzz zzzVar2 = new zzz();
        zzzVar2.zzM(str);
        zzzVar2.zzaa(str3);
        zzzVar2.zzz(i2);
        zzzVar2.zzab(i);
        zzzVar2.zzF(zzuVar);
        zzzVar2.zzQ(str2);
        zzzVar2.zzV(zzd2);
        return zzzVar2.zzag();
    }

    public static zzabl zze(zzdx zzdxVar) {
        String str;
        int i;
        int i2;
        int i3;
        String str2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        String str3;
        int zzc2 = zzdxVar.zzc();
        zzdxVar.zzn(40);
        int zzd2 = zzdxVar.zzd(5);
        zzdxVar.zzl(zzc2);
        int i13 = -1;
        if (zzd2 > 10) {
            zzdxVar.zzn(16);
            int zzd3 = zzdxVar.zzd(2);
            if (zzd3 != 0) {
                if (zzd3 != 1) {
                    if (zzd3 == 2) {
                        i13 = 2;
                    }
                } else {
                    i13 = 1;
                }
            } else {
                i13 = 0;
            }
            zzdxVar.zzn(3);
            int zzd4 = zzdxVar.zzd(11) + 1;
            int zzd5 = zzdxVar.zzd(2);
            if (zzd5 == 3) {
                i9 = zzd[zzdxVar.zzd(2)];
                i10 = 6;
                i8 = 3;
            } else {
                int zzd6 = zzdxVar.zzd(2);
                int i14 = zzb[zzd6];
                i8 = zzd6;
                i9 = zzc[zzd5];
                i10 = i14;
            }
            int i15 = zzd4 + zzd4;
            int i16 = (i15 * i9) / (i10 * 32);
            int zzd7 = zzdxVar.zzd(3);
            boolean zzp = zzdxVar.zzp();
            i2 = zze[zzd7] + (zzp ? 1 : 0);
            zzdxVar.zzn(10);
            if (zzdxVar.zzp()) {
                zzdxVar.zzn(8);
            }
            if (zzd7 == 0) {
                zzdxVar.zzn(5);
                if (zzdxVar.zzp()) {
                    zzdxVar.zzn(8);
                }
                i11 = 0;
                zzd7 = 0;
            } else {
                i11 = zzd7;
            }
            if (i13 == 1) {
                if (zzdxVar.zzp()) {
                    zzdxVar.zzn(16);
                }
                i12 = 1;
            } else {
                i12 = i13;
            }
            if (zzdxVar.zzp()) {
                if (i11 > 2) {
                    zzdxVar.zzn(2);
                }
                if ((i11 & 1) != 0 && i11 > 2) {
                    zzdxVar.zzn(6);
                }
                if ((i11 & 4) != 0) {
                    zzdxVar.zzn(6);
                }
                if (zzp && zzdxVar.zzp()) {
                    zzdxVar.zzn(5);
                }
                if (i12 == 0) {
                    if (zzdxVar.zzp()) {
                        zzdxVar.zzn(6);
                    }
                    if (i11 == 0 && zzdxVar.zzp()) {
                        zzdxVar.zzn(6);
                    }
                    if (zzdxVar.zzp()) {
                        zzdxVar.zzn(6);
                    }
                    int zzd8 = zzdxVar.zzd(2);
                    if (zzd8 == 1) {
                        zzdxVar.zzn(5);
                    } else if (zzd8 == 2) {
                        zzdxVar.zzn(12);
                    } else if (zzd8 == 3) {
                        int zzd9 = zzdxVar.zzd(5);
                        if (zzdxVar.zzp()) {
                            zzdxVar.zzn(5);
                            if (zzdxVar.zzp()) {
                                zzdxVar.zzn(4);
                            }
                            if (zzdxVar.zzp()) {
                                zzdxVar.zzn(4);
                            }
                            if (zzdxVar.zzp()) {
                                zzdxVar.zzn(4);
                            }
                            if (zzdxVar.zzp()) {
                                zzdxVar.zzn(4);
                            }
                            if (zzdxVar.zzp()) {
                                zzdxVar.zzn(4);
                            }
                            if (zzdxVar.zzp()) {
                                zzdxVar.zzn(4);
                            }
                            if (zzdxVar.zzp()) {
                                zzdxVar.zzn(4);
                            }
                            if (zzdxVar.zzp()) {
                                if (zzdxVar.zzp()) {
                                    zzdxVar.zzn(4);
                                }
                                if (zzdxVar.zzp()) {
                                    zzdxVar.zzn(4);
                                }
                            }
                        }
                        if (zzdxVar.zzp()) {
                            zzdxVar.zzn(5);
                            if (zzdxVar.zzp()) {
                                zzdxVar.zzn(7);
                                if (zzdxVar.zzp()) {
                                    zzdxVar.zzn(8);
                                }
                            }
                        }
                        zzdxVar.zzn((zzd9 + 2) * 8);
                        zzdxVar.zzf();
                    }
                    if (i11 < 2) {
                        if (zzdxVar.zzp()) {
                            zzdxVar.zzn(14);
                        }
                        if (zzd7 == 0 && zzdxVar.zzp()) {
                            zzdxVar.zzn(14);
                        }
                    }
                    if (zzdxVar.zzp()) {
                        if (i8 == 0) {
                            zzdxVar.zzn(5);
                            i12 = 0;
                            i8 = 0;
                        } else {
                            for (int i17 = 0; i17 < i10; i17++) {
                                if (zzdxVar.zzp()) {
                                    zzdxVar.zzn(5);
                                }
                            }
                        }
                    }
                    i12 = 0;
                }
            }
            if (zzdxVar.zzp()) {
                zzdxVar.zzn(5);
                if (i11 == 2) {
                    zzdxVar.zzn(4);
                    i11 = 2;
                }
                if (i11 >= 6) {
                    zzdxVar.zzn(2);
                }
                if (zzdxVar.zzp()) {
                    zzdxVar.zzn(8);
                }
                if (i11 == 0 && zzdxVar.zzp()) {
                    zzdxVar.zzn(8);
                }
                if (zzd5 < 3) {
                    zzdxVar.zzm();
                }
            }
            if (i12 == 0 && i8 != 3) {
                zzdxVar.zzm();
            }
            if (i12 == 2 && (i8 == 3 || zzdxVar.zzp())) {
                zzdxVar.zzn(6);
            }
            if (zzdxVar.zzp() && zzdxVar.zzd(6) == 1 && zzdxVar.zzd(8) == 1) {
                str3 = "audio/eac3-joc";
            } else {
                str3 = "audio/eac3";
            }
            str2 = str3;
            i3 = i13;
            i5 = i15;
            i6 = i9;
            i7 = i10 * 256;
            i4 = i16;
        } else {
            zzdxVar.zzn(32);
            int zzd10 = zzdxVar.zzd(2);
            if (zzd10 == 3) {
                str = null;
            } else {
                str = "audio/ac3";
            }
            int zzd11 = zzdxVar.zzd(6);
            int i18 = zzf[zzd11 / 2] * 1000;
            int zzf2 = zzf(zzd10, zzd11);
            zzdxVar.zzn(8);
            int zzd12 = zzdxVar.zzd(3);
            if ((zzd12 & 1) != 0 && zzd12 != 1) {
                zzdxVar.zzn(2);
            }
            if ((zzd12 & 4) != 0) {
                zzdxVar.zzn(2);
            }
            if (zzd12 == 2) {
                zzdxVar.zzn(2);
            }
            if (zzd10 < 3) {
                i = zzc[zzd10];
            } else {
                i = -1;
            }
            i2 = zze[zzd12] + (zzdxVar.zzp() ? 1 : 0);
            i3 = -1;
            str2 = str;
            i4 = i18;
            i5 = zzf2;
            i6 = i;
            i7 = 1536;
        }
        return new zzabl(str2, i3, i2, i6, i5, i7, i4, null);
    }

    private static int zzf(int i, int i2) {
        int i3;
        if (i >= 0 && i < 3 && i2 >= 0 && (i3 = i2 >> 1) < 19) {
            int i4 = zzc[i];
            if (i4 == 44100) {
                int i5 = zzg[i3] + (i2 & 1);
                return i5 + i5;
            }
            int i6 = zzf[i3];
            if (i4 == 32000) {
                return i6 * 6;
            }
            return i6 * 4;
        }
        return -1;
    }
}
