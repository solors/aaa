package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzdq;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.0.2 */
/* loaded from: classes5.dex */
final class zzez extends zzdq.zza {
    private final /* synthetic */ Activity zzc;
    private final /* synthetic */ zzdq.zzd zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzez(zzdq.zzd zzdVar, Activity activity) {
        super(zzdq.this);
        this.zzc = activity;
        this.zzd = zzdVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdq.zza
    final void zza() throws RemoteException {
        zzdb zzdbVar;
        zzdbVar = zzdq.this.zzj;
        ((zzdb) Preconditions.checkNotNull(zzdbVar)).onActivityResumed(ObjectWrapper.wrap(this.zzc), this.zzb);
    }
}
