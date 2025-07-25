package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import androidx.annotation.Nullable;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbbf {
    @Nullable
    private zzbau zza;
    private boolean zzb;
    private final Context zzc;
    private final Object zzd = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbf(Context context) {
        this.zzc = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zze(zzbbf zzbbfVar) {
        synchronized (zzbbfVar.zzd) {
            zzbau zzbauVar = zzbbfVar.zza;
            if (zzbauVar == null) {
                return;
            }
            zzbauVar.disconnect();
            zzbbfVar.zza = null;
            Binder.flushPendingCommands();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Future zzc(zzbav zzbavVar) {
        zzbaz zzbazVar = new zzbaz(this);
        zzbbd zzbbdVar = new zzbbd(this, zzbavVar, zzbazVar);
        zzbbe zzbbeVar = new zzbbe(this, zzbazVar);
        synchronized (this.zzd) {
            zzbau zzbauVar = new zzbau(this.zzc, com.google.android.gms.ads.internal.zzv.zzu().zzb(), zzbbdVar, zzbbeVar);
            this.zza = zzbauVar;
            zzbauVar.checkAvailabilityAndConnect();
        }
        return zzbazVar;
    }
}
