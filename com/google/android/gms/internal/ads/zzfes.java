package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfes {
    private final zzfdw zza;
    private final zzfeq zzb;
    private final zzfds zzc;
    private zzfey zze;
    private int zzf = 1;
    private final ArrayDeque zzd = new ArrayDeque();

    public zzfes(zzfdw zzfdwVar, zzfds zzfdsVar, zzfeq zzfeqVar) {
        this.zza = zzfdwVar;
        this.zzc = zzfdsVar;
        this.zzb = zzfeqVar;
        zzfdsVar.zzb(new zzfen(this));
    }

    public final synchronized void zzh() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzge)).booleanValue() && !com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzh()) {
            this.zzd.clear();
            return;
        }
        if (zzi()) {
            while (!this.zzd.isEmpty()) {
                zzfer zzferVar = (zzfer) this.zzd.pollFirst();
                if (zzferVar == null || (zzferVar.zza() != null && this.zza.zze(zzferVar.zza()))) {
                    zzfey zzfeyVar = new zzfey(this.zza, this.zzb, zzferVar);
                    this.zze = zzfeyVar;
                    zzfeyVar.zzd(new zzfeo(this, zzferVar));
                    return;
                }
            }
        }
    }

    private final synchronized boolean zzi() {
        if (this.zze == null) {
            return true;
        }
        return false;
    }

    @Nullable
    public final synchronized ListenableFuture zza(zzfer zzferVar) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zza(zzferVar);
    }

    public final synchronized void zze(zzfer zzferVar) {
        this.zzd.add(zzferVar);
    }

    public final /* synthetic */ void zzf() {
        synchronized (this) {
            this.zzf = 1;
            zzh();
        }
    }
}
