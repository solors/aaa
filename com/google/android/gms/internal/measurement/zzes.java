package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdq;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzes extends zzdq.zza {
    private final /* synthetic */ zzdc zzc;
    private final /* synthetic */ int zzd;
    private final /* synthetic */ zzdq zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzes(zzdq zzdqVar, zzdc zzdcVar, int i) {
        super(zzdqVar);
        this.zzc = zzdcVar;
        this.zzd = i;
        this.zze = zzdqVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdq.zza
    final void zza() throws RemoteException {
        zzdb zzdbVar;
        zzdbVar = this.zze.zzj;
        ((zzdb) Preconditions.checkNotNull(zzdbVar)).getTestFlag(this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.measurement.zzdq.zza
    protected final void zzb() {
        this.zzc.zza((Bundle) null);
    }
}
