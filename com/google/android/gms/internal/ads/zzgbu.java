package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgbu extends zzgbh {
    private zzgbt zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgbu(zzfxi zzfxiVar, boolean z, Executor executor, Callable callable) {
        super(zzfxiVar, z, false);
        this.zza = new zzgbs(this, callable, executor);
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    protected final void zzq() {
        zzgbt zzgbtVar = this.zza;
        if (zzgbtVar != null) {
            zzgbtVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbh
    final void zzu() {
        zzgbt zzgbtVar = this.zza;
        if (zzgbtVar != null) {
            zzgbtVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbh
    final void zzy(int i) {
        super.zzy(i);
        if (i == 1) {
            this.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbh
    final void zzf(int i, Object obj) {
    }
}
