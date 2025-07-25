package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbbe implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzcab zza;
    final /* synthetic */ zzbbf zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbe(zzbbf zzbbfVar, zzcab zzcabVar) {
        this.zza = zzcabVar;
        this.zzb = zzbbfVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        Object obj;
        obj = this.zzb.zzd;
        synchronized (obj) {
            this.zza.zzd(new RuntimeException("Connection failed."));
        }
    }
}
