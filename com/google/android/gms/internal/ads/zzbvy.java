package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzbvy extends zzayb implements zzbvz {
    public zzbvy() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                zzbwc zzbwcVar = null;
                zzbvx zzbvxVar = null;
                if (i != 3) {
                    if (i != 34) {
                        switch (i) {
                            case 5:
                                boolean zzs = zzs();
                                parcel2.writeNoException();
                                int i3 = zzayc.zza;
                                parcel2.writeInt(zzs ? 1 : 0);
                                break;
                            case 6:
                                zzh();
                                parcel2.writeNoException();
                                break;
                            case 7:
                                zzj();
                                parcel2.writeNoException();
                                break;
                            case 8:
                                zze();
                                parcel2.writeNoException();
                                break;
                            case 9:
                                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                zzayc.zzc(parcel);
                                zzi(asInterface);
                                parcel2.writeNoException();
                                break;
                            case 10:
                                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                zzayc.zzc(parcel);
                                zzk(asInterface2);
                                parcel2.writeNoException();
                                break;
                            case 11:
                                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                zzayc.zzc(parcel);
                                zzf(asInterface3);
                                parcel2.writeNoException();
                                break;
                            case 12:
                                String zzd = zzd();
                                parcel2.writeNoException();
                                parcel2.writeString(zzd);
                                break;
                            case 13:
                                String readString = parcel.readString();
                                zzayc.zzc(parcel);
                                zzp(readString);
                                parcel2.writeNoException();
                                break;
                            case 14:
                                com.google.android.gms.ads.internal.client.zzcc zzb = com.google.android.gms.ads.internal.client.zzcb.zzb(parcel.readStrongBinder());
                                zzayc.zzc(parcel);
                                zzl(zzb);
                                parcel2.writeNoException();
                                break;
                            case 15:
                                Bundle zzb2 = zzb();
                                parcel2.writeNoException();
                                zzayc.zze(parcel2, zzb2);
                                break;
                            case 16:
                                IBinder readStrongBinder = parcel.readStrongBinder();
                                if (readStrongBinder != null) {
                                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                                    if (queryLocalInterface instanceof zzbvx) {
                                        zzbvxVar = (zzbvx) queryLocalInterface;
                                    } else {
                                        zzbvxVar = new zzbvx(readStrongBinder);
                                    }
                                }
                                zzayc.zzc(parcel);
                                zzu(zzbvxVar);
                                parcel2.writeNoException();
                                break;
                            case 17:
                                parcel.readString();
                                zzayc.zzc(parcel);
                                parcel2.writeNoException();
                                break;
                            case 18:
                                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                zzayc.zzc(parcel);
                                zzr(asInterface4);
                                parcel2.writeNoException();
                                break;
                            case 19:
                                String readString2 = parcel.readString();
                                zzayc.zzc(parcel);
                                zzm(readString2);
                                parcel2.writeNoException();
                                break;
                            case 20:
                                boolean zzt = zzt();
                                parcel2.writeNoException();
                                int i4 = zzayc.zza;
                                parcel2.writeInt(zzt ? 1 : 0);
                                break;
                            case 21:
                                com.google.android.gms.ads.internal.client.zzdy zzc = zzc();
                                parcel2.writeNoException();
                                zzayc.zzf(parcel2, zzc);
                                break;
                            default:
                                return false;
                        }
                    } else {
                        boolean zzg = zzayc.zzg(parcel);
                        zzayc.zzc(parcel);
                        zzn(zzg);
                        parcel2.writeNoException();
                    }
                } else {
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                        if (queryLocalInterface2 instanceof zzbwc) {
                            zzbwcVar = (zzbwc) queryLocalInterface2;
                        } else {
                            zzbwcVar = new zzbwa(readStrongBinder2);
                        }
                    }
                    zzayc.zzc(parcel);
                    zzo(zzbwcVar);
                    parcel2.writeNoException();
                }
            } else {
                zzq();
                parcel2.writeNoException();
            }
        } else {
            zzayc.zzc(parcel);
            zzg((zzbwd) zzayc.zza(parcel, zzbwd.CREATOR));
            parcel2.writeNoException();
        }
        return true;
    }
}
