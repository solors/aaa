package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzeto implements zzetr {
    private final zzgcs zza;
    private final Context zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeto(zzgcs zzgcsVar, Context context) {
        this.zza = zzgcsVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 37;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzetm
            {
                zzeto.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeto.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzetn zzc() throws Exception {
        zzbcc zzbccVar = zzbcl.zzfX;
        return new zzetn(com.google.android.gms.ads.internal.util.zzad.zzb(this.zzb, (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)));
    }
}
