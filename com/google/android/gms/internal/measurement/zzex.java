package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdq;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzex extends zzdq.zza {
    private final /* synthetic */ Long zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ String zze;
    private final /* synthetic */ Bundle zzf;
    private final /* synthetic */ boolean zzg;
    private final /* synthetic */ boolean zzh;
    private final /* synthetic */ zzdq zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzex(zzdq zzdqVar, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(zzdqVar);
        this.zzc = l;
        this.zzd = str;
        this.zze = str2;
        this.zzf = bundle;
        this.zzg = z;
        this.zzh = z2;
        this.zzi = zzdqVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdq.zza
    final void zza() throws RemoteException {
        long longValue;
        zzdb zzdbVar;
        Long l = this.zzc;
        if (l == null) {
            longValue = this.zza;
        } else {
            longValue = l.longValue();
        }
        long j = longValue;
        zzdbVar = this.zzi.zzj;
        ((zzdb) Preconditions.checkNotNull(zzdbVar)).logEvent(this.zzd, this.zze, this.zzf, this.zzg, this.zzh, j);
    }
}
