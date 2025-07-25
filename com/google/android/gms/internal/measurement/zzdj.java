package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzdj extends zzbu implements zzdh {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.zzdh
    public final int zza() throws RemoteException {
        Parcel zza = zza(2, m72288a_());
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.measurement.zzdh
    public final void zza(String str, String str2, Bundle bundle, long j) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        m72288a_.writeString(str);
        m72288a_.writeString(str2);
        zzbw.zza(m72288a_, bundle);
        m72288a_.writeLong(j);
        zzb(1, m72288a_);
    }
}
