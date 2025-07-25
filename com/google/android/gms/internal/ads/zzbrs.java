package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
@SafeParcelable.Class(creator = "RtbVersionInfoParcelCreator")
/* loaded from: classes5.dex */
public final class zzbrs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbrs> CREATOR = new zzbrt();
    @SafeParcelable.Field(m72314id = 1)
    public final int zza;
    @SafeParcelable.Field(m72314id = 2)
    public final int zzb;
    @SafeParcelable.Field(m72314id = 3)
    public final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzbrs(@SafeParcelable.Param(m72313id = 1) int i, @SafeParcelable.Param(m72313id = 2) int i2, @SafeParcelable.Param(m72313id = 3) int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    public static zzbrs zza(VersionInfo versionInfo) {
        return new zzbrs(versionInfo.getMajorVersion(), versionInfo.getMinorVersion(), versionInfo.getMicroVersion());
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbrs)) {
            zzbrs zzbrsVar = (zzbrs) obj;
            if (zzbrsVar.zzc == this.zzc && zzbrsVar.zzb == this.zzb && zzbrsVar.zza == this.zza) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.zza, this.zzb, this.zzc});
    }

    public final String toString() {
        return this.zza + "." + this.zzb + "." + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
