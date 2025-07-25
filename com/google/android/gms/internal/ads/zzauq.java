package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzauq implements zzfpd {
    final /* synthetic */ zzfnd zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzauq(zzaus zzausVar, zzfnd zzfndVar) {
        this.zza = zzfndVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpd
    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
