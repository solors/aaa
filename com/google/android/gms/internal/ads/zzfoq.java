package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
@SafeParcelable.Class(creator = "GassRequestParcelCreator")
/* loaded from: classes5.dex */
public final class zzfoq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfoq> CREATOR = new zzfor();
    @SafeParcelable.VersionField(m72311id = 1)
    public final int zza;
    @SafeParcelable.Field(m72314id = 2)
    public final String zzb;
    @SafeParcelable.Field(m72314id = 3)
    public final String zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzfoq(@SafeParcelable.Param(m72313id = 1) int i, @SafeParcelable.Param(m72313id = 2) String str, @SafeParcelable.Param(m72313id = 3) String str2) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzfoq(String str, String str2) {
        this(1, str, str2);
    }
}
