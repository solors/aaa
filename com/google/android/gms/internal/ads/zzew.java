package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzew implements zzax {
    public static final Parcelable.Creator<zzew> CREATOR = new zzeu();
    public final long zza;
    public final long zzb;
    public final long zzc;

    public zzew(long j, long j2, long j3) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = j3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzew)) {
            return false;
        }
        zzew zzewVar = (zzew) obj;
        if (this.zza == zzewVar.zza && this.zzb == zzewVar.zzb && this.zzc == zzewVar.zzc) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.zza;
        long j2 = this.zzc;
        long j3 = this.zzb;
        return ((((((int) (j ^ (j >>> 32))) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.zza + ", modification time=" + this.zzb + ", timescale=" + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.zza);
        parcel.writeLong(this.zzb);
        parcel.writeLong(this.zzc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzew(Parcel parcel, zzev zzevVar) {
        this.zza = parcel.readLong();
        this.zzb = parcel.readLong();
        this.zzc = parcel.readLong();
    }

    @Override // com.google.android.gms.internal.ads.zzax
    public final /* synthetic */ void zza(zzat zzatVar) {
    }
}
