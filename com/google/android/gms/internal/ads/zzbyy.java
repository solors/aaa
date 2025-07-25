package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
@SafeParcelable.Class(creator = "SignalConfigurationParcelCreator")
/* loaded from: classes5.dex */
public final class zzbyy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbyy> CREATOR = new zzbyz();
    @SafeParcelable.Field(m72314id = 1)
    public final String zza;
    @SafeParcelable.Field(m72314id = 2)
    public final String zzb;
    @SafeParcelable.Field(m72314id = 3)
    @Deprecated
    public final com.google.android.gms.ads.internal.client.zzs zzc;
    @SafeParcelable.Field(m72314id = 4)
    public final com.google.android.gms.ads.internal.client.zzm zzd;
    @SafeParcelable.Field(m72314id = 5)
    public final int zze;
    @Nullable
    @SafeParcelable.Field(m72314id = 6)
    public final String zzf;

    @SafeParcelable.Constructor
    public zzbyy(@SafeParcelable.Param(m72313id = 1) String str, @SafeParcelable.Param(m72313id = 2) String str2, @SafeParcelable.Param(m72313id = 3) com.google.android.gms.ads.internal.client.zzs zzsVar, @SafeParcelable.Param(m72313id = 4) com.google.android.gms.ads.internal.client.zzm zzmVar, @SafeParcelable.Param(m72313id = 5) int i, @Nullable @SafeParcelable.Param(m72313id = 6) String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzsVar;
        this.zzd = zzmVar;
        this.zze = i;
        this.zzf = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeString(parcel, 6, this.zzf, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
