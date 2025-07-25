package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzov implements Supplier<zzoy> {
    private static zzov zza = new zzov();
    private final Supplier<zzoy> zzb = Suppliers.ofInstance(new zzox());

    public static boolean zza() {
        return ((zzoy) zza.get()).zza();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzoy get() {
        return this.zzb.get();
    }
}
