package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzfzw extends zzfzz {
    final char[] zza;

    private zzfzw(zzfzv zzfzvVar) {
        super(zzfzvVar, null);
        char[] cArr;
        this.zza = new char[512];
        cArr = zzfzvVar.zzf;
        zzfun.zze(cArr.length == 16);
        for (int i = 0; i < 256; i++) {
            this.zza[i] = zzfzvVar.zza(i >>> 4);
            this.zza[i | 256] = zzfzvVar.zza(i & 15);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzz, com.google.android.gms.internal.ads.zzgaa
    final int zza(byte[] bArr, CharSequence charSequence) throws zzfzy {
        if (charSequence.length() % 2 != 1) {
            int i = 0;
            int i2 = 0;
            while (i < charSequence.length()) {
                bArr[i2] = (byte) ((this.zzb.zzb(charSequence.charAt(i)) << 4) | this.zzb.zzb(charSequence.charAt(i + 1)));
                i += 2;
                i2++;
            }
            return i2;
        }
        throw new zzfzy("Invalid input length " + charSequence.length());
    }

    @Override // com.google.android.gms.internal.ads.zzfzz
    final zzgaa zzb(zzfzv zzfzvVar, Character ch) {
        return new zzfzw(zzfzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfzz, com.google.android.gms.internal.ads.zzgaa
    final void zzc(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        zzfun.zzk(0, i2, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = bArr[i3] & 255;
            appendable.append(this.zza[i4]);
            appendable.append(this.zza[i4 | 256]);
        }
    }

    public zzfzw(String str, String str2) {
        this(new zzfzv("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
