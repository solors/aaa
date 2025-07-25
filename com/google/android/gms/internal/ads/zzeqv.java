package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzeqv implements zzetr {
    private final Context zza;
    private final zzgcs zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeqv(zzgcs zzgcsVar, Context context) {
        this.zzb = zzgcsVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 57;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final ListenableFuture zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzequ
            {
                zzeqv.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeqv.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzeqw zzc() throws Exception {
        com.google.android.gms.ads.internal.zzv.zzq();
        return new zzeqw(com.google.android.gms.ads.internal.util.zzs.zzt(this.zza));
    }
}
