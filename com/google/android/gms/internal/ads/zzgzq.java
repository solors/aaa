package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
final class zzgzq extends zzgwc {
    final zzgzs zza;
    zzgwe zzb = zzb();
    final /* synthetic */ zzgzu zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgzq(zzgzu zzgzuVar) {
        this.zzc = zzgzuVar;
        this.zza = new zzgzs(zzgzuVar, null);
    }

    private final zzgwe zzb() {
        zzgzs zzgzsVar = this.zza;
        if (zzgzsVar.hasNext()) {
            return zzgzsVar.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zzb != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final byte zza() {
        zzgwe zzgweVar = this.zzb;
        if (zzgweVar != null) {
            byte zza = zzgweVar.zza();
            if (!this.zzb.hasNext()) {
                this.zzb = zzb();
            }
            return zza;
        }
        throw new NoSuchElementException();
    }
}
