package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
abstract class zzfwr implements Iterator {
    int zzb;
    int zzc;
    int zzd;
    final /* synthetic */ zzfww zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfwr(zzfww zzfwwVar, zzfwv zzfwvVar) {
        int i;
        this.zze = zzfwwVar;
        i = zzfwwVar.zzf;
        this.zzb = i;
        this.zzc = zzfwwVar.zze();
        this.zzd = -1;
    }

    private final void zzb() {
        int i;
        i = this.zze.zzf;
        if (i == this.zzb) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zzc >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzb();
        if (hasNext()) {
            int i = this.zzc;
            this.zzd = i;
            Object zza = zza(i);
            this.zzc = this.zze.zzf(this.zzc);
            return zza;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        zzb();
        if (this.zzd >= 0) {
            z = true;
        } else {
            z = false;
        }
        zzfun.zzm(z, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        int i = this.zzd;
        zzfww zzfwwVar = this.zze;
        zzfwwVar.remove(zzfww.zzg(zzfwwVar, i));
        this.zzc--;
        this.zzd = -1;
    }

    abstract Object zza(int i);
}
