package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdq;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzej extends zzdq.zza {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ boolean zze;
    private final /* synthetic */ zzdc zzf;
    private final /* synthetic */ zzdq zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzej(zzdq zzdqVar, String str, String str2, boolean z, zzdc zzdcVar) {
        super(zzdqVar);
        this.zzc = str;
        this.zzd = str2;
        this.zze = z;
        this.zzf = zzdcVar;
        this.zzg = zzdqVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdq.zza
    final void zza() throws RemoteException {
        zzdb zzdbVar;
        zzdbVar = this.zzg.zzj;
        ((zzdb) Preconditions.checkNotNull(zzdbVar)).getUserProperties(this.zzc, this.zzd, this.zze, this.zzf);
    }

    @Override // com.google.android.gms.internal.measurement.zzdq.zza
    protected final void zzb() {
        this.zzf.zza((Bundle) null);
    }
}
