package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzpb implements Supplier<zzpe> {
    private static zzpb zza = new zzpb();
    private final Supplier<zzpe> zzb = Suppliers.ofInstance(new zzpd());

    public static boolean zza() {
        return ((zzpe) zza.get()).zza();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzpe get() {
        return this.zzb.get();
    }
}
