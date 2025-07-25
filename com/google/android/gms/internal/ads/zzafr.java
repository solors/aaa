package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzafr implements zzax {
    public static final Parcelable.Creator<zzafr> CREATOR = new zzafq();
    public final int zza;
    @Nullable
    public final String zzb;
    @Nullable
    public final String zzc;
    @Nullable
    public final String zzd;
    public final boolean zze;
    public final int zzf;

    public zzafr(int i, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z, int i2) {
        boolean z2 = true;
        if (i2 != -1 && i2 <= 0) {
            z2 = false;
        }
        zzcw.zzd(z2);
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z;
        this.zzf = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafr.class == obj.getClass()) {
            zzafr zzafrVar = (zzafr) obj;
            if (this.zza == zzafrVar.zza && Objects.equals(this.zzb, zzafrVar.zzb) && Objects.equals(this.zzc, zzafrVar.zzc) && Objects.equals(this.zzd, zzafrVar.zzd) && this.zze == zzafrVar.zze && this.zzf == zzafrVar.zzf) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.zzb;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = this.zza;
        String str2 = this.zzc;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = ((i4 + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + i;
        String str3 = this.zzd;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return (((((((i5 * 31) + i2) * 31) + i3) * 31) + (this.zze ? 1 : 0)) * 31) + this.zzf;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.zzc + "\", genre=\"" + this.zzb + "\", bitrate=" + this.zza + ", metadataInterval=" + this.zzf;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeString(this.zzd);
        int i2 = zzei.zza;
        parcel.writeInt(this.zze ? 1 : 0);
        parcel.writeInt(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzax
    public final void zza(zzat zzatVar) {
        String str = this.zzc;
        if (str != null) {
            zzatVar.zzp(str);
        }
        String str2 = this.zzb;
        if (str2 != null) {
            zzatVar.zzi(str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzafr(Parcel parcel) {
        this.zza = parcel.readInt();
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
        this.zzd = parcel.readString();
        int i = zzei.zza;
        this.zze = parcel.readInt() != 0;
        this.zzf = parcel.readInt();
    }
}
