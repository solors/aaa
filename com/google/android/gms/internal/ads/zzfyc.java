package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
final class zzfyc extends AbstractSequentialList implements Serializable {
    final List zza;
    final zzfuc zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfyc(List list, zzfuc zzfucVar) {
        list.getClass();
        this.zza = list;
        this.zzb = zzfucVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.zza.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new zzfyb(this, this.zza.listIterator(i));
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        this.zza.subList(i, i2).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
