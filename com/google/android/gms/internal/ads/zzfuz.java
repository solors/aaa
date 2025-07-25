package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfuz implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzfvc zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfuz(zzfvc zzfvcVar, CharSequence charSequence) {
        this.zza = charSequence;
        this.zzb = zzfvcVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator zzg;
        zzg = this.zzb.zzg(this.zza);
        return zzg;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        zzfuf.zzb(sb2, this, ", ");
        sb2.append(']');
        return sb2.toString();
    }
}
