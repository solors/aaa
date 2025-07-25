package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzdi extends zzbu implements zzdg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.zzdg
    public final void zza(Bundle bundle) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        zzbw.zza(m72288a_, bundle);
        zzb(1, m72288a_);
    }
}
