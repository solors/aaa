package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzafx extends zzagh {
    public static final Parcelable.Creator<zzafx> CREATOR = new zzafw();
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzagh[] zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzafx(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i = zzei.zza;
        this.zza = readString;
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
        int readInt = parcel.readInt();
        this.zzg = new zzagh[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.zzg[i2] = (zzagh) parcel.readParcelable(zzagh.class.getClassLoader());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagh, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafx.class == obj.getClass()) {
            zzafx zzafxVar = (zzafx) obj;
            if (this.zzb == zzafxVar.zzb && this.zzc == zzafxVar.zzc && this.zzd == zzafxVar.zzd && this.zze == zzafxVar.zze && Objects.equals(this.zza, zzafxVar.zza) && Arrays.equals(this.zzg, zzafxVar.zzg)) {
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
        int i2 = this.zzb;
        return ((((((((i2 + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) this.zze)) * 31) + i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
        parcel.writeInt(this.zzg.length);
        for (zzagh zzaghVar : this.zzg) {
            parcel.writeParcelable(zzaghVar, 0);
        }
    }

    public zzafx(String str, int i, int i2, long j, long j2, zzagh[] zzaghVarArr) {
        super("CHAP");
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j;
        this.zze = j2;
        this.zzg = zzaghVarArr;
    }
}
