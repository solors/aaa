package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdy {
    private static final char[] zza = {'\r', '\n'};
    private static final char[] zzb = {'\n'};
    private static final zzfxs zzc = zzfxs.zzr(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    private byte[] zzd;
    private int zze;
    private int zzf;

    public zzdy(byte[] bArr, int i) {
        this.zzd = bArr;
        this.zzf = i;
    }

    private final char zzO(Charset charset, char[] cArr) {
        int zzP = zzP(charset);
        if (zzP != 0) {
            int i = zzP >> 16;
            for (char c : cArr) {
                char c2 = (char) i;
                if (c == c2) {
                    this.zze += (char) zzP;
                    return c2;
                }
            }
        }
        return (char) 0;
    }

    private final int zzP(Charset charset) {
        int i;
        byte zza2;
        char zzb2;
        int i2 = 1;
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
            if (this.zzf - this.zze > 0) {
                zza2 = (byte) zzgan.zza(this.zzd[i] & 255);
                return (zzgan.zza(zza2) << 16) + i2;
            }
        }
        if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
            int i3 = this.zzf;
            int i4 = this.zze;
            if (i3 - i4 >= 2) {
                byte[] bArr = this.zzd;
                zzb2 = zzgan.zzb(bArr[i4], bArr[i4 + 1]);
                zza2 = (byte) zzb2;
                i2 = 2;
                return (zzgan.zza(zza2) << 16) + i2;
            }
        }
        if (charset.equals(StandardCharsets.UTF_16LE)) {
            int i5 = this.zzf;
            int i6 = this.zze;
            if (i5 - i6 >= 2) {
                byte[] bArr2 = this.zzd;
                zzb2 = zzgan.zzb(bArr2[i6 + 1], bArr2[i6]);
                zza2 = (byte) zzb2;
                i2 = 2;
                return (zzgan.zza(zza2) << 16) + i2;
            }
            return 0;
        }
        return 0;
    }

    public final String zzA(int i) {
        int i2;
        if (i == 0) {
            return "";
        }
        int i3 = this.zze;
        int i4 = (i3 + i) - 1;
        if (i4 < this.zzf && this.zzd[i4] == 0) {
            i2 = i - 1;
        } else {
            i2 = i;
        }
        String zzC = zzei.zzC(this.zzd, i3, i2);
        this.zze += i;
        return zzC;
    }

    public final String zzB(int i, Charset charset) {
        byte[] bArr = this.zzd;
        int i2 = this.zze;
        String str = new String(bArr, i2, i, charset);
        this.zze = i2 + i;
        return str;
    }

    @Nullable
    public final Charset zzC() {
        int i = this.zzf;
        int i2 = this.zze;
        int i3 = i - i2;
        if (i3 >= 3) {
            byte[] bArr = this.zzd;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.zze = i2 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (i3 >= 2) {
            byte[] bArr2 = this.zzd;
            byte b = bArr2[i2];
            if (b == -2) {
                if (bArr2[i2 + 1] == -1) {
                    this.zze = i2 + 2;
                    return StandardCharsets.UTF_16BE;
                }
                return null;
            } else if (b == -1 && bArr2[i2 + 1] == -2) {
                this.zze = i2 + 2;
                return StandardCharsets.UTF_16LE;
            } else {
                return null;
            }
        }
        return null;
    }

    public final short zzD() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = i + 1;
        this.zze = i2 + 1;
        return (short) (((bArr[i2] & 255) << 8) | (bArr[i] & 255));
    }

    public final short zzE() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = i + 1;
        this.zze = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((bArr[i] & 255) << 8));
    }

    public final void zzF(int i) {
        byte[] bArr = this.zzd;
        if (i > bArr.length) {
            this.zzd = Arrays.copyOf(bArr, i);
        }
    }

    public final void zzG(zzdx zzdxVar, int i) {
        zzH(zzdxVar.zza, 0, i);
        zzdxVar.zzl(0);
    }

    public final void zzH(byte[] bArr, int i, int i2) {
        System.arraycopy(this.zzd, this.zze, bArr, i, i2);
        this.zze += i2;
    }

    public final void zzI(int i) {
        byte[] bArr = this.zzd;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        zzJ(bArr, i);
    }

    public final void zzJ(byte[] bArr, int i) {
        this.zzd = bArr;
        this.zzf = i;
        this.zze = 0;
    }

    public final void zzK(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.zzd.length) {
            z = true;
        }
        zzcw.zzd(z);
        this.zzf = i;
    }

    public final void zzL(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.zzf) {
            z = true;
        }
        zzcw.zzd(z);
        this.zze = i;
    }

    public final void zzM(int i) {
        zzL(this.zze + i);
    }

    public final byte[] zzN() {
        return this.zzd;
    }

    public final char zza(Charset charset) {
        zzcw.zze(zzc.contains(charset), "Unsupported charset: ".concat(String.valueOf(charset)));
        return (char) (zzP(charset) >> 16);
    }

    public final int zzb() {
        return this.zzf - this.zze;
    }

    public final int zzc() {
        return this.zzd.length;
    }

    public final int zzd() {
        return this.zze;
    }

    public final int zze() {
        return this.zzf;
    }

    public final int zzf() {
        return this.zzd[this.zze] & 255;
    }

    public final int zzg() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        this.zze = i4 + 1;
        return (bArr[i4] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
    }

    public final int zzh() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = i + 1;
        int i3 = i2 + 1;
        this.zze = i3 + 1;
        return (bArr[i3] & 255) | (((bArr[i] & 255) << 24) >> 8) | ((bArr[i2] & 255) << 8);
    }

    public final int zzi() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        this.zze = i4 + 1;
        return ((bArr[i4] & 255) << 24) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16);
    }

    public final int zzj() {
        int zzi = zzi();
        if (zzi >= 0) {
            return zzi;
        }
        throw new IllegalStateException("Top bit not zero: " + zzi);
    }

    public final int zzk() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = i + 1;
        this.zze = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (bArr[i] & 255);
    }

    public final int zzl() {
        return (zzm() << 21) | (zzm() << 14) | (zzm() << 7) | zzm();
    }

    public final int zzm() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        this.zze = i + 1;
        return bArr[i] & 255;
    }

    public final int zzn() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = i + 1;
        this.zze = i2 + 1 + 2;
        return (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
    }

    public final int zzo() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = i + 1;
        int i3 = i2 + 1;
        this.zze = i3 + 1;
        return (bArr[i3] & 255) | ((bArr[i] & 255) << 16) | ((bArr[i2] & 255) << 8);
    }

    public final int zzp() {
        int zzg = zzg();
        if (zzg >= 0) {
            return zzg;
        }
        throw new IllegalStateException("Top bit not zero: " + zzg);
    }

    public final int zzq() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = i + 1;
        this.zze = i2 + 1;
        return (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
    }

    public final long zzr() {
        int i;
        byte[] bArr = this.zzd;
        int i2 = this.zze;
        int i3 = i2 + 1;
        long j = bArr[i2];
        int i4 = i3 + 1;
        long j2 = bArr[i3];
        int i5 = i4 + 1;
        long j3 = bArr[i4];
        int i6 = i5 + 1;
        long j4 = bArr[i5];
        int i7 = i6 + 1;
        long j5 = bArr[i6];
        int i8 = i7 + 1;
        long j6 = bArr[i7];
        long j7 = bArr[i8];
        this.zze = i8 + 1 + 1;
        return ((bArr[i] & 255) << 56) | ((j7 & 255) << 48) | (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((j6 & 255) << 40);
    }

    public final long zzs() {
        int i;
        byte[] bArr = this.zzd;
        int i2 = this.zze;
        int i3 = i2 + 1;
        long j = bArr[i2];
        int i4 = i3 + 1;
        long j2 = bArr[i3];
        long j3 = bArr[i4];
        this.zze = i4 + 1 + 1;
        return ((bArr[i] & 255) << 24) | (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16);
    }

    public final long zzt() {
        int i;
        byte[] bArr = this.zzd;
        int i2 = this.zze;
        int i3 = i2 + 1;
        long j = bArr[i2];
        int i4 = i3 + 1;
        long j2 = bArr[i3];
        int i5 = i4 + 1;
        long j3 = bArr[i4];
        int i6 = i5 + 1;
        long j4 = bArr[i5];
        int i7 = i6 + 1;
        long j5 = bArr[i6];
        int i8 = i7 + 1;
        long j6 = bArr[i7];
        long j7 = bArr[i8];
        this.zze = i8 + 1 + 1;
        return (bArr[i] & 255) | ((j & 255) << 56) | ((j2 & 255) << 48) | ((j3 & 255) << 40) | ((j4 & 255) << 32) | ((j5 & 255) << 24) | ((j6 & 255) << 16) | ((j7 & 255) << 8);
    }

    public final long zzu() {
        int i;
        byte[] bArr = this.zzd;
        int i2 = this.zze;
        int i3 = i2 + 1;
        long j = bArr[i2];
        int i4 = i3 + 1;
        long j2 = bArr[i3];
        long j3 = bArr[i4];
        this.zze = i4 + 1 + 1;
        return (bArr[i] & 255) | ((j & 255) << 24) | ((j2 & 255) << 16) | ((j3 & 255) << 8);
    }

    public final long zzv() {
        long j = 0;
        for (int i = 0; i < 9; i++) {
            if (this.zze != this.zzf) {
                long zzm = zzm();
                j |= (127 & zzm) << (i * 7);
                if ((zzm & 128) == 0) {
                    break;
                }
            } else {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
        }
        return j;
    }

    public final long zzw() {
        long zzt = zzt();
        if (zzt >= 0) {
            return zzt;
        }
        throw new IllegalStateException("Top bit not zero: " + zzt);
    }

    public final long zzx() {
        int i;
        int i2;
        byte b;
        int i3;
        long j = this.zzd[this.zze];
        int i4 = 7;
        while (true) {
            i = 0;
            if (i4 < 0) {
                break;
            }
            if (((1 << i4) & j) != 0) {
                i4--;
            } else if (i4 < 6) {
                j &= i3 - 1;
                i = 7 - i4;
            } else if (i4 == 7) {
                i = 1;
            }
        }
        if (i != 0) {
            for (i2 = 1; i2 < i; i2++) {
                if ((this.zzd[this.zze + i2] & 192) == 128) {
                    j = (j << 6) | (b & 63);
                } else {
                    throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
                }
            }
            this.zze += i;
            return j;
        }
        throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
    }

    @Nullable
    public final String zzy(char c) {
        int i = this.zzf;
        int i2 = this.zze;
        if (i - i2 != 0) {
            while (i2 < this.zzf && this.zzd[i2] != 0) {
                i2++;
            }
            byte[] bArr = this.zzd;
            int i3 = this.zze;
            String zzC = zzei.zzC(bArr, i3, i2 - i3);
            this.zze = i2;
            if (i2 < this.zzf) {
                this.zze = i2 + 1;
            }
            return zzC;
        }
        return null;
    }

    @Nullable
    public final String zzz(Charset charset) {
        zzcw.zze(zzc.contains(charset), "Unsupported charset: ".concat(String.valueOf(charset)));
        if (this.zzf - this.zze == 0) {
            return null;
        }
        if (!charset.equals(StandardCharsets.US_ASCII)) {
            zzC();
        }
        int i = 1;
        if (!charset.equals(StandardCharsets.UTF_8) && !charset.equals(StandardCharsets.US_ASCII)) {
            i = 2;
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: ".concat(String.valueOf(charset)));
            }
        }
        int i2 = this.zze;
        while (true) {
            int i3 = this.zzf;
            if (i2 < i3 - (i - 1)) {
                if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && zzei.zzL(this.zzd[i2])) {
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                    byte[] bArr = this.zzd;
                    if (bArr[i2] == 0 && zzei.zzL(bArr[i2 + 1])) {
                        break;
                    }
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    byte[] bArr2 = this.zzd;
                    if (bArr2[i2 + 1] == 0 && zzei.zzL(bArr2[i2])) {
                        break;
                    }
                }
                i2 += i;
            } else {
                i2 = i3;
                break;
            }
        }
        String zzB = zzB(i2 - this.zze, charset);
        if (this.zze != this.zzf && zzO(charset, zza) == '\r') {
            zzO(charset, zzb);
        }
        return zzB;
    }

    public zzdy() {
        this.zzd = zzei.zzf;
    }

    public zzdy(int i) {
        this.zzd = new byte[i];
        this.zzf = i;
    }

    public zzdy(byte[] bArr) {
        this.zzd = bArr;
        this.zzf = bArr.length;
    }
}
