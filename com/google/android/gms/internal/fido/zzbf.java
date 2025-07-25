package com.google.android.gms.internal.fido;

import com.ironsource.C20517nb;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes5.dex */
public abstract class zzbf {
    private static final zzbf zza;
    private static final zzbf zzb;
    private static final zzbf zzc;
    private static final zzbf zzd;
    private static final zzbf zze;

    static {
        Character valueOf = Character.valueOf(C20517nb.f52173T);
        zza = new zzbd("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", valueOf);
        zzb = new zzbd("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", valueOf);
        zzc = new zzbe("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", valueOf);
        zzd = new zzbe("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", valueOf);
        zze = new zzbc("base16()", "0123456789ABCDEF");
    }

    public static zzbf zzd() {
        return zze;
    }

    abstract void zza(Appendable appendable, byte[] bArr, int i, int i2) throws IOException;

    abstract int zzb(int i);

    public final String zze(byte[] bArr, int i, int i2) {
        zzam.zze(0, i2, bArr.length);
        StringBuilder sb2 = new StringBuilder(zzb(i2));
        try {
            zza(sb2, bArr, 0, i2);
            return sb2.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
