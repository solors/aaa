package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzagk extends zzagh {
    public static final Parcelable.Creator<zzagk> CREATOR = new zzagj();
    public final String zza;
    public final String zzb;
    public final String zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzagk(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i = zzei.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagk.class == obj.getClass()) {
            zzagk zzagkVar = (zzagk) obj;
            if (Objects.equals(this.zzb, zzagkVar.zzb) && Objects.equals(this.zza, zzagkVar.zza) && Objects.equals(this.zzc, zzagkVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.zza;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        String str2 = this.zzb;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        String str3 = this.zzc;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return (((i4 * 31) + i2) * 31) + i3;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final String toString() {
        return this.zzf + ": domain=" + this.zza + ", description=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzc);
    }

    public zzagk(String str, String str2, String str3) {
        super("----");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }
}
