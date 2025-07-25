package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzayc;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes4.dex */
public abstract class zzea extends zzayb implements zzeb {
    public zzea() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static zzeb zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        if (queryLocalInterface instanceof zzeb) {
            return (zzeb) queryLocalInterface;
        }
        return new zzdz(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzee zzecVar;
        switch (i) {
            case 1:
                zzl();
                parcel2.writeNoException();
                return true;
            case 2:
                zzk();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzg = zzayc.zzg(parcel);
                zzayc.zzc(parcel);
                zzj(zzg);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zzq = zzq();
                parcel2.writeNoException();
                int i3 = zzayc.zza;
                parcel2.writeInt(zzq ? 1 : 0);
                return true;
            case 5:
                int zzh = zzh();
                parcel2.writeNoException();
                parcel2.writeInt(zzh);
                return true;
            case 6:
                float zzg2 = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(zzg2);
                return true;
            case 7:
                float zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(zzf);
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzecVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    if (queryLocalInterface instanceof zzee) {
                        zzecVar = (zzee) queryLocalInterface;
                    } else {
                        zzecVar = new zzec(readStrongBinder);
                    }
                }
                zzayc.zzc(parcel);
                zzm(zzecVar);
                parcel2.writeNoException();
                return true;
            case 9:
                float zze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(zze);
                return true;
            case 10:
                boolean zzp = zzp();
                parcel2.writeNoException();
                int i4 = zzayc.zza;
                parcel2.writeInt(zzp ? 1 : 0);
                return true;
            case 11:
                zzee zzi = zzi();
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzi);
                return true;
            case 12:
                boolean zzo = zzo();
                parcel2.writeNoException();
                int i5 = zzayc.zza;
                parcel2.writeInt(zzo ? 1 : 0);
                return true;
            case 13:
                zzn();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
