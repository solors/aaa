package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzbzw;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes4.dex */
public abstract class zzb {
    private final Runnable zza = new zza(this);
    private volatile Thread zzb;

    public abstract void zza();

    public ListenableFuture zzb() {
        return zzbzw.zza.zza(this.zza);
    }
}
