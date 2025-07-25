package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzetx implements zzetr {
    private final Context zza;
    private final zzgcs zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzetx(Context context, zzgcs zzgcsVar) {
        this.zza = context;
        this.zzb = zzgcsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 59;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final ListenableFuture zzb() {
        if (((Boolean) zzbed.zzb.zze()).booleanValue()) {
            return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzetw
                {
                    zzetx.this = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzetx.this.zzc();
                }
            });
        }
        return zzgch.zzh(new zzety(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzety zzc() throws Exception {
        Context context = this.zza;
        return new zzety(zzbbv.zzb(context), zzbbv.zza(context));
    }
}
