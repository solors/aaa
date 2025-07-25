package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import com.facebook.internal.Validate;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AuthenticationTokenHeader.kt */
@Metadata
/* loaded from: classes3.dex */
public final class AuthenticationTokenHeader implements Parcelable {
    @NotNull
    private final String alg;
    @NotNull
    private final String kid;
    @NotNull
    private final String typ;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final Parcelable.Creator<AuthenticationTokenHeader> CREATOR = new Parcelable.Creator<AuthenticationTokenHeader>() { // from class: com.facebook.AuthenticationTokenHeader$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public AuthenticationTokenHeader createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new AuthenticationTokenHeader(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public AuthenticationTokenHeader[] newArray(int i) {
            return new AuthenticationTokenHeader[i];
        }
    };

    /* compiled from: AuthenticationTokenHeader.kt */
    @Metadata
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AuthenticationTokenHeader(@NotNull String encodedHeaderString) {
        Intrinsics.checkNotNullParameter(encodedHeaderString, "encodedHeaderString");
        if (isValidHeader(encodedHeaderString)) {
            byte[] decodedBytes = Base64.decode(encodedHeaderString, 0);
            Intrinsics.checkNotNullExpressionValue(decodedBytes, "decodedBytes");
            JSONObject jSONObject = new JSONObject(new String(decodedBytes, Charsets.UTF_8));
            String string = jSONObject.getString("alg");
            Intrinsics.checkNotNullExpressionValue(string, "jsonObj.getString(\"alg\")");
            this.alg = string;
            String string2 = jSONObject.getString(ClientData.KEY_TYPE);
            Intrinsics.checkNotNullExpressionValue(string2, "jsonObj.getString(\"typ\")");
            this.typ = string2;
            String string3 = jSONObject.getString("kid");
            Intrinsics.checkNotNullExpressionValue(string3, "jsonObj.getString(\"kid\")");
            this.kid = string3;
            return;
        }
        throw new IllegalArgumentException("Invalid Header".toString());
    }

    private final boolean isValidHeader(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Validate.notEmpty(str, "encodedHeaderString");
        byte[] decodedBytes = Base64.decode(str, 0);
        Intrinsics.checkNotNullExpressionValue(decodedBytes, "decodedBytes");
        try {
            JSONObject jSONObject = new JSONObject(new String(decodedBytes, Charsets.UTF_8));
            String alg = jSONObject.optString("alg");
            Intrinsics.checkNotNullExpressionValue(alg, "alg");
            if (alg.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && Intrinsics.m17075f(alg, "RS256")) {
                z2 = true;
            } else {
                z2 = false;
            }
            String optString = jSONObject.optString("kid");
            Intrinsics.checkNotNullExpressionValue(optString, "jsonObj.optString(\"kid\")");
            if (optString.length() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            String optString2 = jSONObject.optString(ClientData.KEY_TYPE);
            Intrinsics.checkNotNullExpressionValue(optString2, "jsonObj.optString(\"typ\")");
            if (optString2.length() > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z2 || !z3 || !z4) {
                return false;
            }
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationTokenHeader)) {
            return false;
        }
        AuthenticationTokenHeader authenticationTokenHeader = (AuthenticationTokenHeader) obj;
        if (Intrinsics.m17075f(this.alg, authenticationTokenHeader.alg) && Intrinsics.m17075f(this.typ, authenticationTokenHeader.typ) && Intrinsics.m17075f(this.kid, authenticationTokenHeader.kid)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getAlg() {
        return this.alg;
    }

    @NotNull
    public final String getKid() {
        return this.kid;
    }

    @NotNull
    public final String getTyp() {
        return this.typ;
    }

    public int hashCode() {
        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.alg.hashCode()) * 31) + this.typ.hashCode()) * 31) + this.kid.hashCode();
    }

    @VisibleForTesting(otherwise = 2)
    @NotNull
    public final String toEnCodedString() {
        String authenticationTokenHeader = toString();
        Charset charset = Charsets.UTF_8;
        if (authenticationTokenHeader != null) {
            byte[] bytes = authenticationTokenHeader.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            String encodeToString = Base64.encodeToString(bytes, 0);
            Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(claimsJsonString.toByteArray(), Base64.DEFAULT)");
            return encodeToString;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    @NotNull
    public final JSONObject toJSONObject$facebook_core_release() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.alg);
        jSONObject.put(ClientData.KEY_TYPE, this.typ);
        jSONObject.put("kid", this.kid);
        return jSONObject;
    }

    @NotNull
    public String toString() {
        String jSONObject = toJSONObject$facebook_core_release().toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "headerJsonObject.toString()");
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.alg);
        dest.writeString(this.typ);
        dest.writeString(this.kid);
    }

    public AuthenticationTokenHeader(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.alg = Validate.notNullOrEmpty(parcel.readString(), "alg");
        this.typ = Validate.notNullOrEmpty(parcel.readString(), ClientData.KEY_TYPE);
        this.kid = Validate.notNullOrEmpty(parcel.readString(), "kid");
    }

    public AuthenticationTokenHeader(@NotNull JSONObject jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        String string = jsonObject.getString("alg");
        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(\"alg\")");
        this.alg = string;
        String string2 = jsonObject.getString(ClientData.KEY_TYPE);
        Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.getString(\"typ\")");
        this.typ = string2;
        String string3 = jsonObject.getString("kid");
        Intrinsics.checkNotNullExpressionValue(string3, "jsonObject.getString(\"kid\")");
        this.kid = string3;
    }

    @VisibleForTesting(otherwise = 2)
    public AuthenticationTokenHeader(@NotNull String alg, @NotNull String typ, @NotNull String kid) {
        Intrinsics.checkNotNullParameter(alg, "alg");
        Intrinsics.checkNotNullParameter(typ, "typ");
        Intrinsics.checkNotNullParameter(kid, "kid");
        this.alg = alg;
        this.typ = typ;
        this.kid = kid;
    }
}
