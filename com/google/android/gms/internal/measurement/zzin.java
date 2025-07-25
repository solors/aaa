package com.google.android.gms.internal.measurement;

import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzin extends zzio {
    private final byte[] zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    private final void zzaa() {
        int i = this.zze + this.zzf;
        this.zze = i;
        int i2 = i - this.zzh;
        int i3 = this.zzj;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.zzf = i4;
            this.zze = i - i4;
            return;
        }
        this.zzf = 0;
    }

    private final byte zzv() throws IOException {
        int i = this.zzg;
        if (i != this.zze) {
            byte[] bArr = this.zzd;
            this.zzg = i + 1;
            return bArr[i];
        }
        throw zzjs.zzh();
    }

    private final int zzw() throws IOException {
        int i = this.zzg;
        if (this.zze - i >= 4) {
            byte[] bArr = this.zzd;
            this.zzg = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw zzjs.zzh();
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0066, code lost:
        if (r2[r3] >= 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzx() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.zzg
            int r1 = r5.zze
            if (r1 == r0) goto L6b
            byte[] r2 = r5.zzd
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L11
            r5.zzg = r3
            return r0
        L11:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6b
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L22
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L68
        L22:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L2f
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2d:
            r1 = r3
            goto L68
        L2f:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3d
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L68
        L3d:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 < 0) goto L6b
        L68:
            r5.zzg = r1
            return r0
        L6b:
            long r0 = r5.zzm()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzin.zzx():int");
    }

    private final long zzy() throws IOException {
        int i = this.zzg;
        if (this.zze - i >= 8) {
            byte[] bArr = this.zzd;
            this.zzg = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }
        throw zzjs.zzh();
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x00b0, code lost:
        if (r2[r0] >= 0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long zzz() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 189
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzin.zzz():long");
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final double zza() throws IOException {
        return Double.longBitsToDouble(zzy());
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final float zzb() throws IOException {
        return Float.intBitsToFloat(zzw());
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final int zzc() {
        return this.zzg - this.zzh;
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final int zzd() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final int zze() throws IOException {
        return zzw();
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final int zzf() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final int zzg() throws IOException {
        return zzw();
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final int zzh() throws IOException {
        return zzio.zze(zzx());
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final int zzi() throws IOException {
        if (zzt()) {
            this.zzi = 0;
            return 0;
        }
        int zzx = zzx();
        this.zzi = zzx;
        if ((zzx >>> 3) != 0) {
            return zzx;
        }
        throw zzjs.zzc();
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final int zzj() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final long zzk() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final long zzl() throws IOException {
        return zzz();
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final long zzm() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte zzv = zzv();
            j |= (zzv & Byte.MAX_VALUE) << i;
            if ((zzv & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                return j;
            }
        }
        throw zzjs.zze();
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final long zzn() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final long zzo() throws IOException {
        return zzio.zza(zzz());
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final long zzp() throws IOException {
        return zzz();
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final zzia zzq() throws IOException {
        byte[] bArr;
        int zzx = zzx();
        if (zzx > 0) {
            int i = this.zze;
            int i2 = this.zzg;
            if (zzx <= i - i2) {
                zzia zza = zzia.zza(this.zzd, i2, zzx);
                this.zzg += zzx;
                return zza;
            }
        }
        if (zzx == 0) {
            return zzia.zza;
        }
        if (zzx > 0) {
            int i3 = this.zze;
            int i4 = this.zzg;
            if (zzx <= i3 - i4) {
                int i5 = zzx + i4;
                this.zzg = i5;
                bArr = Arrays.copyOfRange(this.zzd, i4, i5);
                return zzia.zzb(bArr);
            }
        }
        if (zzx <= 0) {
            if (zzx == 0) {
                bArr = zzjm.zzb;
                return zzia.zzb(bArr);
            }
            throw zzjs.zzf();
        }
        throw zzjs.zzh();
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final String zzr() throws IOException {
        int zzx = zzx();
        if (zzx > 0) {
            int i = this.zze;
            int i2 = this.zzg;
            if (zzx <= i - i2) {
                String str = new String(this.zzd, i2, zzx, zzjm.zza);
                this.zzg += zzx;
                return str;
            }
        }
        if (zzx == 0) {
            return "";
        }
        if (zzx < 0) {
            throw zzjs.zzf();
        }
        throw zzjs.zzh();
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final String zzs() throws IOException {
        int zzx = zzx();
        if (zzx > 0) {
            int i = this.zze;
            int i2 = this.zzg;
            if (zzx <= i - i2) {
                String zzb = zzmk.zzb(this.zzd, i2, zzx);
                this.zzg += zzx;
                return zzb;
            }
        }
        if (zzx == 0) {
            return "";
        }
        if (zzx <= 0) {
            throw zzjs.zzf();
        }
        throw zzjs.zzh();
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final boolean zzt() throws IOException {
        if (this.zzg == this.zze) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final boolean zzu() throws IOException {
        if (zzz() != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zzin(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.zzj = Integer.MAX_VALUE;
        this.zzd = bArr;
        this.zze = i2 + i;
        this.zzg = i;
        this.zzh = i;
    }

    private final void zzf(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.zze;
            int i3 = this.zzg;
            if (i <= i2 - i3) {
                this.zzg = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw zzjs.zzf();
        }
        throw zzjs.zzh();
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final int zza(int i) throws zzjs {
        if (i >= 0) {
            int zzc = i + zzc();
            if (zzc >= 0) {
                int i2 = this.zzj;
                if (zzc <= i2) {
                    this.zzj = zzc;
                    zzaa();
                    return i2;
                }
                throw zzjs.zzh();
            }
            throw zzjs.zzg();
        }
        throw zzjs.zzf();
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final void zzb(int i) throws zzjs {
        if (this.zzi != i) {
            throw zzjs.zzb();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final void zzc(int i) {
        this.zzj = i;
        zzaa();
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final boolean zzd(int i) throws IOException {
        int zzi;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.zze - this.zzg >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.zzd;
                    int i4 = this.zzg;
                    this.zzg = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw zzjs.zze();
            }
            while (i3 < 10) {
                if (zzv() < 0) {
                    i3++;
                }
            }
            throw zzjs.zze();
            return true;
        } else if (i2 == 1) {
            zzf(8);
            return true;
        } else if (i2 == 2) {
            zzf(zzx());
            return true;
        } else if (i2 != 3) {
            if (i2 != 4) {
                if (i2 == 5) {
                    zzf(4);
                    return true;
                }
                throw zzjs.zza();
            }
            return false;
        } else {
            do {
                zzi = zzi();
                if (zzi == 0) {
                    break;
                }
            } while (zzd(zzi));
            zzb(((i >>> 3) << 3) | 4);
            return true;
        }
    }
}
