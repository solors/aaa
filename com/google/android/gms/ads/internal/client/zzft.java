package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
@SafeParcelable.Class(creator = "PreloadConfigurationParcelCreator")
/* loaded from: classes4.dex */
public final class zzft extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzft> CREATOR = new zzfu();
    @SafeParcelable.Field(m72314id = 1)
    public final String zza;
    @SafeParcelable.Field(m72314id = 2)
    public final int zzb;
    @SafeParcelable.Field(m72314id = 3)
    public final zzm zzc;
    @SafeParcelable.Field(m72314id = 4)
    public final int zzd;

    @SafeParcelable.Constructor
    public zzft(@SafeParcelable.Param(m72313id = 1) String str, @SafeParcelable.Param(m72313id = 2) int i, @SafeParcelable.Param(m72313id = 3) zzm zzmVar, @SafeParcelable.Param(m72313id = 4) int i2) {
        this.zza = str;
        this.zzb = i;
        this.zzc = zzmVar;
        this.zzd = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzft) {
            zzft zzftVar = (zzft) obj;
            if (this.zza.equals(zzftVar.zza) && this.zzb == zzftVar.zzb && this.zzc.zza(zzftVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, Integer.valueOf(this.zzb), this.zzc);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
