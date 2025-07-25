package com.google.android.gms.internal.ads;

import com.ironsource.C20517nb;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzgaa {
    private static final zzgaa zza;

    static {
        Character valueOf = Character.valueOf(C20517nb.f52173T);
        new zzfzx("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", valueOf);
        new zzfzx("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", valueOf);
        new zzfzz("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", valueOf);
        new zzfzz("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", valueOf);
        zza = new zzfzw("base16()", "0123456789ABCDEF");
    }

    public static zzgaa zzi() {
        return zza;
    }

    abstract int zza(byte[] bArr, CharSequence charSequence) throws zzfzy;

    abstract void zzc(Appendable appendable, byte[] bArr, int i, int i2) throws IOException;

    abstract int zzd(int i);

    abstract int zze(int i);

    public abstract zzgaa zzf();

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence zzg(CharSequence charSequence) {
        throw null;
    }

    public final String zzj(byte[] bArr, int i, int i2) {
        zzfun.zzk(0, i2, bArr.length);
        StringBuilder sb2 = new StringBuilder(zze(i2));
        try {
            zzc(sb2, bArr, 0, i2);
            return sb2.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final byte[] zzk(CharSequence charSequence) {
        try {
            CharSequence zzg = zzg(charSequence);
            int zzd = zzd(zzg.length());
            byte[] bArr = new byte[zzd];
            int zza2 = zza(bArr, zzg);
            if (zza2 != zzd) {
                byte[] bArr2 = new byte[zza2];
                System.arraycopy(bArr, 0, bArr2, 0, zza2);
                return bArr2;
            }
            return bArr;
        } catch (zzfzy e) {
            throw new IllegalArgumentException(e);
        }
    }
}
