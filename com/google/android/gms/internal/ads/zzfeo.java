package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfeo implements zzgcd {
    final /* synthetic */ zzfer zza;
    final /* synthetic */ zzfes zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfeo(zzfes zzfesVar, zzfer zzferVar) {
        this.zza = zzferVar;
        this.zzb = zzfesVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable th) {
        synchronized (this.zzb) {
            this.zzb.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayDeque arrayDeque;
        int i;
        Void r4 = (Void) obj;
        synchronized (this.zzb) {
            this.zzb.zze = null;
            arrayDeque = this.zzb.zzd;
            arrayDeque.addFirst(this.zza);
            zzfes zzfesVar = this.zzb;
            i = zzfesVar.zzf;
            if (i == 1) {
                zzfesVar.zzh();
            }
        }
    }
}
