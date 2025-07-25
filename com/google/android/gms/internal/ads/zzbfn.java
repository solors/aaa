package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbfn extends zzaya implements zzbfp {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbfn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.zzbfp
    public final String zzg() throws RemoteException {
        Parcel zzcZ = zzcZ(2, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbfp
    public final List zzh() throws RemoteException {
        Parcel zzcZ = zzcZ(3, zza());
        ArrayList zzb = zzayc.zzb(zzcZ);
        zzcZ.recycle();
        return zzb;
    }
}
