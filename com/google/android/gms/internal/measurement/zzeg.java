package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdq;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzeg extends zzdq.zza {
    private final /* synthetic */ zzdc zzc;
    private final /* synthetic */ zzdq zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeg(zzdq zzdqVar, zzdc zzdcVar) {
        super(zzdqVar);
        this.zzc = zzdcVar;
        this.zzd = zzdqVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdq.zza
    final void zza() throws RemoteException {
        zzdb zzdbVar;
        zzdbVar = this.zzd.zzj;
        ((zzdb) Preconditions.checkNotNull(zzdbVar)).getGmpAppId(this.zzc);
    }

    @Override // com.google.android.gms.internal.measurement.zzdq.zza
    protected final void zzb() {
        this.zzc.zza((Bundle) null);
    }
}
