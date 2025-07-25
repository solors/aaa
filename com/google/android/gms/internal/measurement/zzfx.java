package com.google.android.gms.internal.measurement;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzfx {
    @Nullable
    @GuardedBy("GservicesDelegateSupplier.class")
    private static zzga zza;

    public static synchronized zzga zza() {
        zzga zzgaVar;
        synchronized (zzfx.class) {
            if (zza == null) {
                zza(new zzfz());
            }
            zzgaVar = zza;
        }
        return zzgaVar;
    }

    private static synchronized void zza(zzga zzgaVar) {
        synchronized (zzfx.class) {
            if (zza == null) {
                zza = zzgaVar;
            } else {
                throw new IllegalStateException("init() already called");
            }
        }
    }
}
