package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* compiled from: com.android.billingclient:billing@@6.1.0 */
/* loaded from: classes5.dex */
final class zzhh implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzhi zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhh(zzhi zzhiVar) {
        zzfk zzfkVar;
        this.zzb = zzhiVar;
        zzfkVar = zzhiVar.zza;
        this.zza = zzfkVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
