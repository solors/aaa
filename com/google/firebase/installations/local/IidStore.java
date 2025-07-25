package com.google.firebase.installations.local;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.webkit.ProxyConfig;
import com.amazon.p047a.p048a.p071o.p073b.SignedToken;
import com.google.android.gms.stats.CodePackage;
import com.google.firebase.FirebaseApp;
import com.google.firebase.messaging.FirebaseMessaging;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class IidStore {

    /* renamed from: c */
    private static final String[] f43107c = {ProxyConfig.MATCH_ALL_SCHEMES, FirebaseMessaging.INSTANCE_ID_SCOPE, CodePackage.GCM, ""};
    @GuardedBy("iidPrefs")

    /* renamed from: a */
    private final SharedPreferences f43108a;

    /* renamed from: b */
    private final String f43109b;

    public IidStore(@NonNull FirebaseApp firebaseApp) {
        this.f43108a = firebaseApp.getApplicationContext().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f43109b = m66752b(firebaseApp);
    }

    /* renamed from: a */
    private String m66753a(@NonNull String str, @NonNull String str2) {
        return "|T|" + str + SignedToken.f2767c + str2;
    }

    /* renamed from: b */
    private static String m66752b(FirebaseApp firebaseApp) {
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            return gcmSenderId;
        }
        String applicationId = firebaseApp.getOptions().getApplicationId();
        if (!applicationId.startsWith("1:") && !applicationId.startsWith("2:")) {
            return applicationId;
        }
        String[] split = applicationId.split(":");
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    @Nullable
    /* renamed from: c */
    private static String m66751c(@NonNull PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* renamed from: d */
    private String m66750d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: e */
    private PublicKey m66749e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            Log.w("ContentValues", "Invalid key stored " + e);
            return null;
        }
    }

    @Nullable
    /* renamed from: f */
    private String m66748f() {
        String string;
        synchronized (this.f43108a) {
            string = this.f43108a.getString("|S|id", null);
        }
        return string;
    }

    @Nullable
    /* renamed from: g */
    private String m66747g() {
        synchronized (this.f43108a) {
            String string = this.f43108a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            PublicKey m66749e = m66749e(string);
            if (m66749e == null) {
                return null;
            }
            return m66751c(m66749e);
        }
    }

    @Nullable
    public String readIid() {
        synchronized (this.f43108a) {
            String m66748f = m66748f();
            if (m66748f != null) {
                return m66748f;
            }
            return m66747g();
        }
    }

    @Nullable
    public String readToken() {
        synchronized (this.f43108a) {
            for (String str : f43107c) {
                String string = this.f43108a.getString(m66753a(this.f43109b, str), null);
                if (string != null && !string.isEmpty()) {
                    if (string.startsWith("{")) {
                        string = m66750d(string);
                    }
                    return string;
                }
            }
            return null;
        }
    }

    @VisibleForTesting
    public IidStore(@NonNull SharedPreferences sharedPreferences, @Nullable String str) {
        this.f43108a = sharedPreferences;
        this.f43109b = str;
    }
}
