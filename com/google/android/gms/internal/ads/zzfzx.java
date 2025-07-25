package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzfzx extends zzfzz {
    private zzfzx(zzfzv zzfzvVar, Character ch) {
        super(zzfzvVar, ch);
        char[] cArr;
        cArr = zzfzvVar.zzf;
        zzfun.zze(cArr.length == 64);
    }

    @Override // com.google.android.gms.internal.ads.zzfzz, com.google.android.gms.internal.ads.zzgaa
    final int zza(byte[] bArr, CharSequence charSequence) throws zzfzy {
        CharSequence zzg = zzg(charSequence);
        if (this.zzb.zzd(zzg.length())) {
            int i = 0;
            int i2 = 0;
            while (i < zzg.length()) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                int zzb = (this.zzb.zzb(zzg.charAt(i)) << 18) | (this.zzb.zzb(zzg.charAt(i3)) << 12);
                bArr[i2] = (byte) (zzb >>> 16);
                int i5 = i3 + 1;
                if (i5 < zzg.length()) {
                    int i6 = i5 + 1;
                    int zzb2 = zzb | (this.zzb.zzb(zzg.charAt(i5)) << 6);
                    i2 = i4 + 1;
                    bArr[i4] = (byte) ((zzb2 >>> 8) & 255);
                    if (i6 < zzg.length()) {
                        bArr[i2] = (byte) ((zzb2 | this.zzb.zzb(zzg.charAt(i6))) & 255);
                        i2++;
                        i = i6 + 1;
                    } else {
                        i = i6;
                    }
                } else {
                    i = i5;
                    i2 = i4;
                }
            }
            return i2;
        }
        throw new zzfzy("Invalid input length " + zzg.length());
    }

    @Override // com.google.android.gms.internal.ads.zzfzz
    final zzgaa zzb(zzfzv zzfzvVar, Character ch) {
        return new zzfzx(zzfzvVar, ch);
    }

    @Override // com.google.android.gms.internal.ads.zzfzz, com.google.android.gms.internal.ads.zzgaa
    final void zzc(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        zzfun.zzk(0, i2, bArr.length);
        for (int i4 = i2; i4 >= 3; i4 -= 3) {
            int i5 = i3 + 1;
            int i6 = i5 + 1;
            int i7 = ((bArr[i3] & 255) << 16) | ((bArr[i5] & 255) << 8) | (bArr[i6] & 255);
            appendable.append(this.zzb.zza(i7 >>> 18));
            appendable.append(this.zzb.zza((i7 >>> 12) & 63));
            appendable.append(this.zzb.zza((i7 >>> 6) & 63));
            appendable.append(this.zzb.zza(i7 & 63));
            i3 = i6 + 1;
        }
        if (i3 < i2) {
            zzh(appendable, bArr, i3, i2 - i3);
        }
    }

    public zzfzx(String str, String str2, Character ch) {
        this(new zzfzv(str, str2.toCharArray()), ch);
    }
}
