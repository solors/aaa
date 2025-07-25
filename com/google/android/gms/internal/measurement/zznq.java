package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes5.dex */
public final class zznq implements Supplier<zznp> {
    private static zznq zza = new zznq();
    private final Supplier<zznp> zzb = Suppliers.ofInstance(new zzns());

    public static boolean zza() {
        return ((zznp) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zznp) zza.get()).zzb();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zznp get() {
        return this.zzb.get();
    }
}
