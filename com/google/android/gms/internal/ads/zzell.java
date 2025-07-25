package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzell implements zzetr {
    private final Context zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzell(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final ListenableFuture zzb() {
        boolean z;
        if (ContextCompat.checkSelfPermission(this.zza, "com.google.android.gms.permission.AD_ID") == 0) {
            z = true;
        } else {
            z = false;
        }
        return zzgch.zzh(new zzelm(z));
    }
}
