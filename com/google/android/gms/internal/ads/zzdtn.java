package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdtn implements zzdsx {
    private final long zza;
    private final zzdtc zzb;
    private final zzfbf zzc;

    public zzdtn(long j, Context context, zzdtc zzdtcVar, zzcgx zzcgxVar, String str) {
        this.zza = j;
        this.zzb = zzdtcVar;
        zzfbh zzw = zzcgxVar.zzw();
        zzw.zzb(context);
        zzw.zza(str);
        this.zzc = zzw.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzdsx
    public final void zzb(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        try {
            this.zzc.zzf(zzmVar, new zzdtl(this));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdsx
    public final void zzc() {
        try {
            this.zzc.zzk(new zzdtm(this));
            this.zzc.zzm(ObjectWrapper.wrap(null));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdsx
    public final void zza() {
    }
}
