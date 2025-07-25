package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
@SafeParcelable.Class(creator = "ProgramResponseCreator")
/* loaded from: classes5.dex */
public final class zzfpb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfpb> CREATOR = new zzfpc();
    @SafeParcelable.VersionField(m72311id = 1)
    public final int zza;
    @SafeParcelable.Field(m72314id = 2)
    public final byte[] zzb;
    @SafeParcelable.Field(m72314id = 3)
    public final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzfpb(@SafeParcelable.Param(m72313id = 1) int i, @SafeParcelable.Param(m72313id = 2) byte[] bArr, @SafeParcelable.Param(m72313id = 3) int i2) {
        this.zza = i;
        this.zzb = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.zzc = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeByteArray(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzfpb(byte[] bArr, int i) {
        this(1, null, 1);
    }
}
