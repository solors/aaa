package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@SafeParcelable.Class(creator = "DeviceOrientationRequestInternalCreator")
/* loaded from: classes5.dex */
public final class zzj extends AbstractSafeParcelable {
    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequestInternal.DEFAULT_DEVICE_ORIENTATION_REQUEST", m72314id = 1)
    final com.google.android.gms.location.zzs zzc;
    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequestInternal.DEFAULT_CLIENTS", m72314id = 2)
    final List<ClientIdentity> zzd;
    @Nullable
    @SafeParcelable.Field(defaultValueUnchecked = "null", m72314id = 3)
    final String zze;
    @VisibleForTesting
    static final List<ClientIdentity> zza = Collections.emptyList();
    static final com.google.android.gms.location.zzs zzb = new com.google.android.gms.location.zzs();
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzj(@SafeParcelable.Param(m72313id = 1) com.google.android.gms.location.zzs zzsVar, @SafeParcelable.Param(m72313id = 2) List<ClientIdentity> list, @SafeParcelable.Param(m72313id = 3) String str) {
        this.zzc = zzsVar;
        this.zzd = list;
        this.zze = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzjVar = (zzj) obj;
        if (!Objects.equal(this.zzc, zzjVar.zzc) || !Objects.equal(this.zzd, zzjVar.zzd) || !Objects.equal(this.zze, zzjVar.zze)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.zzc.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(this.zzd);
        String str = this.zze;
        int length = valueOf.length();
        StringBuilder sb2 = new StringBuilder(length + 77 + valueOf2.length() + String.valueOf(str).length());
        sb2.append("DeviceOrientationRequestInternal{deviceOrientationRequest=");
        sb2.append(valueOf);
        sb2.append(", clients=");
        sb2.append(valueOf2);
        sb2.append(", tag='");
        sb2.append(str);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zzc, i, false);
        SafeParcelWriter.writeTypedList(parcel, 2, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 3, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
