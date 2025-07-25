package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgmf {
    private static final zzgmf zza = new zzgmf();
    private static final zzgmd zzb = new zzgmd(null);
    private final AtomicReference zzc = new AtomicReference();

    public static zzgmf zzb() {
        return zza;
    }

    public final zzglq zza() {
        zzglq zzglqVar = (zzglq) this.zzc.get();
        if (zzglqVar == null) {
            return zzb;
        }
        return zzglqVar;
    }
}
