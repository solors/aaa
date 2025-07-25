package com.google.android.gms.internal.ads;

import androidx.core.view.MotionEventCompat;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdx {
    public byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd;

    public zzdx(byte[] bArr, int i) {
        this.zza = bArr;
        this.zzd = i;
    }

    private final void zzq() {
        int i;
        int i2 = this.zzb;
        boolean z = false;
        if (i2 >= 0 && (i2 < (i = this.zzd) || (i2 == i && this.zzc == 0))) {
            z = true;
        }
        zzcw.zzf(z);
    }

    public final int zza() {
        return ((this.zzd - this.zzb) * 8) - this.zzc;
    }

    public final int zzb() {
        boolean z;
        if (this.zzc == 0) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzf(z);
        return this.zzb;
    }

    public final int zzc() {
        return (this.zzb * 8) + this.zzc;
    }

    public final int zzd(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.zzc += i;
        int i3 = 0;
        while (true) {
            i2 = this.zzc;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.zzc = i4;
            byte[] bArr = this.zza;
            int i5 = this.zzb;
            this.zzb = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.zza;
        int i6 = this.zzb;
        int i7 = i3 | ((bArr2[i6] & 255) >> (8 - i2));
        int i8 = 32 - i;
        if (i2 == 8) {
            this.zzc = 0;
            this.zzb = i6 + 1;
        }
        int i9 = ((-1) >>> i8) & i7;
        zzq();
        return i9;
    }

    public final long zze(int i) {
        if (i <= 32) {
            int zzd = zzd(i);
            int i2 = zzei.zza;
            return 4294967295L & zzd;
        }
        int zzd2 = zzd(i - 32);
        int zzd3 = zzd(32);
        int i3 = zzei.zza;
        return (4294967295L & zzd3) | ((zzd2 & 4294967295L) << 32);
    }

    public final void zzf() {
        if (this.zzc == 0) {
            return;
        }
        this.zzc = 0;
        this.zzb++;
        zzq();
    }

    public final void zzg(int i, int i2) {
        int i3;
        int min = Math.min(8 - this.zzc, 14);
        int i4 = this.zzc;
        int i5 = (8 - i4) - min;
        int i6 = MotionEventCompat.ACTION_POINTER_INDEX_MASK >> i4;
        byte[] bArr = this.zza;
        int i7 = this.zzb;
        byte b = (byte) ((i6 | ((1 << i5) - 1)) & bArr[i7]);
        bArr[i7] = b;
        int i8 = 14 - min;
        int i9 = i & 16383;
        bArr[i7] = (byte) (b | ((i9 >>> i8) << i5));
        int i10 = i7 + 1;
        while (i8 > 8) {
            i8 -= 8;
            this.zza[i10] = (byte) (i9 >>> i8);
            i10++;
        }
        byte[] bArr2 = this.zza;
        byte b2 = (byte) (bArr2[i10] & ((1 << i3) - 1));
        bArr2[i10] = b2;
        bArr2[i10] = (byte) (((i9 & ((1 << i8) - 1)) << (8 - i8)) | b2);
        zzn(14);
        zzq();
    }

    public final void zzh(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = 0;
        while (true) {
            i3 = i2 >> 3;
            if (i4 >= i3) {
                break;
            }
            byte[] bArr2 = this.zza;
            int i5 = this.zzb;
            int i6 = i5 + 1;
            this.zzb = i6;
            byte b = bArr2[i5];
            int i7 = this.zzc;
            byte b2 = (byte) (b << i7);
            bArr[i4] = b2;
            bArr[i4] = (byte) (((bArr2[i6] & 255) >> (8 - i7)) | b2);
            i4++;
        }
        int i8 = i2 & 7;
        if (i8 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i3] & (255 >> i8));
        bArr[i3] = b3;
        int i9 = this.zzc;
        if (i9 + i8 > 8) {
            byte[] bArr3 = this.zza;
            int i10 = this.zzb;
            this.zzb = i10 + 1;
            b3 = (byte) (b3 | ((bArr3[i10] & 255) << i9));
            bArr[i3] = b3;
            i9 -= 8;
        }
        int i11 = i9 + i8;
        this.zzc = i11;
        byte[] bArr4 = this.zza;
        int i12 = this.zzb;
        bArr[i3] = (byte) (((byte) (((255 & bArr4[i12]) >> (8 - i11)) << (8 - i8))) | b3);
        if (i11 == 8) {
            this.zzc = 0;
            this.zzb = i12 + 1;
        }
        zzq();
    }

    public final void zzi(byte[] bArr, int i, int i2) {
        boolean z;
        if (this.zzc == 0) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzf(z);
        System.arraycopy(this.zza, this.zzb, bArr, 0, i2);
        this.zzb += i2;
        zzq();
    }

    public final void zzj(zzdy zzdyVar) {
        zzk(zzdyVar.zzN(), zzdyVar.zze());
        zzl(zzdyVar.zzd() * 8);
    }

    public final void zzk(byte[] bArr, int i) {
        this.zza = bArr;
        this.zzb = 0;
        this.zzc = 0;
        this.zzd = i;
    }

    public final void zzl(int i) {
        int i2 = i / 8;
        this.zzb = i2;
        this.zzc = i - (i2 * 8);
        zzq();
    }

    public final void zzm() {
        int i = this.zzc + 1;
        this.zzc = i;
        if (i == 8) {
            this.zzc = 0;
            this.zzb++;
        }
        zzq();
    }

    public final void zzn(int i) {
        int i2 = i / 8;
        int i3 = this.zzb + i2;
        this.zzb = i3;
        int i4 = this.zzc + (i - (i2 * 8));
        this.zzc = i4;
        if (i4 > 7) {
            this.zzb = i3 + 1;
            this.zzc = i4 - 8;
        }
        zzq();
    }

    public final void zzo(int i) {
        boolean z;
        if (this.zzc == 0) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzf(z);
        this.zzb += i;
        zzq();
    }

    public final boolean zzp() {
        int i = this.zza[this.zzb] & (128 >> this.zzc);
        zzm();
        if (i != 0) {
            return true;
        }
        return false;
    }

    public zzdx() {
        this.zza = zzei.zzf;
    }
}
