package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzne implements Supplier<zznd> {
    private static zzne zza = new zzne();
    private final Supplier<zznd> zzb = Suppliers.ofInstance(new zzng());

    public static boolean zza() {
        return ((zznd) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zznd) zza.get()).zzb();
    }

    public static boolean zzc() {
        return ((zznd) zza.get()).zzc();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zznd get() {
        return this.zzb.get();
    }
}
