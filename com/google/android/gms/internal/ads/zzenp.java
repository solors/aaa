package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzenp implements zzetr {
    private final zzgcs zza;
    private final VersionInfoParcel zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzenp(VersionInfoParcel versionInfoParcel, zzgcs zzgcsVar) {
        this.zzb = versionInfoParcel;
        this.zza = zzgcsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 54;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeno
            {
                zzenp.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzenp.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzenq zzc() throws Exception {
        return zzenq.zzc(this.zzb);
    }
}
