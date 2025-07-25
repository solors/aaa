package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@SafeParcelable.Class(creator = "LocationRequestUpdateDataCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public final class zzbc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbc> CREATOR = new zzbd();
    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequestUpdateData.OPERATION_ADD", m72314id = 1)
    final int zza;
    @Nullable
    @SafeParcelable.Field(defaultValueUnchecked = "null", m72314id = 2)
    final zzba zzb;
    @Nullable
    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getLocationListenerBinder", m72314id = 3, type = "android.os.IBinder")
    final com.google.android.gms.location.zzbd zzc;
    @Nullable
    @SafeParcelable.Field(defaultValueUnchecked = "null", m72314id = 4)
    final PendingIntent zzd;
    @Nullable
    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getLocationCallbackBinder", m72314id = 5, type = "android.os.IBinder")
    final com.google.android.gms.location.zzba zze;
    @Nullable
    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getFusedLocationProviderCallbackBinder", m72314id = 6, type = "android.os.IBinder")
    final zzai zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzbc(@SafeParcelable.Param(m72313id = 1) int i, @Nullable @SafeParcelable.Param(m72313id = 2) zzba zzbaVar, @Nullable @SafeParcelable.Param(m72313id = 3) IBinder iBinder, @Nullable @SafeParcelable.Param(m72313id = 4) PendingIntent pendingIntent, @Nullable @SafeParcelable.Param(m72313id = 5) IBinder iBinder2, @Nullable @SafeParcelable.Param(m72313id = 6) IBinder iBinder3) {
        com.google.android.gms.location.zzbd zzb;
        com.google.android.gms.location.zzba zzb2;
        this.zza = i;
        this.zzb = zzbaVar;
        zzai zzaiVar = null;
        if (iBinder == null) {
            zzb = null;
        } else {
            zzb = com.google.android.gms.location.zzbc.zzb(iBinder);
        }
        this.zzc = zzb;
        this.zzd = pendingIntent;
        if (iBinder2 == null) {
            zzb2 = null;
        } else {
            zzb2 = com.google.android.gms.location.zzaz.zzb(iBinder2);
        }
        this.zze = zzb2;
        if (iBinder3 != null) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface instanceof zzai) {
                zzaiVar = (zzai) queryLocalInterface;
            } else {
                zzaiVar = new zzag(iBinder3);
            }
        }
        this.zzf = zzaiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.android.gms.location.zzbd, android.os.IBinder] */
    public static zzbc zza(com.google.android.gms.location.zzbd zzbdVar, @Nullable zzai zzaiVar) {
        if (zzaiVar == null) {
            zzaiVar = null;
        }
        return new zzbc(2, null, zzbdVar, null, null, zzaiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzbc zzb(zzba zzbaVar, PendingIntent pendingIntent, @Nullable zzai zzaiVar) {
        return new zzbc(1, zzbaVar, null, pendingIntent, null, zzaiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.android.gms.location.zzba, android.os.IBinder] */
    public static zzbc zzc(com.google.android.gms.location.zzba zzbaVar, @Nullable zzai zzaiVar) {
        if (zzaiVar == null) {
            zzaiVar = null;
        }
        return new zzbc(2, null, null, null, zzbaVar, zzaiVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        IBinder asBinder2;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        com.google.android.gms.location.zzbd zzbdVar = this.zzc;
        IBinder iBinder = null;
        if (zzbdVar == null) {
            asBinder = null;
        } else {
            asBinder = zzbdVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 3, asBinder, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        com.google.android.gms.location.zzba zzbaVar = this.zze;
        if (zzbaVar == null) {
            asBinder2 = null;
        } else {
            asBinder2 = zzbaVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 5, asBinder2, false);
        zzai zzaiVar = this.zzf;
        if (zzaiVar != null) {
            iBinder = zzaiVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 6, iBinder, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
