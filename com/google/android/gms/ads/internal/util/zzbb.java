package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzfdk;
import com.google.android.gms.internal.ads.zzfve;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
@SafeParcelable.Class(creator = "ExceptionParcelCreator")
/* loaded from: classes4.dex */
public final class zzbb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbb> CREATOR = new zzbc();
    @SafeParcelable.Field(m72314id = 1)
    public final String zza;
    @SafeParcelable.Field(m72314id = 2)
    public final int zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzbb(@Nullable @SafeParcelable.Param(m72313id = 1) String str, @SafeParcelable.Param(m72313id = 2) int i) {
        this.zza = str == null ? "" : str;
        this.zzb = i;
    }

    public static zzbb zzb(Throwable th) {
        String message;
        com.google.android.gms.ads.internal.client.zze zza = zzfdk.zza(th);
        if (zzfve.zzd(th.getMessage())) {
            message = zza.zzb;
        } else {
            message = th.getMessage();
        }
        return new zzbb(message, zza.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzba zza() {
        return new zzba(this.zza, this.zzb);
    }
}
