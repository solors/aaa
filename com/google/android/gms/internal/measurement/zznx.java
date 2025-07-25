package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes5.dex */
public final class zznx implements Supplier<zzoa> {
    private static zznx zza = new zznx();
    private final Supplier<zzoa> zzb = Suppliers.ofInstance(new zznz());

    public static boolean zza() {
        return ((zzoa) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzoa) zza.get()).zzb();
    }

    public static boolean zzc() {
        return ((zzoa) zza.get()).zzc();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzoa get() {
        return this.zzb.get();
    }
}
