package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
final class zzfwu extends AbstractCollection {
    final /* synthetic */ zzfww zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfwu(zzfww zzfwwVar) {
        this.zza = zzfwwVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzfww zzfwwVar = this.zza;
        Map zzl = zzfwwVar.zzl();
        if (zzl != null) {
            return zzl.values().iterator();
        }
        return new zzfwp(zzfwwVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size();
    }
}
