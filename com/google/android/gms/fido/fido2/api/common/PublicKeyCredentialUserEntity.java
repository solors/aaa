package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@SafeParcelable.Class(creator = "PublicKeyCredentialUserEntityCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes4.dex */
public class PublicKeyCredentialUserEntity extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialUserEntity> CREATOR = new zzar();
    @NonNull
    @SafeParcelable.Field(getter = "getId", m72314id = 2)
    private final byte[] zza;
    @NonNull
    @SafeParcelable.Field(getter = "getName", m72314id = 3)
    private final String zzb;
    @Nullable
    @SafeParcelable.Field(getter = "getIcon", m72314id = 4)
    private final String zzc;
    @NonNull
    @SafeParcelable.Field(getter = "getDisplayName", m72314id = 5)
    private final String zzd;

    @SafeParcelable.Constructor
    public PublicKeyCredentialUserEntity(@NonNull @SafeParcelable.Param(m72313id = 2) byte[] bArr, @NonNull @SafeParcelable.Param(m72313id = 3) String str, @NonNull @SafeParcelable.Param(m72313id = 4) String str2, @NonNull @SafeParcelable.Param(m72313id = 5) String str3) {
        this.zza = (byte[]) Preconditions.checkNotNull(bArr);
        this.zzb = (String) Preconditions.checkNotNull(str);
        this.zzc = str2;
        this.zzd = (String) Preconditions.checkNotNull(str3);
    }

    public boolean equals(@NonNull Object obj) {
        if (!(obj instanceof PublicKeyCredentialUserEntity)) {
            return false;
        }
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) obj;
        if (!Arrays.equals(this.zza, publicKeyCredentialUserEntity.zza) || !Objects.equal(this.zzb, publicKeyCredentialUserEntity.zzb) || !Objects.equal(this.zzc, publicKeyCredentialUserEntity.zzc) || !Objects.equal(this.zzd, publicKeyCredentialUserEntity.zzd)) {
            return false;
        }
        return true;
    }

    @NonNull
    public String getDisplayName() {
        return this.zzd;
    }

    @Nullable
    public String getIcon() {
        return this.zzc;
    }

    @NonNull
    public byte[] getId() {
        return this.zza;
    }

    @NonNull
    public String getName() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, getId(), false);
        SafeParcelWriter.writeString(parcel, 3, getName(), false);
        SafeParcelWriter.writeString(parcel, 4, getIcon(), false);
        SafeParcelWriter.writeString(parcel, 5, getDisplayName(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
