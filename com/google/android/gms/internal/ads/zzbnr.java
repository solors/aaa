package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbnr extends zzcai {
    private final com.google.android.gms.ads.internal.util.zzbd zzb;
    private final Object zza = new Object();
    private boolean zzc = false;
    private int zzd = 0;

    public zzbnr(com.google.android.gms.ads.internal.util.zzbd zzbdVar) {
        this.zzb = zzbdVar;
    }

    public final zzbnm zza() {
        boolean z;
        zzbnm zzbnmVar = new zzbnm(this);
        com.google.android.gms.ads.internal.util.zze.zza("createNewReference: Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("createNewReference: Lock acquired");
            zzj(new zzbnn(this, zzbnmVar), new zzbno(this, zzbnmVar));
            if (this.zzd >= 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z);
            this.zzd++;
        }
        com.google.android.gms.ads.internal.util.zze.zza("createNewReference: Lock released");
        return zzbnmVar;
    }

    public final void zzb() {
        boolean z;
        com.google.android.gms.ads.internal.util.zze.zza("markAsDestroyable: Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("markAsDestroyable: Lock acquired");
            if (this.zzd >= 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z);
            com.google.android.gms.ads.internal.util.zze.zza("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.zzc = true;
            zzc();
        }
        com.google.android.gms.ads.internal.util.zze.zza("markAsDestroyable: Lock released");
    }

    protected final void zzc() {
        boolean z;
        com.google.android.gms.ads.internal.util.zze.zza("maybeDestroy: Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("maybeDestroy: Lock acquired");
            if (this.zzd >= 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z);
            if (this.zzc && this.zzd == 0) {
                com.google.android.gms.ads.internal.util.zze.zza("No reference is left (including root). Cleaning up engine.");
                zzj(new zzbnq(this), new zzcae());
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("There are still references to the engine. Not destroying.");
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("maybeDestroy: Lock released");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzd() {
        boolean z;
        com.google.android.gms.ads.internal.util.zze.zza("releaseOneReference: Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("releaseOneReference: Lock acquired");
            if (this.zzd > 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z);
            com.google.android.gms.ads.internal.util.zze.zza("Releasing 1 reference for JS Engine");
            this.zzd--;
            zzc();
        }
        com.google.android.gms.ads.internal.util.zze.zza("releaseOneReference: Lock released");
    }
}
