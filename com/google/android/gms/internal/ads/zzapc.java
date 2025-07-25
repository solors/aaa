package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzapc implements Runnable {
    private final zzapm zza;
    private final zzaps zzb;
    private final Runnable zzc;

    public zzapc(zzapm zzapmVar, zzaps zzapsVar, Runnable runnable) {
        this.zza = zzapmVar;
        this.zzb = zzapsVar;
        this.zzc = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzw();
        zzaps zzapsVar = this.zzb;
        if (zzapsVar.zzc()) {
            this.zza.zzo(zzapsVar.zza);
        } else {
            this.zza.zzn(zzapsVar.zzc);
        }
        if (this.zzb.zzd) {
            this.zza.zzm("intermediate-response");
        } else {
            this.zza.zzp("done");
        }
        Runnable runnable = this.zzc;
        if (runnable != null) {
            runnable.run();
        }
    }
}
