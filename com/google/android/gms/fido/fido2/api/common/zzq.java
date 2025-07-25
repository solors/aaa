package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@SafeParcelable.Class(creator = "CableAuthenticationDataCreator")
/* loaded from: classes4.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();
    @SafeParcelable.Field(getter = MobileAdsBridge.versionMethodName, m72314id = 1)
    private final long zza;
    @NonNull
    @SafeParcelable.Field(getter = "getClientEid", m72314id = 2)
    private final byte[] zzb;
    @NonNull
    @SafeParcelable.Field(getter = "getAuthenticatorEid", m72314id = 3)
    private final byte[] zzc;
    @NonNull
    @SafeParcelable.Field(getter = "getSessionPreKey", m72314id = 4)
    private final byte[] zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzq(@SafeParcelable.Param(m72313id = 1) long j, @NonNull @SafeParcelable.Param(m72313id = 2) byte[] bArr, @NonNull @SafeParcelable.Param(m72313id = 3) byte[] bArr2, @NonNull @SafeParcelable.Param(m72313id = 4) byte[] bArr3) {
        this.zza = j;
        this.zzb = (byte[]) Preconditions.checkNotNull(bArr);
        this.zzc = (byte[]) Preconditions.checkNotNull(bArr2);
        this.zzd = (byte[]) Preconditions.checkNotNull(bArr3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzq)) {
            return false;
        }
        zzq zzqVar = (zzq) obj;
        if (this.zza != zzqVar.zza || !Arrays.equals(this.zzb, zzqVar.zzb) || !Arrays.equals(this.zzc, zzqVar.zzc) || !Arrays.equals(this.zzd, zzqVar.zzd)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zza), this.zzb, this.zzc, this.zzd);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.zza);
        SafeParcelWriter.writeByteArray(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeByteArray(parcel, 4, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
