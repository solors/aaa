package com.google.android.gms.internal.ads;

import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.Provider;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgur implements zzguu {
    private final zzgve zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgur(zzgve zzgveVar, zzguv zzguvVar) {
        this.zza = zzgveVar;
    }

    @Override // com.google.android.gms.internal.ads.zzguu
    public final Object zza(String str) throws GeneralSecurityException {
        for (Provider provider : zzguw.zzb(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL")) {
            try {
                return this.zza.zza(str, provider);
            } catch (Exception unused) {
            }
        }
        return this.zza.zza(str, null);
    }
}
