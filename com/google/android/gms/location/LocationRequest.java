package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@SafeParcelable.Class(creator = "LocationRequestCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<LocationRequest> CREATOR = new zzbf();
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;
    public static final int PRIORITY_HIGH_ACCURACY = 100;
    public static final int PRIORITY_LOW_POWER = 104;
    public static final int PRIORITY_NO_POWER = 105;
    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_PRIORITY", m72314id = 1)
    int zza;
    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_INTERVAL", m72314id = 2)
    long zzb;
    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_FASTEST_INTERVAL", m72314id = 3)
    long zzc;
    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_EXPLICIT_FASTEST_INTERVAL", m72314id = 4)
    boolean zzd;
    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_EXPIRE_AT", m72314id = 5)
    long zze;
    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_NUM_UPDATES", m72314id = 6)
    int zzf;
    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_SMALLEST_DISPLACEMENT", m72314id = 7)
    float zzg;
    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_MAX_WAIT_TIME", m72314id = 8)
    long zzh;
    @SafeParcelable.Field(defaultValue = "false", m72314id = 9)
    boolean zzi;

    @Deprecated
    public LocationRequest() {
        this.zza = 102;
        this.zzb = 3600000L;
        this.zzc = 600000L;
        this.zzd = false;
        this.zze = Long.MAX_VALUE;
        this.zzf = Integer.MAX_VALUE;
        this.zzg = 0.0f;
        this.zzh = 0L;
        this.zzi = false;
    }

    @NonNull
    public static LocationRequest create() {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.setWaitForAccurateLocation(true);
        return locationRequest;
    }

    private static void zza(long j) {
        if (j >= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("invalid interval: ");
        sb2.append(j);
        throw new IllegalArgumentException(sb2.toString());
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.zza == locationRequest.zza && this.zzb == locationRequest.zzb && this.zzc == locationRequest.zzc && this.zzd == locationRequest.zzd && this.zze == locationRequest.zze && this.zzf == locationRequest.zzf && this.zzg == locationRequest.zzg && getMaxWaitTime() == locationRequest.getMaxWaitTime() && this.zzi == locationRequest.zzi) {
                return true;
            }
        }
        return false;
    }

    public long getExpirationTime() {
        return this.zze;
    }

    public long getFastestInterval() {
        return this.zzc;
    }

    public long getInterval() {
        return this.zzb;
    }

    public long getMaxWaitTime() {
        long j = this.zzh;
        long j2 = this.zzb;
        if (j < j2) {
            return j2;
        }
        return j;
    }

    public int getNumUpdates() {
        return this.zzf;
    }

    public int getPriority() {
        return this.zza;
    }

    public float getSmallestDisplacement() {
        return this.zzg;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Long.valueOf(this.zzb), Float.valueOf(this.zzg), Long.valueOf(this.zzh));
    }

    public boolean isFastestIntervalExplicitlySet() {
        return this.zzd;
    }

    public boolean isWaitForAccurateLocation() {
        return this.zzi;
    }

    @NonNull
    public LocationRequest setExpirationDuration(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = Long.MAX_VALUE;
        if (j <= Long.MAX_VALUE - elapsedRealtime) {
            j2 = j + elapsedRealtime;
        }
        this.zze = j2;
        if (j2 < 0) {
            this.zze = 0L;
        }
        return this;
    }

    @NonNull
    public LocationRequest setExpirationTime(long j) {
        this.zze = j;
        if (j < 0) {
            this.zze = 0L;
        }
        return this;
    }

    @NonNull
    public LocationRequest setFastestInterval(long j) {
        zza(j);
        this.zzd = true;
        this.zzc = j;
        return this;
    }

    @NonNull
    public LocationRequest setInterval(long j) {
        zza(j);
        this.zzb = j;
        if (!this.zzd) {
            this.zzc = (long) (j / 6.0d);
        }
        return this;
    }

    @NonNull
    public LocationRequest setMaxWaitTime(long j) {
        zza(j);
        this.zzh = j;
        return this;
    }

    @NonNull
    public LocationRequest setNumUpdates(int i) {
        if (i > 0) {
            this.zzf = i;
            return this;
        }
        StringBuilder sb2 = new StringBuilder(31);
        sb2.append("invalid numUpdates: ");
        sb2.append(i);
        throw new IllegalArgumentException(sb2.toString());
    }

    @NonNull
    public LocationRequest setPriority(int i) {
        if (i != 100 && i != 102 && i != 104 && i != 105) {
            StringBuilder sb2 = new StringBuilder(28);
            sb2.append("invalid quality: ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        }
        this.zza = i;
        return this;
    }

    @NonNull
    public LocationRequest setSmallestDisplacement(float f) {
        if (f >= 0.0f) {
            this.zzg = f;
            return this;
        }
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("invalid displacement: ");
        sb2.append(f);
        throw new IllegalArgumentException(sb2.toString());
    }

    @NonNull
    public LocationRequest setWaitForAccurateLocation(boolean z) {
        this.zzi = z;
        return this;
    }

    @NonNull
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request[");
        int i = this.zza;
        if (i != 100) {
            if (i != 102) {
                if (i != 104) {
                    if (i != 105) {
                        str = "???";
                    } else {
                        str = "PRIORITY_NO_POWER";
                    }
                } else {
                    str = "PRIORITY_LOW_POWER";
                }
            } else {
                str = "PRIORITY_BALANCED_POWER_ACCURACY";
            }
        } else {
            str = "PRIORITY_HIGH_ACCURACY";
        }
        sb2.append(str);
        if (this.zza != 105) {
            sb2.append(" requested=");
            sb2.append(this.zzb);
            sb2.append("ms");
        }
        sb2.append(" fastest=");
        sb2.append(this.zzc);
        sb2.append("ms");
        if (this.zzh > this.zzb) {
            sb2.append(" maxWait=");
            sb2.append(this.zzh);
            sb2.append("ms");
        }
        if (this.zzg > 0.0f) {
            sb2.append(" smallestDisplacement=");
            sb2.append(this.zzg);
            sb2.append("m");
        }
        long j = this.zze;
        if (j != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb2.append(" expireIn=");
            sb2.append(j - elapsedRealtime);
            sb2.append("ms");
        }
        if (this.zzf != Integer.MAX_VALUE) {
            sb2.append(" num=");
            sb2.append(this.zzf);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeLong(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeLong(parcel, 5, this.zze);
        SafeParcelWriter.writeInt(parcel, 6, this.zzf);
        SafeParcelWriter.writeFloat(parcel, 7, this.zzg);
        SafeParcelWriter.writeLong(parcel, 8, this.zzh);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzi);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public LocationRequest(@SafeParcelable.Param(m72313id = 1) int i, @SafeParcelable.Param(m72313id = 2) long j, @SafeParcelable.Param(m72313id = 3) long j2, @SafeParcelable.Param(m72313id = 4) boolean z, @SafeParcelable.Param(m72313id = 5) long j3, @SafeParcelable.Param(m72313id = 6) int i2, @SafeParcelable.Param(m72313id = 7) float f, @SafeParcelable.Param(m72313id = 8) long j4, @SafeParcelable.Param(m72313id = 9) boolean z2) {
        this.zza = i;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = z;
        this.zze = j3;
        this.zzf = i2;
        this.zzg = f;
        this.zzh = j4;
        this.zzi = z2;
    }
}
