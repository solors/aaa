package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzlv {
    private final zzx zza;
    private final SparseArray zzb;

    public zzlv(zzx zzxVar, SparseArray sparseArray) {
        this.zza = zzxVar;
        SparseArray sparseArray2 = new SparseArray(zzxVar.zzb());
        for (int i = 0; i < zzxVar.zzb(); i++) {
            int zza = zzxVar.zza(i);
            zzlu zzluVar = (zzlu) sparseArray.get(zza);
            zzluVar.getClass();
            sparseArray2.append(zza, zzluVar);
        }
        this.zzb = sparseArray2;
    }

    public final int zza(int i) {
        return this.zza.zza(i);
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final zzlu zzc(int i) {
        zzlu zzluVar = (zzlu) this.zzb.get(i);
        zzluVar.getClass();
        return zzluVar;
    }

    public final boolean zzd(int i) {
        return this.zza.zzc(i);
    }
}
