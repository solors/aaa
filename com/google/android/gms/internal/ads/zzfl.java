package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfl {
    private byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    public zzfl(byte[] bArr, int i, int i2) {
        this.zza = bArr;
        this.zzc = i;
        this.zzb = i2;
        zzj();
    }

    private final int zzi() {
        int i = 0;
        int i2 = 0;
        while (!zzh()) {
            i2++;
        }
        int i3 = 1 << i2;
        if (i2 > 0) {
            i = zza(i2);
        }
        return (i3 - 1) + i;
    }

    private final void zzj() {
        int i;
        int i2 = this.zzc;
        boolean z = false;
        if (i2 >= 0 && (i2 < (i = this.zzb) || (i2 == i && this.zzd == 0))) {
            z = true;
        }
        zzcw.zzf(z);
    }

    private final boolean zzk(int i) {
        if (i >= 2 && i < this.zzb) {
            byte[] bArr = this.zza;
            if (bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int zza(int i) {
        int i2;
        int i3;
        this.zzd += i;
        int i4 = 0;
        while (true) {
            i2 = this.zzd;
            i3 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.zzd = i5;
            byte[] bArr = this.zza;
            int i6 = this.zzc;
            i4 |= (bArr[i6] & 255) << i5;
            if (true != zzk(i6 + 1)) {
                i3 = 1;
            }
            this.zzc = i6 + i3;
        }
        byte[] bArr2 = this.zza;
        int i7 = this.zzc;
        int i8 = i4 | ((bArr2[i7] & 255) >> (8 - i2));
        int i9 = 32 - i;
        if (i2 == 8) {
            this.zzd = 0;
            if (true != zzk(i7 + 1)) {
                i3 = 1;
            }
            this.zzc = i7 + i3;
        }
        int i10 = ((-1) >>> i9) & i8;
        zzj();
        return i10;
    }

    public final int zzb() {
        int zzi = zzi();
        int i = zzi % 2;
        int i2 = 1;
        int i3 = zzi + 1;
        if (i == 0) {
            i2 = -1;
        }
        return i2 * (i3 / 2);
    }

    public final int zzc() {
        return zzi();
    }

    public final void zzd() {
        int i = this.zzd;
        if (i > 0) {
            zzf(8 - i);
        }
    }

    public final void zze() {
        int i = 1;
        int i2 = this.zzd + 1;
        this.zzd = i2;
        if (i2 == 8) {
            this.zzd = 0;
            int i3 = this.zzc;
            if (true == zzk(i3 + 1)) {
                i = 2;
            }
            this.zzc = i3 + i;
        }
        zzj();
    }

    public final void zzf(int i) {
        int i2 = this.zzc;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.zzc = i4;
        int i5 = this.zzd + (i - (i3 * 8));
        this.zzd = i5;
        if (i5 > 7) {
            this.zzc = i4 + 1;
            this.zzd = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 <= this.zzc) {
                if (zzk(i2)) {
                    this.zzc++;
                    i2 += 2;
                }
            } else {
                zzj();
                return;
            }
        }
    }

    public final boolean zzg(int i) {
        int i2 = this.zzc;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.zzd + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.zzb) {
                break;
            } else if (zzk(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.zzb;
        if (i4 < i6) {
            return true;
        }
        if (i4 == i6 && i5 == 0) {
            return true;
        }
        return false;
    }

    public final boolean zzh() {
        int i = this.zza[this.zzc] & (128 >> this.zzd);
        zze();
        if (i != 0) {
            return true;
        }
        return false;
    }
}
