package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzbfs extends zzayb implements zzbft {
    public zzbfs() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbhe zzbheVar;
        switch (i) {
            case 2:
                float zze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(zze);
                return true;
            case 3:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                zzj(asInterface);
                parcel2.writeNoException();
                return true;
            case 4:
                IObjectWrapper zzi = zzi();
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzi);
                return true;
            case 5:
                float zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(zzg);
                return true;
            case 6:
                float zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(zzf);
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzeb zzh = zzh();
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzh);
                return true;
            case 8:
                boolean zzl = zzl();
                parcel2.writeNoException();
                int i3 = zzayc.zza;
                parcel2.writeInt(zzl ? 1 : 0);
                return true;
            case 9:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbheVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    if (queryLocalInterface instanceof zzbhe) {
                        zzbheVar = (zzbhe) queryLocalInterface;
                    } else {
                        zzbheVar = new zzbhe(readStrongBinder);
                    }
                }
                zzayc.zzc(parcel);
                zzm(zzbheVar);
                parcel2.writeNoException();
                return true;
            case 10:
                boolean zzk = zzk();
                parcel2.writeNoException();
                int i4 = zzayc.zza;
                parcel2.writeInt(zzk ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
