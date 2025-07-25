package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.internal.Validate;
import com.facebook.internal.security.OidcSecurityUtil;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AuthenticationToken.kt */
@Metadata
/* loaded from: classes3.dex */
public final class AuthenticationToken implements Parcelable {
    @NotNull
    public static final String AUTHENTICATION_TOKEN_KEY = "id_token";
    @NotNull
    private static final String CLAIMS_KEY = "claims";
    @NotNull
    private static final String EXPECTED_NONCE_KEY = "expected_nonce";
    @NotNull
    private static final String HEADER_KEY = "header";
    @NotNull
    private static final String SIGNATURE_KEY = "signature";
    @NotNull
    private static final String TOKEN_STRING_KEY = "token_string";
    @NotNull
    private final AuthenticationTokenClaims claims;
    @NotNull
    private final String expectedNonce;
    @NotNull
    private final AuthenticationTokenHeader header;
    @NotNull
    private final String signature;
    @NotNull
    private final String token;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final Parcelable.Creator<AuthenticationToken> CREATOR = new Parcelable.Creator<AuthenticationToken>() { // from class: com.facebook.AuthenticationToken$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        @NotNull
        public AuthenticationToken createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new AuthenticationToken(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public AuthenticationToken[] newArray(int i) {
            return new AuthenticationToken[i];
        }
    };

    /* compiled from: AuthenticationToken.kt */
    @Metadata
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final AuthenticationToken getCurrentAuthenticationToken() {
            return AuthenticationTokenManager.Companion.getInstance().getCurrentAuthenticationToken();
        }

        public final void setCurrentAuthenticationToken(@Nullable AuthenticationToken authenticationToken) {
            AuthenticationTokenManager.Companion.getInstance().setCurrentAuthenticationToken(authenticationToken);
        }
    }

    public AuthenticationToken(@NotNull String token, @NotNull String expectedNonce) {
        List m16611C0;
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(expectedNonce, "expectedNonce");
        Validate.notEmpty(token, "token");
        Validate.notEmpty(expectedNonce, "expectedNonce");
        m16611C0 = C37690r.m16611C0(token, new String[]{"."}, false, 0, 6, null);
        if (m16611C0.size() == 3) {
            String str = (String) m16611C0.get(0);
            String str2 = (String) m16611C0.get(1);
            String str3 = (String) m16611C0.get(2);
            this.token = token;
            this.expectedNonce = expectedNonce;
            AuthenticationTokenHeader authenticationTokenHeader = new AuthenticationTokenHeader(str);
            this.header = authenticationTokenHeader;
            this.claims = new AuthenticationTokenClaims(str2, expectedNonce);
            if (isValidSignature(str, str2, str3, authenticationTokenHeader.getKid())) {
                this.signature = str3;
                return;
            }
            throw new IllegalArgumentException("Invalid Signature".toString());
        }
        throw new IllegalArgumentException("Invalid IdToken string".toString());
    }

    @Nullable
    public static final AuthenticationToken getCurrentAuthenticationToken() {
        return Companion.getCurrentAuthenticationToken();
    }

    private final boolean isValidSignature(String str, String str2, String str3, String str4) {
        try {
            String rawKeyFromEndPoint = OidcSecurityUtil.getRawKeyFromEndPoint(str4);
            if (rawKeyFromEndPoint == null) {
                return false;
            }
            PublicKey publicKeyFromString = OidcSecurityUtil.getPublicKeyFromString(rawKeyFromEndPoint);
            return OidcSecurityUtil.verify(publicKeyFromString, str + '.' + str2, str3);
        } catch (IOException | InvalidKeySpecException unused) {
            return false;
        }
    }

    public static final void setCurrentAuthenticationToken(@Nullable AuthenticationToken authenticationToken) {
        Companion.setCurrentAuthenticationToken(authenticationToken);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationToken)) {
            return false;
        }
        AuthenticationToken authenticationToken = (AuthenticationToken) obj;
        if (Intrinsics.m17075f(this.token, authenticationToken.token) && Intrinsics.m17075f(this.expectedNonce, authenticationToken.expectedNonce) && Intrinsics.m17075f(this.header, authenticationToken.header) && Intrinsics.m17075f(this.claims, authenticationToken.claims) && Intrinsics.m17075f(this.signature, authenticationToken.signature)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final AuthenticationTokenClaims getClaims() {
        return this.claims;
    }

    @NotNull
    public final String getExpectedNonce() {
        return this.expectedNonce;
    }

    @NotNull
    public final AuthenticationTokenHeader getHeader() {
        return this.header;
    }

    @NotNull
    public final String getSignature() {
        return this.signature;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.token.hashCode()) * 31) + this.expectedNonce.hashCode()) * 31) + this.header.hashCode()) * 31) + this.claims.hashCode()) * 31) + this.signature.hashCode();
    }

    @NotNull
    public final JSONObject toJSONObject$facebook_core_release() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TOKEN_STRING_KEY, this.token);
        jSONObject.put(EXPECTED_NONCE_KEY, this.expectedNonce);
        jSONObject.put(HEADER_KEY, this.header.toJSONObject$facebook_core_release());
        jSONObject.put(CLAIMS_KEY, this.claims.toJSONObject$facebook_core_release());
        jSONObject.put("signature", this.signature);
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.token);
        dest.writeString(this.expectedNonce);
        dest.writeParcelable(this.header, i);
        dest.writeParcelable(this.claims, i);
        dest.writeString(this.signature);
    }

    public AuthenticationToken(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.token = Validate.notNullOrEmpty(parcel.readString(), "token");
        this.expectedNonce = Validate.notNullOrEmpty(parcel.readString(), "expectedNonce");
        Parcelable readParcelable = parcel.readParcelable(AuthenticationTokenHeader.class.getClassLoader());
        if (readParcelable != null) {
            this.header = (AuthenticationTokenHeader) readParcelable;
            Parcelable readParcelable2 = parcel.readParcelable(AuthenticationTokenClaims.class.getClassLoader());
            if (readParcelable2 != null) {
                this.claims = (AuthenticationTokenClaims) readParcelable2;
                this.signature = Validate.notNullOrEmpty(parcel.readString(), "signature");
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public AuthenticationToken(@NotNull JSONObject jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        String string = jsonObject.getString(TOKEN_STRING_KEY);
        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(TOKEN_STRING_KEY)");
        this.token = string;
        String string2 = jsonObject.getString(EXPECTED_NONCE_KEY);
        Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.getString(EXPECTED_NONCE_KEY)");
        this.expectedNonce = string2;
        String string3 = jsonObject.getString("signature");
        Intrinsics.checkNotNullExpressionValue(string3, "jsonObject.getString(SIGNATURE_KEY)");
        this.signature = string3;
        JSONObject headerJSONObject = jsonObject.getJSONObject(HEADER_KEY);
        JSONObject claimsJSONObject = jsonObject.getJSONObject(CLAIMS_KEY);
        Intrinsics.checkNotNullExpressionValue(headerJSONObject, "headerJSONObject");
        this.header = new AuthenticationTokenHeader(headerJSONObject);
        AuthenticationTokenClaims.Companion companion = AuthenticationTokenClaims.Companion;
        Intrinsics.checkNotNullExpressionValue(claimsJSONObject, "claimsJSONObject");
        this.claims = companion.createFromJSONObject$facebook_core_release(claimsJSONObject);
    }
}
