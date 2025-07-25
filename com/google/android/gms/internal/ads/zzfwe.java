package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
final class zzfwe extends zzfwc implements ListIterator {
    final /* synthetic */ zzfwf zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfwe(zzfwf zzfwfVar) {
        super(zzfwfVar);
        this.zzd = zzfwfVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        boolean isEmpty = this.zzd.isEmpty();
        zza();
        ((ListIterator) this.zza).add(obj);
        zzfwg zzfwgVar = this.zzd.zzf;
        i = zzfwgVar.zzb;
        zzfwgVar.zzb = i + 1;
        if (isEmpty) {
            this.zzd.zza();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        zza();
        return ((ListIterator) this.zza).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        zza();
        return ((ListIterator) this.zza).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        zza();
        return ((ListIterator) this.zza).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        zza();
        return ((ListIterator) this.zza).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        zza();
        ((ListIterator) this.zza).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfwe(zzfwf zzfwfVar, int i) {
        super(zzfwfVar, ((List) zzfwfVar.zzb).listIterator(i));
        this.zzd = zzfwfVar;
    }
}
