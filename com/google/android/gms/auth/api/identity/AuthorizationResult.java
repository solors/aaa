package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-auth@@20.7.0 */
@SafeParcelable.Class(creator = "AuthorizationResultCreator")
/* loaded from: classes4.dex */
public final class AuthorizationResult extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<AuthorizationResult> CREATOR = new zbe();
    @Nullable
    @SafeParcelable.Field(getter = "getServerAuthCode", m72314id = 1)
    private final String zba;
    @Nullable
    @SafeParcelable.Field(getter = "getAccessToken", m72314id = 2)
    private final String zbb;
    @Nullable
    @SafeParcelable.Field(getter = "getIdToken", m72314id = 3)
    private final String zbc;
    @SafeParcelable.Field(getter = "getGrantedScopes", m72314id = 4)
    private final List zbd;
    @Nullable
    @SafeParcelable.Field(getter = "toGoogleSignInAccount", m72314id = 5)
    private final GoogleSignInAccount zbe;
    @Nullable
    @SafeParcelable.Field(getter = "getPendingIntent", m72314id = 6)
    private final PendingIntent zbf;

    @SafeParcelable.Constructor
    public AuthorizationResult(@Nullable @SafeParcelable.Param(m72313id = 1) String str, @Nullable @SafeParcelable.Param(m72313id = 2) String str2, @Nullable @SafeParcelable.Param(m72313id = 3) String str3, @NonNull @SafeParcelable.Param(m72313id = 4) List<String> list, @Nullable @SafeParcelable.Param(m72313id = 5) GoogleSignInAccount googleSignInAccount, @Nullable @SafeParcelable.Param(m72313id = 6) PendingIntent pendingIntent) {
        this.zba = str;
        this.zbb = str2;
        this.zbc = str3;
        this.zbd = (List) Preconditions.checkNotNull(list);
        this.zbf = pendingIntent;
        this.zbe = googleSignInAccount;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof AuthorizationResult)) {
            return false;
        }
        AuthorizationResult authorizationResult = (AuthorizationResult) obj;
        if (!Objects.equal(this.zba, authorizationResult.zba) || !Objects.equal(this.zbb, authorizationResult.zbb) || !Objects.equal(this.zbc, authorizationResult.zbc) || !Objects.equal(this.zbd, authorizationResult.zbd) || !Objects.equal(this.zbf, authorizationResult.zbf) || !Objects.equal(this.zbe, authorizationResult.zbe)) {
            return false;
        }
        return true;
    }

    @Nullable
    public String getAccessToken() {
        return this.zbb;
    }

    @NonNull
    public List<String> getGrantedScopes() {
        return this.zbd;
    }

    @Nullable
    public PendingIntent getPendingIntent() {
        return this.zbf;
    }

    @Nullable
    public String getServerAuthCode() {
        return this.zba;
    }

    public boolean hasResolution() {
        if (this.zbf != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.zba, this.zbb, this.zbc, this.zbd, this.zbf, this.zbe);
    }

    @Nullable
    public GoogleSignInAccount toGoogleSignInAccount() {
        return this.zbe;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getServerAuthCode(), false);
        SafeParcelWriter.writeString(parcel, 2, getAccessToken(), false);
        SafeParcelWriter.writeString(parcel, 3, this.zbc, false);
        SafeParcelWriter.writeStringList(parcel, 4, getGrantedScopes(), false);
        SafeParcelWriter.writeParcelable(parcel, 5, toGoogleSignInAccount(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, getPendingIntent(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
