package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
@SafeParcelable.Class(creator = "MediationConfigurationParcelCreator")
/* loaded from: classes5.dex */
public final class zzblx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzblx> CREATOR = new zzbly();
    @SafeParcelable.Field(m72314id = 1)
    public final String zza;
    @SafeParcelable.Field(m72314id = 2)
    public final Bundle zzb;

    @SafeParcelable.Constructor
    public zzblx(@SafeParcelable.Param(m72313id = 1) String str, @SafeParcelable.Param(m72313id = 2) Bundle bundle) {
        this.zza = str;
        this.zzb = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeBundle(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
