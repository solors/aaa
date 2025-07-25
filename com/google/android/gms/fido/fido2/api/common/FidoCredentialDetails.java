package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@SafeParcelable.Class(creator = "FidoCredentialDetailsCreator")
/* loaded from: classes4.dex */
public class FidoCredentialDetails extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<FidoCredentialDetails> CREATOR = new zzy();
    @Nullable
    @SafeParcelable.Field(getter = "getUserName", m72314id = 1)
    private final String zza;
    @Nullable
    @SafeParcelable.Field(getter = "getUserDisplayName", m72314id = 2)
    private final String zzb;
    @Nullable
    @SafeParcelable.Field(getter = "getUserId", m72314id = 3)
    private final byte[] zzc;
    @NonNull
    @SafeParcelable.Field(getter = "getCredentialId", m72314id = 4)
    private final byte[] zzd;
    @SafeParcelable.Field(getter = "getIsDiscoverable", m72314id = 5)
    private final boolean zze;
    @SafeParcelable.Field(getter = "getIsPaymentCredential", m72314id = 6)
    private final boolean zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public FidoCredentialDetails(@Nullable @SafeParcelable.Param(m72313id = 1) String str, @Nullable @SafeParcelable.Param(m72313id = 2) String str2, @Nullable @SafeParcelable.Param(m72313id = 3) byte[] bArr, @NonNull @SafeParcelable.Param(m72313id = 4) byte[] bArr2, @SafeParcelable.Param(m72313id = 5) boolean z, @SafeParcelable.Param(m72313id = 6) boolean z2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = bArr;
        this.zzd = bArr2;
        this.zze = z;
        this.zzf = z2;
    }

    @NonNull
    public static FidoCredentialDetails deserializeFromBytes(@NonNull byte[] bArr) {
        return (FidoCredentialDetails) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof FidoCredentialDetails)) {
            return false;
        }
        FidoCredentialDetails fidoCredentialDetails = (FidoCredentialDetails) obj;
        if (!Objects.equal(this.zza, fidoCredentialDetails.zza) || !Objects.equal(this.zzb, fidoCredentialDetails.zzb) || !Arrays.equals(this.zzc, fidoCredentialDetails.zzc) || !Arrays.equals(this.zzd, fidoCredentialDetails.zzd) || this.zze != fidoCredentialDetails.zze || this.zzf != fidoCredentialDetails.zzf) {
            return false;
        }
        return true;
    }

    @NonNull
    public byte[] getCredentialId() {
        return this.zzd;
    }

    public boolean getIsDiscoverable() {
        return this.zze;
    }

    public boolean getIsPaymentCredential() {
        return this.zzf;
    }

    @Nullable
    public String getUserDisplayName() {
        return this.zzb;
    }

    @Nullable
    public byte[] getUserId() {
        return this.zzc;
    }

    @Nullable
    public String getUserName() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, Boolean.valueOf(this.zze), Boolean.valueOf(this.zzf));
    }

    @NonNull
    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getUserName(), false);
        SafeParcelWriter.writeString(parcel, 2, getUserDisplayName(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, getUserId(), false);
        SafeParcelWriter.writeByteArray(parcel, 4, getCredentialId(), false);
        SafeParcelWriter.writeBoolean(parcel, 5, getIsDiscoverable());
        SafeParcelWriter.writeBoolean(parcel, 6, getIsPaymentCredential());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
