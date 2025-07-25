package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzpn implements Supplier<zzpq> {
    private static zzpn zza = new zzpn();
    private final Supplier<zzpq> zzb = Suppliers.ofInstance(new zzpp());

    public static boolean zza() {
        return ((zzpq) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzpq) zza.get()).zzb();
    }

    public static boolean zzc() {
        return ((zzpq) zza.get()).zzc();
    }

    public static boolean zzd() {
        return ((zzpq) zza.get()).zzd();
    }

    public static boolean zze() {
        return ((zzpq) zza.get()).zze();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzpq get() {
        return this.zzb.get();
    }
}
