package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbzd {
    public final ListenableFuture zza(Context context, int i) {
        zzcab zzcabVar = new zzcab();
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzt(context)) {
            zzbzw.zza.execute(new zzbzc(this, context, zzcabVar));
        }
        return zzcabVar;
    }
}
