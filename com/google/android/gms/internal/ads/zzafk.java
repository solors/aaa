package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzafk implements zzax {
    public static final Parcelable.Creator<zzafk> CREATOR;
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;
    private int zzf;

    static {
        zzz zzzVar = new zzz();
        zzzVar.zzaa("application/id3");
        zzzVar.zzag();
        zzz zzzVar2 = new zzz();
        zzzVar2.zzaa("application/x-scte35");
        zzzVar2.zzag();
        CREATOR = new zzafj();
    }

    public zzafk(String str, String str2, long j, long j2, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafk.class == obj.getClass()) {
            zzafk zzafkVar = (zzafk) obj;
            if (this.zzc == zzafkVar.zzc && this.zzd == zzafkVar.zzd && Objects.equals(this.zza, zzafkVar.zza) && Objects.equals(this.zzb, zzafkVar.zzb) && Arrays.equals(this.zze, zzafkVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = this.zzf;
        if (i2 == 0) {
            String str = this.zza;
            int i3 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            String str2 = this.zzb;
            if (str2 != null) {
                i3 = str2.hashCode();
            }
            int i4 = i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
            long j = this.zzc;
            long j2 = this.zzd;
            int hashCode = (((((((i4 * 31) + i3) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.zze);
            this.zzf = hashCode;
            return hashCode;
        }
        return i2;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.zza + ", id=" + this.zzd + ", durationMs=" + this.zzc + ", value=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeByteArray(this.zze);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzafk(Parcel parcel) {
        String readString = parcel.readString();
        int i = zzei.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readLong();
        this.zzd = parcel.readLong();
        this.zze = parcel.createByteArray();
    }

    @Override // com.google.android.gms.internal.ads.zzax
    public final /* synthetic */ void zza(zzat zzatVar) {
    }
}
