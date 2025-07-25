package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@SafeParcelable.Class(creator = "BrowserPublicKeyCredentialRequestOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes4.dex */
public class BrowserPublicKeyCredentialRequestOptions extends BrowserRequestOptions {
    @NonNull
    public static final Parcelable.Creator<BrowserPublicKeyCredentialRequestOptions> CREATOR = new zzo();
    @NonNull
    @SafeParcelable.Field(getter = "getPublicKeyCredentialRequestOptions", m72314id = 2)
    private final PublicKeyCredentialRequestOptions zza;
    @NonNull
    @SafeParcelable.Field(getter = "getOrigin", m72314id = 3)
    private final Uri zzb;
    @Nullable
    @SafeParcelable.Field(getter = "getClientDataHash", m72314id = 4)
    private final byte[] zzc;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    /* loaded from: classes4.dex */
    public static final class Builder {
        private PublicKeyCredentialRequestOptions zza;
        private Uri zzb;
        private byte[] zzc;

        @NonNull
        public BrowserPublicKeyCredentialRequestOptions build() {
            return new BrowserPublicKeyCredentialRequestOptions(this.zza, this.zzb, this.zzc);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
            jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions.zzb(byte[]):byte[]
            	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:76)
            	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:51)
            Caused by: java.lang.NullPointerException
            */
        @androidx.annotation.NonNull
        public com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions.Builder setClientDataHash(@androidx.annotation.NonNull byte[] r1) {
            /*
                r0 = this;
                com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions.zzb(r1)
                r0.zzc = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions.Builder.setClientDataHash(byte[]):com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions$Builder");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
            jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions.zza(android.net.Uri):android.net.Uri
            	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:76)
            	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:51)
            Caused by: java.lang.NullPointerException
            */
        @androidx.annotation.NonNull
        public com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions.Builder setOrigin(@androidx.annotation.NonNull android.net.Uri r1) {
            /*
                r0 = this;
                com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions.zza(r1)
                r0.zzb = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions.Builder.setOrigin(android.net.Uri):com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions$Builder");
        }

        @NonNull
        public Builder setPublicKeyCredentialRequestOptions(@NonNull PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions) {
            this.zza = (PublicKeyCredentialRequestOptions) Preconditions.checkNotNull(publicKeyCredentialRequestOptions);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public BrowserPublicKeyCredentialRequestOptions(@NonNull @SafeParcelable.Param(m72313id = 2) PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, @NonNull @SafeParcelable.Param(m72313id = 3) Uri uri, @Nullable @SafeParcelable.Param(m72313id = 4) byte[] bArr) {
        this.zza = (PublicKeyCredentialRequestOptions) Preconditions.checkNotNull(publicKeyCredentialRequestOptions);
        zzc(uri);
        this.zzb = uri;
        zzd(bArr);
        this.zzc = bArr;
    }

    @NonNull
    public static BrowserPublicKeyCredentialRequestOptions deserializeFromBytes(@NonNull byte[] bArr) {
        return (BrowserPublicKeyCredentialRequestOptions) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    /*  JADX ERROR: NullPointerException in pass: MarkMethodsForInline
        java.lang.NullPointerException
        */
    static /* bridge */ /* synthetic */ android.net.Uri zza(android.net.Uri r0) {
        /*
            zzc(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions.zza(android.net.Uri):android.net.Uri");
    }

    /*  JADX ERROR: NullPointerException in pass: MarkMethodsForInline
        java.lang.NullPointerException
        */
    static /* bridge */ /* synthetic */ byte[] zzb(byte[] r0) {
        /*
            zzd(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions.zzb(byte[]):byte[]");
    }

    private static Uri zzc(Uri uri) {
        boolean z;
        Preconditions.checkNotNull(uri);
        boolean z2 = true;
        if (uri.getScheme() != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "origin scheme must be non-empty");
        if (uri.getAuthority() == null) {
            z2 = false;
        }
        Preconditions.checkArgument(z2, "origin authority must be non-empty");
        return uri;
    }

    private static byte[] zzd(byte[] bArr) {
        boolean z = true;
        if (bArr != null && bArr.length != 32) {
            z = false;
        }
        Preconditions.checkArgument(z, "clientDataHash must be 32 bytes long");
        return bArr;
    }

    public boolean equals(@NonNull Object obj) {
        if (!(obj instanceof BrowserPublicKeyCredentialRequestOptions)) {
            return false;
        }
        BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions = (BrowserPublicKeyCredentialRequestOptions) obj;
        if (!Objects.equal(this.zza, browserPublicKeyCredentialRequestOptions.zza) || !Objects.equal(this.zzb, browserPublicKeyCredentialRequestOptions.zzb)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @Nullable
    public AuthenticationExtensions getAuthenticationExtensions() {
        return this.zza.getAuthenticationExtensions();
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @NonNull
    public byte[] getChallenge() {
        return this.zza.getChallenge();
    }

    @Override // com.google.android.gms.fido.fido2.api.common.BrowserRequestOptions
    @Nullable
    public byte[] getClientDataHash() {
        return this.zzc;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.BrowserRequestOptions
    @NonNull
    public Uri getOrigin() {
        return this.zzb;
    }

    @NonNull
    public PublicKeyCredentialRequestOptions getPublicKeyCredentialRequestOptions() {
        return this.zza;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @Nullable
    public Integer getRequestId() {
        return this.zza.getRequestId();
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @Nullable
    public Double getTimeoutSeconds() {
        return this.zza.getTimeoutSeconds();
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @Nullable
    public TokenBinding getTokenBinding() {
        return this.zza.getTokenBinding();
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb);
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @NonNull
    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getPublicKeyCredentialRequestOptions(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, getOrigin(), i, false);
        SafeParcelWriter.writeByteArray(parcel, 4, getClientDataHash(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
