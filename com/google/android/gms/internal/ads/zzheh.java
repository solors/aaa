package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzheh implements Iterator {
    int zza = 0;
    final /* synthetic */ zzhei zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzheh(zzhei zzheiVar) {
        this.zzb = zzheiVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zza >= this.zzb.zza.size() && !this.zzb.zzb.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zza < this.zzb.zza.size()) {
            zzhei zzheiVar = this.zzb;
            int i = this.zza;
            this.zza = i + 1;
            return zzheiVar.zza.get(i);
        }
        zzhei zzheiVar2 = this.zzb;
        zzheiVar2.zza.add(zzheiVar2.zzb.next());
        return next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
