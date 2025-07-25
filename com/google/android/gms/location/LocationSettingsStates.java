package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@SafeParcelable.Class(creator = "LocationSettingsStatesCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public final class LocationSettingsStates extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<LocationSettingsStates> CREATOR = new zzbn();
    @SafeParcelable.Field(getter = "isGpsUsable", m72314id = 1)
    private final boolean zza;
    @SafeParcelable.Field(getter = "isNetworkLocationUsable", m72314id = 2)
    private final boolean zzb;
    @SafeParcelable.Field(getter = "isBleUsable", m72314id = 3)
    private final boolean zzc;
    @SafeParcelable.Field(getter = "isGpsPresent", m72314id = 4)
    private final boolean zzd;
    @SafeParcelable.Field(getter = "isNetworkLocationPresent", m72314id = 5)
    private final boolean zze;
    @SafeParcelable.Field(getter = "isBlePresent", m72314id = 6)
    private final boolean zzf;

    @SafeParcelable.Constructor
    public LocationSettingsStates(@SafeParcelable.Param(m72313id = 1) boolean z, @SafeParcelable.Param(m72313id = 2) boolean z2, @SafeParcelable.Param(m72313id = 3) boolean z3, @SafeParcelable.Param(m72313id = 4) boolean z4, @SafeParcelable.Param(m72313id = 5) boolean z5, @SafeParcelable.Param(m72313id = 6) boolean z6) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = z3;
        this.zzd = z4;
        this.zze = z5;
        this.zzf = z6;
    }

    @Nullable
    public static LocationSettingsStates fromIntent(@NonNull Intent intent) {
        return (LocationSettingsStates) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.android.gms.location.LOCATION_SETTINGS_STATES", CREATOR);
    }

    public boolean isBlePresent() {
        return this.zzf;
    }

    public boolean isBleUsable() {
        return this.zzc;
    }

    public boolean isGpsPresent() {
        return this.zzd;
    }

    public boolean isGpsUsable() {
        return this.zza;
    }

    public boolean isLocationPresent() {
        if (!this.zzd && !this.zze) {
            return false;
        }
        return true;
    }

    public boolean isLocationUsable() {
        if (!this.zza && !this.zzb) {
            return false;
        }
        return true;
    }

    public boolean isNetworkLocationPresent() {
        return this.zze;
    }

    public boolean isNetworkLocationUsable() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, isGpsUsable());
        SafeParcelWriter.writeBoolean(parcel, 2, isNetworkLocationUsable());
        SafeParcelWriter.writeBoolean(parcel, 3, isBleUsable());
        SafeParcelWriter.writeBoolean(parcel, 4, isGpsPresent());
        SafeParcelWriter.writeBoolean(parcel, 5, isNetworkLocationPresent());
        SafeParcelWriter.writeBoolean(parcel, 6, isBlePresent());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
