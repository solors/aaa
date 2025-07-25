package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbif;
import com.google.android.gms.internal.ads.zzbih;
import com.google.android.gms.internal.ads.zzbsx;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzcex;
import com.google.android.gms.internal.ads.zzcwg;
import com.google.android.gms.internal.ads.zzdds;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
@SafeParcelable.Class(creator = "AdOverlayInfoCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes4.dex */
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new zzo();
    private static final AtomicLong zzy = new AtomicLong(0);
    private static final ConcurrentHashMap zzz = new ConcurrentHashMap();
    @SafeParcelable.Field(m72314id = 2)
    public final zzc zza;
    @SafeParcelable.Field(getter = "getAdClickListenerAsBinder", m72314id = 3, type = "android.os.IBinder")
    public final com.google.android.gms.ads.internal.client.zza zzb;
    @SafeParcelable.Field(getter = "getAdOverlayListenerAsBinder", m72314id = 4, type = "android.os.IBinder")
    public final zzr zzc;
    @SafeParcelable.Field(getter = "getAdWebViewAsBinder", m72314id = 5, type = "android.os.IBinder")
    public final zzcex zzd;
    @SafeParcelable.Field(getter = "getAppEventGmsgListenerAsBinder", m72314id = 6, type = "android.os.IBinder")
    public final zzbih zze;
    @NonNull
    @SafeParcelable.Field(m72314id = 7)
    public final String zzf;
    @SafeParcelable.Field(m72314id = 8)
    public final boolean zzg;
    @NonNull
    @SafeParcelable.Field(m72314id = 9)
    public final String zzh;
    @SafeParcelable.Field(getter = "getLeaveApplicationListenerAsBinder", m72314id = 10, type = "android.os.IBinder")
    public final zzac zzi;
    @SafeParcelable.Field(m72314id = 11)
    public final int zzj;
    @SafeParcelable.Field(m72314id = 12)
    public final int zzk;
    @NonNull
    @SafeParcelable.Field(m72314id = 13)
    public final String zzl;
    @NonNull
    @SafeParcelable.Field(m72314id = 14)
    public final VersionInfoParcel zzm;
    @NonNull
    @SafeParcelable.Field(m72314id = 16)
    public final String zzn;
    @SafeParcelable.Field(m72314id = 17)
    public final com.google.android.gms.ads.internal.zzl zzo;
    @SafeParcelable.Field(getter = "getAdMetadataGmsgListenerAsBinder", m72314id = 18, type = "android.os.IBinder")
    public final zzbif zzp;
    @NonNull
    @SafeParcelable.Field(m72314id = 19)
    public final String zzq;
    @NonNull
    @SafeParcelable.Field(m72314id = 24)
    public final String zzr;
    @NonNull
    @SafeParcelable.Field(m72314id = 25)
    public final String zzs;
    @SafeParcelable.Field(getter = "getAdFailedToShowEventEmitterAsBinder", m72314id = 26, type = "android.os.IBinder")
    public final zzcwg zzt;
    @SafeParcelable.Field(getter = "getPhysicalClickListenerAsBinder", m72314id = 27, type = "android.os.IBinder")
    public final zzdds zzu;
    @SafeParcelable.Field(getter = "getOfflineUtilsAsBinder", m72314id = 28, type = "android.os.IBinder")
    public final zzbsx zzv;
    @SafeParcelable.Field(m72314id = 29)
    public final boolean zzw;
    @SafeParcelable.Field(m72314id = 30)
    public final long zzx;

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzbif zzbifVar, zzbih zzbihVar, zzac zzacVar, zzcex zzcexVar, boolean z, int i, String str, VersionInfoParcel versionInfoParcel, zzdds zzddsVar, zzbsx zzbsxVar, boolean z2) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzrVar;
        this.zzd = zzcexVar;
        this.zzp = zzbifVar;
        this.zze = zzbihVar;
        this.zzf = null;
        this.zzg = z;
        this.zzh = null;
        this.zzi = zzacVar;
        this.zzj = i;
        this.zzk = 3;
        this.zzl = str;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzddsVar;
        this.zzv = zzbsxVar;
        this.zzw = z2;
        this.zzx = zzy.getAndIncrement();
    }

    @Nullable
    public static AdOverlayInfoParcel zza(@NonNull Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e) {
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzmL)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdOverlayInfoParcel.getFromIntent");
                return null;
            }
            return null;
        }
    }

    @Nullable
    private static final IBinder zzc(Object obj) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzmL)).booleanValue()) {
            return null;
        }
        return ObjectWrapper.wrap(obj).asBinder();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zza, i, false);
        SafeParcelWriter.writeIBinder(parcel, 3, zzc(this.zzb), false);
        SafeParcelWriter.writeIBinder(parcel, 4, zzc(this.zzc), false);
        SafeParcelWriter.writeIBinder(parcel, 5, zzc(this.zzd), false);
        SafeParcelWriter.writeIBinder(parcel, 6, zzc(this.zze), false);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzg);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        SafeParcelWriter.writeIBinder(parcel, 10, zzc(this.zzi), false);
        SafeParcelWriter.writeInt(parcel, 11, this.zzj);
        SafeParcelWriter.writeInt(parcel, 12, this.zzk);
        SafeParcelWriter.writeString(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzm, i, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzn, false);
        SafeParcelWriter.writeParcelable(parcel, 17, this.zzo, i, false);
        SafeParcelWriter.writeIBinder(parcel, 18, zzc(this.zzp), false);
        SafeParcelWriter.writeString(parcel, 19, this.zzq, false);
        SafeParcelWriter.writeString(parcel, 24, this.zzr, false);
        SafeParcelWriter.writeString(parcel, 25, this.zzs, false);
        SafeParcelWriter.writeIBinder(parcel, 26, zzc(this.zzt), false);
        SafeParcelWriter.writeIBinder(parcel, 27, zzc(this.zzu), false);
        SafeParcelWriter.writeIBinder(parcel, 28, zzc(this.zzv), false);
        SafeParcelWriter.writeBoolean(parcel, 29, this.zzw);
        SafeParcelWriter.writeLong(parcel, 30, this.zzx);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzmL)).booleanValue()) {
            long j = this.zzx;
            ScheduledFuture schedule = zzbzw.zzd.schedule(new zzq(j), ((Integer) zzbe.zzc().zza(zzbcl.zzmN)).intValue(), TimeUnit.SECONDS);
            zzz.put(Long.valueOf(this.zzx), new zzp(this.zzb, this.zzc, this.zzd, this.zzp, this.zze, this.zzi, this.zzt, this.zzu, this.zzv, schedule));
        }
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzbif zzbifVar, zzbih zzbihVar, zzac zzacVar, zzcex zzcexVar, boolean z, int i, String str, String str2, VersionInfoParcel versionInfoParcel, zzdds zzddsVar, zzbsx zzbsxVar) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzrVar;
        this.zzd = zzcexVar;
        this.zzp = zzbifVar;
        this.zze = zzbihVar;
        this.zzf = str2;
        this.zzg = z;
        this.zzh = str;
        this.zzi = zzacVar;
        this.zzj = i;
        this.zzk = 3;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzddsVar;
        this.zzv = zzbsxVar;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzac zzacVar, zzcex zzcexVar, int i, VersionInfoParcel versionInfoParcel, String str, com.google.android.gms.ads.internal.zzl zzlVar, String str2, String str3, String str4, zzcwg zzcwgVar, zzbsx zzbsxVar, String str5) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzrVar;
        this.zzd = zzcexVar;
        this.zzp = null;
        this.zze = null;
        this.zzg = false;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzaT)).booleanValue()) {
            this.zzf = null;
            this.zzh = null;
        } else {
            this.zzf = str2;
            this.zzh = str3;
        }
        this.zzi = null;
        this.zzj = i;
        this.zzk = 1;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = str;
        this.zzo = zzlVar;
        this.zzq = str5;
        this.zzr = null;
        this.zzs = str4;
        this.zzt = zzcwgVar;
        this.zzu = null;
        this.zzv = zzbsxVar;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzac zzacVar, zzcex zzcexVar, boolean z, int i, VersionInfoParcel versionInfoParcel, zzdds zzddsVar, zzbsx zzbsxVar) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzrVar;
        this.zzd = zzcexVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = z;
        this.zzh = null;
        this.zzi = zzacVar;
        this.zzj = i;
        this.zzk = 2;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzddsVar;
        this.zzv = zzbsxVar;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public AdOverlayInfoParcel(@SafeParcelable.Param(m72313id = 2) zzc zzcVar, @SafeParcelable.Param(m72313id = 3) IBinder iBinder, @SafeParcelable.Param(m72313id = 4) IBinder iBinder2, @SafeParcelable.Param(m72313id = 5) IBinder iBinder3, @SafeParcelable.Param(m72313id = 6) IBinder iBinder4, @SafeParcelable.Param(m72313id = 7) String str, @SafeParcelable.Param(m72313id = 8) boolean z, @SafeParcelable.Param(m72313id = 9) String str2, @SafeParcelable.Param(m72313id = 10) IBinder iBinder5, @SafeParcelable.Param(m72313id = 11) int i, @SafeParcelable.Param(m72313id = 12) int i2, @SafeParcelable.Param(m72313id = 13) String str3, @SafeParcelable.Param(m72313id = 14) VersionInfoParcel versionInfoParcel, @SafeParcelable.Param(m72313id = 16) String str4, @SafeParcelable.Param(m72313id = 17) com.google.android.gms.ads.internal.zzl zzlVar, @SafeParcelable.Param(m72313id = 18) IBinder iBinder6, @SafeParcelable.Param(m72313id = 19) String str5, @SafeParcelable.Param(m72313id = 24) String str6, @SafeParcelable.Param(m72313id = 25) String str7, @SafeParcelable.Param(m72313id = 26) IBinder iBinder7, @SafeParcelable.Param(m72313id = 27) IBinder iBinder8, @SafeParcelable.Param(m72313id = 28) IBinder iBinder9, @SafeParcelable.Param(m72313id = 29) boolean z2, @SafeParcelable.Param(m72313id = 30) long j) {
        this.zza = zzcVar;
        this.zzf = str;
        this.zzg = z;
        this.zzh = str2;
        this.zzj = i;
        this.zzk = i2;
        this.zzl = str3;
        this.zzm = versionInfoParcel;
        this.zzn = str4;
        this.zzo = zzlVar;
        this.zzq = str5;
        this.zzr = str6;
        this.zzs = str7;
        this.zzw = z2;
        this.zzx = j;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzmL)).booleanValue()) {
            zzp zzpVar = (zzp) zzz.remove(Long.valueOf(j));
            if (zzpVar != null) {
                this.zzb = zzp.zza(zzpVar);
                this.zzc = zzp.zze(zzpVar);
                this.zzd = zzp.zzg(zzpVar);
                this.zzp = zzp.zzb(zzpVar);
                this.zze = zzp.zzc(zzpVar);
                this.zzt = zzp.zzh(zzpVar);
                this.zzu = zzp.zzi(zzpVar);
                this.zzv = zzp.zzd(zzpVar);
                this.zzi = zzp.zzf(zzpVar);
                zzp.zzj(zzpVar).cancel(false);
                return;
            }
            throw new NullPointerException("AdOverlayObjects is null");
        }
        this.zzb = (com.google.android.gms.ads.internal.client.zza) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder));
        this.zzc = (zzr) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder2));
        this.zzd = (zzcex) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder3));
        this.zzp = (zzbif) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder6));
        this.zze = (zzbih) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder4));
        this.zzi = (zzac) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder5));
        this.zzt = (zzcwg) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder7));
        this.zzu = (zzdds) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder8));
        this.zzv = (zzbsx) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder9));
    }

    public AdOverlayInfoParcel(zzc zzcVar, com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzac zzacVar, VersionInfoParcel versionInfoParcel, zzcex zzcexVar, zzdds zzddsVar, String str) {
        this.zza = zzcVar;
        this.zzb = zzaVar;
        this.zzc = zzrVar;
        this.zzd = zzcexVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = zzacVar;
        this.zzj = -1;
        this.zzk = 4;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = str;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzddsVar;
        this.zzv = null;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzr zzrVar, zzcex zzcexVar, int i, VersionInfoParcel versionInfoParcel) {
        this.zzc = zzrVar;
        this.zzd = zzcexVar;
        this.zzj = 1;
        this.zzm = versionInfoParcel;
        this.zza = null;
        this.zzb = null;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzk = 1;
        this.zzl = null;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = null;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzcex zzcexVar, VersionInfoParcel versionInfoParcel, String str, String str2, int i, zzbsx zzbsxVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzcexVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = 14;
        this.zzk = 5;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = str;
        this.zzr = str2;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = zzbsxVar;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }
}
