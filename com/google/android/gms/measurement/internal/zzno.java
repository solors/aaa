package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
@SafeParcelable.Class(creator = "UserAttributeParcelCreator")
/* loaded from: classes5.dex */
public final class zzno extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzno> CREATOR = new zznn();
    @SafeParcelable.Field(m72314id = 2)
    public final String zza;
    @SafeParcelable.Field(m72314id = 3)
    public final long zzb;
    @Nullable
    @SafeParcelable.Field(m72314id = 4)
    public final Long zzc;
    @Nullable
    @SafeParcelable.Field(m72314id = 6)
    public final String zzd;
    @SafeParcelable.Field(m72314id = 7)
    public final String zze;
    @Nullable
    @SafeParcelable.Field(m72314id = 8)
    public final Double zzf;
    @SafeParcelable.Field(m72314id = 1)
    private final int zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzno(zznq zznqVar) {
        this(zznqVar.zzc, zznqVar.zzd, zznqVar.zze, zznqVar.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzg);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeLong(parcel, 3, this.zzb);
        SafeParcelWriter.writeLongObject(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeFloatObject(parcel, 5, null, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 7, this.zze, false);
        SafeParcelWriter.writeDoubleObject(parcel, 8, this.zzf, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Nullable
    public final Object zza() {
        Long l = this.zzc;
        if (l != null) {
            return l;
        }
        Double d = this.zzf;
        if (d != null) {
            return d;
        }
        String str = this.zzd;
        if (str != null) {
            return str;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzno(String str, long j, @Nullable Object obj, String str2) {
        Preconditions.checkNotEmpty(str);
        this.zzg = 2;
        this.zza = str;
        this.zzb = j;
        this.zze = str2;
        if (obj == null) {
            this.zzc = null;
            this.zzf = null;
            this.zzd = null;
        } else if (obj instanceof Long) {
            this.zzc = (Long) obj;
            this.zzf = null;
            this.zzd = null;
        } else if (obj instanceof String) {
            this.zzc = null;
            this.zzf = null;
            this.zzd = (String) obj;
        } else if (obj instanceof Double) {
            this.zzc = null;
            this.zzf = (Double) obj;
            this.zzd = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzno(@SafeParcelable.Param(m72313id = 1) int i, @SafeParcelable.Param(m72313id = 2) String str, @SafeParcelable.Param(m72313id = 3) long j, @Nullable @SafeParcelable.Param(m72313id = 4) Long l, @SafeParcelable.Param(m72313id = 5) Float f, @Nullable @SafeParcelable.Param(m72313id = 6) String str2, @SafeParcelable.Param(m72313id = 7) String str3, @Nullable @SafeParcelable.Param(m72313id = 8) Double d) {
        this.zzg = i;
        this.zza = str;
        this.zzb = j;
        this.zzc = l;
        if (i == 1) {
            this.zzf = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.zzf = d;
        }
        this.zzd = str2;
        this.zze = str3;
    }
}
