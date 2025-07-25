package com.google.android.gms.internal.ads;

import com.ironsource.C20517nb;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public class zzfzz extends zzgaa {
    private volatile zzgaa zza;
    final zzfzv zzb;
    final Character zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfzz(zzfzv zzfzvVar, Character ch) {
        this.zzb = zzfzvVar;
        boolean z = true;
        if (ch != null) {
            ch.charValue();
            if (zzfzvVar.zze(C20517nb.f52173T)) {
                z = false;
            }
        }
        zzfun.zzi(z, "Padding character %s was already in alphabet", ch);
        this.zzc = ch;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfzz) {
            zzfzz zzfzzVar = (zzfzz) obj;
            if (this.zzb.equals(zzfzzVar.zzb) && Objects.equals(this.zzc, zzfzzVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch = this.zzc;
        return Objects.hashCode(ch) ^ this.zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        sb2.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(this.zzc);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgaa
    int zza(byte[] bArr, CharSequence charSequence) throws zzfzy {
        zzfzv zzfzvVar;
        CharSequence zzg = zzg(charSequence);
        if (this.zzb.zzd(zzg.length())) {
            int i = 0;
            int i2 = 0;
            while (i < zzg.length()) {
                long j = 0;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    zzfzvVar = this.zzb;
                    if (i3 >= zzfzvVar.zzc) {
                        break;
                    }
                    j <<= zzfzvVar.zzb;
                    if (i + i3 < zzg.length()) {
                        j |= this.zzb.zzb(zzg.charAt(i4 + i));
                        i4++;
                    }
                    i3++;
                }
                int i5 = zzfzvVar.zzd;
                int i6 = i4 * zzfzvVar.zzb;
                int i7 = (i5 - 1) * 8;
                while (i7 >= (i5 * 8) - i6) {
                    bArr[i2] = (byte) ((j >>> i7) & 255);
                    i7 -= 8;
                    i2++;
                }
                i += this.zzb.zzc;
            }
            return i2;
        }
        throw new zzfzy("Invalid input length " + zzg.length());
    }

    zzgaa zzb(zzfzv zzfzvVar, Character ch) {
        return new zzfzz(zzfzvVar, ch);
    }

    @Override // com.google.android.gms.internal.ads.zzgaa
    void zzc(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        zzfun.zzk(0, i2, bArr.length);
        while (i3 < i2) {
            zzh(appendable, bArr, i3, Math.min(this.zzb.zzd, i2 - i3));
            i3 += this.zzb.zzd;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgaa
    final int zzd(int i) {
        return (int) (((this.zzb.zzb * i) + 7) / 8);
    }

    @Override // com.google.android.gms.internal.ads.zzgaa
    final int zze(int i) {
        zzfzv zzfzvVar = this.zzb;
        return zzfzvVar.zzc * zzgaj.zzb(i, zzfzvVar.zzd, RoundingMode.CEILING);
    }

    @Override // com.google.android.gms.internal.ads.zzgaa
    public final zzgaa zzf() {
        zzgaa zzgaaVar = this.zza;
        if (zzgaaVar == null) {
            zzfzv zzfzvVar = this.zzb;
            zzfzv zzc = zzfzvVar.zzc();
            if (zzc == zzfzvVar) {
                zzgaaVar = this;
            } else {
                zzgaaVar = zzb(zzc, this.zzc);
            }
            this.zza = zzgaaVar;
        }
        return zzgaaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgaa
    final CharSequence zzg(CharSequence charSequence) {
        charSequence.getClass();
        Character ch = this.zzc;
        if (ch == null) {
            return charSequence;
        }
        ch.charValue();
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzh(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        boolean z;
        zzfun.zzk(i, i + i2, bArr.length);
        int i3 = 0;
        if (i2 <= this.zzb.zzd) {
            z = true;
        } else {
            z = false;
        }
        zzfun.zze(z);
        long j = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            j = (j | (bArr[i + i4] & 255)) << 8;
        }
        int i5 = (i2 + 1) * 8;
        zzfzv zzfzvVar = this.zzb;
        while (i3 < i2 * 8) {
            long j2 = j >>> ((i5 - zzfzvVar.zzb) - i3);
            zzfzv zzfzvVar2 = this.zzb;
            appendable.append(zzfzvVar2.zza(((int) j2) & zzfzvVar2.zza));
            i3 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i3 < this.zzb.zzd * 8) {
                this.zzc.charValue();
                appendable.append(C20517nb.f52173T);
                i3 += this.zzb.zzb;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfzz(String str, String str2, Character ch) {
        this(new zzfzv(str, str2.toCharArray()), ch);
    }
}
