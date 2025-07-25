package com.facebook.login;

import android.os.Bundle;
import android.util.Base64;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import com.facebook.internal.ServerProtocol;
import com.p552ot.pubsub.p561i.p562a.C26559a;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.C37626b;
import kotlin.ranges.PrimitiveRanges;
import kotlin.ranges._Ranges;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PKCEUtil.kt */
@Metadata
/* loaded from: classes4.dex */
public final class PKCEUtil {
    @NotNull
    public static final PKCEUtil INSTANCE = new PKCEUtil();

    private PKCEUtil() {
    }

    @NotNull
    public static final GraphRequest createCodeExchangeRequest(@NotNull String authorizationCode, @NotNull String redirectUri, @NotNull String codeVerifier) {
        Intrinsics.checkNotNullParameter(authorizationCode, "authorizationCode");
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        Intrinsics.checkNotNullParameter(codeVerifier, "codeVerifier");
        Bundle bundle = new Bundle();
        bundle.putString(C26559a.f69635d, authorizationCode);
        bundle.putString("client_id", FacebookSdk.getApplicationId());
        bundle.putString(ServerProtocol.DIALOG_PARAM_REDIRECT_URI, redirectUri);
        bundle.putString("code_verifier", codeVerifier);
        GraphRequest newGraphPathRequest = GraphRequest.Companion.newGraphPathRequest(null, "oauth/access_token", null);
        newGraphPathRequest.setHttpMethod(HttpMethod.GET);
        newGraphPathRequest.setParameters(bundle);
        return newGraphPathRequest;
    }

    @NotNull
    public static final String generateCodeChallenge(@NotNull String codeVerifier, @NotNull CodeChallengeMethod codeChallengeMethod) throws FacebookException {
        Intrinsics.checkNotNullParameter(codeVerifier, "codeVerifier");
        Intrinsics.checkNotNullParameter(codeChallengeMethod, "codeChallengeMethod");
        if (isValidCodeVerifier(codeVerifier)) {
            if (codeChallengeMethod == CodeChallengeMethod.PLAIN) {
                return codeVerifier;
            }
            try {
                byte[] bytes = codeVerifier.getBytes(Charsets.f99445e);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(bytes, 0, bytes.length);
                String encodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                Intrinsics.checkNotNullExpressionValue(encodeToString, "{\n      // try to generate challenge with S256\n      val bytes: ByteArray = codeVerifier.toByteArray(Charsets.US_ASCII)\n      val messageDigest = MessageDigest.getInstance(\"SHA-256\")\n      messageDigest.update(bytes, 0, bytes.size)\n      val digest = messageDigest.digest()\n\n      Base64.encodeToString(digest, Base64.URL_SAFE or Base64.NO_PADDING or Base64.NO_WRAP)\n    }");
                return encodeToString;
            } catch (Exception e) {
                throw new FacebookException(e);
            }
        }
        throw new FacebookException("Invalid Code Verifier.");
    }

    @NotNull
    public static final String generateCodeVerifier() {
        int m16903s;
        List m17570I0;
        List m17569J0;
        List m17568K0;
        List m17568K02;
        List m17568K03;
        List m17568K04;
        String m17521z0;
        Object m17567L0;
        m16903s = _Ranges.m16903s(new PrimitiveRanges(43, 128), Random.f99344b);
        m17570I0 = _Collections.m17570I0(new C37626b('a', 'z'), new C37626b('A', 'Z'));
        m17569J0 = _Collections.m17569J0(m17570I0, new C37626b('0', '9'));
        m17568K0 = _Collections.m17568K0(m17569J0, '-');
        m17568K02 = _Collections.m17568K0(m17568K0, '.');
        m17568K03 = _Collections.m17568K0(m17568K02, '_');
        m17568K04 = _Collections.m17568K0(m17568K03, '~');
        ArrayList arrayList = new ArrayList(m16903s);
        for (int i = 0; i < m16903s; i++) {
            m17567L0 = _Collections.m17567L0(m17568K04, Random.f99344b);
            arrayList.add(Character.valueOf(((Character) m17567L0).charValue()));
        }
        m17521z0 = _Collections.m17521z0(arrayList, "", null, null, 0, null, null, 62, null);
        return m17521z0;
    }

    public static final boolean isValidCodeVerifier(@Nullable String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z || str.length() < 43 || str.length() > 128) {
            return false;
        }
        return new Regex("^[-._~A-Za-z0-9]+$").m16766e(str);
    }
}
