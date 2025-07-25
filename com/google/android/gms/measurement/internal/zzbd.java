package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
@SafeParcelable.Class(creator = "EventParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class zzbd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbd> CREATOR = new zzbg();
    @SafeParcelable.Field(m72314id = 2)
    public final String zza;
    @SafeParcelable.Field(m72314id = 3)
    public final zzbc zzb;
    @SafeParcelable.Field(m72314id = 4)
    public final String zzc;
    @SafeParcelable.Field(m72314id = 5)
    public final long zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbd(zzbd zzbdVar, long j) {
        Preconditions.checkNotNull(zzbdVar);
        this.zza = zzbdVar.zza;
        this.zzb = zzbdVar.zzb;
        this.zzc = zzbdVar.zzc;
        this.zzd = j;
    }

    public final String toString() {
        String str = this.zzc;
        String str2 = this.zza;
        String valueOf = String.valueOf(this.zzb);
        return "origin=" + str + ",name=" + str2 + ",params=" + valueOf;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzb, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeLong(parcel, 5, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzbd(@SafeParcelable.Param(m72313id = 2) String str, @SafeParcelable.Param(m72313id = 3) zzbc zzbcVar, @SafeParcelable.Param(m72313id = 4) String str2, @SafeParcelable.Param(m72313id = 5) long j) {
        this.zza = str;
        this.zzb = zzbcVar;
        this.zzc = str2;
        this.zzd = j;
    }
}
