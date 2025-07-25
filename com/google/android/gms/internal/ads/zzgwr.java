package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
abstract class zzgwr extends zzgww {
    final byte[] zza;
    final int zzb;
    int zzc;
    int zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgwr(int i) {
        super(null);
        if (i >= 0) {
            byte[] bArr = new byte[Math.max(i, 20)];
            this.zza = bArr;
            this.zzb = bArr.length;
            return;
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final int zzb() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(byte b) {
        byte[] bArr = this.zza;
        int i = this.zzc;
        bArr[i] = b;
        this.zzc = i + 1;
        this.zzd++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd(int i) {
        int i2 = this.zzc;
        int i3 = i2 + 1;
        byte[] bArr = this.zza;
        bArr[i2] = (byte) i;
        bArr[i3] = (byte) (i >> 8);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >> 16);
        int i5 = i4 + 1;
        bArr[i5] = (byte) (i >> 24);
        this.zzc = i5 + 1;
        this.zzd += 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zze(long j) {
        int i = this.zzc;
        int i2 = i + 1;
        byte[] bArr = this.zza;
        bArr[i] = (byte) j;
        bArr[i2] = (byte) (j >> 8);
        int i3 = i2 + 1;
        bArr[i3] = (byte) (j >> 16);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (j >> 24);
        int i5 = i4 + 1;
        bArr[i5] = (byte) (j >> 32);
        int i6 = i5 + 1;
        bArr[i6] = (byte) (j >> 40);
        int i7 = i6 + 1;
        bArr[i7] = (byte) (j >> 48);
        int i8 = i7 + 1;
        bArr[i8] = (byte) (j >> 56);
        this.zzc = i8 + 1;
        this.zzd += 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzf(int i) {
        boolean z;
        z = zzgww.zzb;
        if (z) {
            long j = this.zzc;
            while ((i & (-128)) != 0) {
                byte[] bArr = this.zza;
                int i2 = this.zzc;
                this.zzc = i2 + 1;
                zzhao.zzq(bArr, i2, (byte) (i | 128));
                i >>>= 7;
            }
            byte[] bArr2 = this.zza;
            int i3 = this.zzc;
            this.zzc = i3 + 1;
            zzhao.zzq(bArr2, i3, (byte) i);
            this.zzd += (int) (this.zzc - j);
            return;
        }
        while ((i & (-128)) != 0) {
            byte[] bArr3 = this.zza;
            int i4 = this.zzc;
            this.zzc = i4 + 1;
            bArr3[i4] = (byte) (i | 128);
            this.zzd++;
            i >>>= 7;
        }
        byte[] bArr4 = this.zza;
        int i5 = this.zzc;
        this.zzc = i5 + 1;
        bArr4[i5] = (byte) i;
        this.zzd++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzg(long j) {
        boolean z;
        z = zzgww.zzb;
        if (z) {
            long j2 = this.zzc;
            while (true) {
                int i = (int) j;
                if ((j & (-128)) == 0) {
                    byte[] bArr = this.zza;
                    int i2 = this.zzc;
                    this.zzc = i2 + 1;
                    zzhao.zzq(bArr, i2, (byte) i);
                    this.zzd += (int) (this.zzc - j2);
                    return;
                }
                byte[] bArr2 = this.zza;
                int i3 = this.zzc;
                this.zzc = i3 + 1;
                zzhao.zzq(bArr2, i3, (byte) (i | 128));
                j >>>= 7;
            }
        } else {
            while (true) {
                int i4 = (int) j;
                if ((j & (-128)) == 0) {
                    byte[] bArr3 = this.zza;
                    int i5 = this.zzc;
                    this.zzc = i5 + 1;
                    bArr3[i5] = (byte) i4;
                    this.zzd++;
                    return;
                }
                byte[] bArr4 = this.zza;
                int i6 = this.zzc;
                this.zzc = i6 + 1;
                bArr4[i6] = (byte) (i4 | 128);
                this.zzd++;
                j >>>= 7;
            }
        }
    }
}
