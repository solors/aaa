package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzzs extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzzq zzd;
    private boolean zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzzs(zzzq zzzqVar, SurfaceTexture surfaceTexture, boolean z, zzzr zzzrVar) {
        super(surfaceTexture);
        this.zzd = zzzqVar;
        this.zza = z;
    }

    public static zzzs zza(Context context, boolean z) {
        int i = 0;
        boolean z2 = true;
        if (z && !zzb(context)) {
            z2 = false;
        }
        zzcw.zzf(z2);
        zzzq zzzqVar = new zzzq();
        if (z) {
            i = zzb;
        }
        return zzzqVar.zza(i);
    }

    public static synchronized boolean zzb(Context context) {
        int i;
        int i2;
        synchronized (zzzs.class) {
            if (!zzc) {
                if (zzdf.zzb(context)) {
                    if (zzdf.zzc()) {
                        i2 = 1;
                    } else {
                        i2 = 2;
                    }
                } else {
                    i2 = 0;
                }
                zzb = i2;
                zzc = true;
            }
            i = zzb;
        }
        if (i == 0) {
            return false;
        }
        return true;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.zzd) {
            if (!this.zze) {
                this.zzd.zzb();
                this.zze = true;
            }
        }
    }
}
