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

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@SafeParcelable.Class(creator = "AuthenticationExtensionsClientOutputsCreator")
/* loaded from: classes4.dex */
public class AuthenticationExtensionsClientOutputs extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<AuthenticationExtensionsClientOutputs> CREATOR = new zzc();
    @Nullable
    @SafeParcelable.Field(getter = "getUvmEntries", m72314id = 1)
    private final UvmEntries zza;
    @Nullable
    @SafeParcelable.Field(getter = "getDevicePubKey", m72314id = 2)
    private final zzf zzb;
    @Nullable
    @SafeParcelable.Field(getter = "getCredProps", m72314id = 3)
    private final AuthenticationExtensionsCredPropsOutputs zzc;
    @Nullable
    @SafeParcelable.Field(getter = "getPrf", m72314id = 4)
    private final zzh zzd;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    /* loaded from: classes4.dex */
    public static final class Builder {
        @Nullable
        private UvmEntries zza;
        @Nullable
        private AuthenticationExtensionsCredPropsOutputs zzb;

        @NonNull
        public AuthenticationExtensionsClientOutputs build() {
            return new AuthenticationExtensionsClientOutputs(this.zza, null, this.zzb, null);
        }

        @NonNull
        public Builder setCredProps(@Nullable AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs) {
            this.zzb = authenticationExtensionsCredPropsOutputs;
            return this;
        }

        @NonNull
        public Builder setUserVerificationMethodEntries(@Nullable UvmEntries uvmEntries) {
            this.zza = uvmEntries;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public AuthenticationExtensionsClientOutputs(@Nullable @SafeParcelable.Param(m72313id = 1) UvmEntries uvmEntries, @Nullable @SafeParcelable.Param(m72313id = 2) zzf zzfVar, @Nullable @SafeParcelable.Param(m72313id = 3) AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs, @Nullable @SafeParcelable.Param(m72313id = 4) zzh zzhVar) {
        this.zza = uvmEntries;
        this.zzb = zzfVar;
        this.zzc = authenticationExtensionsCredPropsOutputs;
        this.zzd = zzhVar;
    }

    @NonNull
    public static AuthenticationExtensionsClientOutputs deserializeFromBytes(@NonNull byte[] bArr) {
        return (AuthenticationExtensionsClientOutputs) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof AuthenticationExtensionsClientOutputs)) {
            return false;
        }
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) obj;
        if (!Objects.equal(this.zza, authenticationExtensionsClientOutputs.zza) || !Objects.equal(this.zzb, authenticationExtensionsClientOutputs.zzb) || !Objects.equal(this.zzc, authenticationExtensionsClientOutputs.zzc) || !Objects.equal(this.zzd, authenticationExtensionsClientOutputs.zzd)) {
            return false;
        }
        return true;
    }

    @Nullable
    public AuthenticationExtensionsCredPropsOutputs getCredProps() {
        return this.zzc;
    }

    @Nullable
    public UvmEntries getUvmEntries() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @NonNull
    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getUvmEntries(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, getCredProps(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
