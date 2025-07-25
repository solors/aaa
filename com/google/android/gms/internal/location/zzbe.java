package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.Geofence;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@VisibleForTesting
@SafeParcelable.Class(creator = "ParcelableGeofenceCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public final class zzbe extends AbstractSafeParcelable implements Geofence {
    public static final Parcelable.Creator<zzbe> CREATOR = new zzbf();
    @SafeParcelable.Field(getter = "getRequestId", m72314id = 1)
    private final String zza;
    @SafeParcelable.Field(getter = "getExpirationTime", m72314id = 2)
    private final long zzb;
    @SafeParcelable.Field(getter = "getType", m72314id = 3)
    private final short zzc;
    @SafeParcelable.Field(getter = "getLatitude", m72314id = 4)
    private final double zzd;
    @SafeParcelable.Field(getter = "getLongitude", m72314id = 5)
    private final double zze;
    @SafeParcelable.Field(getter = "getRadius", m72314id = 6)
    private final float zzf;
    @SafeParcelable.Field(getter = "getTransitionTypes", m72314id = 7)
    private final int zzg;
    @SafeParcelable.Field(defaultValue = "0", getter = "getNotificationResponsiveness", m72314id = 8)
    private final int zzh;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getLoiteringDelay", m72314id = 9)
    private final int zzi;

    @SafeParcelable.Constructor
    public zzbe(@SafeParcelable.Param(m72313id = 1) String str, @SafeParcelable.Param(m72313id = 7) int i, @SafeParcelable.Param(m72313id = 3) short s, @SafeParcelable.Param(m72313id = 4) double d, @SafeParcelable.Param(m72313id = 5) double d2, @SafeParcelable.Param(m72313id = 6) float f, @SafeParcelable.Param(m72313id = 2) long j, @SafeParcelable.Param(m72313id = 8) int i2, @SafeParcelable.Param(m72313id = 9) int i3) {
        String str2;
        if (str != null && str.length() <= 100) {
            if (f > 0.0f) {
                if (d <= 90.0d && d >= -90.0d) {
                    if (d2 <= 180.0d && d2 >= -180.0d) {
                        int i4 = i & 7;
                        if (i4 != 0) {
                            this.zzc = s;
                            this.zza = str;
                            this.zzd = d;
                            this.zze = d2;
                            this.zzf = f;
                            this.zzb = j;
                            this.zzg = i4;
                            this.zzh = i2;
                            this.zzi = i3;
                            return;
                        }
                        StringBuilder sb2 = new StringBuilder(46);
                        sb2.append("No supported transition specified: ");
                        sb2.append(i);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    StringBuilder sb3 = new StringBuilder(43);
                    sb3.append("invalid longitude: ");
                    sb3.append(d2);
                    throw new IllegalArgumentException(sb3.toString());
                }
                StringBuilder sb4 = new StringBuilder(42);
                sb4.append("invalid latitude: ");
                sb4.append(d);
                throw new IllegalArgumentException(sb4.toString());
            }
            StringBuilder sb5 = new StringBuilder(31);
            sb5.append("invalid radius: ");
            sb5.append(f);
            throw new IllegalArgumentException(sb5.toString());
        }
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "requestId is null or too long: ".concat(valueOf);
        } else {
            str2 = new String("requestId is null or too long: ");
        }
        throw new IllegalArgumentException(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbe) {
            zzbe zzbeVar = (zzbe) obj;
            if (this.zzf == zzbeVar.zzf && this.zzd == zzbeVar.zzd && this.zze == zzbeVar.zze && this.zzc == zzbeVar.zzc) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.location.Geofence
    public final String getRequestId() {
        return this.zza;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.zzd);
        long doubleToLongBits2 = Double.doubleToLongBits(this.zze);
        return ((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.zzf)) * 31) + this.zzc) * 31) + this.zzg;
    }

    public final String toString() {
        String str;
        Locale locale = Locale.US;
        Object[] objArr = new Object[9];
        short s = this.zzc;
        if (s != -1) {
            if (s != 1) {
                str = "UNKNOWN";
            } else {
                str = "CIRCLE";
            }
        } else {
            str = "INVALID";
        }
        objArr[0] = str;
        objArr[1] = this.zza.replaceAll("\\p{C}", "?");
        objArr[2] = Integer.valueOf(this.zzg);
        objArr[3] = Double.valueOf(this.zzd);
        objArr[4] = Double.valueOf(this.zze);
        objArr[5] = Float.valueOf(this.zzf);
        objArr[6] = Integer.valueOf(this.zzh / 1000);
        objArr[7] = Integer.valueOf(this.zzi);
        objArr[8] = Long.valueOf(this.zzb);
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", objArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeShort(parcel, 3, this.zzc);
        SafeParcelWriter.writeDouble(parcel, 4, this.zzd);
        SafeParcelWriter.writeDouble(parcel, 5, this.zze);
        SafeParcelWriter.writeFloat(parcel, 6, this.zzf);
        SafeParcelWriter.writeInt(parcel, 7, this.zzg);
        SafeParcelWriter.writeInt(parcel, 8, this.zzh);
        SafeParcelWriter.writeInt(parcel, 9, this.zzi);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
