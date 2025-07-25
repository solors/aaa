package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
@SafeParcelable.Class(creator = "InstreamAdConfigurationParcelCreator")
/* loaded from: classes5.dex */
public final class zzblz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzblz> CREATOR = new zzbma();
    @SafeParcelable.VersionField(m72311id = 1000)
    public final int zza;
    @SafeParcelable.Field(m72314id = 1)
    public final int zzb;
    @SafeParcelable.Field(m72314id = 2)
    public final String zzc;
    @SafeParcelable.Field(m72314id = 3)
    public final int zzd;

    @SafeParcelable.Constructor
    public zzblz(@SafeParcelable.Param(m72313id = 1000) int i, @SafeParcelable.Param(m72313id = 1) int i2, @SafeParcelable.Param(m72313id = 2) String str, @SafeParcelable.Param(m72313id = 3) int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = str;
        this.zzd = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zzb;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeString(parcel, 2, this.zzc, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 1000, this.zza);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
