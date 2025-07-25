package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfzj extends zzfzn {
    final /* synthetic */ Set zza;
    final /* synthetic */ Set zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzj(Set set, Set set2) {
        super(null);
        this.zza = set;
        this.zzb = set2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (this.zza.contains(obj) && this.zzb.contains(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (this.zza.containsAll(collection) && this.zzb.containsAll(collection)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.zzb, this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = 0;
        for (Object obj : this.zza) {
            if (this.zzb.contains(obj)) {
                i++;
            }
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzfzn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: zza */
    public final zzfzt iterator() {
        return new zzfzi(this, this.zza, this.zzb);
    }
}
