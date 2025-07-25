package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzou implements Supplier<zzot> {
    private static zzou zza = new zzou();
    private final Supplier<zzot> zzb = Suppliers.ofInstance(new zzow());

    public static boolean zza() {
        return ((zzot) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzot) zza.get()).zzb();
    }

    public static boolean zzc() {
        return ((zzot) zza.get()).zzc();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzot get() {
        return this.zzb.get();
    }
}
