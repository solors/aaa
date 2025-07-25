package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
@SafeParcelable.Class(creator = "LiteSdkVersionsParcelCreator")
/* loaded from: classes4.dex */
public final class zzfb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfb> CREATOR = new zzfc();
    @SafeParcelable.Field(getter = "getAdsDynamiteVersion", m72314id = 1)
    private final int zza;
    @SafeParcelable.Field(getter = "getSdkVersionLite", m72314id = 2)
    private final int zzb;
    @SafeParcelable.Field(getter = "getGranularVersion", m72314id = 3)
    private final String zzc;

    public zzfb() {
        this(ModuleDescriptor.MODULE_VERSION, 244410000, "23.6.0");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zzc;
    }

    @SafeParcelable.Constructor
    public zzfb(@SafeParcelable.Param(m72313id = 1) int i, @SafeParcelable.Param(m72313id = 2) int i2, @SafeParcelable.Param(m72313id = 3) String str) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = str;
    }
}
