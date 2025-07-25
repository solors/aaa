package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzcbm {
    private long zzb;
    private final long zza = TimeUnit.MILLISECONDS.toNanos(((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzQ)).longValue());
    private boolean zzc = true;

    public final void zza(SurfaceTexture surfaceTexture, final zzcax zzcaxVar) {
        if (zzcaxVar != null) {
            long timestamp = surfaceTexture.getTimestamp();
            if (!this.zzc) {
                if (Math.abs(timestamp - this.zzb) < this.zza) {
                    return;
                }
            }
            this.zzc = false;
            this.zzb = timestamp;
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbl
                @Override // java.lang.Runnable
                public final void run() {
                    zzcaxVar.zzk();
                }
            });
        }
    }

    public final void zzb() {
        this.zzc = true;
    }
}
