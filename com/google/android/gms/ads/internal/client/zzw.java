package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
@SafeParcelable.Class(creator = "AdapterResponseInfoParcelCreator")
/* loaded from: classes4.dex */
public final class zzw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzw> CREATOR = new zzx();
    @SafeParcelable.Field(m72314id = 1)
    public final String zza;
    @SafeParcelable.Field(m72314id = 2)
    public long zzb;
    @Nullable
    @SafeParcelable.Field(m72314id = 3)
    public zze zzc;
    @SafeParcelable.Field(m72314id = 4)
    public final Bundle zzd;
    @SafeParcelable.Field(m72314id = 5)
    public final String zze;
    @SafeParcelable.Field(m72314id = 6)
    public final String zzf;
    @SafeParcelable.Field(m72314id = 7)
    public final String zzg;
    @SafeParcelable.Field(m72314id = 8)
    public final String zzh;

    @SafeParcelable.Constructor
    public zzw(@SafeParcelable.Param(m72313id = 1) String str, @SafeParcelable.Param(m72313id = 2) long j, @Nullable @SafeParcelable.Param(m72313id = 3) zze zzeVar, @SafeParcelable.Param(m72313id = 4) Bundle bundle, @SafeParcelable.Param(m72313id = 5) String str2, @SafeParcelable.Param(m72313id = 6) String str3, @SafeParcelable.Param(m72313id = 7) String str4, @SafeParcelable.Param(m72313id = 8) String str5) {
        this.zza = str;
        this.zzb = j;
        this.zzc = zzeVar;
        this.zzd = bundle;
        this.zze = str2;
        this.zzf = str3;
        this.zzg = str4;
        this.zzh = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.writeBundle(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzg, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzh, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
