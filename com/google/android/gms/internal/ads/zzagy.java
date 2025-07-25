package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzagy implements Parcelable {
    public static final Parcelable.Creator<zzagy> CREATOR = new zzagx();
    public final long zza;
    public final long zzb;
    public final int zzc;

    public zzagy(long j, long j2, int i) {
        boolean z;
        if (j < j2) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzd(z);
        this.zza = j;
        this.zzb = j2;
        this.zzc = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagy.class == obj.getClass()) {
            zzagy zzagyVar = (zzagy) obj;
            if (this.zza == zzagyVar.zza && this.zzb == zzagyVar.zzb && this.zzc == zzagyVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), Long.valueOf(this.zzb), Integer.valueOf(this.zzc)});
    }

    public final String toString() {
        return String.format(Locale.US, "Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.zza), Long.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.zza);
        parcel.writeLong(this.zzb);
        parcel.writeInt(this.zzc);
    }
}
