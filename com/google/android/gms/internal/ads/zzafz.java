package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzafz extends zzagh {
    public static final Parcelable.Creator<zzafz> CREATOR = new zzafy();
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzagh[] zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzafz(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i = zzei.zza;
        this.zza = readString;
        this.zzb = parcel.readByte() != 0;
        this.zzc = parcel.readByte() != 0;
        this.zzd = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.zze = new zzagh[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.zze[i2] = (zzagh) parcel.readParcelable(zzagh.class.getClassLoader());
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafz.class == obj.getClass()) {
            zzafz zzafzVar = (zzafz) obj;
            if (this.zzb == zzafzVar.zzb && this.zzc == zzafzVar.zzc && Objects.equals(this.zza, zzafzVar.zza) && Arrays.equals(this.zzd, zzafzVar.zzd) && Arrays.equals(this.zze, zzafzVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.zza;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return (((((this.zzb ? 1 : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (this.zzc ? 1 : 0)) * 31) + i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByte(this.zzb ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.zzc ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.zzd);
        parcel.writeInt(this.zze.length);
        for (zzagh zzaghVar : this.zze) {
            parcel.writeParcelable(zzaghVar, 0);
        }
    }

    public zzafz(String str, boolean z, boolean z2, String[] strArr, zzagh[] zzaghVarArr) {
        super("CTOC");
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = strArr;
        this.zze = zzaghVarArr;
    }
}
