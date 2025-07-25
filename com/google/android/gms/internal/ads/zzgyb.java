package com.google.android.gms.internal.ads;

import java.util.AbstractList;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgyb extends AbstractList {
    private final zzgxz zza;
    private final zzgya zzb;

    public zzgyb(zzgxz zzgxzVar, zzgya zzgyaVar) {
        this.zza = zzgxzVar;
        this.zzb = zzgyaVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.zzb.zzb(this.zza.zzd(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
