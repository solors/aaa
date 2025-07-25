package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzdq;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.0.2 */
/* loaded from: classes5.dex */
final class zzey extends zzdq.zza {
    private final /* synthetic */ Bundle zzc;
    private final /* synthetic */ Activity zzd;
    private final /* synthetic */ zzdq.zzd zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzey(zzdq.zzd zzdVar, Bundle bundle, Activity activity) {
        super(zzdq.this);
        this.zzc = bundle;
        this.zzd = activity;
        this.zze = zzdVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdq.zza
    final void zza() throws RemoteException {
        Bundle bundle;
        zzdb zzdbVar;
        if (this.zzc != null) {
            bundle = new Bundle();
            if (this.zzc.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.zzc.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        zzdbVar = zzdq.this.zzj;
        ((zzdb) Preconditions.checkNotNull(zzdbVar)).onActivityCreated(ObjectWrapper.wrap(this.zzd), bundle, this.zzb);
    }
}
