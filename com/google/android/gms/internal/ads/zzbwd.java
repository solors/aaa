package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
@SafeParcelable.Class(creator = "RewardedVideoAdRequestParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class zzbwd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbwd> CREATOR = new zzbwe();
    @SafeParcelable.Field(m72314id = 2)
    public final com.google.android.gms.ads.internal.client.zzm zza;
    @SafeParcelable.Field(m72314id = 3)
    public final String zzb;

    @SafeParcelable.Constructor
    public zzbwd(@SafeParcelable.Param(m72313id = 2) com.google.android.gms.ads.internal.client.zzm zzmVar, @SafeParcelable.Param(m72313id = 3) String str) {
        this.zza = zzmVar;
        this.zzb = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        com.google.android.gms.ads.internal.client.zzm zzmVar = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, zzmVar, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
