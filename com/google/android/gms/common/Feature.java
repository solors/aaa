package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
@SafeParcelable.Class(creator = "FeatureCreator")
/* loaded from: classes4.dex */
public class Feature extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<Feature> CREATOR = new zzc();
    @SafeParcelable.Field(getter = "getName", m72314id = 1)
    private final String zza;
    @SafeParcelable.Field(getter = "getOldVersion", m72314id = 2)
    @Deprecated
    private final int zzb;
    @SafeParcelable.Field(defaultValue = "-1", getter = MobileAdsBridge.versionMethodName, m72314id = 3)
    private final long zzc;

    @SafeParcelable.Constructor
    public Feature(@NonNull @SafeParcelable.Param(m72313id = 1) String str, @SafeParcelable.Param(m72313id = 2) int i, @SafeParcelable.Param(m72313id = 3) long j) {
        this.zza = str;
        this.zzb = i;
        this.zzc = j;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (((getName() != null && getName().equals(feature.getName())) || (getName() == null && feature.getName() == null)) && getVersion() == feature.getVersion()) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    @KeepForSdk
    public String getName() {
        return this.zza;
    }

    @KeepForSdk
    public long getVersion() {
        long j = this.zzc;
        if (j == -1) {
            return this.zzb;
        }
        return j;
    }

    public final int hashCode() {
        return Objects.hashCode(getName(), Long.valueOf(getVersion()));
    }

    @NonNull
    public final String toString() {
        Objects.ToStringHelper stringHelper = Objects.toStringHelper(this);
        stringHelper.add("name", getName());
        stringHelper.add("version", Long.valueOf(getVersion()));
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getName(), false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeLong(parcel, 3, getVersion());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @KeepForSdk
    public Feature(@NonNull String str, long j) {
        this.zza = str;
        this.zzc = j;
        this.zzb = -1;
    }
}
