package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzevu implements zzetr {
    final ScheduledExecutorService zza;

    public zzevu(zzbti zzbtiVar, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.zza = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 49;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final ListenableFuture zzb() {
        return zzgch.zzm(zzgch.zzo(zzgch.zzh(new Bundle()), ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzek)).longValue(), TimeUnit.MILLISECONDS, this.zza), new zzfuc() { // from class: com.google.android.gms.internal.ads.zzevt
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final Object apply(Object obj) {
                return new zzevv((Bundle) obj);
            }
        }, zzbzw.zza);
    }
}
