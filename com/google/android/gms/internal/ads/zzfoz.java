package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
@SafeParcelable.Class(creator = "ProgramRequestCreator")
/* loaded from: classes5.dex */
public final class zzfoz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfoz> CREATOR = new zzfpa();
    @SafeParcelable.VersionField(m72311id = 1)
    public final int zza;
    @SafeParcelable.Field(m72314id = 2)
    public final int zzb;
    @SafeParcelable.Field(m72314id = 3)
    public final String zzc;
    @SafeParcelable.Field(m72314id = 4)
    public final String zzd;
    @SafeParcelable.Field(m72314id = 5)
    public final int zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzfoz(@SafeParcelable.Param(m72313id = 1) int i, @SafeParcelable.Param(m72313id = 2) int i2, @SafeParcelable.Param(m72313id = 5) int i3, @SafeParcelable.Param(m72313id = 3) String str, @SafeParcelable.Param(m72313id = 4) String str2) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = str;
        this.zzd = str2;
        this.zze = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzfoz(int i, int i2, String str, String str2) {
        this(1, 1, i2 - 1, str, str2);
    }
}
