package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
@SafeParcelable.Class(creator = "NonagonRequestParcelCreator")
/* loaded from: classes5.dex */
public final class zzbvk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbvk> CREATOR = new zzbvl();
    @SafeParcelable.Field(m72314id = 1)
    public final Bundle zza;
    @SafeParcelable.Field(m72314id = 2)
    public final VersionInfoParcel zzb;
    @SafeParcelable.Field(m72314id = 3)
    public final ApplicationInfo zzc;
    @SafeParcelable.Field(m72314id = 4)
    public final String zzd;
    @SafeParcelable.Field(m72314id = 5)
    public final List zze;
    @Nullable
    @SafeParcelable.Field(m72314id = 6)
    public final PackageInfo zzf;
    @SafeParcelable.Field(m72314id = 7)
    public final String zzg;
    @SafeParcelable.Field(m72314id = 9)
    public final String zzh;
    @Nullable
    @SafeParcelable.Field(m72314id = 10)
    public zzfed zzi;
    @Nullable
    @SafeParcelable.Field(m72314id = 11)
    public String zzj;
    @SafeParcelable.Field(m72314id = 12)
    public final boolean zzk;
    @SafeParcelable.Field(m72314id = 13)
    public final boolean zzl;
    @SafeParcelable.Field(m72314id = 14)
    public final Bundle zzm;
    @SafeParcelable.Field(m72314id = 15)
    public final Bundle zzn;

    @SafeParcelable.Constructor
    public zzbvk(@SafeParcelable.Param(m72313id = 1) Bundle bundle, @SafeParcelable.Param(m72313id = 2) VersionInfoParcel versionInfoParcel, @SafeParcelable.Param(m72313id = 3) ApplicationInfo applicationInfo, @SafeParcelable.Param(m72313id = 4) String str, @SafeParcelable.Param(m72313id = 5) List list, @Nullable @SafeParcelable.Param(m72313id = 6) PackageInfo packageInfo, @SafeParcelable.Param(m72313id = 7) String str2, @SafeParcelable.Param(m72313id = 9) String str3, @SafeParcelable.Param(m72313id = 10) zzfed zzfedVar, @SafeParcelable.Param(m72313id = 11) String str4, @SafeParcelable.Param(m72313id = 12) boolean z, @SafeParcelable.Param(m72313id = 13) boolean z2, @SafeParcelable.Param(m72313id = 14) Bundle bundle2, @SafeParcelable.Param(m72313id = 15) Bundle bundle3) {
        this.zza = bundle;
        this.zzb = versionInfoParcel;
        this.zzd = str;
        this.zzc = applicationInfo;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = str2;
        this.zzh = str3;
        this.zzi = zzfedVar;
        this.zzj = str4;
        this.zzk = z;
        this.zzl = z2;
        this.zzm = bundle2;
        this.zzn = bundle3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, bundle, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeStringList(parcel, 5, this.zze, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzg, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzi, i, false);
        SafeParcelWriter.writeString(parcel, 11, this.zzj, false);
        SafeParcelWriter.writeBoolean(parcel, 12, this.zzk);
        SafeParcelWriter.writeBoolean(parcel, 13, this.zzl);
        SafeParcelWriter.writeBundle(parcel, 14, this.zzm, false);
        SafeParcelWriter.writeBundle(parcel, 15, this.zzn, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
