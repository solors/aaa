package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
@SafeParcelable.Class(creator = "AdapterStatusParcelCreator")
/* loaded from: classes5.dex */
public final class zzbln extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbln> CREATOR = new zzblo();
    @SafeParcelable.Field(m72314id = 1)
    public final String zza;
    @SafeParcelable.Field(m72314id = 2)
    public final boolean zzb;
    @SafeParcelable.Field(m72314id = 3)
    public final int zzc;
    @SafeParcelable.Field(m72314id = 4)
    public final String zzd;

    @SafeParcelable.Constructor
    public zzbln(@SafeParcelable.Param(m72313id = 1) String str, @SafeParcelable.Param(m72313id = 2) boolean z, @SafeParcelable.Param(m72313id = 3) int i, @SafeParcelable.Param(m72313id = 4) String str2) {
        this.zza = str;
        this.zzb = z;
        this.zzc = i;
        this.zzd = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
