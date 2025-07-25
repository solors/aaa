package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzfr implements zzfy {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;
    @Nullable
    private zzgd zzd;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzfr(boolean z) {
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final void zzf(zzgy zzgyVar) {
        zzgyVar.getClass();
        if (!this.zzb.contains(zzgyVar)) {
            this.zzb.add(zzgyVar);
            this.zzc++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzg(int i) {
        zzgd zzgdVar = this.zzd;
        int i2 = zzei.zza;
        for (int i3 = 0; i3 < this.zzc; i3++) {
            ((zzgy) this.zzb.get(i3)).zza(this, zzgdVar, this.zza, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzh() {
        zzgd zzgdVar = this.zzd;
        int i = zzei.zza;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            ((zzgy) this.zzb.get(i2)).zzb(this, zzgdVar, this.zza);
        }
        this.zzd = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzi(zzgd zzgdVar) {
        for (int i = 0; i < this.zzc; i++) {
            ((zzgy) this.zzb.get(i)).zzc(this, zzgdVar, this.zza);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzj(zzgd zzgdVar) {
        this.zzd = zzgdVar;
        for (int i = 0; i < this.zzc; i++) {
            ((zzgy) this.zzb.get(i)).zzd(this, zzgdVar, this.zza);
        }
    }
}
