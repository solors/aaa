package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzcj {
    private final int zza;
    private final int zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final short[] zzi;
    private short[] zzj;
    private int zzk;
    private short[] zzl;
    private int zzm;
    private short[] zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private int zzv;
    private double zzw;

    public zzcj(int i, int i2, float f, float f2, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = f;
        this.zzd = f2;
        this.zze = i / i3;
        this.zzf = i / 400;
        int i4 = i / 65;
        this.zzg = i4;
        int i5 = i4 + i4;
        this.zzh = i5;
        this.zzi = new short[i5];
        int i6 = i5 * i2;
        this.zzj = new short[i6];
        this.zzl = new short[i6];
        this.zzn = new short[i6];
    }

    private final int zzg(short[] sArr, int i, int i2, int i3) {
        int i4 = 1;
        int i5 = 255;
        int i6 = 0;
        int i7 = 0;
        while (i2 <= i3) {
            int i8 = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                int i10 = this.zzb * i;
                i8 += Math.abs(sArr[i10 + i9] - sArr[(i10 + i2) + i9]);
            }
            int i11 = i8 * i6;
            int i12 = i4 * i2;
            if (i11 < i12) {
                i4 = i8;
            }
            if (i11 < i12) {
                i6 = i2;
            }
            int i13 = i8 * i5;
            int i14 = i7 * i2;
            if (i13 > i14) {
                i7 = i8;
            }
            if (i13 > i14) {
                i5 = i2;
            }
            i2++;
        }
        this.zzu = i4 / i6;
        this.zzv = i7 / i5;
        return i6;
    }

    private final void zzh(short[] sArr, int i, int i2) {
        short[] zzl = zzl(this.zzl, this.zzm, i2);
        this.zzl = zzl;
        int i3 = this.zzm;
        int i4 = this.zzb;
        System.arraycopy(sArr, i * i4, zzl, i3 * i4, i2 * i4);
        this.zzm += i2;
    }

    private final void zzi(short[] sArr, int i, int i2) {
        int i3;
        for (int i4 = 0; i4 < this.zzh / i2; i4++) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int i7 = this.zzb;
                i3 = i7 * i2;
                if (i5 < i3) {
                    i6 += sArr[(i7 * i) + (i3 * i4) + i5];
                    i5++;
                }
            }
            this.zzi[i4] = (short) (i6 / i3);
        }
    }

    private static void zzj(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i4 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i3 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i9] = (short) (((sArr2[i7] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i9 += i2;
                i7 += i2;
                i8 += i2;
            }
        }
    }

    private final void zzk() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        long j;
        long j2;
        boolean z;
        int i10;
        double d = this.zzc / this.zzd;
        int i11 = (d > 1.00001d ? 1 : (d == 1.00001d ? 0 : -1));
        int i12 = this.zzm;
        int i13 = 0;
        int i14 = 1;
        if (i11 <= 0 && d >= 0.99999d) {
            zzh(this.zzj, 0, this.zzk);
            this.zzk = 0;
        } else {
            int i15 = this.zzk;
            if (i15 >= this.zzh) {
                int i16 = 0;
                while (true) {
                    int i17 = this.zzr;
                    if (i17 > 0) {
                        int min = Math.min(this.zzh, i17);
                        zzh(this.zzj, i16, min);
                        this.zzr -= min;
                        i16 += min;
                    } else {
                        short[] sArr = this.zzj;
                        int i18 = this.zza;
                        if (i18 > 4000) {
                            i = i18 / 4000;
                        } else {
                            i = i14;
                        }
                        if (this.zzb == i14 && i == i14) {
                            i2 = zzg(sArr, i16, this.zzf, this.zzg);
                        } else {
                            zzi(sArr, i16, i);
                            int zzg = zzg(this.zzi, i13, this.zzf / i, this.zzg / i);
                            if (i != i14) {
                                int i19 = zzg * i;
                                int i20 = i * 4;
                                int i21 = this.zzf;
                                int i22 = i19 - i20;
                                if (i22 >= i21) {
                                    i21 = i22;
                                }
                                int i23 = i19 + i20;
                                int i24 = this.zzg;
                                if (i23 > i24) {
                                    i23 = i24;
                                }
                                if (this.zzb == i14) {
                                    i2 = zzg(sArr, i16, i21, i23);
                                } else {
                                    zzi(sArr, i16, i14);
                                    i2 = zzg(this.zzi, i13, i21, i23);
                                }
                            } else {
                                i2 = zzg;
                            }
                        }
                        int i25 = this.zzu;
                        int i26 = this.zzv;
                        if (i25 != 0 && (i6 = this.zzs) != 0 && i26 <= i25 * 3 && i25 + i25 > this.zzt * 3) {
                            i3 = i6;
                        } else {
                            i3 = i2;
                        }
                        int i27 = i16 + i3;
                        this.zzt = i25;
                        this.zzs = i2;
                        double d2 = i3;
                        if (d > 1.0d) {
                            short[] sArr2 = this.zzj;
                            double d3 = (-1.0d) + d;
                            if (d >= 2.0d) {
                                double d4 = (d2 / d3) + this.zzw;
                                int round = (int) Math.round(d4);
                                this.zzw = d4 - round;
                                i5 = round;
                            } else {
                                double d5 = ((d2 * (2.0d - d)) / d3) + this.zzw;
                                int round2 = (int) Math.round(d5);
                                this.zzr = round2;
                                this.zzw = d5 - round2;
                                i5 = i3;
                            }
                            short[] zzl = zzl(this.zzl, this.zzm, i5);
                            this.zzl = zzl;
                            zzj(i5, this.zzb, zzl, this.zzm, sArr2, i16, sArr2, i27);
                            this.zzm += i5;
                            i16 += i3 + i5;
                        } else {
                            int i28 = i3;
                            short[] sArr3 = this.zzj;
                            double d6 = 1.0d - d;
                            if (d < 0.5d) {
                                double d7 = ((d2 * d) / d6) + this.zzw;
                                int round3 = (int) Math.round(d7);
                                this.zzw = d7 - round3;
                                i4 = round3;
                            } else {
                                double d8 = ((d2 * ((d + d) - 1.0d)) / d6) + this.zzw;
                                int round4 = (int) Math.round(d8);
                                this.zzr = round4;
                                this.zzw = d8 - round4;
                                i4 = i28;
                            }
                            int i29 = i28 + i4;
                            short[] zzl2 = zzl(this.zzl, this.zzm, i29);
                            this.zzl = zzl2;
                            int i30 = this.zzb;
                            System.arraycopy(sArr3, i16 * i30, zzl2, this.zzm * i30, i30 * i28);
                            zzj(i4, this.zzb, this.zzl, this.zzm + i28, sArr3, i27, sArr3, i16);
                            this.zzm += i29;
                            i16 += i4;
                        }
                    }
                    if (this.zzh + i16 > i15) {
                        break;
                    }
                    i13 = 0;
                    i14 = 1;
                }
                int i31 = this.zzk - i16;
                short[] sArr4 = this.zzj;
                int i32 = this.zzb;
                System.arraycopy(sArr4, i16 * i32, sArr4, 0, i32 * i31);
                this.zzk = i31;
            }
        }
        float f = this.zze * this.zzd;
        if (f != 1.0f && this.zzm != i12) {
            int i33 = this.zza;
            long j3 = i33;
            long j4 = i33 / f;
            while (j4 != 0 && j3 != 0 && j4 % 2 == 0 && j3 % 2 == 0) {
                j4 /= 2;
                j3 /= 2;
            }
            int i34 = this.zzm - i12;
            short[] zzl3 = zzl(this.zzn, this.zzo, i34);
            this.zzn = zzl3;
            short[] sArr5 = this.zzl;
            int i35 = this.zzb;
            System.arraycopy(sArr5, i12 * i35, zzl3, this.zzo * i35, i35 * i34);
            this.zzm = i12;
            this.zzo += i34;
            int i36 = 0;
            while (true) {
                i7 = this.zzo;
                i8 = i7 - 1;
                if (i36 >= i8) {
                    break;
                }
                while (true) {
                    i9 = this.zzp + 1;
                    j = i9;
                    j2 = this.zzq;
                    if (j * j4 <= j2 * j3) {
                        break;
                    }
                    this.zzl = zzl(this.zzl, this.zzm, 1);
                    int i37 = 0;
                    while (true) {
                        int i38 = this.zzb;
                        if (i37 < i38) {
                            short[] sArr6 = this.zzl;
                            int i39 = this.zzm * i38;
                            short[] sArr7 = this.zzn;
                            int i40 = (i36 * i38) + i37;
                            short s = sArr7[i40];
                            short s2 = sArr7[i40 + i38];
                            long j5 = this.zzq * j3;
                            long j6 = j3;
                            long j7 = (i10 + 1) * j4;
                            long j8 = j7 - (this.zzp * j4);
                            long j9 = j7 - j5;
                            sArr6[i39 + i37] = (short) (((j9 * s) + ((j8 - j9) * s2)) / j8);
                            i37++;
                            j3 = j6;
                            j4 = j4;
                        }
                    }
                    this.zzq++;
                    this.zzm++;
                    j3 = j3;
                    j4 = j4;
                }
                long j10 = j3;
                long j11 = j4;
                this.zzp = i9;
                if (j == j10) {
                    this.zzp = 0;
                    if (j2 == j11) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zzcw.zzf(z);
                    this.zzq = 0;
                }
                i36++;
                j3 = j10;
                j4 = j11;
            }
            if (i8 != 0) {
                short[] sArr8 = this.zzn;
                int i41 = this.zzb;
                System.arraycopy(sArr8, i8 * i41, sArr8, 0, (i7 - i8) * i41);
                this.zzo -= i8;
            }
        }
    }

    private final short[] zzl(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.zzb;
        int i4 = length / i3;
        if (i + i2 <= i4) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    public final int zza() {
        int i = this.zzm * this.zzb;
        return i + i;
    }

    public final int zzb() {
        int i = this.zzk * this.zzb;
        return i + i;
    }

    public final void zzc() {
        this.zzk = 0;
        this.zzm = 0;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = 0;
        this.zzv = 0;
        this.zzw = 0.0d;
    }

    public final void zzd(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.zzb, this.zzm);
        shortBuffer.put(this.zzl, 0, this.zzb * min);
        int i = this.zzm - min;
        this.zzm = i;
        int i2 = this.zzb;
        short[] sArr = this.zzl;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    public final void zze() {
        int i;
        int i2 = this.zzk;
        int i3 = this.zzr;
        int i4 = this.zzm;
        float f = this.zzc;
        float f2 = this.zzd;
        int i5 = i4 + ((int) (((((((i2 - i3) / (f / f2)) + i3) + this.zzw) + this.zzo) / (this.zze * f2)) + 0.5d));
        this.zzw = 0.0d;
        int i6 = this.zzh;
        this.zzj = zzl(this.zzj, i2, i6 + i6 + i2);
        int i7 = 0;
        while (true) {
            int i8 = this.zzh;
            int i9 = this.zzb;
            i = i8 + i8;
            if (i7 >= i * i9) {
                break;
            }
            this.zzj[(i9 * i2) + i7] = 0;
            i7++;
        }
        this.zzk += i;
        zzk();
        if (this.zzm > i5) {
            this.zzm = i5;
        }
        this.zzk = 0;
        this.zzr = 0;
        this.zzo = 0;
    }

    public final void zzf(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.zzb;
        int i2 = remaining / i;
        int i3 = i * i2;
        short[] zzl = zzl(this.zzj, this.zzk, i2);
        this.zzj = zzl;
        shortBuffer.get(zzl, this.zzk * this.zzb, (i3 + i3) / 2);
        this.zzk += i2;
        zzk();
    }
}
