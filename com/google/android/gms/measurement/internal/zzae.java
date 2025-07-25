package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
@SafeParcelable.Class(creator = "ConditionalUserPropertyParcelCreator")
/* loaded from: classes5.dex */
public final class zzae extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzae> CREATOR = new zzad();
    @Nullable
    @SafeParcelable.Field(m72314id = 2)
    public String zza;
    @SafeParcelable.Field(m72314id = 3)
    public String zzb;
    @SafeParcelable.Field(m72314id = 4)
    public zzno zzc;
    @SafeParcelable.Field(m72314id = 5)
    public long zzd;
    @SafeParcelable.Field(m72314id = 6)
    public boolean zze;
    @Nullable
    @SafeParcelable.Field(m72314id = 7)
    public String zzf;
    @Nullable
    @SafeParcelable.Field(m72314id = 8)
    public zzbd zzg;
    @SafeParcelable.Field(m72314id = 9)
    public long zzh;
    @Nullable
    @SafeParcelable.Field(m72314id = 10)
    public zzbd zzi;
    @SafeParcelable.Field(m72314id = 11)
    public long zzj;
    @Nullable
    @SafeParcelable.Field(m72314id = 12)
    public zzbd zzk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzae(zzae zzaeVar) {
        Preconditions.checkNotNull(zzaeVar);
        this.zza = zzaeVar.zza;
        this.zzb = zzaeVar.zzb;
        this.zzc = zzaeVar.zzc;
        this.zzd = zzaeVar.zzd;
        this.zze = zzaeVar.zze;
        this.zzf = zzaeVar.zzf;
        this.zzg = zzaeVar.zzg;
        this.zzh = zzaeVar.zzh;
        this.zzi = zzaeVar.zzi;
        this.zzj = zzaeVar.zzj;
        this.zzk = zzaeVar.zzk;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzc, i, false);
        SafeParcelWriter.writeLong(parcel, 5, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zze);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzg, i, false);
        SafeParcelWriter.writeLong(parcel, 9, this.zzh);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzi, i, false);
        SafeParcelWriter.writeLong(parcel, 11, this.zzj);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzk, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzae(@Nullable @SafeParcelable.Param(m72313id = 2) String str, @SafeParcelable.Param(m72313id = 3) String str2, @SafeParcelable.Param(m72313id = 4) zzno zznoVar, @SafeParcelable.Param(m72313id = 5) long j, @SafeParcelable.Param(m72313id = 6) boolean z, @Nullable @SafeParcelable.Param(m72313id = 7) String str3, @Nullable @SafeParcelable.Param(m72313id = 8) zzbd zzbdVar, @SafeParcelable.Param(m72313id = 9) long j2, @Nullable @SafeParcelable.Param(m72313id = 10) zzbd zzbdVar2, @SafeParcelable.Param(m72313id = 11) long j3, @Nullable @SafeParcelable.Param(m72313id = 12) zzbd zzbdVar3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zznoVar;
        this.zzd = j;
        this.zze = z;
        this.zzf = str3;
        this.zzg = zzbdVar;
        this.zzh = j2;
        this.zzi = zzbdVar2;
        this.zzj = j3;
        this.zzk = zzbdVar3;
    }
}
