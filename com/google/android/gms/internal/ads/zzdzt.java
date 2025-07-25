package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdzt {
    private final zzbve zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdzt(zzbve zzbveVar) {
        this.zza = zzbveVar;
    }

    public final void zza() {
        ListenableFuture zza = this.zza.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhC)).booleanValue()) {
            zzbzz.zzb(zza, "persistFlags");
        } else {
            zzbzz.zza(zza, "persistFlags");
        }
    }
}
