package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzt implements Parcelable {
    public static final Parcelable.Creator<zzt> CREATOR = new zzs();
    public final UUID zza;
    @Nullable
    public final String zzb;
    public final String zzc;
    @Nullable
    public final byte[] zzd;
    private int zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzt(Parcel parcel) {
        this.zza = new UUID(parcel.readLong(), parcel.readLong());
        this.zzb = parcel.readString();
        String readString = parcel.readString();
        int i = zzei.zza;
        this.zzc = readString;
        this.zzd = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof zzt)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zzt zztVar = (zzt) obj;
        if (!Objects.equals(this.zzb, zztVar.zzb) || !Objects.equals(this.zzc, zztVar.zzc) || !Objects.equals(this.zza, zztVar.zza) || !Arrays.equals(this.zzd, zztVar.zzd)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i = this.zze;
        if (i == 0) {
            int hashCode2 = this.zza.hashCode() * 31;
            String str = this.zzb;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int hashCode3 = ((((hashCode2 + hashCode) * 31) + this.zzc.hashCode()) * 31) + Arrays.hashCode(this.zzd);
            this.zze = hashCode3;
            return hashCode3;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.zza.getMostSignificantBits());
        parcel.writeLong(this.zza.getLeastSignificantBits());
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    public zzt(UUID uuid, @Nullable String str, String str2, @Nullable byte[] bArr) {
        uuid.getClass();
        this.zza = uuid;
        this.zzb = null;
        this.zzc = zzbb.zze(str2);
        this.zzd = bArr;
    }
}
