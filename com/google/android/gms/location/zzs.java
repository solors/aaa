package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@ShowFirstParty
@SafeParcelable.Class(creator = "DeviceOrientationRequestCreator")
/* loaded from: classes5.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();
    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_SHOULD_USE_MAG", m72314id = 1)
    boolean zza;
    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_MINIMUM_SAMPLING_PERIOD_MS", m72314id = 2)
    long zzb;
    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_SMALLEST_ANGLE_CHANGE_RADIANS", m72314id = 3)
    float zzc;
    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_EXPIRE_AT_MS", m72314id = 4)
    long zzd;
    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_NUM_UPDATES", m72314id = 5)
    int zze;

    public zzs() {
        this(true, 50L, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzs)) {
            return false;
        }
        zzs zzsVar = (zzs) obj;
        if (this.zza == zzsVar.zza && this.zzb == zzsVar.zzb && Float.compare(this.zzc, zzsVar.zzc) == 0 && this.zzd == zzsVar.zzd && this.zze == zzsVar.zze) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zza), Long.valueOf(this.zzb), Float.valueOf(this.zzc), Long.valueOf(this.zzd), Integer.valueOf(this.zze));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DeviceOrientationRequest[mShouldUseMag=");
        sb2.append(this.zza);
        sb2.append(" mMinimumSamplingPeriodMs=");
        sb2.append(this.zzb);
        sb2.append(" mSmallestAngleChangeRadians=");
        sb2.append(this.zzc);
        long j = this.zzd;
        if (j != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb2.append(" expireIn=");
            sb2.append(j - elapsedRealtime);
            sb2.append("ms");
        }
        if (this.zze != Integer.MAX_VALUE) {
            sb2.append(" num=");
            sb2.append(this.zze);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zza);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeFloat(parcel, 3, this.zzc);
        SafeParcelWriter.writeLong(parcel, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzs(@SafeParcelable.Param(m72313id = 1) boolean z, @SafeParcelable.Param(m72313id = 2) long j, @SafeParcelable.Param(m72313id = 3) float f, @SafeParcelable.Param(m72313id = 4) long j2, @SafeParcelable.Param(m72313id = 5) int i) {
        this.zza = z;
        this.zzb = j;
        this.zzc = f;
        this.zzd = j2;
        this.zze = i;
    }
}
