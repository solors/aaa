package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzesh implements zzetr {
    @Nullable
    private final Bundle zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzesh(@Nullable Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 30;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final ListenableFuture zzb() {
        return zzgch.zzh(new zzesi(this.zza));
    }
}
