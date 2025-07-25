package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzfn extends com.google.android.gms.internal.measurement.zzbu implements zzfl {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final zzaj zza(zzo zzoVar) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        com.google.android.gms.internal.measurement.zzbw.zza(m72288a_, zzoVar);
        Parcel zza = zza(21, m72288a_);
        zzaj zzajVar = (zzaj) com.google.android.gms.internal.measurement.zzbw.zza(zza, zzaj.CREATOR);
        zza.recycle();
        return zzajVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final String zzb(zzo zzoVar) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        com.google.android.gms.internal.measurement.zzbw.zza(m72288a_, zzoVar);
        Parcel zza = zza(11, m72288a_);
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void zzc(zzo zzoVar) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        com.google.android.gms.internal.measurement.zzbw.zza(m72288a_, zzoVar);
        zzb(4, m72288a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void zzd(zzo zzoVar) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        com.google.android.gms.internal.measurement.zzbw.zza(m72288a_, zzoVar);
        zzb(18, m72288a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void zze(zzo zzoVar) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        com.google.android.gms.internal.measurement.zzbw.zza(m72288a_, zzoVar);
        zzb(20, m72288a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void zzf(zzo zzoVar) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        com.google.android.gms.internal.measurement.zzbw.zza(m72288a_, zzoVar);
        zzb(26, m72288a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void zzg(zzo zzoVar) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        com.google.android.gms.internal.measurement.zzbw.zza(m72288a_, zzoVar);
        zzb(6, m72288a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void zzh(zzo zzoVar) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        com.google.android.gms.internal.measurement.zzbw.zza(m72288a_, zzoVar);
        zzb(25, m72288a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final List<zzmu> zza(zzo zzoVar, Bundle bundle) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        com.google.android.gms.internal.measurement.zzbw.zza(m72288a_, zzoVar);
        com.google.android.gms.internal.measurement.zzbw.zza(m72288a_, bundle);
        Parcel zza = zza(24, m72288a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(zzmu.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final List<zzno> zza(zzo zzoVar, boolean z) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        com.google.android.gms.internal.measurement.zzbw.zza(m72288a_, zzoVar);
        com.google.android.gms.internal.measurement.zzbw.zza(m72288a_, z);
        Parcel zza = zza(7, m72288a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(zzno.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final List<zzae> zza(String str, String str2, zzo zzoVar) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        m72288a_.writeString(str);
        m72288a_.writeString(str2);
        com.google.android.gms.internal.measurement.zzbw.zza(m72288a_, zzoVar);
        Parcel zza = zza(16, m72288a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(zzae.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final List<zzae> zza(String str, String str2, String str3) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        m72288a_.writeString(str);
        m72288a_.writeString(str2);
        m72288a_.writeString(str3);
        Parcel zza = zza(17, m72288a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(zzae.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final List<zzno> zza(String str, String str2, boolean z, zzo zzoVar) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        m72288a_.writeString(str);
        m72288a_.writeString(str2);
        com.google.android.gms.internal.measurement.zzbw.zza(m72288a_, z);
        com.google.android.gms.internal.measurement.zzbw.zza(m72288a_, zzoVar);
        Parcel zza = zza(14, m72288a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(zzno.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final List<zzno> zza(String str, String str2, String str3, boolean z) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        m72288a_.writeString(str);
        m72288a_.writeString(str2);
        m72288a_.writeString(str3);
        com.google.android.gms.internal.measurement.zzbw.zza(m72288a_, z);
        Parcel zza = zza(15, m72288a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(zzno.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void zza(zzbd zzbdVar, zzo zzoVar) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        com.google.android.gms.internal.measurement.zzbw.zza(m72288a_, zzbdVar);
        com.google.android.gms.internal.measurement.zzbw.zza(m72288a_, zzoVar);
        zzb(1, m72288a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void zza(zzbd zzbdVar, String str, String str2) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        com.google.android.gms.internal.measurement.zzbw.zza(m72288a_, zzbdVar);
        m72288a_.writeString(str);
        m72288a_.writeString(str2);
        zzb(5, m72288a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void zza(zzae zzaeVar, zzo zzoVar) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        com.google.android.gms.internal.measurement.zzbw.zza(m72288a_, zzaeVar);
        com.google.android.gms.internal.measurement.zzbw.zza(m72288a_, zzoVar);
        zzb(12, m72288a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void zza(zzae zzaeVar) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        com.google.android.gms.internal.measurement.zzbw.zza(m72288a_, zzaeVar);
        zzb(13, m72288a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void zza(long j, String str, String str2, String str3) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        m72288a_.writeLong(j);
        m72288a_.writeString(str);
        m72288a_.writeString(str2);
        m72288a_.writeString(str3);
        zzb(10, m72288a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void zza(Bundle bundle, zzo zzoVar) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        com.google.android.gms.internal.measurement.zzbw.zza(m72288a_, bundle);
        com.google.android.gms.internal.measurement.zzbw.zza(m72288a_, zzoVar);
        zzb(19, m72288a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void zza(zzno zznoVar, zzo zzoVar) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        com.google.android.gms.internal.measurement.zzbw.zza(m72288a_, zznoVar);
        com.google.android.gms.internal.measurement.zzbw.zza(m72288a_, zzoVar);
        zzb(2, m72288a_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final byte[] zza(zzbd zzbdVar, String str) throws RemoteException {
        Parcel m72288a_ = m72288a_();
        com.google.android.gms.internal.measurement.zzbw.zza(m72288a_, zzbdVar);
        m72288a_.writeString(str);
        Parcel zza = zza(9, m72288a_);
        byte[] createByteArray = zza.createByteArray();
        zza.recycle();
        return createByteArray;
    }
}
