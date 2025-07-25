package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzakg implements zzacq {
    private final zzacq zzb;
    private final zzakd zzc;
    private final SparseArray zzd = new SparseArray();

    public zzakg(zzacq zzacqVar, zzakd zzakdVar) {
        this.zzb = zzacqVar;
        this.zzc = zzakdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacq
    public final void zzD() {
        this.zzb.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzacq
    public final void zzO(zzadm zzadmVar) {
        this.zzb.zzO(zzadmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacq
    public final zzadt zzw(int i, int i2) {
        if (i2 != 3) {
            return this.zzb.zzw(i, i2);
        }
        zzaki zzakiVar = (zzaki) this.zzd.get(i);
        if (zzakiVar != null) {
            return zzakiVar;
        }
        zzaki zzakiVar2 = new zzaki(this.zzb.zzw(i, 3), this.zzc);
        this.zzd.put(i, zzakiVar2);
        return zzakiVar2;
    }
}
