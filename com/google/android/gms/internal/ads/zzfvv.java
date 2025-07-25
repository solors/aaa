package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
final class zzfvv implements Iterator {
    Map.Entry zza;
    final /* synthetic */ Iterator zzb;
    final /* synthetic */ zzfvw zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfvv(zzfvw zzfvwVar, Iterator it) {
        this.zzb = it;
        this.zzc = zzfvwVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.zzb.next();
        this.zza = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        int i;
        if (this.zza != null) {
            z = true;
        } else {
            z = false;
        }
        zzfun.zzm(z, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.zza.getValue();
        this.zzb.remove();
        zzfwg zzfwgVar = this.zzc.zza;
        i = zzfwgVar.zzb;
        zzfwgVar.zzb = i - collection.size();
        collection.clear();
        this.zza = null;
    }
}
