package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
@SafeParcelable.Class(creator = "DeviceMetaDataCreator")
/* loaded from: classes4.dex */
public class DeviceMetaData extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<DeviceMetaData> CREATOR = new zzy();
    @SafeParcelable.VersionField(m72311id = 1)
    final int zza;
    @SafeParcelable.Field(getter = "isLockScreenSolved", m72314id = 2)
    private boolean zzb;
    @SafeParcelable.Field(getter = "getMinAgeOfLockScreen", m72314id = 3)
    private long zzc;
    @SafeParcelable.Field(getter = "isChallengeAllowed", m72314id = 4)
    private final boolean zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public DeviceMetaData(@SafeParcelable.Param(m72313id = 1) int i, @SafeParcelable.Param(m72313id = 2) boolean z, @SafeParcelable.Param(m72313id = 3) long j, @SafeParcelable.Param(m72313id = 4) boolean z2) {
        this.zza = i;
        this.zzb = z;
        this.zzc = j;
        this.zzd = z2;
    }

    public long getMinAgeOfLockScreen() {
        return this.zzc;
    }

    public boolean isChallengeAllowed() {
        return this.zzd;
    }

    public boolean isLockScreenSolved() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeBoolean(parcel, 2, isLockScreenSolved());
        SafeParcelWriter.writeLong(parcel, 3, getMinAgeOfLockScreen());
        SafeParcelWriter.writeBoolean(parcel, 4, isChallengeAllowed());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
