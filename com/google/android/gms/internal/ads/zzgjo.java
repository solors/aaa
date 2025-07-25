package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzgjo extends ThreadLocal {
    protected static final Cipher zza() {
        boolean zzf;
        try {
            Cipher cipher = (Cipher) zzguw.zza.zza("ChaCha20-Poly1305");
            zzf = zzgjp.zzf(cipher);
            if (!zzf) {
                return null;
            }
            return cipher;
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return zza();
    }
}
