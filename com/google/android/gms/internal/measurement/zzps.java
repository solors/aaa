package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzps implements Supplier<zzpr> {
    private static zzps zza = new zzps();
    private final Supplier<zzpr> zzb = Suppliers.ofInstance(new zzpu());

    public static boolean zza() {
        return ((zzpr) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzpr) zza.get()).zzb();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzpr get() {
        return this.zzb.get();
    }
}
