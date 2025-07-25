package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzky implements zzkp {
    public final zzub zza;
    public int zzd;
    public boolean zze;
    public final List zzc = new ArrayList();
    public final Object zzb = new Object();

    public zzky(zzui zzuiVar, boolean z) {
        this.zza = new zzub(zzuiVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final zzbq zza() {
        return this.zza.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final Object zzb() {
        return this.zzb;
    }

    public final void zzc(int i) {
        this.zzd = i;
        this.zze = false;
        this.zzc.clear();
    }
}
