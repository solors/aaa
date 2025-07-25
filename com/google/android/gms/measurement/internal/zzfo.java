package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes5.dex */
public abstract class zzfo extends com.google.android.gms.internal.measurement.zzbx implements zzfl {
    public zzfo() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.zzbx
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                zza((zzbd) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzbd.CREATOR), (zzo) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                zza((zzno) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzno.CREATOR), (zzo) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            default:
                return false;
            case 4:
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                zzc((zzo) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                zza((zzbd) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzbd.CREATOR), readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                zzg((zzo) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                boolean zzc = com.google.android.gms.internal.measurement.zzbw.zzc(parcel);
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                List<zzno> zza = zza((zzo) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzo.CREATOR), zzc);
                parcel2.writeNoException();
                parcel2.writeTypedList(zza);
                return true;
            case 9:
                String readString3 = parcel.readString();
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                byte[] zza2 = zza((zzbd) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzbd.CREATOR), readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(zza2);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                zza(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                String zzb = zzb((zzo) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(zzb);
                return true;
            case 12:
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                zza((zzae) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzae.CREATOR), (zzo) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                zza((zzae) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzae.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                List<zzno> zza3 = zza(parcel.readString(), parcel.readString(), com.google.android.gms.internal.measurement.zzbw.zzc(parcel), (zzo) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(zza3);
                return true;
            case 15:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                boolean zzc2 = com.google.android.gms.internal.measurement.zzbw.zzc(parcel);
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                List<zzno> zza4 = zza(readString7, readString8, readString9, zzc2);
                parcel2.writeNoException();
                parcel2.writeTypedList(zza4);
                return true;
            case 16:
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                List<zzae> zza5 = zza(parcel.readString(), parcel.readString(), (zzo) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(zza5);
                return true;
            case 17:
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                List<zzae> zza6 = zza(readString10, readString11, readString12);
                parcel2.writeNoException();
                parcel2.writeTypedList(zza6);
                return true;
            case 18:
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                zzd((zzo) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                zza((Bundle) com.google.android.gms.internal.measurement.zzbw.zza(parcel, Bundle.CREATOR), (zzo) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                return true;
            case 20:
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                zze((zzo) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                return true;
            case 21:
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                zzaj zza7 = zza((zzo) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel2, zza7);
                return true;
            case 24:
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                List<zzmu> zza8 = zza((zzo) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzo.CREATOR), (Bundle) com.google.android.gms.internal.measurement.zzbw.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(zza8);
                return true;
            case 25:
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                zzh((zzo) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.internal.measurement.zzbw.zzb(parcel);
                zzf((zzo) com.google.android.gms.internal.measurement.zzbw.zza(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
