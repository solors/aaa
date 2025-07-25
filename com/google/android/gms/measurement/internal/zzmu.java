package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
@SafeParcelable.Class(creator = "TriggerUriParcelCreator")
/* loaded from: classes5.dex */
public final class zzmu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmu> CREATOR = new zzmt();
    @SafeParcelable.Field(m72314id = 1)
    public final String zza;
    @SafeParcelable.Field(m72314id = 2)
    public final long zzb;
    @SafeParcelable.Field(m72314id = 3)
    public final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzmu(@SafeParcelable.Param(m72313id = 1) String str, @SafeParcelable.Param(m72313id = 2) long j, @SafeParcelable.Param(m72313id = 3) int i) {
        this.zza = str;
        this.zzb = j;
        this.zzc = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
