package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
class zzfwc implements Iterator {
    final Iterator zza;
    final Collection zzb;
    final /* synthetic */ zzfwd zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfwc(zzfwd zzfwdVar, Iterator it) {
        this.zzc = zzfwdVar;
        this.zzb = zzfwdVar.zzb;
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        zza();
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        this.zza.remove();
        zzfwg zzfwgVar = this.zzc.zze;
        i = zzfwgVar.zzb;
        zzfwgVar.zzb = i - 1;
        this.zzc.zzc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza() {
        this.zzc.zzb();
        if (this.zzc.zzb == this.zzb) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfwc(zzfwd zzfwdVar) {
        Iterator it;
        this.zzc = zzfwdVar;
        Collection collection = zzfwdVar.zzb;
        this.zzb = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.zza = it;
    }
}
