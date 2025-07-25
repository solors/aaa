package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-auth@@20.7.0 */
@SafeParcelable.Class(creator = "HintRequestCreator")
@Deprecated
/* loaded from: classes4.dex */
public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<HintRequest> CREATOR = new zbe();
    @SafeParcelable.Field(m72314id = 1000)
    final int zba;
    @SafeParcelable.Field(getter = "getHintPickerConfig", m72314id = 1)
    private final CredentialPickerConfig zbb;
    @SafeParcelable.Field(getter = "isEmailAddressIdentifierSupported", m72314id = 2)
    private final boolean zbc;
    @SafeParcelable.Field(getter = "isPhoneNumberIdentifierSupported", m72314id = 3)
    private final boolean zbd;
    @SafeParcelable.Field(getter = "getAccountTypes", m72314id = 4)
    private final String[] zbe;
    @SafeParcelable.Field(getter = "isIdTokenRequested", m72314id = 5)
    private final boolean zbf;
    @Nullable
    @SafeParcelable.Field(getter = "getServerClientId", m72314id = 6)
    private final String zbg;
    @Nullable
    @SafeParcelable.Field(getter = "getIdTokenNonce", m72314id = 7)
    private final String zbh;

    /* compiled from: com.google.android.gms:play-services-auth@@20.7.0 */
    /* loaded from: classes4.dex */
    public static final class Builder {
        private boolean zba;
        private boolean zbb;
        private String[] zbc;
        private CredentialPickerConfig zbd = new CredentialPickerConfig.Builder().build();
        private boolean zbe = false;
        @Nullable
        private String zbf;
        @Nullable
        private String zbg;

        @NonNull
        public HintRequest build() {
            if (this.zbc == null) {
                this.zbc = new String[0];
            }
            if (!this.zba && !this.zbb && this.zbc.length == 0) {
                throw new IllegalStateException("At least one authentication method must be specified");
            }
            return new HintRequest(2, this.zbd, this.zba, this.zbb, this.zbc, this.zbe, this.zbf, this.zbg);
        }

        @NonNull
        public Builder setAccountTypes(@NonNull String... strArr) {
            if (strArr == null) {
                strArr = new String[0];
            }
            this.zbc = strArr;
            return this;
        }

        @NonNull
        public Builder setEmailAddressIdentifierSupported(boolean z) {
            this.zba = z;
            return this;
        }

        @NonNull
        public Builder setHintPickerConfig(@NonNull CredentialPickerConfig credentialPickerConfig) {
            this.zbd = (CredentialPickerConfig) Preconditions.checkNotNull(credentialPickerConfig);
            return this;
        }

        @NonNull
        public Builder setIdTokenNonce(@Nullable String str) {
            this.zbg = str;
            return this;
        }

        @NonNull
        public Builder setIdTokenRequested(boolean z) {
            this.zbe = z;
            return this;
        }

        @NonNull
        public Builder setPhoneNumberIdentifierSupported(boolean z) {
            this.zbb = z;
            return this;
        }

        @NonNull
        public Builder setServerClientId(@Nullable String str) {
            this.zbf = str;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public HintRequest(@SafeParcelable.Param(m72313id = 1000) int i, @SafeParcelable.Param(m72313id = 1) CredentialPickerConfig credentialPickerConfig, @SafeParcelable.Param(m72313id = 2) boolean z, @SafeParcelable.Param(m72313id = 3) boolean z2, @SafeParcelable.Param(m72313id = 4) String[] strArr, @SafeParcelable.Param(m72313id = 5) boolean z3, @Nullable @SafeParcelable.Param(m72313id = 6) String str, @Nullable @SafeParcelable.Param(m72313id = 7) String str2) {
        this.zba = i;
        this.zbb = (CredentialPickerConfig) Preconditions.checkNotNull(credentialPickerConfig);
        this.zbc = z;
        this.zbd = z2;
        this.zbe = (String[]) Preconditions.checkNotNull(strArr);
        if (i < 2) {
            this.zbf = true;
            this.zbg = null;
            this.zbh = null;
            return;
        }
        this.zbf = z3;
        this.zbg = str;
        this.zbh = str2;
    }

    @NonNull
    public String[] getAccountTypes() {
        return this.zbe;
    }

    @NonNull
    public CredentialPickerConfig getHintPickerConfig() {
        return this.zbb;
    }

    @Nullable
    public String getIdTokenNonce() {
        return this.zbh;
    }

    @Nullable
    public String getServerClientId() {
        return this.zbg;
    }

    public boolean isEmailAddressIdentifierSupported() {
        return this.zbc;
    }

    public boolean isIdTokenRequested() {
        return this.zbf;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getHintPickerConfig(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 2, isEmailAddressIdentifierSupported());
        SafeParcelWriter.writeBoolean(parcel, 3, this.zbd);
        SafeParcelWriter.writeStringArray(parcel, 4, getAccountTypes(), false);
        SafeParcelWriter.writeBoolean(parcel, 5, isIdTokenRequested());
        SafeParcelWriter.writeString(parcel, 6, getServerClientId(), false);
        SafeParcelWriter.writeString(parcel, 7, getIdTokenNonce(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.zba);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
