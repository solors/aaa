package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
@SafeParcelable.Class(creator = "NotifyCompletionRequestCreator")
/* loaded from: classes5.dex */
public final class zzav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzav> CREATOR = new zzaw();
    @SafeParcelable.VersionField(m72311id = 1)
    final int zza;
    @SafeParcelable.Field(m72314id = 2)
    public final String zzb;
    @SafeParcelable.Field(m72314id = 3)
    public final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzav(@SafeParcelable.Param(m72313id = 1) int i, @SafeParcelable.Param(m72313id = 2) String str, @SafeParcelable.Param(m72313id = 3) int i2) {
        this.zza = 1;
        this.zzb = (String) Preconditions.checkNotNull(str);
        this.zzc = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzav(String str, int i) {
        this(1, str, i);
    }
}
