package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzoj implements Supplier<zzom> {
    private static zzoj zza = new zzoj();
    private final Supplier<zzom> zzb = Suppliers.ofInstance(new zzol());

    public static boolean zza() {
        return ((zzom) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzom) zza.get()).zzb();
    }

    public static boolean zzc() {
        return ((zzom) zza.get()).zzc();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzom get() {
        return this.zzb.get();
    }
}
