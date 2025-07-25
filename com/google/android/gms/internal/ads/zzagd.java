package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzagd extends zzagh {
    public static final Parcelable.Creator<zzagd> CREATOR = new zzagc();
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzagd(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i = zzei.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
        this.zzd = parcel.createByteArray();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagd.class == obj.getClass()) {
            zzagd zzagdVar = (zzagd) obj;
            if (Objects.equals(this.zza, zzagdVar.zza) && Objects.equals(this.zzb, zzagdVar.zzb) && Objects.equals(this.zzc, zzagdVar.zzc) && Arrays.equals(this.zzd, zzagdVar.zzd)) {
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
        return (((((i4 * 31) + i2) * 31) + i3) * 31) + Arrays.hashCode(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final String toString() {
        return this.zzf + ": mimeType=" + this.zza + ", filename=" + this.zzb + ", description=" + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    public zzagd(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = bArr;
    }
}
