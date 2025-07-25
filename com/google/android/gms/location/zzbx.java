package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@ShowFirstParty
@SafeParcelable.Class(creator = "UserPreferredSleepWindowCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public final class zzbx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbx> CREATOR = new zzby();
    @SafeParcelable.Field(getter = "getStartHour", m72314id = 1)
    private final int zza;
    @SafeParcelable.Field(getter = "getStartMinute", m72314id = 2)
    private final int zzb;
    @SafeParcelable.Field(getter = "getEndHour", m72314id = 3)
    private final int zzc;
    @SafeParcelable.Field(getter = "getEndMinute", m72314id = 4)
    private final int zzd;

    @SafeParcelable.Constructor
    public zzbx(@SafeParcelable.Param(m72313id = 1) int i, @SafeParcelable.Param(m72313id = 2) int i2, @SafeParcelable.Param(m72313id = 3) int i3, @SafeParcelable.Param(m72313id = 4) int i4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (i >= 0 && i <= 23) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Start hour must be in range [0, 23].");
        if (i2 >= 0 && i2 <= 59) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkState(z2, "Start minute must be in range [0, 59].");
        if (i3 >= 0 && i3 <= 23) {
            z3 = true;
        } else {
            z3 = false;
        }
        Preconditions.checkState(z3, "End hour must be in range [0, 23].");
        if (i4 >= 0 && i4 <= 59) {
            z4 = true;
        } else {
            z4 = false;
        }
        Preconditions.checkState(z4, "End minute must be in range [0, 59].");
        Preconditions.checkState(((i + i2) + i3) + i4 > 0, "Parameters can't be all 0.");
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbx)) {
            return false;
        }
        zzbx zzbxVar = (zzbx) obj;
        if (this.zza == zzbxVar.zza && this.zzb == zzbxVar.zzb && this.zzc == zzbxVar.zzc && this.zzd == zzbxVar.zzd) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd));
    }

    public final String toString() {
        int i = this.zza;
        int i2 = this.zzb;
        int i3 = this.zzc;
        int i4 = this.zzd;
        StringBuilder sb2 = new StringBuilder(117);
        sb2.append("UserPreferredSleepWindow [startHour=");
        sb2.append(i);
        sb2.append(", startMinute=");
        sb2.append(i2);
        sb2.append(", endHour=");
        sb2.append(i3);
        sb2.append(", endMinute=");
        sb2.append(i4);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
