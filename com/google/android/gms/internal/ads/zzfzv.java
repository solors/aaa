package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfzv {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean[] zzh;
    private final boolean zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzfzv(java.lang.String r10, char[] r11) {
        /*
            r9 = this;
            r0 = 128(0x80, float:1.794E-43)
            byte[] r1 = new byte[r0]
            r2 = -1
            java.util.Arrays.fill(r1, r2)
            r3 = 0
            r4 = r3
        La:
            int r5 = r11.length
            if (r4 >= r5) goto L2b
            char r5 = r11[r4]
            r6 = 1
            if (r5 >= r0) goto L14
            r7 = r6
            goto L15
        L14:
            r7 = r3
        L15:
            java.lang.String r8 = "Non-ASCII character: %s"
            com.google.android.gms.internal.ads.zzfun.zzg(r7, r8, r5)
            r7 = r1[r5]
            if (r7 != r2) goto L1f
            goto L20
        L1f:
            r6 = r3
        L20:
            java.lang.String r7 = "Duplicate character: %s"
            com.google.android.gms.internal.ads.zzfun.zzg(r6, r7, r5)
            byte r6 = (byte) r4
            r1[r5] = r6
            int r4 = r4 + 1
            goto La
        L2b:
            r9.<init>(r10, r11, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfzv.<init>(java.lang.String, char[]):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ char[] zzf(zzfzv zzfzvVar) {
        return zzfzvVar.zzf;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfzv) {
            zzfzv zzfzvVar = (zzfzv) obj;
            if (this.zzi == zzfzvVar.zzi && Arrays.equals(this.zzf, zzfzvVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        boolean z = this.zzi;
        int hashCode = Arrays.hashCode(this.zzf);
        if (true != z) {
            i = 1237;
        } else {
            i = 1231;
        }
        return hashCode + i;
    }

    public final String toString() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final char zza(int i) {
        return this.zzf[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzb(char c) throws zzfzy {
        if (c <= 127) {
            byte b = this.zzg[c];
            if (b == -1) {
                if (c > ' ' && c != 127) {
                    throw new zzfzy("Unrecognized character: " + c);
                }
                throw new zzfzy("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
            }
            return b;
        }
        throw new zzfzy("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    public final zzfzv zzc() {
        boolean z;
        int i = 0;
        while (true) {
            char[] cArr = this.zzf;
            if (i < cArr.length) {
                if (zzftt.zze(cArr[i])) {
                    int i2 = 0;
                    while (true) {
                        if (i2 < cArr.length) {
                            if (zzftt.zzd(cArr[i2])) {
                                z = true;
                                break;
                            }
                            i2++;
                        } else {
                            z = false;
                            break;
                        }
                    }
                    zzfun.zzm(!z, "Cannot call lowerCase() on a mixed-case alphabet");
                    char[] cArr2 = new char[this.zzf.length];
                    int i3 = 0;
                    while (true) {
                        char[] cArr3 = this.zzf;
                        if (i3 >= cArr3.length) {
                            break;
                        }
                        char c = cArr3[i3];
                        if (zzftt.zze(c)) {
                            c ^= 32;
                        }
                        cArr2[i3] = (char) c;
                        i3++;
                    }
                    zzfzv zzfzvVar = new zzfzv(this.zze.concat(".lowerCase()"), cArr2);
                    if (this.zzi && !zzfzvVar.zzi) {
                        byte[] bArr = zzfzvVar.zzg;
                        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                        for (int i4 = 65; i4 <= 90; i4++) {
                            int i5 = i4 | 32;
                            byte[] bArr2 = zzfzvVar.zzg;
                            byte b = bArr2[i4];
                            byte b2 = bArr2[i5];
                            if (b == -1) {
                                copyOf[i4] = b2;
                            } else {
                                char c2 = (char) i4;
                                char c3 = (char) i5;
                                if (b2 == -1) {
                                    copyOf[i5] = b;
                                } else {
                                    throw new IllegalStateException(zzfve.zzb("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c2), Character.valueOf(c3)));
                                }
                            }
                        }
                        return new zzfzv(zzfzvVar.zze.concat(".ignoreCase()"), zzfzvVar.zzf, copyOf, true);
                    }
                    return zzfzvVar;
                }
                i++;
            } else {
                return this;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzd(int i) {
        return this.zzh[i % this.zzc];
    }

    public final boolean zze(char c) {
        byte[] bArr = this.zzg;
        if (bArr.length > 61 && bArr[61] != -1) {
            return true;
        }
        return false;
    }

    private zzfzv(String str, char[] cArr, byte[] bArr, boolean z) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int zzc = zzgaj.zzc(length, RoundingMode.UNNECESSARY);
            this.zzb = zzc;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(zzc);
            int i = 1 << (3 - numberOfTrailingZeros);
            this.zzc = i;
            this.zzd = zzc >> numberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 < this.zzd; i2++) {
                zArr[zzgaj.zzb(i2 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = zArr;
            this.zzi = z;
        } catch (ArithmeticException e) {
            int length2 = cArr.length;
            throw new IllegalArgumentException("Illegal alphabet length " + length2, e);
        }
    }
}
