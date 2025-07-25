package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfrg {
    private static zzfrg zzb;
    final zzfrc zza;

    private zzfrg(Context context) {
        this.zza = zzfrc.zzb(context);
        zzfrb.zza(context);
    }

    public static final zzfrg zza(Context context) {
        zzfrg zzfrgVar;
        synchronized (zzfrg.class) {
            if (zzb == null) {
                zzb = new zzfrg(context);
            }
            zzfrgVar = zzb;
        }
        return zzfrgVar;
    }

    public final void zzb(@Nullable zzfra zzfraVar) throws IOException {
        synchronized (zzfrg.class) {
            this.zza.zze("vendor_scoped_gpid_v2_id");
            this.zza.zze("vendor_scoped_gpid_v2_creation_time");
        }
    }
}
