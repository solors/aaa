package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzetk implements zzetr {
    private final boolean zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzetk(@Nullable zzezj zzezjVar) {
        boolean z;
        if (zzezjVar != null) {
            z = true;
        } else {
            z = false;
        }
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 36;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final ListenableFuture zzb() {
        return zzgch.zzh(new zzeti(this.zza, null));
    }
}
