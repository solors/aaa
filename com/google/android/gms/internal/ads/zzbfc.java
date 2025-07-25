package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbfc {
    private static final AtomicReference zza = new AtomicReference();
    private static final AtomicReference zzb = new AtomicReference();

    static {
        new AtomicBoolean();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbfa zza() {
        return (zzbfa) zza.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbfb zzb() {
        return (zzbfb) zzb.get();
    }

    public static void zzc(zzbfa zzbfaVar) {
        zza.set(zzbfaVar);
    }
}
