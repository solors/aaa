package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-auth@@20.7.0 */
@SafeParcelable.Class(creator = "CredentialCreator")
@SafeParcelable.Reserved({1000, 1001, 1002})
@Deprecated
/* loaded from: classes4.dex */
public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<Credential> CREATOR = new zba();
    @NonNull
    public static final String EXTRA_KEY = "com.google.android.gms.credentials.Credential";
    @SafeParcelable.Field(getter = "getId", m72314id = 1)
    private final String zba;
    @Nullable
    @SafeParcelable.Field(getter = "getName", m72314id = 2)
    private final String zbb;
    @Nullable
    @SafeParcelable.Field(getter = "getProfilePictureUri", m72314id = 3)
    private final Uri zbc;
    @SafeParcelable.Field(getter = "getIdTokens", m72314id = 4)
    private final List zbd;
    @Nullable
    @SafeParcelable.Field(getter = "getPassword", m72314id = 5)
    private final String zbe;
    @Nullable
    @SafeParcelable.Field(getter = "getAccountType", m72314id = 6)
    private final String zbf;
    @Nullable
    @SafeParcelable.Field(getter = "getGivenName", m72314id = 9)
    private final String zbg;
    @Nullable
    @SafeParcelable.Field(getter = "getFamilyName", m72314id = 10)
    private final String zbh;

    /* compiled from: com.google.android.gms:play-services-auth@@20.7.0 */
    @Deprecated
    /* loaded from: classes4.dex */
    public static class Builder {
        private final String zba;
        @Nullable
        private String zbb;
        @Nullable
        private Uri zbc;
        private List zbd;
        @Nullable
        private String zbe;
        @Nullable
        private String zbf;
        @Nullable
        private String zbg;
        @Nullable
        private String zbh;

        public Builder(@NonNull String str) {
            this.zba = str;
        }

        @NonNull
        public Credential build() {
            return new Credential(this.zba, this.zbb, this.zbc, this.zbd, this.zbe, this.zbf, this.zbg, this.zbh);
        }

        @NonNull
        public Builder setAccountType(@NonNull String str) {
            this.zbf = str;
            return this;
        }

        @NonNull
        public Builder setName(@NonNull String str) {
            this.zbb = str;
            return this;
        }

        @NonNull
        public Builder setPassword(@Nullable String str) {
            this.zbe = str;
            return this;
        }

        @NonNull
        public Builder setProfilePictureUri(@NonNull Uri uri) {
            this.zbc = uri;
            return this;
        }

        public Builder(@NonNull Credential credential) {
            this.zba = credential.zba;
            this.zbb = credential.zbb;
            this.zbc = credential.zbc;
            this.zbd = credential.zbd;
            this.zbe = credential.zbe;
            this.zbf = credential.zbf;
            this.zbg = credential.zbg;
            this.zbh = credential.zbh;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public Credential(@SafeParcelable.Param(m72313id = 1) String str, @Nullable @SafeParcelable.Param(m72313id = 2) String str2, @Nullable @SafeParcelable.Param(m72313id = 3) Uri uri, @SafeParcelable.Param(m72313id = 4) List list, @Nullable @SafeParcelable.Param(m72313id = 5) String str3, @Nullable @SafeParcelable.Param(m72313id = 6) String str4, @Nullable @SafeParcelable.Param(m72313id = 9) String str5, @Nullable @SafeParcelable.Param(m72313id = 10) String str6) {
        List unmodifiableList;
        Boolean bool;
        String trim = ((String) Preconditions.checkNotNull(str, "credential identifier cannot be null")).trim();
        Preconditions.checkNotEmpty(trim, "credential identifier cannot be empty");
        if (str3 != null && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Password must not be empty if set");
        }
        if (str4 != null) {
            if (TextUtils.isEmpty(str4)) {
                bool = Boolean.FALSE;
            } else {
                Uri parse = Uri.parse(str4);
                if (parse.isAbsolute() && parse.isHierarchical() && !TextUtils.isEmpty(parse.getScheme()) && !TextUtils.isEmpty(parse.getAuthority())) {
                    boolean z = true;
                    if (!"http".equalsIgnoreCase(parse.getScheme()) && !"https".equalsIgnoreCase(parse.getScheme())) {
                        z = false;
                    }
                    bool = Boolean.valueOf(z);
                } else {
                    bool = Boolean.FALSE;
                }
            }
            if (!bool.booleanValue()) {
                throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
            }
        }
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        if (str2 != null && TextUtils.isEmpty(str2.trim())) {
            str2 = null;
        }
        this.zbb = str2;
        this.zbc = uri;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.zbd = unmodifiableList;
        this.zba = trim;
        this.zbe = str3;
        this.zbf = str4;
        this.zbg = str5;
        this.zbh = str6;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        if (TextUtils.equals(this.zba, credential.zba) && TextUtils.equals(this.zbb, credential.zbb) && Objects.equal(this.zbc, credential.zbc) && TextUtils.equals(this.zbe, credential.zbe) && TextUtils.equals(this.zbf, credential.zbf)) {
            return true;
        }
        return false;
    }

    @Nullable
    public String getAccountType() {
        return this.zbf;
    }

    @Nullable
    public String getFamilyName() {
        return this.zbh;
    }

    @Nullable
    public String getGivenName() {
        return this.zbg;
    }

    public String getId() {
        return this.zba;
    }

    public List<IdToken> getIdTokens() {
        return this.zbd;
    }

    @Nullable
    public String getName() {
        return this.zbb;
    }

    @Nullable
    public String getPassword() {
        return this.zbe;
    }

    @Nullable
    public Uri getProfilePictureUri() {
        return this.zbc;
    }

    public int hashCode() {
        return Objects.hashCode(this.zba, this.zbb, this.zbc, this.zbe, this.zbf);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getId(), false);
        SafeParcelWriter.writeString(parcel, 2, getName(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, getProfilePictureUri(), i, false);
        SafeParcelWriter.writeTypedList(parcel, 4, getIdTokens(), false);
        SafeParcelWriter.writeString(parcel, 5, getPassword(), false);
        SafeParcelWriter.writeString(parcel, 6, getAccountType(), false);
        SafeParcelWriter.writeString(parcel, 9, getGivenName(), false);
        SafeParcelWriter.writeString(parcel, 10, getFamilyName(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
