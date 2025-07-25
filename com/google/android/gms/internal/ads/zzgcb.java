package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public class zzgcb extends zzgcc {
    private final ListenableFuture zza;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzgcb(ListenableFuture listenableFuture) {
        this.zza = listenableFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzgca, com.google.android.gms.internal.ads.zzfxe
    protected final /* synthetic */ Object zza() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgcc, com.google.android.gms.internal.ads.zzgca
    public final /* synthetic */ Future zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgcc
    protected final ListenableFuture zzc() {
        return this.zza;
    }
}
