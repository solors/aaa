package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzbux extends zzayb implements zzbuy {
    public zzbux() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbvc zzbvcVar = null;
        zzbvd zzbvdVar = null;
        zzbvc zzbvcVar2 = null;
        zzbvc zzbvcVar3 = null;
        zzbvc zzbvcVar4 = null;
        switch (i) {
            case 1:
                zzbuq zzbuqVar = (zzbuq) zzayc.zza(parcel, zzbuq.CREATOR);
                zzayc.zzc(parcel);
                parcel2.writeNoException();
                zzayc.zze(parcel2, null);
                return true;
            case 2:
                zzbuq zzbuqVar2 = (zzbuq) zzayc.zza(parcel, zzbuq.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (queryLocalInterface instanceof zzbuz) {
                        zzbuz zzbuzVar = (zzbuz) queryLocalInterface;
                    }
                }
                zzayc.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                zzbvk zzbvkVar = (zzbvk) zzayc.zza(parcel, zzbvk.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    if (queryLocalInterface2 instanceof zzbvc) {
                        zzbvcVar = (zzbvc) queryLocalInterface2;
                    } else {
                        zzbvcVar = new zzbva(readStrongBinder2);
                    }
                }
                zzayc.zzc(parcel);
                zzg(zzbvkVar, zzbvcVar);
                parcel2.writeNoException();
                return true;
            case 5:
                zzbvk zzbvkVar2 = (zzbvk) zzayc.zza(parcel, zzbvk.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    if (queryLocalInterface3 instanceof zzbvc) {
                        zzbvcVar4 = (zzbvc) queryLocalInterface3;
                    } else {
                        zzbvcVar4 = new zzbva(readStrongBinder3);
                    }
                }
                zzayc.zzc(parcel);
                zzf(zzbvkVar2, zzbvcVar4);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbvk zzbvkVar3 = (zzbvk) zzayc.zza(parcel, zzbvk.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    if (queryLocalInterface4 instanceof zzbvc) {
                        zzbvcVar3 = (zzbvc) queryLocalInterface4;
                    } else {
                        zzbvcVar3 = new zzbva(readStrongBinder4);
                    }
                }
                zzayc.zzc(parcel);
                zze(zzbvkVar3, zzbvcVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                String readString = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    if (queryLocalInterface5 instanceof zzbvc) {
                        zzbvcVar2 = (zzbvc) queryLocalInterface5;
                    } else {
                        zzbvcVar2 = new zzbva(readStrongBinder5);
                    }
                }
                zzayc.zzc(parcel);
                zzh(readString, zzbvcVar2);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbuu zzbuuVar = (zzbuu) zzayc.zza(parcel, zzbuu.CREATOR);
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    if (queryLocalInterface6 instanceof zzbvd) {
                        zzbvdVar = (zzbvd) queryLocalInterface6;
                    } else {
                        zzbvdVar = new zzbvd(readStrongBinder6);
                    }
                }
                zzayc.zzc(parcel);
                zzi(zzbuuVar, zzbvdVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
