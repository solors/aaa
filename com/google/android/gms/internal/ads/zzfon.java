package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
@SafeParcelable.Class(creator = "GassEventParcelCreator")
/* loaded from: classes5.dex */
public final class zzfon extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfon> CREATOR = new zzfoo();
    @SafeParcelable.VersionField(m72311id = 1)
    public final int zza;
    @SafeParcelable.Field(m72314id = 2)
    public final byte[] zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzfon(@SafeParcelable.Param(m72313id = 1) int i, @SafeParcelable.Param(m72313id = 2) byte[] bArr) {
        this.zza = i;
        this.zzb = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeByteArray(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzfon(byte[] bArr) {
        this(1, bArr);
    }
}
