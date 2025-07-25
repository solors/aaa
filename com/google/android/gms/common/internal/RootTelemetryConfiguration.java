package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
@SafeParcelable.Class(creator = "RootTelemetryConfigurationCreator")
/* loaded from: classes4.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new zzaj();
    @SafeParcelable.Field(getter = MobileAdsBridge.versionMethodName, m72314id = 1)
    private final int zza;
    @SafeParcelable.Field(getter = "getMethodInvocationTelemetryEnabled", m72314id = 2)
    private final boolean zzb;
    @SafeParcelable.Field(getter = "getMethodTimingTelemetryEnabled", m72314id = 3)
    private final boolean zzc;
    @SafeParcelable.Field(getter = "getBatchPeriodMillis", m72314id = 4)
    private final int zzd;
    @SafeParcelable.Field(getter = "getMaxMethodInvocationsInBatch", m72314id = 5)
    private final int zze;

    @SafeParcelable.Constructor
    public RootTelemetryConfiguration(@SafeParcelable.Param(m72313id = 1) int i, @SafeParcelable.Param(m72313id = 2) boolean z, @SafeParcelable.Param(m72313id = 3) boolean z2, @SafeParcelable.Param(m72313id = 4) int i2, @SafeParcelable.Param(m72313id = 5) int i3) {
        this.zza = i;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = i2;
        this.zze = i3;
    }

    @KeepForSdk
    public int getBatchPeriodMillis() {
        return this.zzd;
    }

    @KeepForSdk
    public int getMaxMethodInvocationsInBatch() {
        return this.zze;
    }

    @KeepForSdk
    public boolean getMethodInvocationTelemetryEnabled() {
        return this.zzb;
    }

    @KeepForSdk
    public boolean getMethodTimingTelemetryEnabled() {
        return this.zzc;
    }

    @KeepForSdk
    public int getVersion() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getVersion());
        SafeParcelWriter.writeBoolean(parcel, 2, getMethodInvocationTelemetryEnabled());
        SafeParcelWriter.writeBoolean(parcel, 3, getMethodTimingTelemetryEnabled());
        SafeParcelWriter.writeInt(parcel, 4, getBatchPeriodMillis());
        SafeParcelWriter.writeInt(parcel, 5, getMaxMethodInvocationsInBatch());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
