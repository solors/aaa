package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
@SafeParcelable.Class(creator = "DecagonRequestParcelCreator")
/* loaded from: classes5.dex */
public final class zzbuu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbuu> CREATOR = new zzbuv();
    @SafeParcelable.Field(m72314id = 1)
    public final String zza;

    @SafeParcelable.Constructor
    public zzbuu(@SafeParcelable.Param(m72313id = 1) String str) {
        this.zza = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
