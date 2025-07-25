package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzbb implements Iterator<String> {
    private Iterator<String> zza;
    private final /* synthetic */ zzbc zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbb(zzbc zzbcVar) {
        Bundle bundle;
        this.zzb = zzbcVar;
        bundle = zzbcVar.zza;
        this.zza = bundle.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
