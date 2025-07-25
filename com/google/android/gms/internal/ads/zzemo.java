package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzemo implements zzetq {
    private final Bundle zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public zzemo(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcuv zzcuvVar = (zzcuv) obj;
        if (!this.zza.isEmpty()) {
            zzcuvVar.zza.putBundle("installed_adapter_data", this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(Object obj) {
    }
}
