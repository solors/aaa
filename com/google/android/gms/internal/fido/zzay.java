package com.google.android.gms.internal.fido;

import com.ironsource.C21114v8;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes5.dex */
final class zzay extends zzau {
    final transient Object zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzay(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.fido.zzau, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.fido.zzau, com.google.android.gms.internal.fido.zzaq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzav(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.zza.toString();
        return C21114v8.C21123i.f54137d + obj + C21114v8.C21123i.f54139e;
    }

    @Override // com.google.android.gms.internal.fido.zzaq
    final int zza(Object[] objArr, int i) {
        objArr[0] = this.zza;
        return 1;
    }

    @Override // com.google.android.gms.internal.fido.zzau, com.google.android.gms.internal.fido.zzaq
    public final zzaz zzd() {
        return new zzav(this.zza);
    }
}
