package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzpm implements Supplier<zzpl> {
    private static zzpm zza = new zzpm();
    private final Supplier<zzpl> zzb = Suppliers.ofInstance(new zzpo());

    public static boolean zza() {
        return ((zzpl) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzpl) zza.get()).zzb();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzpl get() {
        return this.zzb.get();
    }
}
