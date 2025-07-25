package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzay implements Parcelable {
    public static final Parcelable.Creator<zzay> CREATOR = new zzaw();
    public final long zza;
    private final zzax[] zzb;

    public zzay(long j, zzax... zzaxVarArr) {
        this.zza = j;
        this.zzb = zzaxVarArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzay.class == obj.getClass()) {
            zzay zzayVar = (zzay) obj;
            if (Arrays.equals(this.zzb, zzayVar.zzb) && this.zza == zzayVar.zza) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.zza;
        return (Arrays.hashCode(this.zzb) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String str;
        long j = this.zza;
        int i = (j > (-9223372036854775807L) ? 1 : (j == (-9223372036854775807L) ? 0 : -1));
        String arrays = Arrays.toString(this.zzb);
        if (i == 0) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        return "entries=" + arrays + str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zzb.length);
        for (zzax zzaxVar : this.zzb) {
            parcel.writeParcelable(zzaxVar, 0);
        }
        parcel.writeLong(this.zza);
    }

    public final int zza() {
        return this.zzb.length;
    }

    public final zzax zzb(int i) {
        return this.zzb[i];
    }

    public final zzay zzc(zzax... zzaxVarArr) {
        int length = zzaxVarArr.length;
        if (length == 0) {
            return this;
        }
        long j = this.zza;
        zzax[] zzaxVarArr2 = this.zzb;
        int i = zzei.zza;
        int length2 = zzaxVarArr2.length;
        Object[] copyOf = Arrays.copyOf(zzaxVarArr2, length2 + length);
        System.arraycopy(zzaxVarArr, 0, copyOf, length2, length);
        return new zzay(j, (zzax[]) copyOf);
    }

    public final zzay zzd(@Nullable zzay zzayVar) {
        if (zzayVar == null) {
            return this;
        }
        return zzc(zzayVar.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzay(Parcel parcel) {
        this.zzb = new zzax[parcel.readInt()];
        int i = 0;
        while (true) {
            zzax[] zzaxVarArr = this.zzb;
            if (i < zzaxVarArr.length) {
                zzaxVarArr[i] = (zzax) parcel.readParcelable(zzax.class.getClassLoader());
                i++;
            } else {
                this.zza = parcel.readLong();
                return;
            }
        }
    }

    public zzay(List list) {
        this(-9223372036854775807L, (zzax[]) list.toArray(new zzax[0]));
    }
}
