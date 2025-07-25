package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* compiled from: com.android.billingclient:billing@@6.1.0 */
/* loaded from: classes5.dex */
final class zzdn extends zzdp {
    final /* synthetic */ zzdw zza;
    private int zzb = 0;
    private final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdn(zzdw zzdwVar) {
        this.zza = zzdwVar;
        this.zzc = zzdwVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zzb < this.zzc) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdr
    public final byte zza() {
        int i = this.zzb;
        if (i < this.zzc) {
            this.zzb = i + 1;
            return this.zza.zzb(i);
        }
        throw new NoSuchElementException();
    }
}
