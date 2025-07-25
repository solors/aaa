package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes5.dex */
public final class zznf implements Supplier<zzni> {
    private static zznf zza = new zznf();
    private final Supplier<zzni> zzb = Suppliers.ofInstance(new zznh());

    public static long zza() {
        return ((zzni) zza.get()).zza();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzni get() {
        return this.zzb.get();
    }
}
