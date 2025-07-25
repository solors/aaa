package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
@SafeParcelable.Class(creator = "AdRequestParcelCreator")
/* loaded from: classes4.dex */
public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new zzo();
    @SafeParcelable.Field(m72314id = 1)
    public final int zza;
    @SafeParcelable.Field(m72314id = 2)
    @Deprecated
    public final long zzb;
    @SafeParcelable.Field(m72314id = 3)
    public final Bundle zzc;
    @SafeParcelable.Field(m72314id = 4)
    @Deprecated
    public final int zzd;
    @SafeParcelable.Field(m72314id = 5)
    public final List zze;
    @SafeParcelable.Field(m72314id = 6)
    public final boolean zzf;
    @SafeParcelable.Field(m72314id = 7)
    public final int zzg;
    @SafeParcelable.Field(m72314id = 8)
    public final boolean zzh;
    @SafeParcelable.Field(m72314id = 9)
    public final String zzi;
    @SafeParcelable.Field(m72314id = 10)
    public final zzfx zzj;
    @SafeParcelable.Field(m72314id = 11)
    public final Location zzk;
    @SafeParcelable.Field(m72314id = 12)
    public final String zzl;
    @SafeParcelable.Field(m72314id = 13)
    public final Bundle zzm;
    @SafeParcelable.Field(m72314id = 14)
    public final Bundle zzn;
    @SafeParcelable.Field(m72314id = 15)
    public final List zzo;
    @SafeParcelable.Field(m72314id = 16)
    public final String zzp;
    @SafeParcelable.Field(m72314id = 17)
    public final String zzq;
    @SafeParcelable.Field(m72314id = 18)
    @Deprecated
    public final boolean zzr;
    @Nullable
    @SafeParcelable.Field(m72314id = 19)
    public final zzc zzs;
    @SafeParcelable.Field(m72314id = 20)
    public final int zzt;
    @Nullable
    @SafeParcelable.Field(m72314id = 21)
    public final String zzu;
    @SafeParcelable.Field(m72314id = 22)
    public final List zzv;
    @SafeParcelable.Field(m72314id = 23)
    public final int zzw;
    @Nullable
    @SafeParcelable.Field(m72314id = 24)
    public final String zzx;
    @SafeParcelable.Field(m72314id = 25)
    public final int zzy;
    @SafeParcelable.Field(m72314id = 26)
    public final long zzz;

    @SafeParcelable.Constructor
    public zzm(@SafeParcelable.Param(m72313id = 1) int i, @SafeParcelable.Param(m72313id = 2) long j, @SafeParcelable.Param(m72313id = 3) Bundle bundle, @SafeParcelable.Param(m72313id = 4) int i2, @SafeParcelable.Param(m72313id = 5) List list, @SafeParcelable.Param(m72313id = 6) boolean z, @SafeParcelable.Param(m72313id = 7) int i3, @SafeParcelable.Param(m72313id = 8) boolean z2, @SafeParcelable.Param(m72313id = 9) String str, @SafeParcelable.Param(m72313id = 10) zzfx zzfxVar, @SafeParcelable.Param(m72313id = 11) Location location, @SafeParcelable.Param(m72313id = 12) String str2, @SafeParcelable.Param(m72313id = 13) Bundle bundle2, @SafeParcelable.Param(m72313id = 14) Bundle bundle3, @SafeParcelable.Param(m72313id = 15) List list2, @SafeParcelable.Param(m72313id = 16) String str3, @SafeParcelable.Param(m72313id = 17) String str4, @SafeParcelable.Param(m72313id = 18) boolean z3, @Nullable @SafeParcelable.Param(m72313id = 19) zzc zzcVar, @SafeParcelable.Param(m72313id = 20) int i4, @Nullable @SafeParcelable.Param(m72313id = 21) String str5, @SafeParcelable.Param(m72313id = 22) List list3, @SafeParcelable.Param(m72313id = 23) int i5, @Nullable @SafeParcelable.Param(m72313id = 24) String str6, @SafeParcelable.Param(m72313id = 25) int i6, @SafeParcelable.Param(m72313id = 26) long j2) {
        this.zza = i;
        this.zzb = j;
        this.zzc = bundle == null ? new Bundle() : bundle;
        this.zzd = i2;
        this.zze = list;
        this.zzf = z;
        this.zzg = i3;
        this.zzh = z2;
        this.zzi = str;
        this.zzj = zzfxVar;
        this.zzk = location;
        this.zzl = str2;
        this.zzm = bundle2 == null ? new Bundle() : bundle2;
        this.zzn = bundle3;
        this.zzo = list2;
        this.zzp = str3;
        this.zzq = str4;
        this.zzr = z3;
        this.zzs = zzcVar;
        this.zzt = i4;
        this.zzu = str5;
        this.zzv = list3 == null ? new ArrayList() : list3;
        this.zzw = i5;
        this.zzx = str6;
        this.zzy = i6;
        this.zzz = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzm)) {
            return false;
        }
        zzm zzmVar = (zzm) obj;
        if (!zza(obj) || this.zzz != zzmVar.zzz) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Long.valueOf(this.zzb), this.zzc, Integer.valueOf(this.zzd), this.zze, Boolean.valueOf(this.zzf), Integer.valueOf(this.zzg), Boolean.valueOf(this.zzh), this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzp, this.zzq, Boolean.valueOf(this.zzr), Integer.valueOf(this.zzt), this.zzu, this.zzv, Integer.valueOf(this.zzw), this.zzx, Integer.valueOf(this.zzy), Long.valueOf(this.zzz));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeBundle(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeStringList(parcel, 5, this.zze, false);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zzf);
        SafeParcelWriter.writeInt(parcel, 7, this.zzg);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzh);
        SafeParcelWriter.writeString(parcel, 9, this.zzi, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzj, i, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzk, i, false);
        SafeParcelWriter.writeString(parcel, 12, this.zzl, false);
        SafeParcelWriter.writeBundle(parcel, 13, this.zzm, false);
        SafeParcelWriter.writeBundle(parcel, 14, this.zzn, false);
        SafeParcelWriter.writeStringList(parcel, 15, this.zzo, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzp, false);
        SafeParcelWriter.writeString(parcel, 17, this.zzq, false);
        SafeParcelWriter.writeBoolean(parcel, 18, this.zzr);
        SafeParcelWriter.writeParcelable(parcel, 19, this.zzs, i, false);
        SafeParcelWriter.writeInt(parcel, 20, this.zzt);
        SafeParcelWriter.writeString(parcel, 21, this.zzu, false);
        SafeParcelWriter.writeStringList(parcel, 22, this.zzv, false);
        SafeParcelWriter.writeInt(parcel, 23, this.zzw);
        SafeParcelWriter.writeString(parcel, 24, this.zzx, false);
        SafeParcelWriter.writeInt(parcel, 25, this.zzy);
        SafeParcelWriter.writeLong(parcel, 26, this.zzz);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final boolean zza(Object obj) {
        if (!(obj instanceof zzm)) {
            return false;
        }
        zzm zzmVar = (zzm) obj;
        if (this.zza != zzmVar.zza || this.zzb != zzmVar.zzb || !com.google.android.gms.ads.internal.util.client.zzp.zza(this.zzc, zzmVar.zzc) || this.zzd != zzmVar.zzd || !Objects.equal(this.zze, zzmVar.zze) || this.zzf != zzmVar.zzf || this.zzg != zzmVar.zzg || this.zzh != zzmVar.zzh || !Objects.equal(this.zzi, zzmVar.zzi) || !Objects.equal(this.zzj, zzmVar.zzj) || !Objects.equal(this.zzk, zzmVar.zzk) || !Objects.equal(this.zzl, zzmVar.zzl) || !com.google.android.gms.ads.internal.util.client.zzp.zza(this.zzm, zzmVar.zzm) || !com.google.android.gms.ads.internal.util.client.zzp.zza(this.zzn, zzmVar.zzn) || !Objects.equal(this.zzo, zzmVar.zzo) || !Objects.equal(this.zzp, zzmVar.zzp) || !Objects.equal(this.zzq, zzmVar.zzq) || this.zzr != zzmVar.zzr || this.zzt != zzmVar.zzt || !Objects.equal(this.zzu, zzmVar.zzu) || !Objects.equal(this.zzv, zzmVar.zzv) || this.zzw != zzmVar.zzw || !Objects.equal(this.zzx, zzmVar.zzx) || this.zzy != zzmVar.zzy) {
            return false;
        }
        return true;
    }

    public final boolean zzb() {
        return this.zzc.getBoolean("is_sdk_preload", false);
    }
}
