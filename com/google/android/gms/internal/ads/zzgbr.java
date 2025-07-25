package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
abstract class zzgbr extends zzgbh {
    private List zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgbr(zzfxi zzfxiVar, boolean z) {
        super(zzfxiVar, z, true);
        List zza;
        if (zzfxiVar.isEmpty()) {
            zza = Collections.emptyList();
        } else {
            zza = zzfyd.zza(zzfxiVar.size());
        }
        for (int i = 0; i < zzfxiVar.size(); i++) {
            zza.add(null);
        }
        this.zza = zza;
    }

    abstract Object zzG(List list);

    @Override // com.google.android.gms.internal.ads.zzgbh
    final void zzf(int i, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i, new zzgbq(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbh
    final void zzu() {
        List list = this.zza;
        if (list != null) {
            zzc(zzG(list));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgbh
    public final void zzy(int i) {
        super.zzy(i);
        this.zza = null;
    }
}
