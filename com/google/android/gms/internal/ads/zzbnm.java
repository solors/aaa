package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbnm extends zzcai {
    private final Object zza = new Object();
    private final zzbnr zzb;
    private boolean zzc;

    public zzbnm(zzbnr zzbnrVar) {
        this.zzb = zzbnrVar;
    }

    public final void zzb() {
        com.google.android.gms.ads.internal.util.zze.zza("release: Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("release: Lock acquired");
            if (this.zzc) {
                com.google.android.gms.ads.internal.util.zze.zza("release: Lock already released");
                return;
            }
            this.zzc = true;
            zzj(new zzbnj(this), new zzcae());
            zzj(new zzbnk(this), new zzbnl(this));
            com.google.android.gms.ads.internal.util.zze.zza("release: Lock released");
        }
    }
}
